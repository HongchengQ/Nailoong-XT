package com.nailong.xt.gate.handler;

import com.nailong.xt.gate.annotation.CmdHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GameCmdHandlerTest {

    private GameCmdHandler gameCmdHandler;

    @BeforeEach
    void setUp() {
        gameCmdHandler = new GameCmdHandler();
    }

    @Test
    void testHandleLoginRequest() {
        byte[] protoData = new byte[]{1, 2, 3, 4};
        
        byte[] result = gameCmdHandler.handleLoginRequest(protoData);
        
        assertNotNull(result);
        assertEquals(0, result.length); // Should return empty byte array
    }

    @Test
    void testHandleMoveRequest() {
        // Create a CmdRequestContext with cmdId 1002 and some proto data
        byte[] protoData = new byte[]{5, 6, 7, 8};
        CmdRequestContext context = new CmdRequestContext(1002, protoData);
        
        byte[] result = gameCmdHandler.handleMoveRequest(context);
        
        assertNotNull(result);
        assertEquals(4, result.length); // Should return empty byte array
        assertEquals(1002, context.getCmdId());
    }

    @Test
    void testHandleChatRequest() {
        byte[] protoData = new byte[]{9, 10, 11, 12};
        
        byte[] result = gameCmdHandler.handleChatRequest(protoData);
        
        assertNotNull(result);
        assertEquals(0, result.length); // Should return empty byte array
    }

    @Test
    void testCmdHandlerAnnotations() {
        // Test that the CmdHandler annotations are correctly applied
        assertEquals(1001, getCmdHandlerValue("handleLoginRequest"));
        assertEquals(1002, getCmdHandlerValue("handleMoveRequest"));
        assertEquals(2001, getCmdHandlerValue("handleChatRequest"));
    }

    // Helper method to get the value from CmdHandler annotation
    private int getCmdHandlerValue(String methodName) {
        try {
            if (methodName.equals("handleLoginRequest")) {
                return GameCmdHandler.class.getMethod("handleLoginRequest", byte[].class)
                        .getAnnotation(CmdHandler.class).value();
            } else if (methodName.equals("handleMoveRequest")) {
                return GameCmdHandler.class.getMethod("handleMoveRequest", CmdRequestContext.class)
                        .getAnnotation(CmdHandler.class).value();
            } else if (methodName.equals("handleChatRequest")) {
                return GameCmdHandler.class.getMethod("handleChatRequest", byte[].class)
                        .getAnnotation(CmdHandler.class).value();
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Method not found: " + methodName, e);
        }
        return -1;
    }
}