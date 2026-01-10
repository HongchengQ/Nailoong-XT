package com.nailong.xt.gate.network;

import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import com.nailong.xt.common.utils.RpcUtils;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import com.nailong.xt.proto.server.PlayerCommandServiceGrpc;
import io.grpc.ManagedChannel;
import org.springframework.cloud.client.ServiceInstance;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class PlayerBindInstance {

    // grpc 通道
    ManagedChannel gameServerChannel;

    // 提供通道的服务器实例 - 从注册中心拿
    ServiceInstance instance;


    public PlayerBindInstance(ServiceInstance instance) {
        this.instance = instance;

        gameServerChannel = RpcUtils.generateGrpcManagedChannel(
                Objects.requireNonNull(instance.getMetadata()).get("grpcServer")
        );
    }

    /**
     * 测试用
     */
    public PlayerBindInstance(String gameServerAddress) {
        gameServerChannel = RpcUtils.generateGrpcManagedChannel(gameServerAddress);
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