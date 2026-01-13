package com.nailong.xt.common.consul;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * consul 资源自动卸载
 * 防止关闭程序时报错
 * 不知道为什么这对 gate的一个异常不生效
 */
@Component
@RequiredArgsConstructor
public class ConsulDestroy implements SmartLifecycle {
    private final AbstractAutoServiceRegistration<?> abstractAutoServiceRegistration;

    boolean isRunning = false;

    @Override
    public void start() {
        isRunning = true;
    }

    @Override
    public void stop() {
        try {
            abstractAutoServiceRegistration.stop();
        } catch (Exception _) {
        }
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public int getPhase() {
        return Integer.MAX_VALUE;
    }
}
