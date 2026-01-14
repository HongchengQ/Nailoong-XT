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
 * 对应文件: AgentTab.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AgentTabConfig {

    private final Integer id;
    private final String name;
    private final String bg;
    private final Boolean spTag;

    @JsonCreator
    public AgentTabConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Bg") String bg,
        @JsonProperty("SpTag") Boolean spTag
    ) {
        this.id = id;
        this.name = name;
        this.bg = bg;
        this.spTag = spTag;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBg() {
        return this.bg;
    }

    public Boolean getSpTag() {
        return this.spTag;
    }

}
