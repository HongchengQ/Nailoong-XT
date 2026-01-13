package com.nailong.xt.game.dispatcher.handler;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.annotation.CmdIdHandler;
import com.nailong.xt.common.constants.GamePlayerCmdIdConstants;
import com.nailong.xt.game.core.player.service.PlayerPackageService;
import com.nailong.xt.game.core.session.PlayerSessionMgr;
import com.nailong.xt.game.core.session.model.PlayerSession;
import com.nailong.xt.proto.server.Command;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlayerHandler {

    private final PlayerSessionMgr playerSessionMgr;

    private final PlayerPackageService playerPackageService;

    @CmdIdHandler(GamePlayerCmdIdConstants.player_login_req)
    public void onPlayerLoginReq(Command.CmdReqContext reqContext, Command.CmdRspContext.Builder responseContext, PlayerSession playerSession) {
        long accountUid = reqContext.getAccountUid();

        // 上层我们只针对uid检测，但是客户端在传这个包时不会携带uid，而是携带accountId
        if (playerSession == null) {
            playerSession = playerSessionMgr.loadDBPlayerByAccountUid(accountUid);
        }
        if (playerSession == null) {
            playerSession = playerSessionMgr.createPlayer(accountUid);
        }

        log.info("player_login_req 已成功获取 player {}", playerSession.getPlayer().getUid());

        responseContext.setPlayerUid(playerSession.getPlayer().getUid());
        // message 内容由gate填充
        responseContext.setCmdId(GamePlayerCmdIdConstants.player_login_succeed_ack);
    }

    @CmdIdHandler(GamePlayerCmdIdConstants.player_data_req)
    public void onPlayerDataReq(Command.CmdReqContext reqContext, Command.CmdRspContext.Builder responseContext, PlayerSession playerSession) {
        responseContext.setCmdId(GamePlayerCmdIdConstants.player_data_succeed_ack);

        var rsp = playerPackageService.getPlayerInfoProto(playerSession.getPlayer());

        responseContext.setProtoData(ByteString.copyFrom(rsp.toByteArray()));
    }
}
