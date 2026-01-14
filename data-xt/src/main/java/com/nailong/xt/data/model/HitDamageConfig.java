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
 * 对应文件: HitDamage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HitDamageConfig {

    private final Integer id;
    private final Integer levelTypeData;
    private final String hitdamageInfo;
    private final Integer distanceType;
    private final Integer sourceType;
    private final Integer damageType;
    private final Integer effectType;
    private final Integer elementType;
    private final List<Integer> damageTag;
    private final Integer damageBonusType;
    private final List<Integer> skillPercentAmend;
    private final List<Integer> skillAbsAmend;
    private final List<Integer> talentPercentAmend;
    private final List<Integer> talentAbsAmend;
    private final Integer levelData;
    private final Integer energyCharge;
    private final Integer skillId;
    private final Integer skillSlotType;
    private final Integer mainOrSupport;
    private final Boolean isDenseType;
    private final Integer perkId;
    private final Integer hitImmunityTime;
    private final Integer additionalSource;
    private final Integer additionalType;
    private final List<Integer> additionalPercent;

    @JsonCreator
    public HitDamageConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("levelTypeData") Integer levelTypeData,
        @JsonProperty("HitdamageInfo") String hitdamageInfo,
        @JsonProperty("DistanceType") Integer distanceType,
        @JsonProperty("SourceType") Integer sourceType,
        @JsonProperty("DamageType") Integer damageType,
        @JsonProperty("EffectType") Integer effectType,
        @JsonProperty("ElementType") Integer elementType,
        @JsonProperty("DamageTag") List<Integer> damageTag,
        @JsonProperty("DamageBonusType") Integer damageBonusType,
        @JsonProperty("SkillPercentAmend") List<Integer> skillPercentAmend,
        @JsonProperty("SkillAbsAmend") List<Integer> skillAbsAmend,
        @JsonProperty("TalentPercentAmend") List<Integer> talentPercentAmend,
        @JsonProperty("TalentAbsAmend") List<Integer> talentAbsAmend,
        @JsonProperty("LevelData") Integer levelData,
        @JsonProperty("EnergyCharge") Integer energyCharge,
        @JsonProperty("SkillId") Integer skillId,
        @JsonProperty("SkillSlotType") Integer skillSlotType,
        @JsonProperty("MainOrSupport") Integer mainOrSupport,
        @JsonProperty("IsDenseType") Boolean isDenseType,
        @JsonProperty("PerkId") Integer perkId,
        @JsonProperty("HitImmunityTime") Integer hitImmunityTime,
        @JsonProperty("AdditionalSource") Integer additionalSource,
        @JsonProperty("AdditionalType") Integer additionalType,
        @JsonProperty("AdditionalPercent") List<Integer> additionalPercent
    ) {
        this.id = id;
        this.levelTypeData = levelTypeData;
        this.hitdamageInfo = hitdamageInfo;
        this.distanceType = distanceType;
        this.sourceType = sourceType;
        this.damageType = damageType;
        this.effectType = effectType;
        this.elementType = elementType;
        this.damageTag = damageTag != null ? 
            new ArrayList<>(damageTag) : 
            new ArrayList<>();
        this.damageBonusType = damageBonusType;
        this.skillPercentAmend = skillPercentAmend != null ? 
            new ArrayList<>(skillPercentAmend) : 
            new ArrayList<>();
        this.skillAbsAmend = skillAbsAmend != null ? 
            new ArrayList<>(skillAbsAmend) : 
            new ArrayList<>();
        this.talentPercentAmend = talentPercentAmend != null ? 
            new ArrayList<>(talentPercentAmend) : 
            new ArrayList<>();
        this.talentAbsAmend = talentAbsAmend != null ? 
            new ArrayList<>(talentAbsAmend) : 
            new ArrayList<>();
        this.levelData = levelData;
        this.energyCharge = energyCharge;
        this.skillId = skillId;
        this.skillSlotType = skillSlotType;
        this.mainOrSupport = mainOrSupport;
        this.isDenseType = isDenseType;
        this.perkId = perkId;
        this.hitImmunityTime = hitImmunityTime;
        this.additionalSource = additionalSource;
        this.additionalType = additionalType;
        this.additionalPercent = additionalPercent != null ? 
            new ArrayList<>(additionalPercent) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLevelTypeData() {
        return this.levelTypeData;
    }

    public String getHitdamageInfo() {
        return this.hitdamageInfo;
    }

    public Integer getDistanceType() {
        return this.distanceType;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    public Integer getDamageType() {
        return this.damageType;
    }

    public Integer getEffectType() {
        return this.effectType;
    }

    public Integer getElementType() {
        return this.elementType;
    }

    public List<Integer> getDamageTag() {
        return this.damageTag;
    }

    public Integer getDamageBonusType() {
        return this.damageBonusType;
    }

    public List<Integer> getSkillPercentAmend() {
        return this.skillPercentAmend;
    }

    public List<Integer> getSkillAbsAmend() {
        return this.skillAbsAmend;
    }

    public List<Integer> getTalentPercentAmend() {
        return this.talentPercentAmend;
    }

    public List<Integer> getTalentAbsAmend() {
        return this.talentAbsAmend;
    }

    public Integer getLevelData() {
        return this.levelData;
    }

    public Integer getEnergyCharge() {
        return this.energyCharge;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public Integer getSkillSlotType() {
        return this.skillSlotType;
    }

    public Integer getMainOrSupport() {
        return this.mainOrSupport;
    }

    public Boolean getIsDenseType() {
        return this.isDenseType;
    }

    public Integer getPerkId() {
        return this.perkId;
    }

    public Integer getHitImmunityTime() {
        return this.hitImmunityTime;
    }

    public Integer getAdditionalSource() {
        return this.additionalSource;
    }

    public Integer getAdditionalType() {
        return this.additionalType;
    }

    public List<Integer> getAdditionalPercent() {
        return this.additionalPercent;
    }

}
