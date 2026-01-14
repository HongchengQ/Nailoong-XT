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
 * 对应文件: WeightParameter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WeightParameterConfig {

    private final Integer id;
    private final Integer proportion;
    private final Integer effect;

    @JsonCreator
    public WeightParameterConfig(
        @JsonProperty("id") Integer id,
        @JsonProperty("Proportion") Integer proportion,
        @JsonProperty("effect") Integer effect
    ) {
        this.id = id;
        this.proportion = proportion;
        this.effect = effect;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getProportion() {
        return this.proportion;
    }

    public Integer getEffect() {
        return this.effect;
    }

}
