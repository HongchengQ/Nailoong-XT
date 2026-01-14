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
 * 对应文件: EventOptionsRules.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EventOptionsRulesConfig {

    private final Integer id;

    @JsonCreator
    public EventOptionsRulesConfig(
        @JsonProperty("Id") Integer id
    ) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

}
