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
 * 对应文件: SkillInstanceType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SkillInstanceTypeConfig {

    private final Integer id;
    private final String name;
    private final Integer worldClassLevel;
    private final String episode;
    private final Integer sort;
    private final List<Integer> eet;

    @JsonCreator
    public SkillInstanceTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("WorldClassLevel") Integer worldClassLevel,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("EET") List<Integer> eet
    ) {
        this.id = id;
        this.name = name;
        this.worldClassLevel = worldClassLevel;
        this.episode = episode;
        this.sort = sort;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
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

    public List<Integer> getEet() {
        return this.eet;
    }

}
