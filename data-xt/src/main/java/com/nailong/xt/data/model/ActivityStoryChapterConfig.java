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
 * 对应文件: ActivityStoryChapter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityStoryChapterConfig {

    private final Integer id;
    private final Integer activityId;
    private final Integer activityGroupType;

    @JsonCreator
    public ActivityStoryChapterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("ActivityGroupType") Integer activityGroupType
    ) {
        this.id = id;
        this.activityId = activityId;
        this.activityGroupType = activityGroupType;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public Integer getActivityGroupType() {
        return this.activityGroupType;
    }

}
