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
 * 对应文件: StoryCondition.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryConditionConfig {

    private final Integer id;
    private final String conditionId;
    private final List<String> storyIdA;
    private final List<Integer> achieveIds;
    private final List<String> evIdsA;
    private final List<String> storyIdB;

    @JsonCreator
    public StoryConditionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ConditionId") String conditionId,
        @JsonProperty("StoryId_a") List<String> storyIdA,
        @JsonProperty("AchieveIds") List<Integer> achieveIds,
        @JsonProperty("EvIds_a") List<String> evIdsA,
        @JsonProperty("StoryId_b") List<String> storyIdB
    ) {
        this.id = id;
        this.conditionId = conditionId;
        this.storyIdA = storyIdA != null ? 
            new ArrayList<>(storyIdA) : 
            new ArrayList<>();
        this.achieveIds = achieveIds != null ? 
            new ArrayList<>(achieveIds) : 
            new ArrayList<>();
        this.evIdsA = evIdsA != null ? 
            new ArrayList<>(evIdsA) : 
            new ArrayList<>();
        this.storyIdB = storyIdB != null ? 
            new ArrayList<>(storyIdB) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getConditionId() {
        return this.conditionId;
    }

    public List<String> getStoryIdA() {
        return this.storyIdA;
    }

    public List<Integer> getAchieveIds() {
        return this.achieveIds;
    }

    public List<String> getEvIdsA() {
        return this.evIdsA;
    }

    public List<String> getStoryIdB() {
        return this.storyIdB;
    }

}
