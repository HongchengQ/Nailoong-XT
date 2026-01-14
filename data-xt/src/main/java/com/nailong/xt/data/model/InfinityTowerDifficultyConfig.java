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
 * 对应文件: InfinityTowerDifficulty.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerDifficultyConfig {

    private final Integer id;
    private final String name;
    private final Integer towerId;
    private final Integer unlockWorldClass;
    private final String unlockTips;
    private final Integer recommendLevel;
    private final Integer recommendBuildRank;
    private final Integer sort;
    private final Boolean isChallenge;

    @JsonCreator
    public InfinityTowerDifficultyConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("TowerId") Integer towerId,
        @JsonProperty("UnlockWorldClass") Integer unlockWorldClass,
        @JsonProperty("UnlockTips") String unlockTips,
        @JsonProperty("RecommendLevel") Integer recommendLevel,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("IsChallenge") Boolean isChallenge
    ) {
        this.id = id;
        this.name = name;
        this.towerId = towerId;
        this.unlockWorldClass = unlockWorldClass;
        this.unlockTips = unlockTips;
        this.recommendLevel = recommendLevel;
        this.recommendBuildRank = recommendBuildRank;
        this.sort = sort;
        this.isChallenge = isChallenge;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getTowerId() {
        return this.towerId;
    }

    public Integer getUnlockWorldClass() {
        return this.unlockWorldClass;
    }

    public String getUnlockTips() {
        return this.unlockTips;
    }

    public Integer getRecommendLevel() {
        return this.recommendLevel;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Boolean getIsChallenge() {
        return this.isChallenge;
    }

}
