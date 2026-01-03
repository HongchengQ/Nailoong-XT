package com.nailong.xt.gate.controller;

import com.nailong.xt.gate.handler.CmdHandlerRegistry;
import com.nailong.xt.gate.handler.CmdRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/gate")
public class GateController {

    @Autowired
    private CmdHandlerRegistry cmdHandlerRegistry;

    @PostMapping
    public byte[] handleBinaryRequest(@RequestBody byte[] requestData) throws IOException {
        if (requestData.length < 4) {
            throw new IllegalArgumentException("Request data too short, need at least 4 bytes for cmdId");
        }

        // Extract cmdId from first 4 bytes (assuming little-endian format)
        int cmdId = ((requestData[0] & 0xFF)) |
                   ((requestData[1] & 0xFF) << 8) |
                   ((requestData[2] & 0xFF) << 16) |
                   ((requestData[3] & 0xFF) << 24);

        // Get the handler method for this cmdId
        CmdHandlerRegistry.HandlerMethod handlerMethod = cmdHandlerRegistry.getHandler(cmdId);
        if (handlerMethod == null) {
            throw new IllegalArgumentException("No handler found for cmdId: " + cmdId);
        }

        // Extract the remaining data (proto data)
        byte[] protoData = new byte[requestData.length - 4];
        System.arraycopy(requestData, 4, protoData, 0, protoData.length);

        try {
            // Create request context
            CmdRequestContext context = new CmdRequestContext(cmdId, protoData);
            
            // Check if the method accepts CmdRequestContext as parameter
            Class<?>[] paramTypes = handlerMethod.method().getParameterTypes();
            Object result;
            
            if (paramTypes.length > 0 && paramTypes[0] == CmdRequestContext.class) {
                result = handlerMethod.method().invoke(handlerMethod.handler(), context);
            } else {
                result = handlerMethod.method().invoke(handlerMethod.handler(), (Object) protoData);
            }
            
            if (result instanceof byte[]) {
                return (byte[]) result;
            } else {
                // If result is not byte array, return empty response
                return new byte[0];
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Error invoking handler for cmdId: " + cmdId, e);
        }
    }
}