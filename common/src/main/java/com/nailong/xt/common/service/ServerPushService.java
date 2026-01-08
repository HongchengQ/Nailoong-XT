package com.nailong.xt.common.service;

import com.nailong.xt.proto.server.Push;

/**
 * 用于Game向Gate推送消息的服务接口
 */
public interface ServerPushService {
    /**
     * 推送单个通知
     *
     * @param notify 通知消息
     * @return Empty
     */
    Push.NoneMessage pushSingleNotify(Push.PushPacketNotify notify);
}