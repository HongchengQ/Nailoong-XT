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
 * 对应文件: MonsterSkin.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterSkinConfig {

    private final Integer id;
    private final Integer monsterManual;
    private final String model;
    private final Integer runAnimationSpd;
    private final Integer walkAnimationSpd;
    private final Integer barHeight;
    private final Integer modelScale;
    private final Integer colliderScale;
    private final Boolean forbiddenBehitRot;
    private final Integer effectScaleValue;
    private final Integer tagEffectScaleValue;
    private final List<Integer> hitFxRadialOffset;

    @JsonCreator
    public MonsterSkinConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MonsterManual") Integer monsterManual,
        @JsonProperty("Model") String model,
        @JsonProperty("RunAnimationSpd") Integer runAnimationSpd,
        @JsonProperty("WalkAnimationSpd") Integer walkAnimationSpd,
        @JsonProperty("BarHeight") Integer barHeight,
        @JsonProperty("ModelScale") Integer modelScale,
        @JsonProperty("ColliderScale") Integer colliderScale,
        @JsonProperty("ForbiddenBehitRot") Boolean forbiddenBehitRot,
        @JsonProperty("EffectScaleValue") Integer effectScaleValue,
        @JsonProperty("TagEffectScaleValue") Integer tagEffectScaleValue,
        @JsonProperty("HitFxRadialOffset") List<Integer> hitFxRadialOffset
    ) {
        this.id = id;
        this.monsterManual = monsterManual;
        this.model = model;
        this.runAnimationSpd = runAnimationSpd;
        this.walkAnimationSpd = walkAnimationSpd;
        this.barHeight = barHeight;
        this.modelScale = modelScale;
        this.colliderScale = colliderScale;
        this.forbiddenBehitRot = forbiddenBehitRot;
        this.effectScaleValue = effectScaleValue;
        this.tagEffectScaleValue = tagEffectScaleValue;
        this.hitFxRadialOffset = hitFxRadialOffset != null ? 
            new ArrayList<>(hitFxRadialOffset) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMonsterManual() {
        return this.monsterManual;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getRunAnimationSpd() {
        return this.runAnimationSpd;
    }

    public Integer getWalkAnimationSpd() {
        return this.walkAnimationSpd;
    }

    public Integer getBarHeight() {
        return this.barHeight;
    }

    public Integer getModelScale() {
        return this.modelScale;
    }

    public Integer getColliderScale() {
        return this.colliderScale;
    }

    public Boolean getForbiddenBehitRot() {
        return this.forbiddenBehitRot;
    }

    public Integer getEffectScaleValue() {
        return this.effectScaleValue;
    }

    public Integer getTagEffectScaleValue() {
        return this.tagEffectScaleValue;
    }

    public List<Integer> getHitFxRadialOffset() {
        return this.hitFxRadialOffset;
    }

}
