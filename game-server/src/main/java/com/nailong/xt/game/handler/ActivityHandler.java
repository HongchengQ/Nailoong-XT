package com.nailong.xt.game.handler;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.annotation.CmdIdHandler;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.game.player.Player;
import com.nailong.xt.game.service.grpc.SendMessageToGateService;
import com.nailong.xt.proto.cmd.ActivityDetail;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActivityHandler {

    @Autowired
    private SendMessageToGateService sendMessageToGateService;

    @CmdIdHandler(NetMsgIdConstants.activity_detail_req)
    public void onActivityDetailReq(CmdRequestContext reqContext, CmdRespContext.Builder responseContext, Player player) {

        responseContext
                .setCmdId(NetMsgIdConstants.activity_detail_succeed_ack)
                .setProtoData(
                        ByteString.copyFrom(
                                ActivityDetail.ActivityResp.newInstance()
                                        .addList(ActivityDetail.ActivityMsg.newInstance().setId(102001)).toByteArray()));
    }
}