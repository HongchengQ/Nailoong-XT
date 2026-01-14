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
 * 对应文件: Character.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterConfig {

    private final Integer id;
    private final String name;
    private final Boolean visible;
    private final Boolean available;
    private final Integer grade;
    private final Integer defaultSkinId;
    private final Integer advanceSkinId;
    private final Integer advanceGroup;
    private final Integer advanceSkinUnlockLevel;
    private final Integer viewId;
    private final Integer faction;
    private final Integer weight;
    private final Integer eet;
    private final Integer classField;
    private final Integer characterAttackType;
    private final Integer searchTargetType;
    private final Integer atkSpd;
    private final Integer movType;
    private final Integer walkSpd;
    private final Integer runSpd;
    private final Integer spRunSpd;
    private final Integer transSpd;
    private final Integer walkToRunDuration;
    private final Boolean dodgeToRunAccelerationOrNot;
    private final Integer movAcc;
    private final Integer rotSpd;
    private final Integer rotAcc;
    private final Integer visionDeg;
    private final Integer visionRng;
    private final Integer visionAttackRng;
    private final Integer hearRng;
    private final Integer hearAttackRng;
    private final Integer raiseGunRng;
    private final Integer bulletType;
    private final Integer ammo;
    private final Integer aiId;
    private final Integer normalAtkId;
    private final Integer dodgeId;
    private final Integer skillId;
    private final Integer specialSkillId;
    private final Integer ultimateId;
    private final Integer assistAiId;
    private final Integer assistNormalAtkId;
    private final Integer assistDodgeId;
    private final Integer assistSkillId;
    private final Integer assistSpecialSkillId;
    private final Integer assistUltimateId;
    private final Integer talentSkillId;
    private final Integer assistSkillOnStageType;
    private final Integer assistSkillAngle;
    private final Integer assistSkillRadius;
    private final Integer assistUltimateOnStageType;
    private final Integer assistUltimateAngle;
    private final Integer assistUltimateRadius;
    private final Integer assistUltimateOnStageOrientation;
    private final Integer skillSemiAutoRng;
    private final Integer ultimateSemiAutoRng;
    private final Integer switchCd;
    private final Integer energyConvRatio;
    private final Integer energyEfficiency;
    private final Integer fragmentsId;
    private final Integer transformQty;
    private final Integer recruitmentQty;
    private final String attributeId;
    private final Integer presentsTraitId;
    private final List<Integer> skillsUpgradeGroup;
    private final Integer frozenTimeHighlightUnit;
    private final List<Integer> gemSlots;
    private final Integer assistSkillOnStageOrientation;

    @JsonCreator
    public CharacterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Visible") Boolean visible,
        @JsonProperty("Available") Boolean available,
        @JsonProperty("Grade") Integer grade,
        @JsonProperty("DefaultSkinId") Integer defaultSkinId,
        @JsonProperty("AdvanceSkinId") Integer advanceSkinId,
        @JsonProperty("AdvanceGroup") Integer advanceGroup,
        @JsonProperty("AdvanceSkinUnlockLevel") Integer advanceSkinUnlockLevel,
        @JsonProperty("ViewId") Integer viewId,
        @JsonProperty("Faction") Integer faction,
        @JsonProperty("Weight") Integer weight,
        @JsonProperty("EET") Integer eet,
        @JsonProperty("Class") Integer classField,
        @JsonProperty("CharacterAttackType") Integer characterAttackType,
        @JsonProperty("SearchTargetType") Integer searchTargetType,
        @JsonProperty("AtkSpd") Integer atkSpd,
        @JsonProperty("MovType") Integer movType,
        @JsonProperty("WalkSpd") Integer walkSpd,
        @JsonProperty("RunSpd") Integer runSpd,
        @JsonProperty("SpRunSpd") Integer spRunSpd,
        @JsonProperty("TransSpd") Integer transSpd,
        @JsonProperty("WalkToRunDuration") Integer walkToRunDuration,
        @JsonProperty("DodgeToRunAccelerationOrNot") Boolean dodgeToRunAccelerationOrNot,
        @JsonProperty("MovAcc") Integer movAcc,
        @JsonProperty("RotSpd") Integer rotSpd,
        @JsonProperty("RotAcc") Integer rotAcc,
        @JsonProperty("VisionDeg") Integer visionDeg,
        @JsonProperty("VisionRng") Integer visionRng,
        @JsonProperty("VisionAttackRng") Integer visionAttackRng,
        @JsonProperty("HearRng") Integer hearRng,
        @JsonProperty("HearAttackRng") Integer hearAttackRng,
        @JsonProperty("RaiseGunRng") Integer raiseGunRng,
        @JsonProperty("BulletType") Integer bulletType,
        @JsonProperty("Ammo") Integer ammo,
        @JsonProperty("AIId") Integer aiId,
        @JsonProperty("NormalAtkId") Integer normalAtkId,
        @JsonProperty("DodgeId") Integer dodgeId,
        @JsonProperty("SkillId") Integer skillId,
        @JsonProperty("SpecialSkillId") Integer specialSkillId,
        @JsonProperty("UltimateId") Integer ultimateId,
        @JsonProperty("AssistAIId") Integer assistAiId,
        @JsonProperty("AssistNormalAtkId") Integer assistNormalAtkId,
        @JsonProperty("AssistDodgeId") Integer assistDodgeId,
        @JsonProperty("AssistSkillId") Integer assistSkillId,
        @JsonProperty("AssistSpecialSkillId") Integer assistSpecialSkillId,
        @JsonProperty("AssistUltimateId") Integer assistUltimateId,
        @JsonProperty("TalentSkillId") Integer talentSkillId,
        @JsonProperty("AssistSkillOnStageType") Integer assistSkillOnStageType,
        @JsonProperty("AssistSkillAngle") Integer assistSkillAngle,
        @JsonProperty("AssistSkillRadius") Integer assistSkillRadius,
        @JsonProperty("AssistUltimateOnStageType") Integer assistUltimateOnStageType,
        @JsonProperty("AssistUltimateAngle") Integer assistUltimateAngle,
        @JsonProperty("AssistUltimateRadius") Integer assistUltimateRadius,
        @JsonProperty("AssistUltimateOnStageOrientation") Integer assistUltimateOnStageOrientation,
        @JsonProperty("SkillSemiAutoRng") Integer skillSemiAutoRng,
        @JsonProperty("UltimateSemiAutoRng") Integer ultimateSemiAutoRng,
        @JsonProperty("SwitchCD") Integer switchCd,
        @JsonProperty("EnergyConvRatio") Integer energyConvRatio,
        @JsonProperty("EnergyEfficiency") Integer energyEfficiency,
        @JsonProperty("FragmentsId") Integer fragmentsId,
        @JsonProperty("TransformQty") Integer transformQty,
        @JsonProperty("RecruitmentQty") Integer recruitmentQty,
        @JsonProperty("AttributeId") String attributeId,
        @JsonProperty("PresentsTraitId") Integer presentsTraitId,
        @JsonProperty("SkillsUpgradeGroup") List<Integer> skillsUpgradeGroup,
        @JsonProperty("FrozenTimeHighlightUnit") Integer frozenTimeHighlightUnit,
        @JsonProperty("GemSlots") List<Integer> gemSlots,
        @JsonProperty("AssistSkillOnStageOrientation") Integer assistSkillOnStageOrientation
    ) {
        this.id = id;
        this.name = name;
        this.visible = visible;
        this.available = available;
        this.grade = grade;
        this.defaultSkinId = defaultSkinId;
        this.advanceSkinId = advanceSkinId;
        this.advanceGroup = advanceGroup;
        this.advanceSkinUnlockLevel = advanceSkinUnlockLevel;
        this.viewId = viewId;
        this.faction = faction;
        this.weight = weight;
        this.eet = eet;
        this.classField = classField;
        this.characterAttackType = characterAttackType;
        this.searchTargetType = searchTargetType;
        this.atkSpd = atkSpd;
        this.movType = movType;
        this.walkSpd = walkSpd;
        this.runSpd = runSpd;
        this.spRunSpd = spRunSpd;
        this.transSpd = transSpd;
        this.walkToRunDuration = walkToRunDuration;
        this.dodgeToRunAccelerationOrNot = dodgeToRunAccelerationOrNot;
        this.movAcc = movAcc;
        this.rotSpd = rotSpd;
        this.rotAcc = rotAcc;
        this.visionDeg = visionDeg;
        this.visionRng = visionRng;
        this.visionAttackRng = visionAttackRng;
        this.hearRng = hearRng;
        this.hearAttackRng = hearAttackRng;
        this.raiseGunRng = raiseGunRng;
        this.bulletType = bulletType;
        this.ammo = ammo;
        this.aiId = aiId;
        this.normalAtkId = normalAtkId;
        this.dodgeId = dodgeId;
        this.skillId = skillId;
        this.specialSkillId = specialSkillId;
        this.ultimateId = ultimateId;
        this.assistAiId = assistAiId;
        this.assistNormalAtkId = assistNormalAtkId;
        this.assistDodgeId = assistDodgeId;
        this.assistSkillId = assistSkillId;
        this.assistSpecialSkillId = assistSpecialSkillId;
        this.assistUltimateId = assistUltimateId;
        this.talentSkillId = talentSkillId;
        this.assistSkillOnStageType = assistSkillOnStageType;
        this.assistSkillAngle = assistSkillAngle;
        this.assistSkillRadius = assistSkillRadius;
        this.assistUltimateOnStageType = assistUltimateOnStageType;
        this.assistUltimateAngle = assistUltimateAngle;
        this.assistUltimateRadius = assistUltimateRadius;
        this.assistUltimateOnStageOrientation = assistUltimateOnStageOrientation;
        this.skillSemiAutoRng = skillSemiAutoRng;
        this.ultimateSemiAutoRng = ultimateSemiAutoRng;
        this.switchCd = switchCd;
        this.energyConvRatio = energyConvRatio;
        this.energyEfficiency = energyEfficiency;
        this.fragmentsId = fragmentsId;
        this.transformQty = transformQty;
        this.recruitmentQty = recruitmentQty;
        this.attributeId = attributeId;
        this.presentsTraitId = presentsTraitId;
        this.skillsUpgradeGroup = skillsUpgradeGroup != null ? 
            new ArrayList<>(skillsUpgradeGroup) : 
            new ArrayList<>();
        this.frozenTimeHighlightUnit = frozenTimeHighlightUnit;
        this.gemSlots = gemSlots != null ? 
            new ArrayList<>(gemSlots) : 
            new ArrayList<>();
        this.assistSkillOnStageOrientation = assistSkillOnStageOrientation;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public Integer getDefaultSkinId() {
        return this.defaultSkinId;
    }

    public Integer getAdvanceSkinId() {
        return this.advanceSkinId;
    }

    public Integer getAdvanceGroup() {
        return this.advanceGroup;
    }

    public Integer getAdvanceSkinUnlockLevel() {
        return this.advanceSkinUnlockLevel;
    }

    public Integer getViewId() {
        return this.viewId;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getEet() {
        return this.eet;
    }

    public Integer getClassField() {
        return this.classField;
    }

    public Integer getCharacterAttackType() {
        return this.characterAttackType;
    }

    public Integer getSearchTargetType() {
        return this.searchTargetType;
    }

    public Integer getAtkSpd() {
        return this.atkSpd;
    }

    public Integer getMovType() {
        return this.movType;
    }

    public Integer getWalkSpd() {
        return this.walkSpd;
    }

    public Integer getRunSpd() {
        return this.runSpd;
    }

    public Integer getSpRunSpd() {
        return this.spRunSpd;
    }

    public Integer getTransSpd() {
        return this.transSpd;
    }

    public Integer getWalkToRunDuration() {
        return this.walkToRunDuration;
    }

    public Boolean getDodgeToRunAccelerationOrNot() {
        return this.dodgeToRunAccelerationOrNot;
    }

    public Integer getMovAcc() {
        return this.movAcc;
    }

    public Integer getRotSpd() {
        return this.rotSpd;
    }

    public Integer getRotAcc() {
        return this.rotAcc;
    }

    public Integer getVisionDeg() {
        return this.visionDeg;
    }

    public Integer getVisionRng() {
        return this.visionRng;
    }

    public Integer getVisionAttackRng() {
        return this.visionAttackRng;
    }

    public Integer getHearRng() {
        return this.hearRng;
    }

    public Integer getHearAttackRng() {
        return this.hearAttackRng;
    }

    public Integer getRaiseGunRng() {
        return this.raiseGunRng;
    }

    public Integer getBulletType() {
        return this.bulletType;
    }

    public Integer getAmmo() {
        return this.ammo;
    }

    public Integer getAiId() {
        return this.aiId;
    }

    public Integer getNormalAtkId() {
        return this.normalAtkId;
    }

    public Integer getDodgeId() {
        return this.dodgeId;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public Integer getSpecialSkillId() {
        return this.specialSkillId;
    }

    public Integer getUltimateId() {
        return this.ultimateId;
    }

    public Integer getAssistAiId() {
        return this.assistAiId;
    }

    public Integer getAssistNormalAtkId() {
        return this.assistNormalAtkId;
    }

    public Integer getAssistDodgeId() {
        return this.assistDodgeId;
    }

    public Integer getAssistSkillId() {
        return this.assistSkillId;
    }

    public Integer getAssistSpecialSkillId() {
        return this.assistSpecialSkillId;
    }

    public Integer getAssistUltimateId() {
        return this.assistUltimateId;
    }

    public Integer getTalentSkillId() {
        return this.talentSkillId;
    }

    public Integer getAssistSkillOnStageType() {
        return this.assistSkillOnStageType;
    }

    public Integer getAssistSkillAngle() {
        return this.assistSkillAngle;
    }

    public Integer getAssistSkillRadius() {
        return this.assistSkillRadius;
    }

    public Integer getAssistUltimateOnStageType() {
        return this.assistUltimateOnStageType;
    }

    public Integer getAssistUltimateAngle() {
        return this.assistUltimateAngle;
    }

    public Integer getAssistUltimateRadius() {
        return this.assistUltimateRadius;
    }

    public Integer getAssistUltimateOnStageOrientation() {
        return this.assistUltimateOnStageOrientation;
    }

    public Integer getSkillSemiAutoRng() {
        return this.skillSemiAutoRng;
    }

    public Integer getUltimateSemiAutoRng() {
        return this.ultimateSemiAutoRng;
    }

    public Integer getSwitchCd() {
        return this.switchCd;
    }

    public Integer getEnergyConvRatio() {
        return this.energyConvRatio;
    }

    public Integer getEnergyEfficiency() {
        return this.energyEfficiency;
    }

    public Integer getFragmentsId() {
        return this.fragmentsId;
    }

    public Integer getTransformQty() {
        return this.transformQty;
    }

    public Integer getRecruitmentQty() {
        return this.recruitmentQty;
    }

    public String getAttributeId() {
        return this.attributeId;
    }

    public Integer getPresentsTraitId() {
        return this.presentsTraitId;
    }

    public List<Integer> getSkillsUpgradeGroup() {
        return this.skillsUpgradeGroup;
    }

    public Integer getFrozenTimeHighlightUnit() {
        return this.frozenTimeHighlightUnit;
    }

    public List<Integer> getGemSlots() {
        return this.gemSlots;
    }

    public Integer getAssistSkillOnStageOrientation() {
        return this.assistSkillOnStageOrientation;
    }

}
