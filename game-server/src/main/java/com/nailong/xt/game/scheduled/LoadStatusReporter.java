package com.nailong.xt.game.scheduled;

import com.google.gson.Gson;
import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import com.nailong.xt.common.utils.Utils;
import com.nailong.xt.game.player.PlayerMgr;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.consul.ConsulClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.nailong.xt.common.constants.KVPathPrefix.GAME_KV_PATH_PREFIX;

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
        String key = GAME_KV_PATH_PREFIX + instanceId;

        int currentPlayers = PlayerMgr.getAllPlayers();

        // 程序固定属性 从metadata获取
        int maxPlayers = 0;
        String appid = "";
        String grpcServer = "";
        String region = "";
        Map<String, String> metadata = serviceInstance.getMetadata();
        if (metadata != null) {
            maxPlayers = Integer.parseInt(metadata.get("maxPlayers"));
            appid = metadata.get("appid");
            grpcServer = metadata.get("grpcServer");
            region = metadata.get("grpcServer");
        }

        // 构造负载数据
        GameServiceKVLoadData loadData = GameServiceKVLoadData.builder()
                .weight(computeWeight(currentPlayers, maxPlayers))
                .appid(appid)
                .grpcServer(grpcServer)
                .region(region)
                .currentPlayers(currentPlayers)
                .maxPlayers(maxPlayers)
                .timestamp(Utils.getCurrentServerTime())
                .build();

        // 将数据转换为JSON字符串并写入Consul KV
        String value = new Gson().toJson(loadData);
        consulClient.setKVValue(key, value);
    }

    /**
     * 计算负载均衡权重
     *
     * @param currentPlayers 当前在线玩家
     * @return 0-10 数值越高越容易被连接 0不被连接
     */
    private int computeWeight(int currentPlayers, int maxPlayers) {
        int playerCountWeight = 10;

        // todo
        // 最大人数的0.9倍 -> 权重0 禁止新连接
        if (currentPlayers >= (maxPlayers * 0.9f)) {
            playerCountWeight = 0;
        }
        // 最大人数的0.75倍 -> 权重1
        if (currentPlayers >= (maxPlayers * 0.75d)) {
            playerCountWeight = 1;
        }
        if (currentPlayers >= (maxPlayers * 0.1f)) {
            playerCountWeight = 9;
        }

        return playerCountWeight;
    }

    /**
     * 清理自身创建的 KV
     */
    @PreDestroy
    public void destroy() {
        String instanceId = serviceInstance.getInstanceId();
        String key = GAME_KV_PATH_PREFIX + instanceId;

        consulClient.deleteKVValues(key);
    }
}