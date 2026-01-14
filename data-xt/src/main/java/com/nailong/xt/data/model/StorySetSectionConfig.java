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
 * 对应文件: StorySetSection.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StorySetSectionConfig {

    private final Integer id;
    private final Integer chapterId;
    private final Integer rewardItem1Tid;
    private final Integer rewardItem1Qty;
    private final String title;
    private final String desc;
    private final String avgId;

    @JsonCreator
    public StorySetSectionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ChapterId") Integer chapterId,
        @JsonProperty("RewardItem1Tid") Integer rewardItem1Tid,
        @JsonProperty("RewardItem1Qty") Integer rewardItem1Qty,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("AVGId") String avgId
    ) {
        this.id = id;
        this.chapterId = chapterId;
        this.rewardItem1Tid = rewardItem1Tid;
        this.rewardItem1Qty = rewardItem1Qty;
        this.title = title;
        this.desc = desc;
        this.avgId = avgId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getChapterId() {
        return this.chapterId;
    }

    public Integer getRewardItem1Tid() {
        return this.rewardItem1Tid;
    }

    public Integer getRewardItem1Qty() {
        return this.rewardItem1Qty;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getAvgId() {
        return this.avgId;
    }

}
