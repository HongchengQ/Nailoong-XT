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
 * 对应文件: DailyInstanceRewardGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyInstanceRewardGroupConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer dailyRewardType;
    private final String rewardName;
    private final String rewardDes;
    private final String rewardIcon;
    private final Integer dropId;
    private final String baseAwardPreview;

    @JsonCreator
    public DailyInstanceRewardGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("DailyRewardType") Integer dailyRewardType,
        @JsonProperty("RewardName") String rewardName,
        @JsonProperty("RewardDes") String rewardDes,
        @JsonProperty("RewardIcon") String rewardIcon,
        @JsonProperty("DropId") Integer dropId,
        @JsonProperty("BaseAwardPreview") String baseAwardPreview
    ) {
        this.id = id;
        this.groupId = groupId;
        this.dailyRewardType = dailyRewardType;
        this.rewardName = rewardName;
        this.rewardDes = rewardDes;
        this.rewardIcon = rewardIcon;
        this.dropId = dropId;
        this.baseAwardPreview = baseAwardPreview;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getDailyRewardType() {
        return this.dailyRewardType;
    }

    public String getRewardName() {
        return this.rewardName;
    }

    public String getRewardDes() {
        return this.rewardDes;
    }

    public String getRewardIcon() {
        return this.rewardIcon;
    }

    public Integer getDropId() {
        return this.dropId;
    }

    public String getBaseAwardPreview() {
        return this.baseAwardPreview;
    }

}
