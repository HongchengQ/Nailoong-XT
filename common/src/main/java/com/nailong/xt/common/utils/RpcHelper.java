package com.nailong.xt.common.utils;

import com.google.gson.Gson;
import com.nailong.xt.common.model.bo.GameServiceKVLoadData;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.consul.ConsulClient;
import org.springframework.cloud.consul.model.http.kv.GetValue;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static com.nailong.xt.common.constants.KVPathPrefix.GAME_KV_PATH_PREFIX;

@Slf4j
@Component
@RequiredArgsConstructor
public class RpcHelper {

    private final ConsulClient consulClient;

    public GameServiceKVLoadData fetchLoadDataFromConsulKV(String instanceId) {
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
}
