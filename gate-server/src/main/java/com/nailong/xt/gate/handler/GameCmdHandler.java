package com.nailong.xt.gate.handler;

import com.nailong.xt.common.proto.NetMsgId;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.gate.annotation.CmdHandler;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.gate.network.PlayerSessionMgr;
import com.nailong.xt.proto.cmd.Ike;
import com.nailong.xt.proto.cmd.PlayerLogin;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import us.hebi.quickbuf.InvalidProtocolBufferException;

@Component
@Slf4j
public class GameCmdHandler {

    @CmdHandler(NetMsgId.ike_req)
    public byte[] handlerIkeReq(CmdRequestContext context, PlayerSession session) throws InvalidProtocolBufferException {
        IO.println("000000000000000000000000000000000000000000000000");
        var req = Ike.IKEReq.parseFrom(context.getProtoData().toByteArray());

        session.setClientPublicKey(req.getPubKey().toArray());
        session.generateServerKey();
        session.calculateKey();

        PlayerSessionMgr.generateSessionToken(session);

        // Create response
        var rsp = Ike.IKEResp.newInstance()
                .setToken(session.getSessionToken())
                .setCipher(session.getEncryptMethod())
                .setServerTs(System.currentTimeMillis() / 1000)
                .setPubKey(session.getServerPublicKey());

        log.info("Client Public: {}", Utils.base64Encode(session.getClientPublicKey()));
        log.info("Server Public: {}", Utils.base64Encode(session.getServerPublicKey()));
        log.info("Server Private: {}", Utils.base64Encode(session.getServerPrivateKey()));
        log.info("Key: {}", Utils.base64Encode(session.getKey()));

        return session.encodeMsg(NetMsgId.ike_succeed_ack, rsp);
    }

    @CmdHandler(NetMsgId.player_login_req)
    public byte[] handlerLoginReq(CmdRequestContext context, PlayerSession session) throws InvalidProtocolBufferException {
        IO.println("11111111111111111111111111111111111111111");
        var req = PlayerLogin.LoginReq.parseFrom(context.getProtoData().toByteArray());

        // OS
        String loginToken = req.getOfficialOverseas().getToken();

        // CN
        if (loginToken.isEmpty()) {
            loginToken = req.getOfficial().getToken();
        }

        // 分配一个新 token
        PlayerSessionMgr.generateSessionToken(session);

        // Create rsp
        var rsp = PlayerLogin.LoginResp.newInstance().setToken(session.getSessionToken());

        return session.encodeMsg(NetMsgId.player_login_succeed_ack, rsp);
    }
}