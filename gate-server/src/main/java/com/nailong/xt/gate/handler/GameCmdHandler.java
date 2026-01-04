package com.nailong.xt.gate.handler;

import com.nailong.xt.common.aead.AeadHelper;
import com.nailong.xt.common.proto.NetMsgId;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.gate.annotation.CmdHandler;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.gate.network.PlayerSessionMgr;
import com.nailong.xt.proto.cmd.Ike;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.springframework.stereotype.Component;
import us.hebi.quickbuf.InvalidProtocolBufferException;

@Component
@Slf4j
public class GameCmdHandler {

    @CmdHandler(NetMsgId.ike_req)
    public byte[] handlerIkeReq(CmdRequestContext context, PlayerSession session) throws InvalidProtocolBufferException {
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
    public byte[] handlerLoginReq(CmdRequestContext context, PlayerSession session) {
        IO.println("00000000000000000000000000000000000000000000000000000");

        return session.encodeMsg(NetMsgId.player_login_failed_ack);
    }
}