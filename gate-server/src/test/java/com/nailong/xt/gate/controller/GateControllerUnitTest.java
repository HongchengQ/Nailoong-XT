package com.nailong.xt.gate.controller;

import com.nailong.xt.gate.handler.CmdHandlerRegistry;
import com.nailong.xt.gate.handler.CmdRequestContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GateControllerUnitTest {

    @Mock
    private CmdHandlerRegistry cmdHandlerRegistry;

    private GateController gateController;

    @BeforeEach
    void setUp() {
        gateController = new GateController();
        // 使用反射设置私有字段
        java.lang.reflect.Field field;
        try {
            field = GateController.class.getDeclaredField("cmdHandlerRegistry");
            field.setAccessible(true);
            field.set(gateController, cmdHandlerRegistry);
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up test", e);
        }
    }

    @Test
    void testHandleBinaryRequest_ShortData_ThrowsException() {
        byte[] shortData = new byte[3]; // Less than 4 bytes

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gateController.handleBinaryRequest(shortData);
        });

        assertEquals("Request data too short, need at least 4 bytes for cmdId", exception.getMessage());
    }

    @Test
    void testHandleBinaryRequest_NoHandlerFound_ThrowsException() throws Exception {
        byte[] requestData = createRequestData(9999, new byte[]{1, 2, 3, 4}); // Non-existent cmdId

        when(cmdHandlerRegistry.getHandler(anyInt())).thenReturn(null);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            gateController.handleBinaryRequest(requestData);
        });

        assertEquals("No handler found for cmdId: 9999", exception.getMessage());
    }

    @Test
    void testHandleBinaryRequest_WithByteArrayHandler() throws Exception {
        byte[] protoData = new byte[]{1, 2, 3, 4};
        byte[] responseData = new byte[]{5, 6, 7, 8};
        byte[] requestData = createRequestData(1001, protoData);

        // Create a mock handler that returns specific data
        TestByteArrayHandler mockHandler = new TestByteArrayHandler(responseData);
        Method method = TestByteArrayHandler.class.getMethod("handleTest", byte[].class);
        
        CmdHandlerRegistry.HandlerMethod handlerMethod = new CmdHandlerRegistry.HandlerMethod(mockHandler, method);
        when(cmdHandlerRegistry.getHandler(anyInt())).thenReturn(handlerMethod);

        byte[] result = gateController.handleBinaryRequest(requestData);

        assertArrayEquals(responseData, result);
        verify(cmdHandlerRegistry).getHandler(1001);
    }

    @Test
    void testHandleBinaryRequest_WithContextHandler() throws Exception {
        byte[] protoData = new byte[]{1, 2, 3, 4};
        byte[] responseData = new byte[]{9, 8, 7, 6};
        byte[] requestData = createRequestData(1002, protoData);

        // Create a mock handler that accepts CmdRequestContext
        TestContextHandler mockHandler = new TestContextHandler(responseData);
        Method method = TestContextHandler.class.getMethod("handleWithContext", CmdRequestContext.class);
        
        CmdHandlerRegistry.HandlerMethod handlerMethod = new CmdHandlerRegistry.HandlerMethod(mockHandler, method);
        when(cmdHandlerRegistry.getHandler(anyInt())).thenReturn(handlerMethod);

        byte[] result = gateController.handleBinaryRequest(requestData);

        assertArrayEquals(responseData, result);
        verify(cmdHandlerRegistry).getHandler(1002);
    }

    @Test
    void testHandleBinaryRequest_InvalidMethodInvocation_ThrowsException() throws Exception {
        byte[] requestData = createRequestData(1003, new byte[]{1, 2, 3, 4});

        // Create a mock handler that will throw an exception when invoked
        ThrowingHandler mockHandler = new ThrowingHandler();
        Method method = ThrowingHandler.class.getMethod("handleThrowing", byte[].class);
        
        CmdHandlerRegistry.HandlerMethod handlerMethod = new CmdHandlerRegistry.HandlerMethod(mockHandler, method);
        when(cmdHandlerRegistry.getHandler(anyInt())).thenReturn(handlerMethod);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            gateController.handleBinaryRequest(requestData);
        });

        assertTrue(exception.getMessage().contains("Error invoking handler for cmdId: 1003"));
    }

    @Test
    void testCmdIdExtraction() {
        // Test little-endian cmdId extraction
        int originalCmdId = 0x12345678; // 305419896 in decimal
        byte[] requestData = createRequestData(originalCmdId, new byte[]{1, 2, 3, 4});

        // Extract cmdId manually to verify the algorithm
        int extractedCmdId = ((requestData[0] & 0xFF)) |
                           ((requestData[1] & 0xFF) << 8) |
                           ((requestData[2] & 0xFF) << 16) |
                           ((requestData[3] & 0xFF) << 24);

        assertEquals(originalCmdId, extractedCmdId);
    }

    // Helper method to create request data with cmdId and proto data
    private byte[] createRequestData(int cmdId, byte[] protoData) {
        byte[] requestData = new byte[4 + protoData.length];
        // Write cmdId in little-endian format
        requestData[0] = (byte) (cmdId & 0xFF);
        requestData[1] = (byte) ((cmdId >> 8) & 0xFF);
        requestData[2] = (byte) ((cmdId >> 16) & 0xFF);
        requestData[3] = (byte) ((cmdId >> 24) & 0xFF);
        
        System.arraycopy(protoData, 0, requestData, 4, protoData.length);
        return requestData;
    }

    // Test handler classes
    static class TestByteArrayHandler {
        private final byte[] responseData;

        public TestByteArrayHandler(byte[] responseData) {
            this.responseData = responseData;
        }

        public byte[] handleTest(byte[] protoData) {
            return responseData;
        }
    }

    static class TestContextHandler {
        private final byte[] responseData;

        public TestContextHandler(byte[] responseData) {
            this.responseData = responseData;
        }

        public byte[] handleWithContext(CmdRequestContext context) {
            // Verify that context contains correct cmdId
            assertEquals(1002, context.getCmdId());
            return responseData;
        }
    }

    static class ThrowingHandler {
        public byte[] handleThrowing(byte[] protoData) {
            throw new RuntimeException("Test exception");
        }
    }
}