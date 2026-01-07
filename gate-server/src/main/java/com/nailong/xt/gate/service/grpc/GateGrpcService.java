package com.nailong.xt.gate.service.grpc;

import com.nailong.xt.proto.server.Package;
import com.nailong.xt.proto.server.Package.CmdRequestContext;
import com.nailong.xt.proto.server.Package.CmdRespContext;
import com.nailong.xt.proto.server.PackageServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;

/**
 * 内部通信
 */
@GrpcService
@Log4j2
public class GateGrpcService extends PackageServiceGrpc.PackageServiceImplBase {

    // 处理来自game server的请求
    @Override
    public void handleGameToGatePackageRequest(CmdRequestContext request, StreamObserver<CmdRespContext> responseObserver) {
        int reqContextCmdId = request.getCmdId();
        String reqContextToken = request.getToken();
        int reqContextUid = request.getPlayerUid();

        log.info("Received gRPC request from game server with cmdId: {}", reqContextCmdId);

        try {
            log.warn("99999999999999999999999999999999\nreqContextCmdId:{}", reqContextCmdId);

            Package.CmdRespContext response = CmdRespContext.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            log.error("Error processing gRPC request from game server", e);
            responseObserver.onError(e);
        }
    }
}