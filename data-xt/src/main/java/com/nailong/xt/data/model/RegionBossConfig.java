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
 * 对应文件: RegionBoss.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RegionBossConfig {

    private final Integer id;
    private final Integer monsterId;
    private final Integer regionType;
    private final String name;
    private final String icon;
    private final Integer sort;
    private final List<Integer> openDay;
    private final String openDayDesc;
    private final List<Integer> eet;
    private final String episode;
    private final String image;
    private final List<Integer> dropItem;

    @JsonCreator
    public RegionBossConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("RegionType") Integer regionType,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("OpenDay") List<Integer> openDay,
        @JsonProperty("OpenDayDesc") String openDayDesc,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Image") String image,
        @JsonProperty("DropItem") List<Integer> dropItem
    ) {
        this.id = id;
        this.monsterId = monsterId;
        this.regionType = regionType;
        this.name = name;
        this.icon = icon;
        this.sort = sort;
        this.openDay = openDay != null ? 
            new ArrayList<>(openDay) : 
            new ArrayList<>();
        this.openDayDesc = openDayDesc;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.episode = episode;
        this.image = image;
        this.dropItem = dropItem != null ? 
            new ArrayList<>(dropItem) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMonsterId() {
        return this.monsterId;
    }

    public Integer getRegionType() {
        return this.regionType;
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

    public List<Integer> getOpenDay() {
        return this.openDay;
    }

    public String getOpenDayDesc() {
        return this.openDayDesc;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getImage() {
        return this.image;
    }

    public List<Integer> getDropItem() {
        return this.dropItem;
    }

}
