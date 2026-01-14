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
 * 对应文件: StarTowerCombatEvent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerCombatEventConfig {

    private final Integer id;
    private final String name;
    private final Integer type;
    private final String params;
    private final Integer active;
    private final Integer start;

    @JsonCreator
    public StarTowerCombatEventConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Params") String params,
        @JsonProperty("Active") Integer active,
        @JsonProperty("Start") Integer start
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.params = params;
        this.active = active;
        this.start = start;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public String getParams() {
        return this.params;
    }

    public Integer getActive() {
        return this.active;
    }

    public Integer getStart() {
        return this.start;
    }

}
