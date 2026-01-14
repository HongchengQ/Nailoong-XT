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
 * 对应文件: StarTowerBookFateCardBundle.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBookFateCardBundleConfig {

    private final Integer id;
    private final String name;
    private final String shortName;
    private final Integer sortId;
    private final String icon;
    private final String text;

    @JsonCreator
    public StarTowerBookFateCardBundleConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("ShortName") String shortName,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Text") String text
    ) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.sortId = sortId;
        this.icon = icon;
        this.text = text;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getText() {
        return this.text;
    }

}
