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
 * 对应文件: TravelerDuelChallengeDifficulty.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TravelerDuelChallengeDifficultyConfig {

    private final Integer recommendBuildRank;
    private final Integer recommendLevel;
    private final Integer id;
    private final List<Integer> effectId;
    private final Integer attr;

    @JsonCreator
    public TravelerDuelChallengeDifficultyConfig(
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("RecommendLevel") Integer recommendLevel,
        @JsonProperty("Id") Integer id,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("Attr") Integer attr
    ) {
        this.recommendBuildRank = recommendBuildRank;
        this.recommendLevel = recommendLevel;
        this.id = id;
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.attr = attr;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getRecommendLevel() {
        return this.recommendLevel;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getEffectId() {
        return this.effectId;
    }

    public Integer getAttr() {
        return this.attr;
    }

}
