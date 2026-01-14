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
 * 对应文件: EnergyBuy.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EnergyBuyConfig {

    private final Integer id;
    private final Integer currencyItemId;
    private final Integer currencyItemQty;
    private final Integer energyValue;
    private final Integer priceGroup;
    private final String groupName;

    @JsonCreator
    public EnergyBuyConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CurrencyItemId") Integer currencyItemId,
        @JsonProperty("CurrencyItemQty") Integer currencyItemQty,
        @JsonProperty("EnergyValue") Integer energyValue,
        @JsonProperty("PriceGroup") Integer priceGroup,
        @JsonProperty("GroupName") String groupName
    ) {
        this.id = id;
        this.currencyItemId = currencyItemId;
        this.currencyItemQty = currencyItemQty;
        this.energyValue = energyValue;
        this.priceGroup = priceGroup;
        this.groupName = groupName;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCurrencyItemId() {
        return this.currencyItemId;
    }

    public Integer getCurrencyItemQty() {
        return this.currencyItemQty;
    }

    public Integer getEnergyValue() {
        return this.energyValue;
    }

    public Integer getPriceGroup() {
        return this.priceGroup;
    }

    public String getGroupName() {
        return this.groupName;
    }

}
