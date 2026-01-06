package com.nailong.xt.game.service.grpc;

import com.nailong.xt.common.constants.NetMsgIdConstants;
import com.nailong.xt.common.dao.PlayerDataRepository;
import com.nailong.xt.common.dao.PlayerUidRepository;
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

    @Autowired
    PlayerUidRepository playerUidRepository;

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
                    int playerUid = request.getPlayerUid();
                    long accountUid = request.getAccountUid();
                    String token = request.getToken();

                    // 新号
                    if (playerUid == 0) {
                        // 创建账号
                        int createdPlayerUid = playerDataRepository.createPlayerData().id();
                        playerUidRepository.createPlayerUid(createdPlayerUid, accountUid);

                        log.info("已创建新 player data，PlayerUid: {}, accountUid: {}", createdPlayerUid, accountUid);
                    } else {
                        // 从数据库加载
                        log.info("test log -> 老号登录");
                    }
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