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
 * 对应文件: CharGemInstanceType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGemInstanceTypeConfig {

    private final Integer id;
    private final String name;
    private final String episode;
    private final Integer sort;

    @JsonCreator
    public CharGemInstanceTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Sort") Integer sort
    ) {
        this.id = id;
        this.name = name;
        this.episode = episode;
        this.sort = sort;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEpisode() {
        return this.episode;
    }

    public Integer getSort() {
        return this.sort;
    }

}
