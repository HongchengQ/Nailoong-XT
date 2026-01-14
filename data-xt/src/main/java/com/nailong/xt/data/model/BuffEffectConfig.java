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
 * 对应文件: BuffEffect.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BuffEffectConfig {

    private final Integer id;
    private final Integer buffEffectType;
    private final String param1;
    private final String param2;

    @JsonCreator
    public BuffEffectConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BuffEffectType") Integer buffEffectType,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2
    ) {
        this.id = id;
        this.buffEffectType = buffEffectType;
        this.param1 = param1;
        this.param2 = param2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBuffEffectType() {
        return this.buffEffectType;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

}
