package com.nailong.xt.gate.service.dubbo;

import com.nailong.xt.common.service.PlayerCommandService;
import com.nailong.xt.proto.server.Command.CmdReqContext;
import com.nailong.xt.proto.server.Command.CmdRspContext;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class SendReqPackageService {

    @DubboReference
    private PlayerCommandService playerCommandService;

    public CompletableFuture<CmdRspContext> sendPackageAsync(CmdReqContext request) {
        return CompletableFuture.supplyAsync(() -> playerCommandService.handlePlayerRequest(request));
    }

    public CmdRspContext sendPackage(CmdReqContext request) {
        return playerCommandService.handlePlayerRequest(request);
    }
}