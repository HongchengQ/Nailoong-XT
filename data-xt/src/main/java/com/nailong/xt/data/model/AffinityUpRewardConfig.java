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
 * 对应文件: AffinityUpReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AffinityUpRewardConfig {

    private final Integer id;
    private final Integer charId;
    private final Integer rewardLevel;
    private final String descFront1;
    private final String descFront2;
    private final String descFront3;
    private final String descAfter1;
    private final String descAfter2;
    private final String descAfter3;
    private final List<Integer> reward1;

    @JsonCreator
    public AffinityUpRewardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("RewardLevel") Integer rewardLevel,
        @JsonProperty("DescFront1") String descFront1,
        @JsonProperty("DescFront2") String descFront2,
        @JsonProperty("DescFront3") String descFront3,
        @JsonProperty("DescAfter1") String descAfter1,
        @JsonProperty("DescAfter2") String descAfter2,
        @JsonProperty("DescAfter3") String descAfter3,
        @JsonProperty("Reward1") List<Integer> reward1
    ) {
        this.id = id;
        this.charId = charId;
        this.rewardLevel = rewardLevel;
        this.descFront1 = descFront1;
        this.descFront2 = descFront2;
        this.descFront3 = descFront3;
        this.descAfter1 = descAfter1;
        this.descAfter2 = descAfter2;
        this.descAfter3 = descAfter3;
        this.reward1 = reward1 != null ? 
            new ArrayList<>(reward1) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getRewardLevel() {
        return this.rewardLevel;
    }

    public String getDescFront1() {
        return this.descFront1;
    }

    public String getDescFront2() {
        return this.descFront2;
    }

    public String getDescFront3() {
        return this.descFront3;
    }

    public String getDescAfter1() {
        return this.descAfter1;
    }

    public String getDescAfter2() {
        return this.descAfter2;
    }

    public String getDescAfter3() {
        return this.descAfter3;
    }

    public List<Integer> getReward1() {
        return this.reward1;
    }

}
