package com.nailong.xt.game.core.player;

import com.google.protobuf.Empty;
import com.nailong.xt.common.utils.RpcUtils;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;

/**
 * Game Server to Gate Server 消息服务
 * 提供game server向gate server主动发送消息的功能
 */
@Slf4j
@Getter
@Setter
public class PlayerBindInstance {

    ManagedChannel gateServerChannel;

    String gateServerAddress;


    public PlayerBindInstance(String gateServerAddress) {
        setBindInstance(gateServerAddress);
    }

    public void setBindInstance(String gateServerAddress) {
        this.gateServerAddress = gateServerAddress;

        gateServerChannel = RpcUtils.generateGrpcManagedChannel(gateServerAddress);
    }

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