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
 * 对应文件: EventResult.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EventResultConfig {

    private final Integer id;
    private final Integer effect1;
    private final List<Integer> parameter1;
    private final Integer effect2;
    private final List<Integer> parameter2;
    private final Integer effect3;
    private final List<Integer> parameter3;

    @JsonCreator
    public EventResultConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Effect1") Integer effect1,
        @JsonProperty("Parameter1") List<Integer> parameter1,
        @JsonProperty("Effect2") Integer effect2,
        @JsonProperty("Parameter2") List<Integer> parameter2,
        @JsonProperty("Effect3") Integer effect3,
        @JsonProperty("Parameter3") List<Integer> parameter3
    ) {
        this.id = id;
        this.effect1 = effect1;
        this.parameter1 = parameter1 != null ? 
            new ArrayList<>(parameter1) : 
            new ArrayList<>();
        this.effect2 = effect2;
        this.parameter2 = parameter2 != null ? 
            new ArrayList<>(parameter2) : 
            new ArrayList<>();
        this.effect3 = effect3;
        this.parameter3 = parameter3 != null ? 
            new ArrayList<>(parameter3) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getEffect1() {
        return this.effect1;
    }

    public List<Integer> getParameter1() {
        return this.parameter1;
    }

    public Integer getEffect2() {
        return this.effect2;
    }

    public List<Integer> getParameter2() {
        return this.parameter2;
    }

    public Integer getEffect3() {
        return this.effect3;
    }

    public List<Integer> getParameter3() {
        return this.parameter3;
    }

}
