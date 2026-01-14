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
 * 对应文件: ActivityLevelsLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityLevelsLevelConfig {

    private final Integer id;
    private final Integer activityId;
    private final String name;
    private final String iconRes;
    private final Integer type;
    private final Integer difficulty;
    private final Integer energyConsume;
    private final Boolean energyConsumeOnRetry;
    private final Integer floorId;
    private final Integer previewMonsterGroupId;
    private final List<Integer> eet;
    private final Integer recommendBuildRank;
    private final Integer suggestedPower;
    private final Integer starConditionType;
    private final List<Integer> oneStarCondition;
    private final List<Integer> twoStarCondition;
    private final List<Integer> threeStarCondition;
    private final String oneStarDesc;
    private final String twoStarDesc;
    private final String threeStarDesc;
    private final String desc;
    private final String completeRewardPreview;
    private final Boolean threeStarSweep;
    private final Integer dayOpen;
    private final Integer preLevelId;
    private final Integer preLevelStar;
    private final List<Integer> preActivityStory;

    @JsonCreator
    public ActivityLevelsLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("Name") String name,
        @JsonProperty("IconRes") String iconRes,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("EnergyConsume") Integer energyConsume,
        @JsonProperty("EnergyConsumeOnRetry") Boolean energyConsumeOnRetry,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("StarConditionType") Integer starConditionType,
        @JsonProperty("OneStarCondition") List<Integer> oneStarCondition,
        @JsonProperty("TwoStarCondition") List<Integer> twoStarCondition,
        @JsonProperty("ThreeStarCondition") List<Integer> threeStarCondition,
        @JsonProperty("OneStarDesc") String oneStarDesc,
        @JsonProperty("TwoStarDesc") String twoStarDesc,
        @JsonProperty("ThreeStarDesc") String threeStarDesc,
        @JsonProperty("Desc") String desc,
        @JsonProperty("CompleteRewardPreview") String completeRewardPreview,
        @JsonProperty("ThreeStarSweep") Boolean threeStarSweep,
        @JsonProperty("DayOpen") Integer dayOpen,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("PreLevelStar") Integer preLevelStar,
        @JsonProperty("PreActivityStory") List<Integer> preActivityStory
    ) {
        this.id = id;
        this.activityId = activityId;
        this.name = name;
        this.iconRes = iconRes;
        this.type = type;
        this.difficulty = difficulty;
        this.energyConsume = energyConsume;
        this.energyConsumeOnRetry = energyConsumeOnRetry;
        this.floorId = floorId;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.recommendBuildRank = recommendBuildRank;
        this.suggestedPower = suggestedPower;
        this.starConditionType = starConditionType;
        this.oneStarCondition = oneStarCondition != null ? 
            new ArrayList<>(oneStarCondition) : 
            new ArrayList<>();
        this.twoStarCondition = twoStarCondition != null ? 
            new ArrayList<>(twoStarCondition) : 
            new ArrayList<>();
        this.threeStarCondition = threeStarCondition != null ? 
            new ArrayList<>(threeStarCondition) : 
            new ArrayList<>();
        this.oneStarDesc = oneStarDesc;
        this.twoStarDesc = twoStarDesc;
        this.threeStarDesc = threeStarDesc;
        this.desc = desc;
        this.completeRewardPreview = completeRewardPreview;
        this.threeStarSweep = threeStarSweep;
        this.dayOpen = dayOpen;
        this.preLevelId = preLevelId;
        this.preLevelStar = preLevelStar;
        this.preActivityStory = preActivityStory != null ? 
            new ArrayList<>(preActivityStory) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getName() {
        return this.name;
    }

    public String getIconRes() {
        return this.iconRes;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getEnergyConsume() {
        return this.energyConsume;
    }

    public Boolean getEnergyConsumeOnRetry() {
        return this.energyConsumeOnRetry;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getStarConditionType() {
        return this.starConditionType;
    }

    public List<Integer> getOneStarCondition() {
        return this.oneStarCondition;
    }

    public List<Integer> getTwoStarCondition() {
        return this.twoStarCondition;
    }

    public List<Integer> getThreeStarCondition() {
        return this.threeStarCondition;
    }

    public String getOneStarDesc() {
        return this.oneStarDesc;
    }

    public String getTwoStarDesc() {
        return this.twoStarDesc;
    }

    public String getThreeStarDesc() {
        return this.threeStarDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getCompleteRewardPreview() {
        return this.completeRewardPreview;
    }

    public Boolean getThreeStarSweep() {
        return this.threeStarSweep;
    }

    public Integer getDayOpen() {
        return this.dayOpen;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getPreLevelStar() {
        return this.preLevelStar;
    }

    public List<Integer> getPreActivityStory() {
        return this.preActivityStory;
    }

}
