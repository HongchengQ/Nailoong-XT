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
 * 对应文件: StarTowerFloorExp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerFloorExpConfig {

    private final Integer id;
    private final Integer starTowerId;
    private final Integer stage;
    private final Integer normalExp;
    private final Integer eliteExp;
    private final Integer bossExp;
    private final Integer finalBossExp;

    @JsonCreator
    public StarTowerFloorExpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("StarTowerId") Integer starTowerId,
        @JsonProperty("Stage") Integer stage,
        @JsonProperty("NormalExp") Integer normalExp,
        @JsonProperty("EliteExp") Integer eliteExp,
        @JsonProperty("BossExp") Integer bossExp,
        @JsonProperty("FinalBossExp") Integer finalBossExp
    ) {
        this.id = id;
        this.starTowerId = starTowerId;
        this.stage = stage;
        this.normalExp = normalExp;
        this.eliteExp = eliteExp;
        this.bossExp = bossExp;
        this.finalBossExp = finalBossExp;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getStarTowerId() {
        return this.starTowerId;
    }

    public Integer getStage() {
        return this.stage;
    }

    public Integer getNormalExp() {
        return this.normalExp;
    }

    public Integer getEliteExp() {
        return this.eliteExp;
    }

    public Integer getBossExp() {
        return this.bossExp;
    }

    public Integer getFinalBossExp() {
        return this.finalBossExp;
    }

}
