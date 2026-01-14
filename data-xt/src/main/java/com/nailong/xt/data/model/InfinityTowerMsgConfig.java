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
 * 对应文件: InfinityTowerMsg.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerMsgConfig {

    private final Integer id;
    private final String title;
    private final String content;
    private final Integer type;
    private final List<Integer> dayOfWeek;
    private final Integer condition;
    private final String params;

    @JsonCreator
    public InfinityTowerMsgConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Content") String content,
        @JsonProperty("Type") Integer type,
        @JsonProperty("DayOfWeek") List<Integer> dayOfWeek,
        @JsonProperty("Condition") Integer condition,
        @JsonProperty("Params") String params
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.dayOfWeek = dayOfWeek != null ? 
            new ArrayList<>(dayOfWeek) : 
            new ArrayList<>();
        this.condition = condition;
        this.params = params;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getType() {
        return this.type;
    }

    public List<Integer> getDayOfWeek() {
        return this.dayOfWeek;
    }

    public Integer getCondition() {
        return this.condition;
    }

    public String getParams() {
        return this.params;
    }

}
