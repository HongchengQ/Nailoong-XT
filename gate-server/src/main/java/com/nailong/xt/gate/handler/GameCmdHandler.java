package com.nailong.xt.gate.handler;

import com.nailong.xt.common.proto.NetMsgId;
import com.nailong.xt.gate.annotation.CmdHandler;
import org.springframework.stereotype.Component;

@Component
public class GameCmdHandler {

    @CmdHandler(NetMsgId.player_data_req) // 示例cmdid为1001
    public byte[] handleLoginRequest(byte[] protoData) {
        // 这里处理登录请求的逻辑
        // protoData 包含解析后的proto数据（不包含前4字节cmdid）
        System.out.println("Handling login request with cmdId 1001");
        // 实际处理逻辑将在这里实现，解析protoData并返回响应
        return new byte[0]; // 返回响应数据
    }

    @CmdHandler(NetMsgId.player_data_succeed_ack) // 示例cmdid为1002
    public byte[] handleMoveRequest(CmdRequestContext context) { // 使用CmdRequestContext参数
        // 这里处理移动请求的逻辑
        System.out.println("Handling move request with cmdId " + context.getCmdId());
        // 实际处理逻辑将在这里实现
//        return new byte[0]; // 返回响应数据
        return context.getProtoData();
    }
    
    @CmdHandler(NetMsgId.player_formation_req) // 示例cmdid为2001
    public byte[] handleChatRequest(byte[] protoData) {
        // 这里处理聊天请求的逻辑
        System.out.println("Handling chat request with cmdId 2001");
        // 实际处理逻辑将在这里实现
        return new byte[0]; // 返回响应数据
    }
}