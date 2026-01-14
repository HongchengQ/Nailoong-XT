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
 * 对应文件: StarTower.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Integer groupId;
    private final String preConditions;
    private final Integer previewMonsterGroupId;
    private final Integer difficulty;
    private final Integer valueDifficulty;
    private final Integer recommend;
    private final Integer currencyId;
    private final List<Integer> stageGroupIds;
    private final List<Integer> floorNum;
    private final Integer teamExpGroupId;
    private final Integer subNoteSkillDropGroupId;
    private final String firstAward;
    private final List<Integer> eet;
    private final List<Integer> notEet;
    private final String episode;
    private final String image;
    private final String rewardPreview;
    private final Integer shopNpc;
    private final Integer standShopNpc;
    private final Integer upgradeNpc;
    private final Integer resqueNpc;
    private final Integer dangerNpc;
    private final Integer horrorNpc;
    private final Integer dangerEndEvent;
    private final Integer horrorEndEvent;
    private final Integer destructibleObjectType;

    @JsonCreator
    public StarTowerConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("PreConditions") String preConditions,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("ValueDifficulty") Integer valueDifficulty,
        @JsonProperty("Recommend") Integer recommend,
        @JsonProperty("CurrencyId") Integer currencyId,
        @JsonProperty("StageGroupIds") List<Integer> stageGroupIds,
        @JsonProperty("FloorNum") List<Integer> floorNum,
        @JsonProperty("TeamExpGroupId") Integer teamExpGroupId,
        @JsonProperty("SubNoteSkillDropGroupId") Integer subNoteSkillDropGroupId,
        @JsonProperty("FirstAward") String firstAward,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("NotEET") List<Integer> notEet,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Image") String image,
        @JsonProperty("RewardPreview") String rewardPreview,
        @JsonProperty("ShopNpc") Integer shopNpc,
        @JsonProperty("StandShopNpc") Integer standShopNpc,
        @JsonProperty("UpgradeNpc") Integer upgradeNpc,
        @JsonProperty("ResqueNpc") Integer resqueNpc,
        @JsonProperty("DangerNpc") Integer dangerNpc,
        @JsonProperty("HorrorNpc") Integer horrorNpc,
        @JsonProperty("DangerEndEvent") Integer dangerEndEvent,
        @JsonProperty("HorrorEndEvent") Integer horrorEndEvent,
        @JsonProperty("DestructibleObjectType") Integer destructibleObjectType
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.groupId = groupId;
        this.preConditions = preConditions;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.difficulty = difficulty;
        this.valueDifficulty = valueDifficulty;
        this.recommend = recommend;
        this.currencyId = currencyId;
        this.stageGroupIds = stageGroupIds != null ? 
            new ArrayList<>(stageGroupIds) : 
            new ArrayList<>();
        this.floorNum = floorNum != null ? 
            new ArrayList<>(floorNum) : 
            new ArrayList<>();
        this.teamExpGroupId = teamExpGroupId;
        this.subNoteSkillDropGroupId = subNoteSkillDropGroupId;
        this.firstAward = firstAward;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.notEet = notEet != null ? 
            new ArrayList<>(notEet) : 
            new ArrayList<>();
        this.episode = episode;
        this.image = image;
        this.rewardPreview = rewardPreview;
        this.shopNpc = shopNpc;
        this.standShopNpc = standShopNpc;
        this.upgradeNpc = upgradeNpc;
        this.resqueNpc = resqueNpc;
        this.dangerNpc = dangerNpc;
        this.horrorNpc = horrorNpc;
        this.dangerEndEvent = dangerEndEvent;
        this.horrorEndEvent = horrorEndEvent;
        this.destructibleObjectType = destructibleObjectType;
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

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getPreConditions() {
        return this.preConditions;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getValueDifficulty() {
        return this.valueDifficulty;
    }

    public Integer getRecommend() {
        return this.recommend;
    }

    public Integer getCurrencyId() {
        return this.currencyId;
    }

    public List<Integer> getStageGroupIds() {
        return this.stageGroupIds;
    }

    public List<Integer> getFloorNum() {
        return this.floorNum;
    }

    public Integer getTeamExpGroupId() {
        return this.teamExpGroupId;
    }

    public Integer getSubNoteSkillDropGroupId() {
        return this.subNoteSkillDropGroupId;
    }

    public String getFirstAward() {
        return this.firstAward;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public List<Integer> getNotEet() {
        return this.notEet;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getImage() {
        return this.image;
    }

    public String getRewardPreview() {
        return this.rewardPreview;
    }

    public Integer getShopNpc() {
        return this.shopNpc;
    }

    public Integer getStandShopNpc() {
        return this.standShopNpc;
    }

    public Integer getUpgradeNpc() {
        return this.upgradeNpc;
    }

    public Integer getResqueNpc() {
        return this.resqueNpc;
    }

    public Integer getDangerNpc() {
        return this.dangerNpc;
    }

    public Integer getHorrorNpc() {
        return this.horrorNpc;
    }

    public Integer getDangerEndEvent() {
        return this.dangerEndEvent;
    }

    public Integer getHorrorEndEvent() {
        return this.horrorEndEvent;
    }

    public Integer getDestructibleObjectType() {
        return this.destructibleObjectType;
    }

}
