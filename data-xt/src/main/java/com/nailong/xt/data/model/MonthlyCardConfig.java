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
 * 对应文件: MonthlyCard.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonthlyCardConfig {

    private final Integer id;
    private final Integer cardId;
    private final Integer rewardId1;
    private final Integer rewardNum1;
    private final Integer rewardId2;
    private final Integer rewardNum2;

    @JsonCreator
    public MonthlyCardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CardId") Integer cardId,
        @JsonProperty("RewardId1") Integer rewardId1,
        @JsonProperty("RewardNum1") Integer rewardNum1,
        @JsonProperty("RewardId2") Integer rewardId2,
        @JsonProperty("RewardNum2") Integer rewardNum2
    ) {
        this.id = id;
        this.cardId = cardId;
        this.rewardId1 = rewardId1;
        this.rewardNum1 = rewardNum1;
        this.rewardId2 = rewardId2;
        this.rewardNum2 = rewardNum2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCardId() {
        return this.cardId;
    }

    public Integer getRewardId1() {
        return this.rewardId1;
    }

    public Integer getRewardNum1() {
        return this.rewardNum1;
    }

    public Integer getRewardId2() {
        return this.rewardId2;
    }

    public Integer getRewardNum2() {
        return this.rewardNum2;
    }

}
