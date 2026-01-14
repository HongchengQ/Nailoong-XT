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
 * 对应文件: TowerDefenseMonster.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseMonsterConfig {

    private final Integer id;
    private final Integer expGive;
    private final Integer hpReduce;
    private final Integer amountReduce;
    private final String brief;

    @JsonCreator
    public TowerDefenseMonsterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ExpGive") Integer expGive,
        @JsonProperty("HpReduce") Integer hpReduce,
        @JsonProperty("AmountReduce") Integer amountReduce,
        @JsonProperty("Brief") String brief
    ) {
        this.id = id;
        this.expGive = expGive;
        this.hpReduce = hpReduce;
        this.amountReduce = amountReduce;
        this.brief = brief;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getExpGive() {
        return this.expGive;
    }

    public Integer getHpReduce() {
        return this.hpReduce;
    }

    public Integer getAmountReduce() {
        return this.amountReduce;
    }

    public String getBrief() {
        return this.brief;
    }

}
