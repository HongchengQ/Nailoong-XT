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
 * 对应文件: GmSuperman.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GmSupermanConfig {

    private final Integer id;
    private final String name;
    private final Integer charLevel;
    private final String charSkill;
    private final Integer talentKey;
    private final Integer talentNormal;
    private final Integer affinity;
    private final Integer discLevel;
    private final Integer discStar;
    private final Integer worldClass;
    private final Boolean levelClear;
    private final Integer starTowerGrowth;
    private final Integer discPhase;

    @JsonCreator
    public GmSupermanConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("CharLevel") Integer charLevel,
        @JsonProperty("CharSkill") String charSkill,
        @JsonProperty("TalentKey") Integer talentKey,
        @JsonProperty("TalentNormal") Integer talentNormal,
        @JsonProperty("Affinity") Integer affinity,
        @JsonProperty("DiscLevel") Integer discLevel,
        @JsonProperty("DiscStar") Integer discStar,
        @JsonProperty("WorldClass") Integer worldClass,
        @JsonProperty("LevelClear") Boolean levelClear,
        @JsonProperty("StarTowerGrowth") Integer starTowerGrowth,
        @JsonProperty("DiscPhase") Integer discPhase
    ) {
        this.id = id;
        this.name = name;
        this.charLevel = charLevel;
        this.charSkill = charSkill;
        this.talentKey = talentKey;
        this.talentNormal = talentNormal;
        this.affinity = affinity;
        this.discLevel = discLevel;
        this.discStar = discStar;
        this.worldClass = worldClass;
        this.levelClear = levelClear;
        this.starTowerGrowth = starTowerGrowth;
        this.discPhase = discPhase;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCharLevel() {
        return this.charLevel;
    }

    public String getCharSkill() {
        return this.charSkill;
    }

    public Integer getTalentKey() {
        return this.talentKey;
    }

    public Integer getTalentNormal() {
        return this.talentNormal;
    }

    public Integer getAffinity() {
        return this.affinity;
    }

    public Integer getDiscLevel() {
        return this.discLevel;
    }

    public Integer getDiscStar() {
        return this.discStar;
    }

    public Integer getWorldClass() {
        return this.worldClass;
    }

    public Boolean getLevelClear() {
        return this.levelClear;
    }

    public Integer getStarTowerGrowth() {
        return this.starTowerGrowth;
    }

    public Integer getDiscPhase() {
        return this.discPhase;
    }

}
