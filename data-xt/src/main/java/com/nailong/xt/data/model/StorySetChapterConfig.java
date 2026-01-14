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
 * 对应文件: StorySetChapter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StorySetChapterConfig {

    private final Integer id;
    private final String title;
    private final String name;
    private final String lockText;
    private final Boolean isShow;
    private final String icon;
    private final String image;
    private final String bg;
    private final String openTime;
    private final Boolean isHighLight;

    @JsonCreator
    public StorySetChapterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Name") String name,
        @JsonProperty("LockText") String lockText,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Image") String image,
        @JsonProperty("Bg") String bg,
        @JsonProperty("OpenTime") String openTime,
        @JsonProperty("IsHighLight") Boolean isHighLight
    ) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.lockText = lockText;
        this.isShow = isShow;
        this.icon = icon;
        this.image = image;
        this.bg = bg;
        this.openTime = openTime;
        this.isHighLight = isHighLight;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getName() {
        return this.name;
    }

    public String getLockText() {
        return this.lockText;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getImage() {
        return this.image;
    }

    public String getBg() {
        return this.bg;
    }

    public String getOpenTime() {
        return this.openTime;
    }

    public Boolean getIsHighLight() {
        return this.isHighLight;
    }

}
