package com.nailong.xt.game.service;

import com.google.protobuf.ByteString;
import com.nailong.xt.common.proto.NetMsgId;
import com.nailong.xt.proto.cmd.PlayerLogin;
import com.nailong.xt.proto.server.PackageServiceGrpc;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import io.grpc.stub.StreamObserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class GameGrpcService extends PackageServiceGrpc.PackageServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(GameGrpcService.class);

    @Override
    public void sendPackage(CmdRequestContext request, StreamObserver<CmdRespContext> responseObserver) {
        try {
            log.info("Received gRPC request with cmdId: {}", request.getCmdId());
            
            // 根据 cmdId 处理不同的请求
            CmdRespContext.Builder responseBuilder = CmdRespContext.newBuilder()
                    .setCmdId(request.getCmdId())
                    .setTimestamp(System.currentTimeMillis())
                    .setToken(request.getToken());

            switch (request.getCmdId()) {
                case NetMsgId.player_login_req:
                    // 处理登录逻辑
                    PlayerLogin.LoginReq req = PlayerLogin.LoginReq
                            .parseFrom(request.getProtoData().toByteArray());

                    // todo 验证
                    PlayerLogin.LoginResp rsp = PlayerLogin.LoginResp.newInstance();

                    responseBuilder.setCmdId(NetMsgId.player_login_succeed_ack);
                    responseBuilder.setProtoData(ByteString.copyFrom(rsp.toByteArray()));
                    break;
                default:
                    // 默认处理
                    responseBuilder.setProtoData(request.getProtoData());
                    break;
            }
            
            CmdRespContext response = responseBuilder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            
        } catch (Exception e) {
            log.error("Error processing gRPC request", e);
            responseObserver.onError(e);
        }
    }
}