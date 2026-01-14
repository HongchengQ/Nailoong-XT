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
 * 对应文件: InfinityTowerLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerLevelConfig {

    private final Integer id;
    private final String name;
    private final Integer difficultyId;
    private final Integer levelType;
    private final Integer floor;
    private final Integer floorId;
    private final Integer awardDropId;
    private final Integer recommendLv;
    private final Integer recommendBuildRank;
    private final String baseAwardPreview;
    private final Integer entryCond;
    private final List<Integer> entryCondParam;

    @JsonCreator
    public InfinityTowerLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("DifficultyId") Integer difficultyId,
        @JsonProperty("LevelType") Integer levelType,
        @JsonProperty("Floor") Integer floor,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("AwardDropId") Integer awardDropId,
        @JsonProperty("RecommendLv") Integer recommendLv,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("BaseAwardPreview") String baseAwardPreview,
        @JsonProperty("EntryCond") Integer entryCond,
        @JsonProperty("EntryCondParam") List<Integer> entryCondParam
    ) {
        this.id = id;
        this.name = name;
        this.difficultyId = difficultyId;
        this.levelType = levelType;
        this.floor = floor;
        this.floorId = floorId;
        this.awardDropId = awardDropId;
        this.recommendLv = recommendLv;
        this.recommendBuildRank = recommendBuildRank;
        this.baseAwardPreview = baseAwardPreview;
        this.entryCond = entryCond;
        this.entryCondParam = entryCondParam != null ? 
            new ArrayList<>(entryCondParam) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getDifficultyId() {
        return this.difficultyId;
    }

    public Integer getLevelType() {
        return this.levelType;
    }

    public Integer getFloor() {
        return this.floor;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getAwardDropId() {
        return this.awardDropId;
    }

    public Integer getRecommendLv() {
        return this.recommendLv;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public String getBaseAwardPreview() {
        return this.baseAwardPreview;
    }

    public Integer getEntryCond() {
        return this.entryCond;
    }

    public List<Integer> getEntryCondParam() {
        return this.entryCondParam;
    }

}
