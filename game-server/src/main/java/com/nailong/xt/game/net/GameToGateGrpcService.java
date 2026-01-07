package com.nailong.xt.game.net;

import com.nailong.xt.proto.server.Package;
import com.nailong.xt.proto.server.PackageServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class GameToGateGrpcService {
    @Autowired
    private ManagedChannel gameServerChannel;


    public CompletableFuture<com.nailong.xt.proto.server.Package.CmdRespContext> sendPackageAsync(com.nailong.xt.proto.server.Package.CmdRequestContext request) {
        return CompletableFuture.supplyAsync(() -> {
            PackageServiceGrpc.PackageServiceBlockingStub stub =
                    PackageServiceGrpc.newBlockingStub(gameServerChannel);
            return stub.handleGameToGatePackageRequest(request);
        });
    }

    public com.nailong.xt.proto.server.Package.CmdRespContext sendPackage(Package.CmdRequestContext request) {
        PackageServiceGrpc.PackageServiceBlockingStub stub =
                PackageServiceGrpc.newBlockingStub(gameServerChannel);
        return stub.handleGameToGatePackageRequest(request);
    }
}