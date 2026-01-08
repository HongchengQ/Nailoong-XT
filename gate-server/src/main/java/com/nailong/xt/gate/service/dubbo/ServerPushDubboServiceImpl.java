package com.nailong.xt.gate.service.dubbo;

import com.google.protobuf.Empty;
import com.nailong.xt.common.service.ServerPushService;
import com.nailong.xt.proto.server.Push;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * Gate服务器端实现，用于接收来自Game的推送消息
 */
@DubboService
@Log4j2
public class ServerPushDubboServiceImpl implements ServerPushService {

    @Override
    public Push.NoneMessage pushSingleNotify(Push.PushPacketNotify notify) {
        int reqContextCmdId = notify.getCmdId();
        String reqContextToken = notify.getToken();
        int reqContextUid = notify.getTargetPlayerUids(0);

        log.info("Received Dubbo notify from game server with cmdId: {}", reqContextCmdId);

        try {
            log.warn("99999999999999999999999999999999\nreqContextCmdId:{}", reqContextCmdId);

            return Push.NoneMessage.newBuilder().build();
        } catch (Exception e) {
            log.error("Error processing Dubbo notify from game server", e);
            throw e;
        }
    }
}