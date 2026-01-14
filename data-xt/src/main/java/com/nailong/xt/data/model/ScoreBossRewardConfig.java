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
 * 对应文件: ScoreBossReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossRewardConfig {

    private final Integer id;
    private final Integer starNeed;
    private final Integer rewardItemId1;
    private final Integer rewardNum1;

    @JsonCreator
    public ScoreBossRewardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("StarNeed") Integer starNeed,
        @JsonProperty("RewardItemId1") Integer rewardItemId1,
        @JsonProperty("RewardNum1") Integer rewardNum1
    ) {
        this.id = id;
        this.starNeed = starNeed;
        this.rewardItemId1 = rewardItemId1;
        this.rewardNum1 = rewardNum1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getStarNeed() {
        return this.starNeed;
    }

    public Integer getRewardItemId1() {
        return this.rewardItemId1;
    }

    public Integer getRewardNum1() {
        return this.rewardNum1;
    }

}
