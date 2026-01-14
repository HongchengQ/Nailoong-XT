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
 * 对应文件: NpcAffinityGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NpcAffinityGroupConfig {

    private final Integer id;
    private final Integer affinityGroupId;
    private final String relationshipName;
    private final String icon;
    private final Integer affinityLevelStage;
    private final Integer level;
    private final Integer affinityValue;
    private final String reward;

    @JsonCreator
    public NpcAffinityGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AffinityGroupId") Integer affinityGroupId,
        @JsonProperty("RelationshipName") String relationshipName,
        @JsonProperty("Icon") String icon,
        @JsonProperty("AffinityLevelStage") Integer affinityLevelStage,
        @JsonProperty("Level") Integer level,
        @JsonProperty("AffinityValue") Integer affinityValue,
        @JsonProperty("Reward") String reward
    ) {
        this.id = id;
        this.affinityGroupId = affinityGroupId;
        this.relationshipName = relationshipName;
        this.icon = icon;
        this.affinityLevelStage = affinityLevelStage;
        this.level = level;
        this.affinityValue = affinityValue;
        this.reward = reward;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getAffinityGroupId() {
        return this.affinityGroupId;
    }

    public String getRelationshipName() {
        return this.relationshipName;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getAffinityLevelStage() {
        return this.affinityLevelStage;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getAffinityValue() {
        return this.affinityValue;
    }

    public String getReward() {
        return this.reward;
    }

}
