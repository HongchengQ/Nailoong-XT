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
 * 对应文件: DatingLandmark.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DatingLandmarkConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final String icon;
    private final String bg;

    @JsonCreator
    public DatingLandmarkConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Bg") String bg
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.icon = icon;
        this.bg = bg;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getBg() {
        return this.bg;
    }

}
