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
 * 对应文件: StarTowerGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerGroupConfig {

    private final Integer id;
    private final String name;
    private final List<Integer> eet;
    private final String episode;
    private final String coverImage;
    private final Integer sort;
    private final Integer groupTheme;

    @JsonCreator
    public StarTowerGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("Episode") String episode,
        @JsonProperty("CoverImage") String coverImage,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("GroupTheme") Integer groupTheme
    ) {
        this.id = id;
        this.name = name;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.episode = episode;
        this.coverImage = coverImage;
        this.sort = sort;
        this.groupTheme = groupTheme;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getCoverImage() {
        return this.coverImage;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getGroupTheme() {
        return this.groupTheme;
    }

}
