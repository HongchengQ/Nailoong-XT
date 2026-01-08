package com.nailong.xt.game.service.dubbo;

import com.nailong.xt.common.service.ServerPushService;
import com.nailong.xt.proto.server.Push;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class SendServerPushService {

    @DubboReference
    ServerPushService serverPushService;

    public CompletableFuture<Push.NoneMessage> pushPackageAsync(Push.PushPacketNotify notify) {
        return CompletableFuture.supplyAsync(() -> serverPushService.pushSingleNotify(notify));
    }

    public Push.NoneMessage pushPackage(Push.PushPacketNotify notify) {
        return serverPushService.pushSingleNotify(notify);
    }
}
