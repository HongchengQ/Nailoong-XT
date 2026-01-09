package com.nailong.xt.game.service.grpc.send;

import com.google.protobuf.Empty;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * Game Server to Gate Server 消息服务
 * 提供game server向gate server主动发送消息的功能
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class SendPackageToGate {
    private final ManagedChannel gateServerChannel;

    public CompletableFuture<Empty> sendPackageAsync(Push.PushPacketNotify request) {
        return CompletableFuture.supplyAsync(() -> {
            ServerPushServiceGrpc.ServerPushServiceBlockingStub stub =
                    ServerPushServiceGrpc.newBlockingStub(gateServerChannel);
            return stub.pushSingleNotify(request);
        });
    }

    public Empty sendPackage(Push.PushPacketNotify request) {
        ServerPushServiceGrpc.ServerPushServiceBlockingStub stub =
                ServerPushServiceGrpc.newBlockingStub(gateServerChannel);
        return stub.pushSingleNotify(request);
    }
}