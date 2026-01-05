package com.nailong.xt.gate.handler;

import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.gate.annotation.CmdHandler;
import com.nailong.xt.gate.client.GameServerGrpcClient;
import com.nailong.xt.gate.network.PlayerSession;
import com.nailong.xt.gate.network.PlayerSessionMgr;
import com.nailong.xt.proto.cmd.Ike;
import com.nailong.xt.proto.cmd.PlayerLogin;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class GameCmdHandler {

    @Autowired
    private GameServerGrpcClient gameServerGrpcClient;

    @CmdHandler(NetMsgIdConstants.ike_req)
    public byte[] handlerIkeReq(CmdRequestContext context, PlayerSession session) throws IOException {
        IO.println("000000000000000000000000000000000000000000000000");
        var req = Ike.IKEReq.parseFrom(context.getProtoData().toByteArray());

        session.setClientPublicKey(req.getPubKey().toArray());
        session.generateServerKey();
        session.calculateKey();

        // Create response
        var rsp = Ike.IKEResp.newInstance()
                .setToken(PlayerSessionMgr.generateSessionToken(session))
                .setCipher(session.getEncryptMethod())
                .setServerTs(System.currentTimeMillis() / 1000)
                .setPubKey(session.getServerPublicKey());

        log.debug("Client Public: {}", Utils.base64Encode(session.getClientPublicKey()));
        log.debug("Server Public: {}", Utils.base64Encode(session.getServerPublicKey()));
        log.debug("Server Private: {}", Utils.base64Encode(session.getServerPrivateKey()));
        log.debug("Key: {}", Utils.base64Encode(session.getKey()));

        return session.encodeMsg(NetMsgIdConstants.ike_succeed_ack, rsp);
    }

    @CmdHandler(NetMsgIdConstants.player_login_req)
    public byte[] handlerLoginReq(CmdRequestContext context, PlayerSession session) throws IOException {
        IO.println("11111111111111111111111111111111111111111");
        var req = PlayerLogin.LoginReq.parseFrom(context.getProtoData().toByteArray());

        // OS
        String clientLoginToken = req.getOfficialOverseas().getToken();

        // CN
        if (clientLoginToken.isEmpty()) {
            clientLoginToken = req.getOfficial().getToken();
        }

        // 通过 grpc 调用 game-server 直接返回远程获取的 cmdid 和 data
        // 创建gRPC请求
        CmdRequestContext grpcRequest = CmdRequestContext.newBuilder()
                .setCmdId(NetMsgIdConstants.player_login_req)
                .setProtoData(context.getProtoData())
                .setTimestamp(System.currentTimeMillis())
                .setToken(clientLoginToken)
                .build();

        // 发送gRPC请求到game-server
        CmdRespContext grpcResponse = gameServerGrpcClient.sendPackage(grpcRequest);

        // 从 gRPC 响应构建登录响应
        int cmdId = grpcResponse.getCmdId();
//        Message rsp = (Message) grpcResponse.getProtoData();
        PlayerLogin.LoginResp rsp = PlayerLogin.LoginResp.parseFrom(grpcResponse.getProtoData().toByteArray());

        // 重新分配 token
        rsp.setToken(PlayerSessionMgr.generateSessionToken(session));

        // 返回响应
        return session.encodeMsg(cmdId, rsp);
    }
}