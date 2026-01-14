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
 * 对应文件: WeekBossLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WeekBossLevelConfig {

    private final Integer id;
    private final Integer type;
    private final Integer difficulty;
    private final String name;
    private final Integer suggestedBuild;
    private final Integer suggestedPower;
    private final Integer bossShowTime;
    private final Integer needWorldClass;
    private final Integer floorId;
    private final Integer roundTableDropId;
    private final String roundTableGuarantee;
    private final Integer sequentialDropId;
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

    @JsonCreator
    public WeekBossLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("Name") String name,
        @JsonProperty("SuggestedBuild") Integer suggestedBuild,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("BossShowTime") Integer bossShowTime,
        @JsonProperty("NeedWorldClass") Integer needWorldClass,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("RoundTableDropId") Integer roundTableDropId,
        @JsonProperty("RoundTableGuarantee") String roundTableGuarantee,
        @JsonProperty("SequentialDropId") Integer sequentialDropId,
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
        @JsonProperty("PreLevelId") Integer preLevelId
    ) {
        this.id = id;
        this.type = type;
        this.difficulty = difficulty;
        this.name = name;
        this.suggestedBuild = suggestedBuild;
        this.suggestedPower = suggestedPower;
        this.bossShowTime = bossShowTime;
        this.needWorldClass = needWorldClass;
        this.floorId = floorId;
        this.roundTableDropId = roundTableDropId;
        this.roundTableGuarantee = roundTableGuarantee;
        this.sequentialDropId = sequentialDropId;
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
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSuggestedBuild() {
        return this.suggestedBuild;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getBossShowTime() {
        return this.bossShowTime;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getRoundTableDropId() {
        return this.roundTableDropId;
    }

    public String getRoundTableGuarantee() {
        return this.roundTableGuarantee;
    }

    public Integer getSequentialDropId() {
        return this.sequentialDropId;
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

}
