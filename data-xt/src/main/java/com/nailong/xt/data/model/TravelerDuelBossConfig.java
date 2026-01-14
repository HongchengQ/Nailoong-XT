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
 * 对应文件: TravelerDuelBoss.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TravelerDuelBossConfig {

    private final Integer id;
    private final String name;
    private final Integer travelerDuelBossType;
    private final String episode;
    private final String image;
    private final String cover;

    @JsonCreator
    public TravelerDuelBossConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("TravelerDuelBossType") Integer travelerDuelBossType,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Image") String image,
        @JsonProperty("Cover") String cover
    ) {
        this.id = id;
        this.name = name;
        this.travelerDuelBossType = travelerDuelBossType;
        this.episode = episode;
        this.image = image;
        this.cover = cover;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getTravelerDuelBossType() {
        return this.travelerDuelBossType;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getImage() {
        return this.image;
    }

    public String getCover() {
        return this.cover;
    }

}
