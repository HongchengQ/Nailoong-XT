package com.nailong.xt.game.service.grpc;

import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.common.model.po.PlayerData;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import com.nailong.xt.proto.server.PackageServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
@Log4j2
public class GameGrpcService extends PackageServiceGrpc.PackageServiceImplBase {

    @Autowired
    PlayerDataRepository playerDataRepository;

    @Override
    public void handleContextPackageRequest(CmdRequestContext request, StreamObserver<CmdRespContext> responseObserver) {
        try {
            log.info("Received gRPC request with cmdId: {}", request.getCmdId());

            // 根据 cmdId 处理不同的请求
            CmdRespContext.Builder responseBuilder = CmdRespContext.newBuilder()
                    .setCmdId(request.getCmdId())
                    .setTimestamp(System.currentTimeMillis())
                    .setToken(request.getToken())
                    .setReqCmdId(request.getCmdId());

            switch (request.getCmdId()) {
                case NetMsgIdConstants.player_login_req -> {
                    long accountUid = request.getAccountUid();
                    String token = request.getToken();

                    PlayerData createdPlayerData = playerDataRepository.queryOrCreatePlayerDataByAccountId(accountUid);

                    log.info("已成功读取 player data {}", createdPlayerData.toString());
                }
                default -> responseBuilder.setProtoData(request.getProtoData()); // 默认处理
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