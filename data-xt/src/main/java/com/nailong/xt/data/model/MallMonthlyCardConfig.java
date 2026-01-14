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
 * 对应文件: MallMonthlyCard.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MallMonthlyCardConfig {

    private final String id;
    private final String name;
    private final String statisticalGroup;
    private final Integer monthlyCardId;
    private final Integer price;
    private final String showPrice;
    private final Integer baseItemId;
    private final Integer baseItemQty;
    private final Integer maxDays;
    private final String icon;

    @JsonCreator
    public MallMonthlyCardConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Name") String name,
        @JsonProperty("StatisticalGroup") String statisticalGroup,
        @JsonProperty("MonthlyCardId") Integer monthlyCardId,
        @JsonProperty("Price") Integer price,
        @JsonProperty("ShowPrice") String showPrice,
        @JsonProperty("BaseItemId") Integer baseItemId,
        @JsonProperty("BaseItemQty") Integer baseItemQty,
        @JsonProperty("MaxDays") Integer maxDays,
        @JsonProperty("Icon") String icon
    ) {
        this.id = id;
        this.name = name;
        this.statisticalGroup = statisticalGroup;
        this.monthlyCardId = monthlyCardId;
        this.price = price;
        this.showPrice = showPrice;
        this.baseItemId = baseItemId;
        this.baseItemQty = baseItemQty;
        this.maxDays = maxDays;
        this.icon = icon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getStatisticalGroup() {
        return this.statisticalGroup;
    }

    public Integer getMonthlyCardId() {
        return this.monthlyCardId;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getShowPrice() {
        return this.showPrice;
    }

    public Integer getBaseItemId() {
        return this.baseItemId;
    }

    public Integer getBaseItemQty() {
        return this.baseItemQty;
    }

    public Integer getMaxDays() {
        return this.maxDays;
    }

    public String getIcon() {
        return this.icon;
    }

}
