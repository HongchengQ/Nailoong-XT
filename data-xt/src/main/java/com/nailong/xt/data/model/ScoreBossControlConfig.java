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
 * 对应文件: ScoreBossControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossControlConfig {

    private final Integer id;
    private final String startTime;
    private final String endTime;
    private final List<Integer> levelGroup;

    @JsonCreator
    public ScoreBossControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("LevelGroup") List<Integer> levelGroup
    ) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.levelGroup = levelGroup != null ? 
            new ArrayList<>(levelGroup) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public List<Integer> getLevelGroup() {
        return this.levelGroup;
    }

}
