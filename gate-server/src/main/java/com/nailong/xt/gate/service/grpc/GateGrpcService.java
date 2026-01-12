package com.nailong.xt.gate.service.grpc;

import com.google.protobuf.Empty;
import com.nailong.xt.common.constants.ServerCmdIdConstants;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.log4j.Log4j2;
import org.springframework.grpc.server.service.GrpcService;

import java.util.List;

import static com.nailong.xt.gate.network.PlayerSessionMgr.playerSessionMap;

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
        int notifyCmdId = notify.getCmdId();
        List<Integer> uids = notify.getTargetPlayerUidsList();

        log.info("Received gRPC notify from game server with cmdId: {}", notifyCmdId);

        try {
            // 先简单实现逻辑 后期优化
            if (notifyCmdId == ServerCmdIdConstants.PLAYER_FORCE_LOGOUT) {
//                for (int uid : uids) {
//                    playerSessionMap.remove(uid);
//                }
                IO.println("未实现的逻辑");
            }

            Empty response = Empty.newBuilder().build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            log.error("Error processing gRPC notify from game server", e);
            responseObserver.onError(e);
        }
    }
}