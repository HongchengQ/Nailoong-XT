package com.nailong.xt.gate.balancer;

import com.google.gson.Gson;
import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import com.nailong.xt.proto.server.Common;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.consul.ConsulClient;
import org.springframework.cloud.consul.model.http.kv.GetValue;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static com.nailong.xt.common.constants.KVPathPrefix.GAME_KV_PATH_PREFIX;

@RequiredArgsConstructor
@Slf4j
@Component
public class ConsulGameServerLoadBalancer {
    private final ConsulClient consulClient;
    private final DiscoveryClient discoveryClient;

    public ServiceInstance getLowestLoadInstance() {
        // 1. 通过Spring Cloud Commons获取服务实例列表
        List<ServiceInstance> instances = discoveryClient.getInstances(Common.ServerType.GameServer.name());
        if (instances.isEmpty()) {
            log.warn("{} 实例列表为空", Common.ServerType.GameServer.name());
            return null;
        }

        // 2. 为每个实例查询其Consul KV负载数据，并封装成选择对象
        List<ServerWithLoad> serversWithLoad = instances.stream()
                .map(instance -> {
                    GameServiceKVLoadData load = fetchLoadDataFromConsulKV(instance.getInstanceId());
                    return new ServerWithLoad(instance, load);
                })
                .filter(server -> server.load != null && server.load.isHealthy()) // 过滤掉无数据或不健康的
                .toList();

        if (serversWithLoad.isEmpty()) {
            log.warn("{}中serversWithLoad 为空", Common.ServerType.GameServer.name());
            return null;
        }

        // 3. 应用选择策略：选择权重最高的服务器
        ServerWithLoad bestServer = serversWithLoad.stream()
                .max(Comparator.comparingInt(s -> s.load.getWeight()))
                .orElseThrow(() -> new IllegalStateException("No healthy instances available"));

        return bestServer.instance;
    }

    private GameServiceKVLoadData fetchLoadDataFromConsulKV(String instanceId) {
        try {
            String key = GAME_KV_PATH_PREFIX + instanceId;
            GetValue kvResponse = Objects.requireNonNull(consulClient.getKVValue(key, null).getBody()).getFirst();

            if (kvResponse.getDecodedValue() != null) {
                String json = kvResponse.getDecodedValue();
                // 解析JSON，返回负载对象
                return new Gson().fromJson(json, GameServiceKVLoadData.class);
            }
        } catch (Exception e) {
            log.warn("Failed to fetch load data from Consul for instance: {}", instanceId, e);
        }
        return null;
    }
//    private KVLoadData fetchLoadDataFromConsulKV(String instanceId) {
//        try {
//            String KV_PATH_PREFIX = "load/GameServer/";
//            String key = KV_PATH_PREFIX + instanceId;
//            Response<GetValue> kvResponse = consulClient.getKVValue(key);
//            if (kvResponse.getValue() != null) {
//                String json = kvResponse.getValue().getDecodedValue();
//                // 解析JSON，返回负载对象
//                return new Gson().fromJson(json, KVLoadData.class);
//            }
//        } catch (Exception e) {
//            log.warn("Failed to fetch load data from Consul for instance: {}", instanceId, e);
//        }
//        return null;
//    }

    // 内部辅助类
    @AllArgsConstructor
    private static class ServerWithLoad {
        ServiceInstance instance;
        GameServiceKVLoadData load;
    }
}
