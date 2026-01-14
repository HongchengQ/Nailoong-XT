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
 * 对应文件: ActivityAvgLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityAvgLevelConfig {

    private final Integer id;
    private final Integer activityId;
    private final String index;
    private final String name;
    private final String iconRes;
    private final Integer type;
    private final String storyId;
    private final String desc;
    private final String firstCompleteRewardPreview;
    private final Integer preLevelId;
    private final Integer dayOpen;

    @JsonCreator
    public ActivityAvgLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("Index") String index,
        @JsonProperty("Name") String name,
        @JsonProperty("IconRes") String iconRes,
        @JsonProperty("Type") Integer type,
        @JsonProperty("StoryId") String storyId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("FirstCompleteRewardPreview") String firstCompleteRewardPreview,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("DayOpen") Integer dayOpen
    ) {
        this.id = id;
        this.activityId = activityId;
        this.index = index;
        this.name = name;
        this.iconRes = iconRes;
        this.type = type;
        this.storyId = storyId;
        this.desc = desc;
        this.firstCompleteRewardPreview = firstCompleteRewardPreview;
        this.preLevelId = preLevelId;
        this.dayOpen = dayOpen;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getIndex() {
        return this.index;
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

    public String getStoryId() {
        return this.storyId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getFirstCompleteRewardPreview() {
        return this.firstCompleteRewardPreview;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getDayOpen() {
        return this.dayOpen;
    }

}
