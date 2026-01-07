package com.nailong.xt.gate.service;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.annotation.CmdIdHandler;
import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.net.GrpcClientService;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.gate.network.PlayerSessionMgr;
import com.nailong.xt.proto.cmd.Ike;
import com.nailong.xt.proto.cmd.PlayerLogin;
import com.nailong.xt.proto.cmd.PlayerPing;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class GateCmdHandler {

    @Autowired
    private GrpcClientService grpcClientService;

    /**
     * 这个包由网关自身响应
     * 不向远程发起调用
     *
     * @param context
     * @param session
     * @return
     * @throws IOException
     */
    @CmdIdHandler(NetMsgIdConstants.ike_req)
    public byte[] onIkeReq(CmdRequestContext context, PlayerSession session) throws IOException {
        var req = Ike.IKEReq.parseFrom(context.getProtoData().toByteArray());

        // 改变 session 内部状态
        session.setClientPublicKey(req.getPubKey().toArray());
        session.generateServerKey();
        session.calculateKey();

        // 生成一个新 token
        String newToken = PlayerSessionMgr.generateSessionToken(session);

        // Create response
        var rsp = Ike.IKEResp.newInstance()
                .setToken(newToken)
                .setCipher(session.getEncryptMethod())
                .setServerTs(Utils.getCurrentServerTime())
                .setPubKey(session.getServerPublicKey());

        // log
        log.debug("Client Public: {}", Utils.base64Encode(session.getClientPublicKey()));
        log.debug("Server Public: {}", Utils.base64Encode(session.getServerPublicKey()));
        log.debug("Server Private: {}", Utils.base64Encode(session.getServerPrivateKey()));
        log.debug("Key: {}", Utils.base64Encode(session.getKey()));

        // 返回响应包
        return session.encodeMsg(NetMsgIdConstants.ike_succeed_ack, rsp);
    }

    /**
     * 客户端的 token 和 uid 由 sdk 填充
     * 这里先做用户的校验
     * 然后向 game 构建一个更适合的请求 加载 player 数据
     *
     * @param context
     * @param session
     * @return
     */
    @CmdIdHandler(NetMsgIdConstants.player_login_req)
    public byte[] onLoginReq(CmdRequestContext context, PlayerSession session) {
        try {
            ByteString protoData = context.getProtoData();

            var loginReq = PlayerLogin.LoginReq.parseFrom(protoData.toByteArray());

            String clientLoginToken;
            long clientLoginUid;
            {
                // OS
                clientLoginToken = loginReq.getOfficialOverseas().getToken();             // 这个 account token 感觉没什么用
                clientLoginUid = Long.parseLong(loginReq.getOfficialOverseas().getUid());   // account uid 立大功

                // CN
                if (clientLoginToken.isEmpty() && clientLoginUid == 0) {
                    clientLoginToken = loginReq.getOfficial().getToken();
                    clientLoginUid = loginReq.getOfficial().getUid();
                }
            }

            // 构建响应数据 -> 重新分配 token
            PlayerLogin.LoginResp loginResp = PlayerLogin.LoginResp.newInstance().setToken(PlayerSessionMgr.generateSessionToken(session));

            // 更新 session uid and token
            session.setAccountUid(clientLoginUid);
            session.setAccountToken(clientLoginToken);

            // 发送gRPC请求到 game-server
            CmdRespContext grpcResponse = grpcClientService.sendPackage(
                    context.toBuilder()
                            .setToken(session.getSessionToken()) // 注意：这里发送 session token 而不是 login token
                            .setAccountUid(clientLoginUid)
                            .build()
            );

            if (grpcResponse.getIsFailed()) {
                return session.encodeMsg(NetMsgIdConstants.player_login_failed_ack);
            }

            // 返回预构建的响应
            return session.encodeMsg(NetMsgIdConstants.player_login_succeed_ack, loginResp);
        } catch (Exception e) {
            return session.encodeMsg(NetMsgIdConstants.player_login_failed_ack);
        }
    }

    /**
     * ping
     * 客户端 120s 请求一次
     * 超时断线
     *
     * @param context
     * @param session
     * @return
     * @throws IOException
     */
    @CmdIdHandler(NetMsgIdConstants.player_ping_req)
    public byte[] onPingReq(CmdRequestContext context, PlayerSession session) throws IOException {
        // Create response
        var rsp = PlayerPing.Pong.newInstance()
                .setServerTs(Utils.getCurrentServerTime());

        return session.encodeMsg(NetMsgIdConstants.player_ping_succeed_ack, rsp);
    }
}