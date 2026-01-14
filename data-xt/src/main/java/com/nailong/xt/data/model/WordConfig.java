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
 * 对应文件: Word.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WordConfig {

    private final Integer id;
    private final String title;
    private final Integer type;
    private final String desc;
    private final String color;
    private final String icon;
    private final String param1;
    private final String param2;
    private final String titleIcon;
    private final String param3;
    private final String param4;

    @JsonCreator
    public WordConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Color") String color,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("TitleIcon") String titleIcon,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4
    ) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.desc = desc;
        this.color = color;
        this.icon = icon;
        this.param1 = param1;
        this.param2 = param2;
        this.titleIcon = titleIcon;
        this.param3 = param3;
        this.param4 = param4;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getColor() {
        return this.color;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getTitleIcon() {
        return this.titleIcon;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

}
