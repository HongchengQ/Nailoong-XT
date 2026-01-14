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
 * 对应文件: CharacterSkin.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterSkinConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Boolean isShow;
    private final Integer charId;
    private final Integer type;
    private final Integer sourceDesc;
    private final List<Integer> skinExtraTag;
    private final String transform;
    private final Integer walkAnimationSpd;
    private final Integer runAnimationSpd;
    private final Integer spRunAnimationSpd;
    private final Integer modelScale;
    private final Integer colliderScale;
    private final Integer modelShowScale;
    private final Integer modelEndScale;
    private final String icon;
    private final String portrait;
    private final String bg;
    private final String offset;
    private final String l2d;
    private final Integer characterCg;
    private final String model;
    private final String modelShow;
    private final String modelEnd;
    private final String gachaL2d;
    private final Integer effectScaleValue;
    private final Integer smoothTime;

    @JsonCreator
    public CharacterSkinConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Type") Integer type,
        @JsonProperty("SourceDesc") Integer sourceDesc,
        @JsonProperty("SkinExtraTag") List<Integer> skinExtraTag,
        @JsonProperty("Transform") String transform,
        @JsonProperty("WalkAnimationSpd") Integer walkAnimationSpd,
        @JsonProperty("RunAnimationSpd") Integer runAnimationSpd,
        @JsonProperty("SpRunAnimationSpd") Integer spRunAnimationSpd,
        @JsonProperty("ModelScale") Integer modelScale,
        @JsonProperty("ColliderScale") Integer colliderScale,
        @JsonProperty("ModelShowScale") Integer modelShowScale,
        @JsonProperty("ModelEndScale") Integer modelEndScale,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Portrait") String portrait,
        @JsonProperty("Bg") String bg,
        @JsonProperty("Offset") String offset,
        @JsonProperty("L2D") String l2d,
        @JsonProperty("CharacterCG") Integer characterCg,
        @JsonProperty("Model") String model,
        @JsonProperty("Model_Show") String modelShow,
        @JsonProperty("Model_End") String modelEnd,
        @JsonProperty("GachaL2D") String gachaL2d,
        @JsonProperty("EffectScaleValue") Integer effectScaleValue,
        @JsonProperty("SmoothTime") Integer smoothTime
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.isShow = isShow;
        this.charId = charId;
        this.type = type;
        this.sourceDesc = sourceDesc;
        this.skinExtraTag = skinExtraTag != null ? 
            new ArrayList<>(skinExtraTag) : 
            new ArrayList<>();
        this.transform = transform;
        this.walkAnimationSpd = walkAnimationSpd;
        this.runAnimationSpd = runAnimationSpd;
        this.spRunAnimationSpd = spRunAnimationSpd;
        this.modelScale = modelScale;
        this.colliderScale = colliderScale;
        this.modelShowScale = modelShowScale;
        this.modelEndScale = modelEndScale;
        this.icon = icon;
        this.portrait = portrait;
        this.bg = bg;
        this.offset = offset;
        this.l2d = l2d;
        this.characterCg = characterCg;
        this.model = model;
        this.modelShow = modelShow;
        this.modelEnd = modelEnd;
        this.gachaL2d = gachaL2d;
        this.effectScaleValue = effectScaleValue;
        this.smoothTime = smoothTime;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSourceDesc() {
        return this.sourceDesc;
    }

    public List<Integer> getSkinExtraTag() {
        return this.skinExtraTag;
    }

    public String getTransform() {
        return this.transform;
    }

    public Integer getWalkAnimationSpd() {
        return this.walkAnimationSpd;
    }

    public Integer getRunAnimationSpd() {
        return this.runAnimationSpd;
    }

    public Integer getSpRunAnimationSpd() {
        return this.spRunAnimationSpd;
    }

    public Integer getModelScale() {
        return this.modelScale;
    }

    public Integer getColliderScale() {
        return this.colliderScale;
    }

    public Integer getModelShowScale() {
        return this.modelShowScale;
    }

    public Integer getModelEndScale() {
        return this.modelEndScale;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getPortrait() {
        return this.portrait;
    }

    public String getBg() {
        return this.bg;
    }

    public String getOffset() {
        return this.offset;
    }

    public String getL2d() {
        return this.l2d;
    }

    public Integer getCharacterCg() {
        return this.characterCg;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelShow() {
        return this.modelShow;
    }

    public String getModelEnd() {
        return this.modelEnd;
    }

    public String getGachaL2d() {
        return this.gachaL2d;
    }

    public Integer getEffectScaleValue() {
        return this.effectScaleValue;
    }

    public Integer getSmoothTime() {
        return this.smoothTime;
    }

}
