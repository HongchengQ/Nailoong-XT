package com.nailong.xt.game.controller;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.common.model.po.PlayerDataDraft;
import com.nailong.xt.game.core.player.PlayerBindInstance;
import com.nailong.xt.proto.server.BinPlayerData;
import com.nailong.xt.proto.server.Push;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestController {

    @Autowired
    private PlayerDataRepository playerDataRepository;

    PlayerBindInstance playerBindInstance = new PlayerBindInstance("127.0.0.1:1146");

    @RequestMapping(path = "/send")
    public String test() {
        IO.println("11111111111");
        // 示例：向gate server发送通知
        ByteString notificationData = ByteString.copyFromUtf8("Tower defense reward received");
        System.out.println(playerBindInstance.sendPackage(
                Push.PushPacketNotify.newBuilder()
                        .setCmdId(NetMsgIdConstants.player_new_notify)
                        .setProtoData(notificationData)
                        .addTargetPlayerUids(10001)
                        .setToken("111")
                        .build()

        ));
        return "ok";
    }

    @RequestMapping(path = "/db")
    public String db() {
        IO.println("22222222222222");
        playerDataRepository.savePlayerDataObj(
                new PlayerDataDraft.Builder()
                        .uid(999)
                        .accountUid(999L)
                        .binData(BinPlayerData.PlayerDataBin.newBuilder()
                                .setUid(999)
                                .setItemBin(BinPlayerData.PlayerItemCompBin.newBuilder()
                                        .setHcoin(999999)
                                        .build())
                                .setBasicBin(
                                        BinPlayerData.PlayerBasicCompBin.newBuilder()
                                                .setTotalGameTime(9999)
                                                .setNickname("qwdqbdad暗示大家打压Uu7qdw8777d渡鸦的gay的公")
                                                .build()
                                )
                                .build())
                        .build());
        return "ok";
    }

    @RequestMapping(path = "/db1")
    public String db1() {
        System.out.println(playerDataRepository.queryPlayerDataByUid(999).binData());
        return "ok";
    }
}
