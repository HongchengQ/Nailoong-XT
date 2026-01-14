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
 * 对应文件: ActivityTaskGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityTaskGroupConfig {

    private final Integer id;
    private final Integer taskTabType;
    private final String activityGroupName;
    private final Integer activityId;
    private final Integer order;
    private final Integer reward1;
    private final Integer rewardQty1;
    private final Integer reward2;
    private final Integer rewardQty2;
    private final Integer reward3;
    private final Integer rewardQty3;
    private final Integer reward4;
    private final Integer rewardQty4;
    private final Integer reward5;
    private final Integer rewardQty5;
    private final Integer reward6;
    private final Integer rewardQty6;

    @JsonCreator
    public ActivityTaskGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TaskTabType") Integer taskTabType,
        @JsonProperty("ActivityGroupName") String activityGroupName,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("Order") Integer order,
        @JsonProperty("Reward1") Integer reward1,
        @JsonProperty("RewardQty1") Integer rewardQty1,
        @JsonProperty("Reward2") Integer reward2,
        @JsonProperty("RewardQty2") Integer rewardQty2,
        @JsonProperty("Reward3") Integer reward3,
        @JsonProperty("RewardQty3") Integer rewardQty3,
        @JsonProperty("Reward4") Integer reward4,
        @JsonProperty("RewardQty4") Integer rewardQty4,
        @JsonProperty("Reward5") Integer reward5,
        @JsonProperty("RewardQty5") Integer rewardQty5,
        @JsonProperty("Reward6") Integer reward6,
        @JsonProperty("RewardQty6") Integer rewardQty6
    ) {
        this.id = id;
        this.taskTabType = taskTabType;
        this.activityGroupName = activityGroupName;
        this.activityId = activityId;
        this.order = order;
        this.reward1 = reward1;
        this.rewardQty1 = rewardQty1;
        this.reward2 = reward2;
        this.rewardQty2 = rewardQty2;
        this.reward3 = reward3;
        this.rewardQty3 = rewardQty3;
        this.reward4 = reward4;
        this.rewardQty4 = rewardQty4;
        this.reward5 = reward5;
        this.rewardQty5 = rewardQty5;
        this.reward6 = reward6;
        this.rewardQty6 = rewardQty6;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTaskTabType() {
        return this.taskTabType;
    }

    public String getActivityGroupName() {
        return this.activityGroupName;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Integer getReward1() {
        return this.reward1;
    }

    public Integer getRewardQty1() {
        return this.rewardQty1;
    }

    public Integer getReward2() {
        return this.reward2;
    }

    public Integer getRewardQty2() {
        return this.rewardQty2;
    }

    public Integer getReward3() {
        return this.reward3;
    }

    public Integer getRewardQty3() {
        return this.rewardQty3;
    }

    public Integer getReward4() {
        return this.reward4;
    }

    public Integer getRewardQty4() {
        return this.rewardQty4;
    }

    public Integer getReward5() {
        return this.reward5;
    }

    public Integer getRewardQty5() {
        return this.rewardQty5;
    }

    public Integer getReward6() {
        return this.reward6;
    }

    public Integer getRewardQty6() {
        return this.rewardQty6;
    }

}
