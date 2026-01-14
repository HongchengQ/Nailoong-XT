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
 * 对应文件: MonsterTeam.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterTeamConfig {

    private final Integer id;
    private final Integer mate0Id;
    private final Integer mate1Id;
    private final Integer mate2Id;
    private final Integer mate3Id;
    private final Integer mate4Id;
    private final Integer mate5Id;
    private final Integer mate6Id;

    @JsonCreator
    public MonsterTeamConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Mate0Id") Integer mate0Id,
        @JsonProperty("Mate1Id") Integer mate1Id,
        @JsonProperty("Mate2Id") Integer mate2Id,
        @JsonProperty("Mate3Id") Integer mate3Id,
        @JsonProperty("Mate4Id") Integer mate4Id,
        @JsonProperty("Mate5Id") Integer mate5Id,
        @JsonProperty("Mate6Id") Integer mate6Id
    ) {
        this.id = id;
        this.mate0Id = mate0Id;
        this.mate1Id = mate1Id;
        this.mate2Id = mate2Id;
        this.mate3Id = mate3Id;
        this.mate4Id = mate4Id;
        this.mate5Id = mate5Id;
        this.mate6Id = mate6Id;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMate0Id() {
        return this.mate0Id;
    }

    public Integer getMate1Id() {
        return this.mate1Id;
    }

    public Integer getMate2Id() {
        return this.mate2Id;
    }

    public Integer getMate3Id() {
        return this.mate3Id;
    }

    public Integer getMate4Id() {
        return this.mate4Id;
    }

    public Integer getMate5Id() {
        return this.mate5Id;
    }

    public Integer getMate6Id() {
        return this.mate6Id;
    }

}
