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
 * 对应文件: CharRaritySequence.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharRaritySequenceConfig {

    private final Integer id;
    private final Integer grade;
    private final Integer lvLimit;
    private final Integer worldClassLimit;
    private final Integer advanceLvl;

    @JsonCreator
    public CharRaritySequenceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Grade") Integer grade,
        @JsonProperty("LvLimit") Integer lvLimit,
        @JsonProperty("WorldClassLimit") Integer worldClassLimit,
        @JsonProperty("AdvanceLvl") Integer advanceLvl
    ) {
        this.id = id;
        this.grade = grade;
        this.lvLimit = lvLimit;
        this.worldClassLimit = worldClassLimit;
        this.advanceLvl = advanceLvl;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public Integer getLvLimit() {
        return this.lvLimit;
    }

    public Integer getWorldClassLimit() {
        return this.worldClassLimit;
    }

    public Integer getAdvanceLvl() {
        return this.advanceLvl;
    }

}
