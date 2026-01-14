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
 * 对应文件: SkillInstance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SkillInstanceConfig {

    private final Integer id;
    private final Integer type;
    private final Integer difficulty;
    private final String name;
    private final String desc;
    private final Integer suggestedPower;
    private final Integer suggestedBuild;
    private final Integer needWorldClass;
    private final Integer floorId;
    private final Integer previewMonsterGroupId;
    private final String oneStarCondition;
    private final String twoStarCondition;
    private final String threeStarCondition;
    private final Integer sequentialDropId;
    private final Integer energyConsume;
    private final String baseAwardPreview;
    private final String icon;
    private final Integer preLevelId;
    private final Integer preLevelStar;
    private final String sequentialGuarantee;

    @JsonCreator
    public SkillInstanceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("SuggestedBuild") Integer suggestedBuild,
        @JsonProperty("NeedWorldClass") Integer needWorldClass,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("OneStarCondition") String oneStarCondition,
        @JsonProperty("TwoStarCondition") String twoStarCondition,
        @JsonProperty("ThreeStarCondition") String threeStarCondition,
        @JsonProperty("SequentialDropId") Integer sequentialDropId,
        @JsonProperty("EnergyConsume") Integer energyConsume,
        @JsonProperty("BaseAwardPreview") String baseAwardPreview,
        @JsonProperty("Icon") String icon,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("PreLevelStar") Integer preLevelStar,
        @JsonProperty("SequentialGuarantee") String sequentialGuarantee
    ) {
        this.id = id;
        this.type = type;
        this.difficulty = difficulty;
        this.name = name;
        this.desc = desc;
        this.suggestedPower = suggestedPower;
        this.suggestedBuild = suggestedBuild;
        this.needWorldClass = needWorldClass;
        this.floorId = floorId;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.oneStarCondition = oneStarCondition;
        this.twoStarCondition = twoStarCondition;
        this.threeStarCondition = threeStarCondition;
        this.sequentialDropId = sequentialDropId;
        this.energyConsume = energyConsume;
        this.baseAwardPreview = baseAwardPreview;
        this.icon = icon;
        this.preLevelId = preLevelId;
        this.preLevelStar = preLevelStar;
        this.sequentialGuarantee = sequentialGuarantee;
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

    public String getDesc() {
        return this.desc;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getSuggestedBuild() {
        return this.suggestedBuild;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public String getOneStarCondition() {
        return this.oneStarCondition;
    }

    public String getTwoStarCondition() {
        return this.twoStarCondition;
    }

    public String getThreeStarCondition() {
        return this.threeStarCondition;
    }

    public Integer getSequentialDropId() {
        return this.sequentialDropId;
    }

    public Integer getEnergyConsume() {
        return this.energyConsume;
    }

    public String getBaseAwardPreview() {
        return this.baseAwardPreview;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getPreLevelStar() {
        return this.preLevelStar;
    }

    public String getSequentialGuarantee() {
        return this.sequentialGuarantee;
    }

}
