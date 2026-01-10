package com.nailong.xt.gate.service.grpc;

import com.google.protobuf.Empty;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.springframework.grpc.server.service.GrpcService;

/**
 * 内部通信
 * 接收来自 game的推送/广播包
 */
@GrpcService
@Log4j2
public class GateGrpcService extends ServerPushServiceGrpc.ServerPushServiceImplBase {

    // 处理来自game server的请求
    @Override
    public void pushSingleNotify(Push.PushPacketNotify notify, StreamObserver<Empty> responseObserver) {
        int reqContextCmdId = notify.getCmdId();
        String reqContextToken = notify.getToken();
        int reqContextUid = notify.getTargetPlayerUidsCount();

        log.info("Received gRPC notify from game server with cmdId: {}", reqContextCmdId);

        try {
            log.warn("99999999999999999999999999999999\nreqContextCmdId:{}", reqContextCmdId);

            Empty response = Empty.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            log.error("Error processing gRPC notify from game server", e);
            responseObserver.onError(e);
        }
    }
}