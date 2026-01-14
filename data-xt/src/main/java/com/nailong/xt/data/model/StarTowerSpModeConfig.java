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
 * 对应文件: StarTowerSpMode.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerSpModeConfig {

    private final Integer id;
    private final Boolean limitTimeWeight;
    private final Boolean limitKilledWeight;
    private final Boolean goblinWeight;
    private final Boolean continuousKillingWeight;

    @JsonCreator
    public StarTowerSpModeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("LimitTimeWeight") Boolean limitTimeWeight,
        @JsonProperty("LimitKilledWeight") Boolean limitKilledWeight,
        @JsonProperty("GoblinWeight") Boolean goblinWeight,
        @JsonProperty("ContinuousKillingWeight") Boolean continuousKillingWeight
    ) {
        this.id = id;
        this.limitTimeWeight = limitTimeWeight;
        this.limitKilledWeight = limitKilledWeight;
        this.goblinWeight = goblinWeight;
        this.continuousKillingWeight = continuousKillingWeight;
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getLimitTimeWeight() {
        return this.limitTimeWeight;
    }

    public Boolean getLimitKilledWeight() {
        return this.limitKilledWeight;
    }

    public Boolean getGoblinWeight() {
        return this.goblinWeight;
    }

    public Boolean getContinuousKillingWeight() {
        return this.continuousKillingWeight;
    }

}
