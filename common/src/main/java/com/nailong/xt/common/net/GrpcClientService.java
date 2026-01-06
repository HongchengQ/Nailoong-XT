package com.nailong.xt.common.net;

import com.nailong.xt.proto.server.PackageServiceGrpc;
import com.nailong.xt.proto.server.Package;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class GrpcClientService {

    @Autowired
    private ManagedChannel managedChannel;

    public CompletableFuture<Package.CmdRespContext> sendPackageAsync(Package.CmdRequestContext request) {
        return CompletableFuture.supplyAsync(() -> {
            PackageServiceGrpc.PackageServiceBlockingStub stub = 
                PackageServiceGrpc.newBlockingStub(managedChannel);
            return stub.handleContextPackageRequest(request);
        });
    }

    public Package.CmdRespContext sendPackage(Package.CmdRequestContext request) {
        PackageServiceGrpc.PackageServiceBlockingStub stub = 
            PackageServiceGrpc.newBlockingStub(managedChannel);
        return stub.handleContextPackageRequest(request);
    }
}