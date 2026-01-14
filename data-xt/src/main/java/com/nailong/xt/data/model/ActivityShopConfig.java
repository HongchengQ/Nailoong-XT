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
 * 对应文件: ActivityShop.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityShopConfig {

    private final Integer id;
    private final String name;
    private final Integer sequence;
    private final Integer currencyItemId;
    private final Integer exchangeItemId;
    private final Integer rate;
    private final List<Integer> otherExchangeItem1;

    @JsonCreator
    public ActivityShopConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Sequence") Integer sequence,
        @JsonProperty("CurrencyItemId") Integer currencyItemId,
        @JsonProperty("ExchangeItemId") Integer exchangeItemId,
        @JsonProperty("Rate") Integer rate,
        @JsonProperty("OtherExchangeItem1") List<Integer> otherExchangeItem1
    ) {
        this.id = id;
        this.name = name;
        this.sequence = sequence;
        this.currencyItemId = currencyItemId;
        this.exchangeItemId = exchangeItemId;
        this.rate = rate;
        this.otherExchangeItem1 = otherExchangeItem1 != null ? 
            new ArrayList<>(otherExchangeItem1) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Integer getCurrencyItemId() {
        return this.currencyItemId;
    }

    public Integer getExchangeItemId() {
        return this.exchangeItemId;
    }

    public Integer getRate() {
        return this.rate;
    }

    public List<Integer> getOtherExchangeItem1() {
        return this.otherExchangeItem1;
    }

}
