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
 * 对应文件: MiningDemo.json.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MiningDemoConfigConfig {

    private final Integer id;
    private final List<Integer> gridList;
    private final List<Integer> rewardList;
    private final List<Integer> rewardAIndex;
    private final List<Integer> rewardBIndex;
    private final List<Integer> rewardCIndex;
    private final List<Integer> rewardDir;

    @JsonCreator
    public MiningDemoConfigConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GridList") List<Integer> gridList,
        @JsonProperty("RewardList") List<Integer> rewardList,
        @JsonProperty("RewardAIndex") List<Integer> rewardAIndex,
        @JsonProperty("RewardBIndex") List<Integer> rewardBIndex,
        @JsonProperty("RewardCIndex") List<Integer> rewardCIndex,
        @JsonProperty("RewardDir") List<Integer> rewardDir
    ) {
        this.id = id;
        this.gridList = gridList != null ? 
            new ArrayList<>(gridList) : 
            new ArrayList<>();
        this.rewardList = rewardList != null ? 
            new ArrayList<>(rewardList) : 
            new ArrayList<>();
        this.rewardAIndex = rewardAIndex != null ? 
            new ArrayList<>(rewardAIndex) : 
            new ArrayList<>();
        this.rewardBIndex = rewardBIndex != null ? 
            new ArrayList<>(rewardBIndex) : 
            new ArrayList<>();
        this.rewardCIndex = rewardCIndex != null ? 
            new ArrayList<>(rewardCIndex) : 
            new ArrayList<>();
        this.rewardDir = rewardDir != null ? 
            new ArrayList<>(rewardDir) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getGridList() {
        return this.gridList;
    }

    public List<Integer> getRewardList() {
        return this.rewardList;
    }

    public List<Integer> getRewardAIndex() {
        return this.rewardAIndex;
    }

    public List<Integer> getRewardBIndex() {
        return this.rewardBIndex;
    }

    public List<Integer> getRewardCIndex() {
        return this.rewardCIndex;
    }

    public List<Integer> getRewardDir() {
        return this.rewardDir;
    }

}
