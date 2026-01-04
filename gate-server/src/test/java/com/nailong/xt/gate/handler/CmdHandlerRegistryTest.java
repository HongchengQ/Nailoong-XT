//package com.nailong.xt.gate.handler;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeEach;
//
//import java.lang.reflect.Method;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CmdHandlerRegistryTest {
//
//    private CmdHandlerRegistry registry;
//
//    @BeforeEach
//    void setUp() {
//        registry = new CmdHandlerRegistry();
//    }
//
//    @Test
//    void testRegisterAndGetHandler() throws NoSuchMethodException {
//        // Create a mock handler object
//        TestHandler handler = new TestHandler();
//        Method method = TestHandler.class.getMethod("handleTest", byte[].class);
//
//        // Register the handler
//        int cmdId = 1001;
//        registry.registerHandler(cmdId, handler, method);
//
//        // Retrieve the handler
//        CmdHandlerRegistry.HandlerMethod handlerMethod = registry.getHandler(cmdId);
//
//        // Assert the handler is correctly retrieved
//        assertNotNull(handlerMethod);
//        assertEquals(handler, handlerMethod.handler());
//        assertEquals(method, handlerMethod.method());
//    }
//
//    @Test
//    void testGetNonExistentHandlerReturnsNull() {
//        CmdHandlerRegistry.HandlerMethod handlerMethod = registry.getHandler(9999);
//
//        assertNull(handlerMethod);
//    }
//
//    // Test handler class
//    static class TestHandler {
//        public byte[] handleTest(byte[] data) {
//            return new byte[0];
//        }
//    }
//}