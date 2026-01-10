package com.nailong.xt.game.handler;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.annotation.CmdIdHandler;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.game.player.Player;
import com.nailong.xt.proto.cmd.ActivityDetail;
import com.nailong.xt.proto.server.Command;
import com.nailong.xt.proto.server.Push.PushPacketNotify;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActivityHandler {

    @CmdIdHandler(NetMsgIdConstants.activity_detail_req)
    public void onActivityDetailReq(Command.CmdReqContext reqContext, Command.CmdRspContext.Builder responseContext, Player player) {
        responseContext
                .setCmdId(NetMsgIdConstants.activity_detail_succeed_ack)
                .setProtoData(
                        ByteString.copyFrom(
                                ActivityDetail.ActivityResp.newInstance()
                                        .addList(ActivityDetail.ActivityMsg.newInstance().setId(102001)).toByteArray()));
    }
}