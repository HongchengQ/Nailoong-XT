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
 * 对应文件: DailyInstanceType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyInstanceTypeConfig {

    private final Integer id;
    private final String name;
    private final Integer worldClassLevel;
    private final String episode;
    private final Integer sort;
    private final List<Integer> howReward;

    @JsonCreator
    public DailyInstanceTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("WorldClassLevel") Integer worldClassLevel,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("HowReward") List<Integer> howReward
    ) {
        this.id = id;
        this.name = name;
        this.worldClassLevel = worldClassLevel;
        this.episode = episode;
        this.sort = sort;
        this.howReward = howReward != null ? 
            new ArrayList<>(howReward) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getWorldClassLevel() {
        return this.worldClassLevel;
    }

    public String getEpisode() {
        return this.episode;
    }

    public Integer getSort() {
        return this.sort;
    }

    public List<Integer> getHowReward() {
        return this.howReward;
    }

}
