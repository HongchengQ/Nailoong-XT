package com.nailong.xt.common.registry;

import com.nailong.xt.proto.server.Common;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务发现/注册 核心配置类
 */
@Component
@RequiredArgsConstructor
public class DiscoveryConfig {
    private final DiscoveryClient discoveryClient;

    public List<ServiceInstance> getTypeAllServers(Common.ServerType serverType) {
        return discoveryClient.getInstances(serverType.name());
    }
}
