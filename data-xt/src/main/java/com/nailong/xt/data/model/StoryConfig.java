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
 * 对应文件: Story.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryConfig {

    private final Integer id;
    private final String storyId;
    private final Integer chapter;
    private final String index;
    private final String title;
    private final String desc;
    private final Integer trialBuild;
    private final String conditionId;
    private final Boolean isBattle;
    private final Integer reward;
    private final String rewardDisplay;
    private final List<String> parentStoryId;
    private final List<Integer> floorId;
    private final Integer previewMonsterGroupId;
    private final String recommend;
    private final String aim;
    private final String avgLuaName;
    private final String avgMotion;
    private final Boolean hasEvidence;
    private final Boolean isBranch;
    private final Boolean isLast;

    @JsonCreator
    public StoryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("StoryId") String storyId,
        @JsonProperty("Chapter") Integer chapter,
        @JsonProperty("Index") String index,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("TrialBuild") Integer trialBuild,
        @JsonProperty("ConditionId") String conditionId,
        @JsonProperty("IsBattle") Boolean isBattle,
        @JsonProperty("Reward") Integer reward,
        @JsonProperty("RewardDisplay") String rewardDisplay,
        @JsonProperty("ParentStoryId") List<String> parentStoryId,
        @JsonProperty("FloorId") List<Integer> floorId,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("Recommend") String recommend,
        @JsonProperty("Aim") String aim,
        @JsonProperty("AvgLuaName") String avgLuaName,
        @JsonProperty("AvgMotion") String avgMotion,
        @JsonProperty("HasEvidence") Boolean hasEvidence,
        @JsonProperty("IsBranch") Boolean isBranch,
        @JsonProperty("IsLast") Boolean isLast
    ) {
        this.id = id;
        this.storyId = storyId;
        this.chapter = chapter;
        this.index = index;
        this.title = title;
        this.desc = desc;
        this.trialBuild = trialBuild;
        this.conditionId = conditionId;
        this.isBattle = isBattle;
        this.reward = reward;
        this.rewardDisplay = rewardDisplay;
        this.parentStoryId = parentStoryId != null ? 
            new ArrayList<>(parentStoryId) : 
            new ArrayList<>();
        this.floorId = floorId != null ? 
            new ArrayList<>(floorId) : 
            new ArrayList<>();
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.recommend = recommend;
        this.aim = aim;
        this.avgLuaName = avgLuaName;
        this.avgMotion = avgMotion;
        this.hasEvidence = hasEvidence;
        this.isBranch = isBranch;
        this.isLast = isLast;
    }

    public Integer getId() {
        return this.id;
    }

    public String getStoryId() {
        return this.storyId;
    }

    public Integer getChapter() {
        return this.chapter;
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

    public Integer getTrialBuild() {
        return this.trialBuild;
    }

    public String getConditionId() {
        return this.conditionId;
    }

    public Boolean getIsBattle() {
        return this.isBattle;
    }

    public Integer getReward() {
        return this.reward;
    }

    public String getRewardDisplay() {
        return this.rewardDisplay;
    }

    public List<String> getParentStoryId() {
        return this.parentStoryId;
    }

    public List<Integer> getFloorId() {
        return this.floorId;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public String getRecommend() {
        return this.recommend;
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

    public Boolean getHasEvidence() {
        return this.hasEvidence;
    }

    public Boolean getIsBranch() {
        return this.isBranch;
    }

    public Boolean getIsLast() {
        return this.isLast;
    }

}
