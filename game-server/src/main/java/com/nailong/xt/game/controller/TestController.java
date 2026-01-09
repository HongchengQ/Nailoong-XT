package com.nailong.xt.game.controller;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.game.service.grpc.send.SendPackageToGate;
import com.nailong.xt.proto.server.Push;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
@RequiredArgsConstructor
public class TestController {

    private final SendPackageToGate sendPackageToGate;

    @RequestMapping(path = "/send")
    public String test() {
        IO.println("11111111111");
        // 示例：向gate server发送通知
        ByteString notificationData = ByteString.copyFromUtf8("Tower defense reward received");
        sendPackageToGate.sendPackage(
                Push.PushPacketNotify.newBuilder()
                        .setCmdId(NetMsgIdConstants.player_new_notify)
//                        .setProtoData(notificationData)
                        .addTargetPlayerUids(10001)
//                        .setToken("111")
                        .build()

        );
        return "ok";
    }
}
