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
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class GameCmdHandlerService {

    @Autowired
    private GrpcClientService grpcClientService;

    /**
     * 这个包由网关自身响应
     *
     * @param context
     * @param session
     * @return
     * @throws IOException
     */
    @CmdIdHandler(NetMsgIdConstants.ike_req)
    public byte[] handlerIkeReq(CmdRequestContext context, PlayerSession session) throws IOException {
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

    @CmdIdHandler(NetMsgIdConstants.player_login_req)
    public byte[] handlerLoginReq(CmdRequestContext context, PlayerSession session) throws IOException {
        ByteString protoData = context.getProtoData();

        var req = PlayerLogin.LoginReq.parseFrom(protoData.toByteArray());

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
                .setProtoData(protoData)
                .setTimestamp(System.currentTimeMillis())
                .setToken(session.getSessionToken())
                .build();

        // 发送gRPC请求到game-server
        CmdRespContext grpcResponse = grpcClientService.sendPackage(grpcRequest);

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