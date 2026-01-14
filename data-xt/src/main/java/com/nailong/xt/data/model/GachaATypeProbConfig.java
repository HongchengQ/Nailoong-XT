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
 * 对应文件: GachaATypeProb.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaATypeProbConfig {

    private final Integer group;
    private final Integer prob;
    private final Integer times;

    @JsonCreator
    public GachaATypeProbConfig(
        @JsonProperty("Group") Integer group,
        @JsonProperty("Prob") Integer prob,
        @JsonProperty("Times") Integer times
    ) {
        this.group = group;
        this.prob = prob;
        this.times = times;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getProb() {
        return this.prob;
    }

    public Integer getTimes() {
        return this.times;
    }

}
