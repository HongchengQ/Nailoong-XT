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
 * 对应文件: AffinityLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AffinityLevelConfig {

    private final Integer id;
    private final Integer templateId;
    private final String affinityLevelName;
    private final String affinityLevelIcon;
    private final String affinityLevelRewardIcon;
    private final String affinityLevelRewardLockIcon;
    private final Integer affinityLevelStage;
    private final Integer affinityLevel;
    private final Integer needExp;
    private final List<Integer> effect;
    private final Boolean isKeyAffinityLevel;

    @JsonCreator
    public AffinityLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TemplateId") Integer templateId,
        @JsonProperty("AffinityLevelName") String affinityLevelName,
        @JsonProperty("AffinityLevelIcon") String affinityLevelIcon,
        @JsonProperty("AffinityLevelRewardIcon") String affinityLevelRewardIcon,
        @JsonProperty("AffinityLevelRewardLockIcon") String affinityLevelRewardLockIcon,
        @JsonProperty("AffinityLevelStage") Integer affinityLevelStage,
        @JsonProperty("AffinityLevel") Integer affinityLevel,
        @JsonProperty("NeedExp") Integer needExp,
        @JsonProperty("Effect") List<Integer> effect,
        @JsonProperty("IsKeyAffinityLevel") Boolean isKeyAffinityLevel
    ) {
        this.id = id;
        this.templateId = templateId;
        this.affinityLevelName = affinityLevelName;
        this.affinityLevelIcon = affinityLevelIcon;
        this.affinityLevelRewardIcon = affinityLevelRewardIcon;
        this.affinityLevelRewardLockIcon = affinityLevelRewardLockIcon;
        this.affinityLevelStage = affinityLevelStage;
        this.affinityLevel = affinityLevel;
        this.needExp = needExp;
        this.effect = effect != null ? 
            new ArrayList<>(effect) : 
            new ArrayList<>();
        this.isKeyAffinityLevel = isKeyAffinityLevel;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public String getAffinityLevelName() {
        return this.affinityLevelName;
    }

    public String getAffinityLevelIcon() {
        return this.affinityLevelIcon;
    }

    public String getAffinityLevelRewardIcon() {
        return this.affinityLevelRewardIcon;
    }

    public String getAffinityLevelRewardLockIcon() {
        return this.affinityLevelRewardLockIcon;
    }

    public Integer getAffinityLevelStage() {
        return this.affinityLevelStage;
    }

    public Integer getAffinityLevel() {
        return this.affinityLevel;
    }

    public Integer getNeedExp() {
        return this.needExp;
    }

    public List<Integer> getEffect() {
        return this.effect;
    }

    public Boolean getIsKeyAffinityLevel() {
        return this.isKeyAffinityLevel;
    }

}
