package com.nailong.xt.gate.service.grpc.send;

import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import com.nailong.xt.proto.server.PlayerCommandServiceGrpc;
import io.grpc.ManagedChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class SendPackageToGame {

    private final ManagedChannel gameServerChannel;

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