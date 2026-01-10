package com.nailong.xt.gate.controller;

import com.nailong.xt.common.enums.ServerTypeEnum;
import com.nailong.xt.gate.balancer.ConsulGameServerLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    RestTemplate restTemplate = new RestTemplate();

//    @Autowired
//    LoadBalancerClient loadBalancerClient; // 注入LoadBalancerClient
//    ServiceInstance instance = loadBalancerClient.choose("GameServer"); // 获取服务实例

    @Autowired
    ConsulGameServerLoadBalancer consulGameServerLoadBalancer;

    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances(ServerTypeEnum.GameServer.name());

        if (!list.isEmpty()) {
            System.out.println(list.getFirst().getServiceId());
        }

        return list.toString();
    }

    @RequestMapping(path = "/test")
    public String test() {
        ServiceInstance serviceInstance = consulGameServerLoadBalancer.getLowestLoadInstance();

        System.out.println(serviceInstance.getHost());
        System.out.println(serviceInstance.getInstanceId());
        System.out.println(serviceInstance.getServiceId());
        System.out.println(Objects.requireNonNull(serviceInstance.getMetadata()));
        return "";
    }
}
