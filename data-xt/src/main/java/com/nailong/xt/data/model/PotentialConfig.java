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
 * 对应文件: Potential.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PotentialConfig {

    private final Integer id;
    private final Integer charId;
    private final Integer build;
    private final Integer branchType;
    private final Integer maxLevel;
    private final Integer scoreGroupId;
    private final List<Integer> buildScore;
    private final Integer gameBookId;
    private final Integer effectGroupId;
    private final String spBg;
    private final String spFace;
    private final String briefDesc;
    private final String desc;
    private final String param1;
    private final Integer corner;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;
    private final Integer effectId1;
    private final String param6;
    private final String param7;
    private final String param8;
    private final String param9;
    private final String param10;
    private final Boolean isEffective;

    @JsonCreator
    public PotentialConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Build") Integer build,
        @JsonProperty("BranchType") Integer branchType,
        @JsonProperty("MaxLevel") Integer maxLevel,
        @JsonProperty("ScoreGroupId") Integer scoreGroupId,
        @JsonProperty("BuildScore") List<Integer> buildScore,
        @JsonProperty("GameBookId") Integer gameBookId,
        @JsonProperty("EffectGroupId") Integer effectGroupId,
        @JsonProperty("SpBg") String spBg,
        @JsonProperty("SpFace") String spFace,
        @JsonProperty("BriefDesc") String briefDesc,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Corner") Integer corner,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("Param5") String param5,
        @JsonProperty("EffectId1") Integer effectId1,
        @JsonProperty("Param6") String param6,
        @JsonProperty("Param7") String param7,
        @JsonProperty("Param8") String param8,
        @JsonProperty("Param9") String param9,
        @JsonProperty("Param10") String param10,
        @JsonProperty("IsEffective") Boolean isEffective
    ) {
        this.id = id;
        this.charId = charId;
        this.build = build;
        this.branchType = branchType;
        this.maxLevel = maxLevel;
        this.scoreGroupId = scoreGroupId;
        this.buildScore = buildScore != null ? 
            new ArrayList<>(buildScore) : 
            new ArrayList<>();
        this.gameBookId = gameBookId;
        this.effectGroupId = effectGroupId;
        this.spBg = spBg;
        this.spFace = spFace;
        this.briefDesc = briefDesc;
        this.desc = desc;
        this.param1 = param1;
        this.corner = corner;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.effectId1 = effectId1;
        this.param6 = param6;
        this.param7 = param7;
        this.param8 = param8;
        this.param9 = param9;
        this.param10 = param10;
        this.isEffective = isEffective;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getBuild() {
        return this.build;
    }

    public Integer getBranchType() {
        return this.branchType;
    }

    public Integer getMaxLevel() {
        return this.maxLevel;
    }

    public Integer getScoreGroupId() {
        return this.scoreGroupId;
    }

    public List<Integer> getBuildScore() {
        return this.buildScore;
    }

    public Integer getGameBookId() {
        return this.gameBookId;
    }

    public Integer getEffectGroupId() {
        return this.effectGroupId;
    }

    public String getSpBg() {
        return this.spBg;
    }

    public String getSpFace() {
        return this.spFace;
    }

    public String getBriefDesc() {
        return this.briefDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getParam1() {
        return this.param1;
    }

    public Integer getCorner() {
        return this.corner;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

    public String getParam5() {
        return this.param5;
    }

    public Integer getEffectId1() {
        return this.effectId1;
    }

    public String getParam6() {
        return this.param6;
    }

    public String getParam7() {
        return this.param7;
    }

    public String getParam8() {
        return this.param8;
    }

    public String getParam9() {
        return this.param9;
    }

    public String getParam10() {
        return this.param10;
    }

    public Boolean getIsEffective() {
        return this.isEffective;
    }

}
