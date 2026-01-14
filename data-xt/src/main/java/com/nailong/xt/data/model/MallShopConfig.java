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
 * 对应文件: MallShop.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MallShopConfig {

    private final String id;
    private final String name;
    private final String desc;
    private final Integer groupId;
    private final Integer sort;
    private final Integer exchangeItemId;
    private final Integer exchangeItemQty;
    private final Integer stock;
    private final Integer refreshType;
    private final Integer itemId;
    private final Integer itemQty;
    private final String listTime;
    private final String deListTime;
    private final Integer displayMode;

    @JsonCreator
    public MallShopConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("ExchangeItemId") Integer exchangeItemId,
        @JsonProperty("ExchangeItemQty") Integer exchangeItemQty,
        @JsonProperty("Stock") Integer stock,
        @JsonProperty("RefreshType") Integer refreshType,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty,
        @JsonProperty("ListTime") String listTime,
        @JsonProperty("DeListTime") String deListTime,
        @JsonProperty("DisplayMode") Integer displayMode
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.groupId = groupId;
        this.sort = sort;
        this.exchangeItemId = exchangeItemId;
        this.exchangeItemQty = exchangeItemQty;
        this.stock = stock;
        this.refreshType = refreshType;
        this.itemId = itemId;
        this.itemQty = itemQty;
        this.listTime = listTime;
        this.deListTime = deListTime;
        this.displayMode = displayMode;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getExchangeItemId() {
        return this.exchangeItemId;
    }

    public Integer getExchangeItemQty() {
        return this.exchangeItemQty;
    }

    public Integer getStock() {
        return this.stock;
    }

    public Integer getRefreshType() {
        return this.refreshType;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

    public String getListTime() {
        return this.listTime;
    }

    public String getDeListTime() {
        return this.deListTime;
    }

    public Integer getDisplayMode() {
        return this.displayMode;
    }

}
