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
 * 对应文件: TrialGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialGroupConfig {

    private final Integer id;
    private final Integer trialChar;
    private final List<Integer> masterPotential;
    private final List<Integer> assistPotential;
    private final Integer rewardId1;
    private final Integer qty1;
    private final Integer rewardId2;
    private final Integer qty2;
    private final Integer rewardId3;
    private final Integer qty3;

    @JsonCreator
    public TrialGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TrialChar") Integer trialChar,
        @JsonProperty("MasterPotential") List<Integer> masterPotential,
        @JsonProperty("AssistPotential") List<Integer> assistPotential,
        @JsonProperty("RewardId1") Integer rewardId1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("RewardId2") Integer rewardId2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("RewardId3") Integer rewardId3,
        @JsonProperty("Qty3") Integer qty3
    ) {
        this.id = id;
        this.trialChar = trialChar;
        this.masterPotential = masterPotential != null ? 
            new ArrayList<>(masterPotential) : 
            new ArrayList<>();
        this.assistPotential = assistPotential != null ? 
            new ArrayList<>(assistPotential) : 
            new ArrayList<>();
        this.rewardId1 = rewardId1;
        this.qty1 = qty1;
        this.rewardId2 = rewardId2;
        this.qty2 = qty2;
        this.rewardId3 = rewardId3;
        this.qty3 = qty3;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTrialChar() {
        return this.trialChar;
    }

    public List<Integer> getMasterPotential() {
        return this.masterPotential;
    }

    public List<Integer> getAssistPotential() {
        return this.assistPotential;
    }

    public Integer getRewardId1() {
        return this.rewardId1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getRewardId2() {
        return this.rewardId2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getRewardId3() {
        return this.rewardId3;
    }

    public Integer getQty3() {
        return this.qty3;
    }

}
