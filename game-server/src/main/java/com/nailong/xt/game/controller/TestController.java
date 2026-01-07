package com.nailong.xt.game.controller;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.game.service.grpc.SendMessageToGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestController {

    @Autowired
    private SendMessageToGateService sendMessageToGateService;

    @RequestMapping(path = "/send")
    public String test() {
        IO.println("11111111111");
        // 示例：向gate server发送通知
        ByteString notificationData = ByteString.copyFromUtf8("Tower defense reward received");
        sendMessageToGateService.sendPlayerNotification(
                NetMsgIdConstants.player_new_notify,
                "111",
                123,
                notificationData
        );
        return "ok";
    }
}
