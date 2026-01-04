package com.nailong.xt.gate.controller;

import com.google.protobuf.ByteString;
import com.nailong.xt.gate.handler.CmdHandlerRegistry;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

import static com.nailong.xt.gate.network.PlayerSessionMgr.findOrCreatePlayerSession;

@RestController
@RequestMapping("/agent-zone-global")
public class GateController {

    @Autowired
    private CmdHandlerRegistry cmdHandlerRegistry;

    @PostMapping
    public ResponseEntity<byte[]> handleBinaryRequest(
            @Nullable @RequestHeader("X-Token") String token,
            @RequestBody byte[] requestData) throws Exception {
        PlayerSession playerSession = findOrCreatePlayerSession(token);

        // Create request context
        CmdRequestContext packageContext = playerSession.decryptMsg(token, requestData);

        // Get the handler method for this cmdId
        CmdHandlerRegistry.HandlerMethod handlerMethod = cmdHandlerRegistry.getHandler(packageContext.getCmdId());
        if (handlerMethod == null) {
            // todo: 直接转发给 game server
            throw new IllegalArgumentException("No handler found for cmdId: " + packageContext.getCmdId());
        }

        // Extract the remaining data (proto data)
        ByteString protoData = packageContext.getProtoData();

        try {
            // Check if the method accepts CmdRequestContext as parameter
            Class<?>[] paramTypes = handlerMethod.method().getParameterTypes();
            Object result;

            if (paramTypes.length > 0 && paramTypes[0] == CmdRequestContext.class) {
                result = handlerMethod.method().invoke(handlerMethod.handler(), packageContext, playerSession);
            } else {
                result = handlerMethod.method().invoke(handlerMethod.handler(), protoData, playerSession);
            }

            if (result instanceof byte[] r) {
                return ResponseEntity.ok().header("Server", "agent").body(playerSession.encryptPacketData(r));
            } else {
                // If result is not byte array, return empty response
                return ResponseEntity.ok(new byte[0]);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Error invoking handler for cmdId: " + packageContext.getCmdId(), e);
        }
    }
}