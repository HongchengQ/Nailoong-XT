package com.nailong.xt.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 自动生成的配置类。
 * 对应文件: MiningStory.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MiningStoryConfig {

    private final Integer id;
    private final Integer activityId;
    private final String avgId;
    private final Integer unlockLayer;
    private final Integer reward;
    private final Integer rewardQty;

    @JsonCreator
    public MiningStoryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("AvgId") String avgId,
        @JsonProperty("UnlockLayer") Integer unlockLayer,
        @JsonProperty("Reward") Integer reward,
        @JsonProperty("RewardQty") Integer rewardQty
    ) {
        this.id = id;
        this.activityId = activityId;
        this.avgId = avgId;
        this.unlockLayer = unlockLayer;
        this.reward = reward;
        this.rewardQty = rewardQty;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getAvgId() {
        return this.avgId;
    }

    public Integer getUnlockLayer() {
        return this.unlockLayer;
    }

    public Integer getReward() {
        return this.reward;
    }

    public Integer getRewardQty() {
        return this.rewardQty;
    }

}
