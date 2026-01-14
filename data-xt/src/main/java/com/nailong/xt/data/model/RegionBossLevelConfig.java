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
 * 对应文件: RegionBossLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RegionBossLevelConfig {

    private final Integer id;
    private final Integer regionBossId;
    private final Integer difficulty;
    private final Integer regionType;
    private final String name;
    private final String desc;
    private final Integer suggestedPower;
    private final Integer recommendBuildRank;
    private final Integer needWorldClass;
    private final Integer floorId;
    private final String oneStarCondition;
    private final String twoStarCondition;
    private final String threeStarCondition;
    private final Integer sequentialDropId;
    private final Integer energyConsume;
    private final String baseAwardPreview;
    private final Integer entryGroupId1;
    private final Integer entryGroupLevel1;
    private final Integer entryGroupId2;
    private final Integer entryGroupLevel2;
    private final Integer entryGroupId3;
    private final Integer entryGroupLevel3;
    private final Integer entryGroupId4;
    private final Integer entryGroupLevel4;
    private final Integer entryGroupId5;
    private final Integer entryGroupLevel5;
    private final Integer preLevelId;
    private final Integer preLevelStar;
    private final Integer roundTableDropId;
    private final String roundTableGuarantee;

    @JsonCreator
    public RegionBossLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("RegionBossId") Integer regionBossId,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("RegionType") Integer regionType,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("NeedWorldClass") Integer needWorldClass,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("OneStarCondition") String oneStarCondition,
        @JsonProperty("TwoStarCondition") String twoStarCondition,
        @JsonProperty("ThreeStarCondition") String threeStarCondition,
        @JsonProperty("SequentialDropId") Integer sequentialDropId,
        @JsonProperty("EnergyConsume") Integer energyConsume,
        @JsonProperty("BaseAwardPreview") String baseAwardPreview,
        @JsonProperty("EntryGroupId1") Integer entryGroupId1,
        @JsonProperty("EntryGroupLevel1") Integer entryGroupLevel1,
        @JsonProperty("EntryGroupId2") Integer entryGroupId2,
        @JsonProperty("EntryGroupLevel2") Integer entryGroupLevel2,
        @JsonProperty("EntryGroupId3") Integer entryGroupId3,
        @JsonProperty("EntryGroupLevel3") Integer entryGroupLevel3,
        @JsonProperty("EntryGroupId4") Integer entryGroupId4,
        @JsonProperty("EntryGroupLevel4") Integer entryGroupLevel4,
        @JsonProperty("EntryGroupId5") Integer entryGroupId5,
        @JsonProperty("EntryGroupLevel5") Integer entryGroupLevel5,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("PreLevelStar") Integer preLevelStar,
        @JsonProperty("RoundTableDropId") Integer roundTableDropId,
        @JsonProperty("RoundTableGuarantee") String roundTableGuarantee
    ) {
        this.id = id;
        this.regionBossId = regionBossId;
        this.difficulty = difficulty;
        this.regionType = regionType;
        this.name = name;
        this.desc = desc;
        this.suggestedPower = suggestedPower;
        this.recommendBuildRank = recommendBuildRank;
        this.needWorldClass = needWorldClass;
        this.floorId = floorId;
        this.oneStarCondition = oneStarCondition;
        this.twoStarCondition = twoStarCondition;
        this.threeStarCondition = threeStarCondition;
        this.sequentialDropId = sequentialDropId;
        this.energyConsume = energyConsume;
        this.baseAwardPreview = baseAwardPreview;
        this.entryGroupId1 = entryGroupId1;
        this.entryGroupLevel1 = entryGroupLevel1;
        this.entryGroupId2 = entryGroupId2;
        this.entryGroupLevel2 = entryGroupLevel2;
        this.entryGroupId3 = entryGroupId3;
        this.entryGroupLevel3 = entryGroupLevel3;
        this.entryGroupId4 = entryGroupId4;
        this.entryGroupLevel4 = entryGroupLevel4;
        this.entryGroupId5 = entryGroupId5;
        this.entryGroupLevel5 = entryGroupLevel5;
        this.preLevelId = preLevelId;
        this.preLevelStar = preLevelStar;
        this.roundTableDropId = roundTableDropId;
        this.roundTableGuarantee = roundTableGuarantee;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRegionBossId() {
        return this.regionBossId;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getRegionType() {
        return this.regionType;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public String getOneStarCondition() {
        return this.oneStarCondition;
    }

    public String getTwoStarCondition() {
        return this.twoStarCondition;
    }

    public String getThreeStarCondition() {
        return this.threeStarCondition;
    }

    public Integer getSequentialDropId() {
        return this.sequentialDropId;
    }

    public Integer getEnergyConsume() {
        return this.energyConsume;
    }

    public String getBaseAwardPreview() {
        return this.baseAwardPreview;
    }

    public Integer getEntryGroupId1() {
        return this.entryGroupId1;
    }

    public Integer getEntryGroupLevel1() {
        return this.entryGroupLevel1;
    }

    public Integer getEntryGroupId2() {
        return this.entryGroupId2;
    }

    public Integer getEntryGroupLevel2() {
        return this.entryGroupLevel2;
    }

    public Integer getEntryGroupId3() {
        return this.entryGroupId3;
    }

    public Integer getEntryGroupLevel3() {
        return this.entryGroupLevel3;
    }

    public Integer getEntryGroupId4() {
        return this.entryGroupId4;
    }

    public Integer getEntryGroupLevel4() {
        return this.entryGroupLevel4;
    }

    public Integer getEntryGroupId5() {
        return this.entryGroupId5;
    }

    public Integer getEntryGroupLevel5() {
        return this.entryGroupLevel5;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getPreLevelStar() {
        return this.preLevelStar;
    }

    public Integer getRoundTableDropId() {
        return this.roundTableDropId;
    }

    public String getRoundTableGuarantee() {
        return this.roundTableGuarantee;
    }

}
