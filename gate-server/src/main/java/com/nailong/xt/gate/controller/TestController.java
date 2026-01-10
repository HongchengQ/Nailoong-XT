package com.nailong.xt.gate.controller;

import com.nailong.xt.proto.server.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.consul.ConsulClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    ConsulClient consulClient;

    RestTemplate restTemplate = new RestTemplate();

    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient.getInstances(Common.ServerType.GameServer.name());

        if (!list.isEmpty()) {
            System.out.println(list.getFirst().getServiceId());
        }

        return list.toString();
    }

    @RequestMapping(path = "/test")
    public String test() {
//        return this.restTemplate.getForObject("http://game/actuator/health", String.class);
        return serviceUrl();
    }
}
