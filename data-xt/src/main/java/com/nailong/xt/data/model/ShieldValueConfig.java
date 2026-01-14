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
 * 对应文件: ShieldValue.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ShieldValueConfig {

    private final Integer id;
    private final String name;
    private final Integer referenceTarget;
    private final Integer referenceAttrib;
    private final Integer referenceScale;
    private final Integer time;
    private final Integer shieldLaminatedNum;
    private final Integer timeSuperposition;
    private final Boolean notRemove;

    @JsonCreator
    public ShieldValueConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("ReferenceTarget") Integer referenceTarget,
        @JsonProperty("ReferenceAttrib") Integer referenceAttrib,
        @JsonProperty("ReferenceScale") Integer referenceScale,
        @JsonProperty("Time") Integer time,
        @JsonProperty("ShieldLaminatedNum") Integer shieldLaminatedNum,
        @JsonProperty("TimeSuperposition") Integer timeSuperposition,
        @JsonProperty("NotRemove") Boolean notRemove
    ) {
        this.id = id;
        this.name = name;
        this.referenceTarget = referenceTarget;
        this.referenceAttrib = referenceAttrib;
        this.referenceScale = referenceScale;
        this.time = time;
        this.shieldLaminatedNum = shieldLaminatedNum;
        this.timeSuperposition = timeSuperposition;
        this.notRemove = notRemove;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getReferenceTarget() {
        return this.referenceTarget;
    }

    public Integer getReferenceAttrib() {
        return this.referenceAttrib;
    }

    public Integer getReferenceScale() {
        return this.referenceScale;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getShieldLaminatedNum() {
        return this.shieldLaminatedNum;
    }

    public Integer getTimeSuperposition() {
        return this.timeSuperposition;
    }

    public Boolean getNotRemove() {
        return this.notRemove;
    }

}
