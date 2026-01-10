package com.nailong.xt.game.player;

import com.google.protobuf.Empty;
import com.nailong.xt.common.utils.RpcHelper;
import com.nailong.xt.common.utils.RpcUtils;
import com.nailong.xt.proto.server.Push;
import com.nailong.xt.proto.server.ServerPushServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * Game Server to Gate Server 消息服务
 * 提供game server向gate server主动发送消息的功能
 */
@Slf4j
public class PlayerBindInstance {
    RpcHelper rpcHelper;

    ManagedChannel gateServerChannel;

    // 提供通道的服务器实例 - 从注册中心拿
    ServiceInstance instance;

    public PlayerBindInstance(String gateServerAddress) {
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