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
 * 对应文件: StarTowerBuildRank.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBuildRankConfig {

    private final Integer id;
    private final Integer rarity;
    private final Integer attrBaseGroupId;
    private final Integer level;
    private final String desc;
    private final Integer param1;
    private final Integer param2;
    private final Integer minGrade;

    @JsonCreator
    public StarTowerBuildRankConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("AttrBaseGroupId") Integer attrBaseGroupId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Param1") Integer param1,
        @JsonProperty("Param2") Integer param2,
        @JsonProperty("MinGrade") Integer minGrade
    ) {
        this.id = id;
        this.rarity = rarity;
        this.attrBaseGroupId = attrBaseGroupId;
        this.level = level;
        this.desc = desc;
        this.param1 = param1;
        this.param2 = param2;
        this.minGrade = minGrade;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public Integer getAttrBaseGroupId() {
        return this.attrBaseGroupId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getParam1() {
        return this.param1;
    }

    public Integer getParam2() {
        return this.param2;
    }

    public Integer getMinGrade() {
        return this.minGrade;
    }

}
