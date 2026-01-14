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
 * 对应文件: ActivityStory.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityStoryConfig {

    private final Integer id;
    private final Integer chapterId;
    private final String index;
    private final String title;
    private final String desc;
    private final Integer type;
    private final String storyId;
    private final Integer conditionId;
    private final String aim;
    private final String avgLuaName;
    private final String avgMotion;
    private final String firstCompleteReward;
    private final List<String> parentStoryId;
    private final Integer dayOpen;
    private final Boolean isBattle;
    private final List<Integer> floorId;
    private final Integer trialBuild;
    private final Integer previewMonsterGroupId;
    private final String recommend;
    private final Boolean isLast;

    @JsonCreator
    public ActivityStoryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ChapterId") Integer chapterId,
        @JsonProperty("Index") String index,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Type") Integer type,
        @JsonProperty("StoryId") String storyId,
        @JsonProperty("ConditionId") Integer conditionId,
        @JsonProperty("Aim") String aim,
        @JsonProperty("AvgLuaName") String avgLuaName,
        @JsonProperty("AvgMotion") String avgMotion,
        @JsonProperty("FirstCompleteReward") String firstCompleteReward,
        @JsonProperty("ParentStoryId") List<String> parentStoryId,
        @JsonProperty("DayOpen") Integer dayOpen,
        @JsonProperty("IsBattle") Boolean isBattle,
        @JsonProperty("FloorId") List<Integer> floorId,
        @JsonProperty("TrialBuild") Integer trialBuild,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("Recommend") String recommend,
        @JsonProperty("IsLast") Boolean isLast
    ) {
        this.id = id;
        this.chapterId = chapterId;
        this.index = index;
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.storyId = storyId;
        this.conditionId = conditionId;
        this.aim = aim;
        this.avgLuaName = avgLuaName;
        this.avgMotion = avgMotion;
        this.firstCompleteReward = firstCompleteReward;
        this.parentStoryId = parentStoryId != null ? 
            new ArrayList<>(parentStoryId) : 
            new ArrayList<>();
        this.dayOpen = dayOpen;
        this.isBattle = isBattle;
        this.floorId = floorId != null ? 
            new ArrayList<>(floorId) : 
            new ArrayList<>();
        this.trialBuild = trialBuild;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.recommend = recommend;
        this.isLast = isLast;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getChapterId() {
        return this.chapterId;
    }

    public String getIndex() {
        return this.index;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public Integer getConditionId() {
        return this.conditionId;
    }

    public String getAim() {
        return this.aim;
    }

    public String getAvgLuaName() {
        return this.avgLuaName;
    }

    public String getAvgMotion() {
        return this.avgMotion;
    }

    public String getFirstCompleteReward() {
        return this.firstCompleteReward;
    }

    public List<String> getParentStoryId() {
        return this.parentStoryId;
    }

    public Integer getDayOpen() {
        return this.dayOpen;
    }

    public Boolean getIsBattle() {
        return this.isBattle;
    }

    public List<Integer> getFloorId() {
        return this.floorId;
    }

    public Integer getTrialBuild() {
        return this.trialBuild;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public String getRecommend() {
        return this.recommend;
    }

    public Boolean getIsLast() {
        return this.isLast;
    }

}
