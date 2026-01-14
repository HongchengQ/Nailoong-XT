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
 * 对应文件: ResidentGoods.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ResidentGoodsConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Integer shopId;
    private final Integer saleNumber;
    private final Integer itemId;
    private final Integer itemQuantity;
    private final Integer maximumLimit;
    private final Integer currencyItemId;
    private final Integer price;
    private final Integer displayMode;
    private final Integer appearCondType;
    private final String appearCondParams;

    @JsonCreator
    public ResidentGoodsConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ShopId") Integer shopId,
        @JsonProperty("SaleNumber") Integer saleNumber,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQuantity") Integer itemQuantity,
        @JsonProperty("MaximumLimit") Integer maximumLimit,
        @JsonProperty("CurrencyItemId") Integer currencyItemId,
        @JsonProperty("Price") Integer price,
        @JsonProperty("DisplayMode") Integer displayMode,
        @JsonProperty("AppearCondType") Integer appearCondType,
        @JsonProperty("AppearCondParams") String appearCondParams
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.shopId = shopId;
        this.saleNumber = saleNumber;
        this.itemId = itemId;
        this.itemQuantity = itemQuantity;
        this.maximumLimit = maximumLimit;
        this.currencyItemId = currencyItemId;
        this.price = price;
        this.displayMode = displayMode;
        this.appearCondType = appearCondType;
        this.appearCondParams = appearCondParams;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getShopId() {
        return this.shopId;
    }

    public Integer getSaleNumber() {
        return this.saleNumber;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQuantity() {
        return this.itemQuantity;
    }

    public Integer getMaximumLimit() {
        return this.maximumLimit;
    }

    public Integer getCurrencyItemId() {
        return this.currencyItemId;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getDisplayMode() {
        return this.displayMode;
    }

    public Integer getAppearCondType() {
        return this.appearCondType;
    }

    public String getAppearCondParams() {
        return this.appearCondParams;
    }

}
