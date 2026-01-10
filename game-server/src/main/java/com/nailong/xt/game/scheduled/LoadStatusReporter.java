package com.nailong.xt.game.scheduled;

import com.google.gson.Gson;
import com.nailong.xt.game.player.PlayerMgr;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.consul.ConsulClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 定时向注册中心上报服务器负载
 * kv形式 并非metadata
 */
@Service
@RequiredArgsConstructor
public class LoadStatusReporter {

    private final ConsulClient consulClient;
    private final ServiceInstance serviceInstance; // 当前实例信息

    @Scheduled(fixedRate = 5000) // 毫秒
    public void reportLoad() {
        String instanceId = serviceInstance.getInstanceId();
        String KV_PATH_PREFIX = "load/GameServer/";
        String key = KV_PATH_PREFIX + instanceId;

        // 构造负载数据，推荐使用JSON格式
        Map<String, Object> loadData = new HashMap<>();
        loadData.put("currentPlayers", PlayerMgr.playerMap.size());
        loadData.put("timestamp", System.currentTimeMillis());

        // 将数据转换为JSON字符串并写入Consul KV
        String value = new Gson().toJson(loadData);
        consulClient.setKVValue(key, value);
    }
}