package com.nailong.xt.common.model.bo;

import com.nailong.xt.common.utils.Utils;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GameServiceKVLoadData {
    // 负载权重 0-10 数值越高越容易被连接 0不被连接
    private int weight;

    // 程序固定属性 从metadata获取
    private String appid;
    private String grpcServer;
    private String region;

    // 玩家
    private int currentPlayers;
    private int maxPlayers;

    // 最后更新时间戳 单位秒
    private long timestamp;

    // 健康状态判断，数据是否过期（超过10秒）
    public boolean isHealthy() {
        return Utils.getCurrentServerTime() - timestamp < 10;
    }
}
