package com.nailong.xt.gate.net;

import com.nailong.xt.proto.server.PackageServiceGrpc;
import com.nailong.xt.proto.server.Package;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class GateToGameGrpcService {

    @Autowired
    private ManagedChannel gameServerChannel;

    public CompletableFuture<Package.CmdRespContext> sendPackageAsync(Package.CmdRequestContext request) {
        return CompletableFuture.supplyAsync(() -> {
            PackageServiceGrpc.PackageServiceBlockingStub stub = 
                PackageServiceGrpc.newBlockingStub(gameServerChannel);
            return stub.handleContextPackageRequest(request);
        });
    }

    public Package.CmdRespContext sendPackage(Package.CmdRequestContext request) {
        PackageServiceGrpc.PackageServiceBlockingStub stub = 
            PackageServiceGrpc.newBlockingStub(gameServerChannel);
        return stub.handleContextPackageRequest(request);
    }
}