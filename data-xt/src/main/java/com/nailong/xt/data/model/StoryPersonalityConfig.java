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
 * 对应文件: StoryPersonality.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryPersonalityConfig {

    private final Integer id;
    private final String name;
    private final String db;
    private final String icon;
    private final String color;

    @JsonCreator
    public StoryPersonalityConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Db") String db,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Color") String color
    ) {
        this.id = id;
        this.name = name;
        this.db = db;
        this.icon = icon;
        this.color = color;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDb() {
        return this.db;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getColor() {
        return this.color;
    }

}
