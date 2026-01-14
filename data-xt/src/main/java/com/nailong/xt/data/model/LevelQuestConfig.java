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
 * 对应文件: LevelQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class LevelQuestConfig {

    private final Integer id;
    private final String questName;
    private final List<Integer> levelQuestTargetIds;

    @JsonCreator
    public LevelQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("QuestName") String questName,
        @JsonProperty("LevelQuestTargetIds") List<Integer> levelQuestTargetIds
    ) {
        this.id = id;
        this.questName = questName;
        this.levelQuestTargetIds = levelQuestTargetIds != null ? 
            new ArrayList<>(levelQuestTargetIds) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getQuestName() {
        return this.questName;
    }

    public List<Integer> getLevelQuestTargetIds() {
        return this.levelQuestTargetIds;
    }

}
