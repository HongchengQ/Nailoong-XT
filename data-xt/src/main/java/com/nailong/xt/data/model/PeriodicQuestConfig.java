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
 * 对应文件: PeriodicQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PeriodicQuestConfig {

    private final Integer id;
    private final Integer belong;
    private final Integer groupid;
    private final String title;
    private final Integer reward;
    private final Integer rewardQty;
    private final Integer jumpTo;

    @JsonCreator
    public PeriodicQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Belong") Integer belong,
        @JsonProperty("Groupid") Integer groupid,
        @JsonProperty("Title") String title,
        @JsonProperty("Reward") Integer reward,
        @JsonProperty("RewardQty") Integer rewardQty,
        @JsonProperty("JumpTo") Integer jumpTo
    ) {
        this.id = id;
        this.belong = belong;
        this.groupid = groupid;
        this.title = title;
        this.reward = reward;
        this.rewardQty = rewardQty;
        this.jumpTo = jumpTo;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBelong() {
        return this.belong;
    }

    public Integer getGroupid() {
        return this.groupid;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getReward() {
        return this.reward;
    }

    public Integer getRewardQty() {
        return this.rewardQty;
    }

    public Integer getJumpTo() {
        return this.jumpTo;
    }

}
