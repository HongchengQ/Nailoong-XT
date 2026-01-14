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
 * 对应文件: CookieRhythmlResult.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CookieRhythmlResultConfig {

    private final Integer id;
    private final Integer resultType;
    private final String resultName;
    private final Integer addScoreType;
    private final Integer addScore;
    private final Double range;
    private final String otherCondition;

    @JsonCreator
    public CookieRhythmlResultConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ResultType") Integer resultType,
        @JsonProperty("ResultName") String resultName,
        @JsonProperty("AddScoreType") Integer addScoreType,
        @JsonProperty("AddScore") Integer addScore,
        @JsonProperty("Range") Double range,
        @JsonProperty("OtherCondition") String otherCondition
    ) {
        this.id = id;
        this.resultType = resultType;
        this.resultName = resultName;
        this.addScoreType = addScoreType;
        this.addScore = addScore;
        this.range = range;
        this.otherCondition = otherCondition;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getResultType() {
        return this.resultType;
    }

    public String getResultName() {
        return this.resultName;
    }

    public Integer getAddScoreType() {
        return this.addScoreType;
    }

    public Integer getAddScore() {
        return this.addScore;
    }

    public Double getRange() {
        return this.range;
    }

    public String getOtherCondition() {
        return this.otherCondition;
    }

}
