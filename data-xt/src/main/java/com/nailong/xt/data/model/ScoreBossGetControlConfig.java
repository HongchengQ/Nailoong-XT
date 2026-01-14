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
 * 对应文件: ScoreBossGetControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossGetControlConfig {

    private final Integer id;
    private final Integer scoreBossBehavior;
    private final Integer scoreBossType;
    private final String name;
    private final String desc;
    private final String iconSource;
    private final Integer onceScore;
    private final Integer maxLimit;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String value1;
    private final String value2;
    private final String value3;
    private final String param4;
    private final String value4;

    @JsonCreator
    public ScoreBossGetControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ScoreBossBehavior") Integer scoreBossBehavior,
        @JsonProperty("ScoreBossType") Integer scoreBossType,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("IconSource") String iconSource,
        @JsonProperty("OnceScore") Integer onceScore,
        @JsonProperty("MaxLimit") Integer maxLimit,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Value1") String value1,
        @JsonProperty("Value2") String value2,
        @JsonProperty("Value3") String value3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("Value4") String value4
    ) {
        this.id = id;
        this.scoreBossBehavior = scoreBossBehavior;
        this.scoreBossType = scoreBossType;
        this.name = name;
        this.desc = desc;
        this.iconSource = iconSource;
        this.onceScore = onceScore;
        this.maxLimit = maxLimit;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.param4 = param4;
        this.value4 = value4;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getScoreBossBehavior() {
        return this.scoreBossBehavior;
    }

    public Integer getScoreBossType() {
        return this.scoreBossType;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIconSource() {
        return this.iconSource;
    }

    public Integer getOnceScore() {
        return this.onceScore;
    }

    public Integer getMaxLimit() {
        return this.maxLimit;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getValue1() {
        return this.value1;
    }

    public String getValue2() {
        return this.value2;
    }

    public String getValue3() {
        return this.value3;
    }

    public String getParam4() {
        return this.param4;
    }

    public String getValue4() {
        return this.value4;
    }

}
