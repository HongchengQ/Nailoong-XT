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
 * 对应文件: ActivityStoryCondition.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityStoryConditionConfig {

    private final Integer id;
    private final Integer activityId;
    private final List<Integer> activityStoryIdA;
    private final List<Integer> evIdsA;
    private final List<Integer> activityStoryIdB;

    @JsonCreator
    public ActivityStoryConditionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("ActivityStoryId_a") List<Integer> activityStoryIdA,
        @JsonProperty("EvIds_a") List<Integer> evIdsA,
        @JsonProperty("ActivityStoryId_b") List<Integer> activityStoryIdB
    ) {
        this.id = id;
        this.activityId = activityId;
        this.activityStoryIdA = activityStoryIdA != null ? 
            new ArrayList<>(activityStoryIdA) : 
            new ArrayList<>();
        this.evIdsA = evIdsA != null ? 
            new ArrayList<>(evIdsA) : 
            new ArrayList<>();
        this.activityStoryIdB = activityStoryIdB != null ? 
            new ArrayList<>(activityStoryIdB) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public List<Integer> getActivityStoryIdA() {
        return this.activityStoryIdA;
    }

    public List<Integer> getEvIdsA() {
        return this.evIdsA;
    }

    public List<Integer> getActivityStoryIdB() {
        return this.activityStoryIdB;
    }

}
