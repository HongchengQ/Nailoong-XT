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
 * 对应文件: DailyInstance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyInstanceConfig {

    private final Integer id;
    private final Integer dailyType;
    private final Integer difficulty;
    private final String name;
    private final String desc;
    private final Integer suggestedPower;
    private final Integer recommendBuildRank;
    private final Integer floorId;
    private final String oneStarDesc;
    private final String twoStarDesc;
    private final String threeStarDesc;
    private final Integer oneStarEnergyConsume;
    private final Integer twoStarEnergyConsume;
    private final Integer threeStarEnergyConsume;
    private final Integer awardDropId;
    private final Integer previewMonsterGroupId;
    private final String icon;
    private final List<Integer> firstRewardPreview;
    private final Integer preLevelId;
    private final Integer preLevelStar;
    private final Integer needWorldClass;

    @JsonCreator
    public DailyInstanceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("DailyType") Integer dailyType,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("OneStarDesc") String oneStarDesc,
        @JsonProperty("TwoStarDesc") String twoStarDesc,
        @JsonProperty("ThreeStarDesc") String threeStarDesc,
        @JsonProperty("OneStarEnergyConsume") Integer oneStarEnergyConsume,
        @JsonProperty("TwoStarEnergyConsume") Integer twoStarEnergyConsume,
        @JsonProperty("ThreeStarEnergyConsume") Integer threeStarEnergyConsume,
        @JsonProperty("AwardDropId") Integer awardDropId,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("Icon") String icon,
        @JsonProperty("FirstRewardPreview") List<Integer> firstRewardPreview,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("PreLevelStar") Integer preLevelStar,
        @JsonProperty("NeedWorldClass") Integer needWorldClass
    ) {
        this.id = id;
        this.dailyType = dailyType;
        this.difficulty = difficulty;
        this.name = name;
        this.desc = desc;
        this.suggestedPower = suggestedPower;
        this.recommendBuildRank = recommendBuildRank;
        this.floorId = floorId;
        this.oneStarDesc = oneStarDesc;
        this.twoStarDesc = twoStarDesc;
        this.threeStarDesc = threeStarDesc;
        this.oneStarEnergyConsume = oneStarEnergyConsume;
        this.twoStarEnergyConsume = twoStarEnergyConsume;
        this.threeStarEnergyConsume = threeStarEnergyConsume;
        this.awardDropId = awardDropId;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.icon = icon;
        this.firstRewardPreview = firstRewardPreview != null ? 
            new ArrayList<>(firstRewardPreview) : 
            new ArrayList<>();
        this.preLevelId = preLevelId;
        this.preLevelStar = preLevelStar;
        this.needWorldClass = needWorldClass;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDailyType() {
        return this.dailyType;
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

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getFloorId() {
        return this.floorId;
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

    public Integer getOneStarEnergyConsume() {
        return this.oneStarEnergyConsume;
    }

    public Integer getTwoStarEnergyConsume() {
        return this.twoStarEnergyConsume;
    }

    public Integer getThreeStarEnergyConsume() {
        return this.threeStarEnergyConsume;
    }

    public Integer getAwardDropId() {
        return this.awardDropId;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public String getIcon() {
        return this.icon;
    }

    public List<Integer> getFirstRewardPreview() {
        return this.firstRewardPreview;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getPreLevelStar() {
        return this.preLevelStar;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

}
