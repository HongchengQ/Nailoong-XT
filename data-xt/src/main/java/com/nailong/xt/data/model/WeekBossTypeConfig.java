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
 * 对应文件: WeekBossType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WeekBossTypeConfig {

    private final Integer id;
    private final String name;
    private final String icon;
    private final Integer sort;
    private final List<Integer> eet;
    private final List<Integer> antiEet;
    private final String episode;
    private final String bossBg;

    @JsonCreator
    public WeekBossTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("AntiEET") List<Integer> antiEet,
        @JsonProperty("Episode") String episode,
        @JsonProperty("BossBg") String bossBg
    ) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.sort = sort;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.antiEet = antiEet != null ? 
            new ArrayList<>(antiEet) : 
            new ArrayList<>();
        this.episode = episode;
        this.bossBg = bossBg;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getSort() {
        return this.sort;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public List<Integer> getAntiEet() {
        return this.antiEet;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getBossBg() {
        return this.bossBg;
    }

}
