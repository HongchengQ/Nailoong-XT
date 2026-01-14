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
 * 对应文件: TowerDefenseCharacter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseCharacterConfig {

    private final Integer id;
    private final String name;
    private final Integer skinId;
    private final Integer searchTargetType;
    private final Integer searchRadius;
    private final Integer aiId;
    private final List<Integer> newPotential2;
    private final List<Integer> newPotential3;
    private final List<Integer> newPotential4;
    private final List<Integer> newPotential5;
    private final List<Integer> newPotential6;
    private final List<Integer> pointNeeded;
    private final Integer faction;
    private final Integer normalAtkId;
    private final Integer skillId;
    private final Integer skillCd;
    private final Boolean cdStartTime;
    private final Integer templete;
    private final String icon;
    private final Integer skillRadius;

    @JsonCreator
    public TowerDefenseCharacterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("SkinId") Integer skinId,
        @JsonProperty("SearchTargetType") Integer searchTargetType,
        @JsonProperty("SearchRadius") Integer searchRadius,
        @JsonProperty("AIId") Integer aiId,
        @JsonProperty("NewPotential2") List<Integer> newPotential2,
        @JsonProperty("NewPotential3") List<Integer> newPotential3,
        @JsonProperty("NewPotential4") List<Integer> newPotential4,
        @JsonProperty("NewPotential5") List<Integer> newPotential5,
        @JsonProperty("NewPotential6") List<Integer> newPotential6,
        @JsonProperty("PointNeeded") List<Integer> pointNeeded,
        @JsonProperty("Faction") Integer faction,
        @JsonProperty("NormalAtkId") Integer normalAtkId,
        @JsonProperty("SkillId") Integer skillId,
        @JsonProperty("SkillCd") Integer skillCd,
        @JsonProperty("CdStartTime") Boolean cdStartTime,
        @JsonProperty("Templete") Integer templete,
        @JsonProperty("Icon") String icon,
        @JsonProperty("SkillRadius") Integer skillRadius
    ) {
        this.id = id;
        this.name = name;
        this.skinId = skinId;
        this.searchTargetType = searchTargetType;
        this.searchRadius = searchRadius;
        this.aiId = aiId;
        this.newPotential2 = newPotential2 != null ? 
            new ArrayList<>(newPotential2) : 
            new ArrayList<>();
        this.newPotential3 = newPotential3 != null ? 
            new ArrayList<>(newPotential3) : 
            new ArrayList<>();
        this.newPotential4 = newPotential4 != null ? 
            new ArrayList<>(newPotential4) : 
            new ArrayList<>();
        this.newPotential5 = newPotential5 != null ? 
            new ArrayList<>(newPotential5) : 
            new ArrayList<>();
        this.newPotential6 = newPotential6 != null ? 
            new ArrayList<>(newPotential6) : 
            new ArrayList<>();
        this.pointNeeded = pointNeeded != null ? 
            new ArrayList<>(pointNeeded) : 
            new ArrayList<>();
        this.faction = faction;
        this.normalAtkId = normalAtkId;
        this.skillId = skillId;
        this.skillCd = skillCd;
        this.cdStartTime = cdStartTime;
        this.templete = templete;
        this.icon = icon;
        this.skillRadius = skillRadius;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSkinId() {
        return this.skinId;
    }

    public Integer getSearchTargetType() {
        return this.searchTargetType;
    }

    public Integer getSearchRadius() {
        return this.searchRadius;
    }

    public Integer getAiId() {
        return this.aiId;
    }

    public List<Integer> getNewPotential2() {
        return this.newPotential2;
    }

    public List<Integer> getNewPotential3() {
        return this.newPotential3;
    }

    public List<Integer> getNewPotential4() {
        return this.newPotential4;
    }

    public List<Integer> getNewPotential5() {
        return this.newPotential5;
    }

    public List<Integer> getNewPotential6() {
        return this.newPotential6;
    }

    public List<Integer> getPointNeeded() {
        return this.pointNeeded;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public Integer getNormalAtkId() {
        return this.normalAtkId;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public Integer getSkillCd() {
        return this.skillCd;
    }

    public Boolean getCdStartTime() {
        return this.cdStartTime;
    }

    public Integer getTemplete() {
        return this.templete;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getSkillRadius() {
        return this.skillRadius;
    }

}
