package com.nailong.xt.gate.network;

import com.nailong.xt.common.utils.GrpcClientUtils;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import com.nailong.xt.proto.server.PlayerCommandServiceGrpc;
import io.grpc.ManagedChannel;
import org.springframework.cloud.client.ServiceInstance;

import java.util.concurrent.CompletableFuture;

public class PlayerBindInstance {

    // grpc 通道
    ManagedChannel gameServerChannel;

    // 提供通道的服务器实例 - 从注册中心拿
    ServiceInstance instance;

    public PlayerBindInstance(String gameServerAddress) {
        gameServerChannel = GrpcClientUtils.generateGrpcManagedChannel(gameServerAddress);
    }

    public CompletableFuture<CmdRspContext> sendPackageAsync(CmdReqContext request) {
        return CompletableFuture.supplyAsync(() -> {
            PlayerCommandServiceGrpc.PlayerCommandServiceBlockingStub stub =
                    PlayerCommandServiceGrpc.newBlockingStub(gameServerChannel);
            return stub.handlePlayerRequest(request);
        });
    }

    public CmdRspContext sendPackage(CmdReqContext request) {
        PlayerCommandServiceGrpc.PlayerCommandServiceBlockingStub stub =
                PlayerCommandServiceGrpc.newBlockingStub(gameServerChannel);
        return stub.handlePlayerRequest(request);
    }
}