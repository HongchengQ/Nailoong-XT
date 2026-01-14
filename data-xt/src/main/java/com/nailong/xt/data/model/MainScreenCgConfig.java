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
 * 对应文件: MainScreenCg.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MainScreenCgConfig {

    private final Integer id;
    private final String name;
    private final Boolean isShown;
    private final String fullScreenImg;
    private final String listImg;
    private final String icon;
    private final Integer sort;

    @JsonCreator
    public MainScreenCgConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("IsShown") Boolean isShown,
        @JsonProperty("FullScreenImg") String fullScreenImg,
        @JsonProperty("ListImg") String listImg,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Sort") Integer sort
    ) {
        this.id = id;
        this.name = name;
        this.isShown = isShown;
        this.fullScreenImg = fullScreenImg;
        this.listImg = listImg;
        this.icon = icon;
        this.sort = sort;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getIsShown() {
        return this.isShown;
    }

    public String getFullScreenImg() {
        return this.fullScreenImg;
    }

    public String getListImg() {
        return this.listImg;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getSort() {
        return this.sort;
    }

}
