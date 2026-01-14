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
 * 对应文件: StarTowerBuild.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBuildConfig {

    private final Integer id;
    private final Integer starTowerId;
    private final List<Integer> characters;
    private final List<Integer> discs;
    private final String potantials;
    private final String subNotes;

    @JsonCreator
    public StarTowerBuildConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("StarTowerId") Integer starTowerId,
        @JsonProperty("Characters") List<Integer> characters,
        @JsonProperty("Discs") List<Integer> discs,
        @JsonProperty("Potantials") String potantials,
        @JsonProperty("SubNotes") String subNotes
    ) {
        this.id = id;
        this.starTowerId = starTowerId;
        this.characters = characters != null ? 
            new ArrayList<>(characters) : 
            new ArrayList<>();
        this.discs = discs != null ? 
            new ArrayList<>(discs) : 
            new ArrayList<>();
        this.potantials = potantials;
        this.subNotes = subNotes;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getStarTowerId() {
        return this.starTowerId;
    }

    public List<Integer> getCharacters() {
        return this.characters;
    }

    public List<Integer> getDiscs() {
        return this.discs;
    }

    public String getPotantials() {
        return this.potantials;
    }

    public String getSubNotes() {
        return this.subNotes;
    }

}
