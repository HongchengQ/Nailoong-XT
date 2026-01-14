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
 * 对应文件: TrialBuild.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialBuildConfig {

    private final Integer id;
    private final String name;
    private final Integer score;
    private final List<Integer> charField;
    private final List<Integer> disc;
    private final String potential;
    private final Integer starTowerId;
    private final List<Integer> activeSecondaryIds;
    private final String note;

    @JsonCreator
    public TrialBuildConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Score") Integer score,
        @JsonProperty("Char") List<Integer> charField,
        @JsonProperty("Disc") List<Integer> disc,
        @JsonProperty("Potential") String potential,
        @JsonProperty("StarTowerId") Integer starTowerId,
        @JsonProperty("ActiveSecondaryIds") List<Integer> activeSecondaryIds,
        @JsonProperty("Note") String note
    ) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.charField = charField != null ? 
            new ArrayList<>(charField) : 
            new ArrayList<>();
        this.disc = disc != null ? 
            new ArrayList<>(disc) : 
            new ArrayList<>();
        this.potential = potential;
        this.starTowerId = starTowerId;
        this.activeSecondaryIds = activeSecondaryIds != null ? 
            new ArrayList<>(activeSecondaryIds) : 
            new ArrayList<>();
        this.note = note;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getScore() {
        return this.score;
    }

    public List<Integer> getCharField() {
        return this.charField;
    }

    public List<Integer> getDisc() {
        return this.disc;
    }

    public String getPotential() {
        return this.potential;
    }

    public Integer getStarTowerId() {
        return this.starTowerId;
    }

    public List<Integer> getActiveSecondaryIds() {
        return this.activeSecondaryIds;
    }

    public String getNote() {
        return this.note;
    }

}
