package com.nailong.xt.gate.balancer;

import com.nailong.xt.common.enums.ServerTypeEnum;
import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import com.nailong.xt.common.utils.RpcHelper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Component
public class ConsulGameServerLoadBalancer {
    private final RpcHelper rpcHelper;
    private final DiscoveryClient discoveryClient;

    /**
     * 获取负载最低的 game 实例
     *
     * @return game
     */
    public ServiceInstance getLowestLoadInstance() {
        // 1. 通过Spring Cloud Commons获取服务实例列表
        List<ServiceInstance> instances = discoveryClient.getInstances(ServerTypeEnum.GameServer.name());
        if (instances.isEmpty()) {
            log.warn("{} 实例列表为空", ServerTypeEnum.GameServer.name());
            return null;
        }

        // 2. 为每个实例查询其Consul KV负载数据，并封装成选择对象
        List<ServerWithLoad> serversWithLoad = instances.stream()
                .map(instance -> {
                    GameServiceKVLoadData load = rpcHelper.fetchLoadDataFromConsulKV(instance.getInstanceId());
                    return new ServerWithLoad(instance, load);
                })
                .filter(server -> server.load != null && server.load.isHealthy()) // 过滤掉无数据或不健康的
                .toList();

        if (serversWithLoad.isEmpty()) {
            log.warn("{}中serversWithLoad 为空", ServerTypeEnum.GameServer.name());
            return null;
        }

        // 3. 应用选择策略：选择权重最高的服务器
        ServerWithLoad bestServer = serversWithLoad.stream()
                .max(Comparator.comparingInt(s -> s.load.getWeight()))
                .orElseThrow(() -> new IllegalStateException("No healthy instances available"));

        return bestServer.instance;
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
