package com.nailong.xt.game.dispatcher.handler;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.annotation.CmdIdHandler;
import com.nailong.xt.common.constants.GamePlayerCmdIdConstants;
import com.nailong.xt.game.core.session.model.PlayerSession;
import com.nailong.xt.proto.cmd.ActivityDetail;
import com.nailong.xt.proto.server.Command;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActivityHandler {

    @CmdIdHandler(GamePlayerCmdIdConstants.activity_detail_req)
    public void onActivityDetailReq(Command.CmdReqContext reqContext, Command.CmdRspContext.Builder responseContext, PlayerSession playerSession) {
        responseContext
                .setCmdId(GamePlayerCmdIdConstants.activity_detail_succeed_ack)
                .setProtoData(
                        ByteString.copyFrom(
                                ActivityDetail.ActivityResp.newInstance()
                                        .addList(ActivityDetail.ActivityMsg.newInstance().setId(102001)).toByteArray()));
    }
}