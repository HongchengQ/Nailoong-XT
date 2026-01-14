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
 * 对应文件: WorldClass.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WorldClassConfig {

    private final Integer id;
    private final Integer rewardLimit;
    private final List<Integer> openFunc;
    private final String funcChangeText1;
    private final String funcChangeText2;
    private final String funcChangeText3;
    private final Integer exp;
    private final String reward;

    @JsonCreator
    public WorldClassConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("RewardLimit") Integer rewardLimit,
        @JsonProperty("OpenFunc") List<Integer> openFunc,
        @JsonProperty("FuncChangeText1") String funcChangeText1,
        @JsonProperty("FuncChangeText2") String funcChangeText2,
        @JsonProperty("FuncChangeText3") String funcChangeText3,
        @JsonProperty("Exp") Integer exp,
        @JsonProperty("Reward") String reward
    ) {
        this.id = id;
        this.rewardLimit = rewardLimit;
        this.openFunc = openFunc != null ? 
            new ArrayList<>(openFunc) : 
            new ArrayList<>();
        this.funcChangeText1 = funcChangeText1;
        this.funcChangeText2 = funcChangeText2;
        this.funcChangeText3 = funcChangeText3;
        this.exp = exp;
        this.reward = reward;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRewardLimit() {
        return this.rewardLimit;
    }

    public List<Integer> getOpenFunc() {
        return this.openFunc;
    }

    public String getFuncChangeText1() {
        return this.funcChangeText1;
    }

    public String getFuncChangeText2() {
        return this.funcChangeText2;
    }

    public String getFuncChangeText3() {
        return this.funcChangeText3;
    }

    public Integer getExp() {
        return this.exp;
    }

    public String getReward() {
        return this.reward;
    }

}
