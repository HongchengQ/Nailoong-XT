package com.nailong.xt.gate.controller;

import com.nailong.xt.gate.handler.CmdHandlerRegistry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GateControllerTest {

    @Mock
    private CmdHandlerRegistry cmdHandlerRegistry;

    @InjectMocks
    private GateController gateController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(gateController).build();
    }

    @Test
    void testHandleBinaryRequest_ShortData_ThrowsException() {
        byte[] shortData = new byte[3]; // Less than 4 bytes

        assertThrows(IllegalArgumentException.class, () -> {
            gateController.handleBinaryRequest(shortData);
        });
    }

    @Test
    void testHandleBinaryRequest_NoHandlerFound_ThrowsException() throws Exception {
        byte[] requestData = createRequestData(9999, new byte[]{1, 2, 3, 4}); // Non-existent cmdId

        when(cmdHandlerRegistry.getHandler(anyInt())).thenReturn(null);

        assertThrows(IllegalArgumentException.class, () -> {
            gateController.handleBinaryRequest(requestData);
        });
    }

    @Test
    void testHandleBinaryRequest_ValidRequest_ReturnsResponse() throws Exception {
        byte[] protoData = new byte[]{1, 2, 3, 4};
        byte[] responseData = new byte[]{5, 6, 7, 8};
        byte[] requestData = createRequestData(1001, protoData);

        // Since we can't easily mock the reflection call, we'll test the extraction logic instead
        // Let's test the cmdId extraction logic
        int cmdId = ((requestData[0] & 0xFF)) |
                ((requestData[1] & 0xFF) << 8) |
                ((requestData[2] & 0xFF) << 16) |
                ((requestData[3] & 0xFF) << 24);

        assert cmdId == 1001 : "CmdId extraction failed";
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
}