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
 * 对应文件: ActivityStoryEvidence.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityStoryEvidenceConfig {

    private final Integer id;
    private final String evId;
    private final Integer activityId;

    @JsonCreator
    public ActivityStoryEvidenceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("EvId") String evId,
        @JsonProperty("ActivityId") Integer activityId
    ) {
        this.id = id;
        this.evId = evId;
        this.activityId = activityId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getEvId() {
        return this.evId;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

}
