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
 * 对应文件: CharacterVoiceControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterVoiceControlConfig {

    private final String id;
    private final Integer probability;
    private final Integer resType;
    private final List<Integer> worldLevelTypes;
    private final Integer voPlayer;
    private final Integer priority;
    private final Integer cd;
    private final Boolean bubble;
    private final Boolean dateTrigger;
    private final String date;

    @JsonCreator
    public CharacterVoiceControlConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("probability") Integer probability,
        @JsonProperty("resType") Integer resType,
        @JsonProperty("worldLevelTypes") List<Integer> worldLevelTypes,
        @JsonProperty("voPlayer") Integer voPlayer,
        @JsonProperty("priority") Integer priority,
        @JsonProperty("cd") Integer cd,
        @JsonProperty("bubble") Boolean bubble,
        @JsonProperty("dateTrigger") Boolean dateTrigger,
        @JsonProperty("date") String date
    ) {
        this.id = id;
        this.probability = probability;
        this.resType = resType;
        this.worldLevelTypes = worldLevelTypes != null ? 
            new ArrayList<>(worldLevelTypes) : 
            new ArrayList<>();
        this.voPlayer = voPlayer;
        this.priority = priority;
        this.cd = cd;
        this.bubble = bubble;
        this.dateTrigger = dateTrigger;
        this.date = date;
    }

    public String getId() {
        return this.id;
    }

    public Integer getProbability() {
        return this.probability;
    }

    public Integer getResType() {
        return this.resType;
    }

    public List<Integer> getWorldLevelTypes() {
        return this.worldLevelTypes;
    }

    public Integer getVoPlayer() {
        return this.voPlayer;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Integer getCd() {
        return this.cd;
    }

    public Boolean getBubble() {
        return this.bubble;
    }

    public Boolean getDateTrigger() {
        return this.dateTrigger;
    }

    public String getDate() {
        return this.date;
    }

}
