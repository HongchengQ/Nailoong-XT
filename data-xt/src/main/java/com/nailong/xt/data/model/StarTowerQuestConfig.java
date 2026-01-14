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
 * 对应文件: StarTowerQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerQuestConfig {

    private final Integer id;
    private final String title;
    private final Integer towerQuestType;
    private final Integer reward1;
    private final Integer rewardQty1;
    private final Integer reward2;
    private final Integer rewardQty2;
    private final List<Integer> preTowerQuestIds;

    @JsonCreator
    public StarTowerQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("TowerQuestType") Integer towerQuestType,
        @JsonProperty("Reward1") Integer reward1,
        @JsonProperty("RewardQty1") Integer rewardQty1,
        @JsonProperty("Reward2") Integer reward2,
        @JsonProperty("RewardQty2") Integer rewardQty2,
        @JsonProperty("PreTowerQuestIds") List<Integer> preTowerQuestIds
    ) {
        this.id = id;
        this.title = title;
        this.towerQuestType = towerQuestType;
        this.reward1 = reward1;
        this.rewardQty1 = rewardQty1;
        this.reward2 = reward2;
        this.rewardQty2 = rewardQty2;
        this.preTowerQuestIds = preTowerQuestIds != null ? 
            new ArrayList<>(preTowerQuestIds) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getTowerQuestType() {
        return this.towerQuestType;
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

    public List<Integer> getPreTowerQuestIds() {
        return this.preTowerQuestIds;
    }

}
