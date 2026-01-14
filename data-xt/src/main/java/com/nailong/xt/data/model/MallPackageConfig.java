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
 * 对应文件: MallPackage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MallPackageConfig {

    private final String id;
    private final String name;
    private final String detailName;
    private final Integer groupId;
    private final String statisticalGroup;
    private final Integer tag;
    private final Integer sort;
    private final Integer currencyType;
    private final Integer currencyItemQty;
    private final String currencyShowPrice;
    private final Integer stock;
    private final String items;
    private final String listTime;
    private final String deListTime;
    private final String proDeListTime;
    private final List<Integer> contentIcon;
    private final Integer displayMode;
    private final String icon;
    private final String simpleName;
    private final Integer saleRate;
    private final String iconBg;
    private final Integer refreshType;
    private final Integer currencyItemId;
    private final Integer orderCondType;
    private final String orderCondParams;
    private final Integer listCondType;
    private final String listCondParams;

    @JsonCreator
    public MallPackageConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Name") String name,
        @JsonProperty("DetailName") String detailName,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("StatisticalGroup") String statisticalGroup,
        @JsonProperty("Tag") Integer tag,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("CurrencyType") Integer currencyType,
        @JsonProperty("CurrencyItemQty") Integer currencyItemQty,
        @JsonProperty("CurrencyShowPrice") String currencyShowPrice,
        @JsonProperty("Stock") Integer stock,
        @JsonProperty("Items") String items,
        @JsonProperty("ListTime") String listTime,
        @JsonProperty("DeListTime") String deListTime,
        @JsonProperty("ProDeListTime") String proDeListTime,
        @JsonProperty("ContentIcon") List<Integer> contentIcon,
        @JsonProperty("DisplayMode") Integer displayMode,
        @JsonProperty("Icon") String icon,
        @JsonProperty("SimpleName") String simpleName,
        @JsonProperty("SaleRate") Integer saleRate,
        @JsonProperty("IconBg") String iconBg,
        @JsonProperty("RefreshType") Integer refreshType,
        @JsonProperty("CurrencyItemId") Integer currencyItemId,
        @JsonProperty("OrderCondType") Integer orderCondType,
        @JsonProperty("OrderCondParams") String orderCondParams,
        @JsonProperty("ListCondType") Integer listCondType,
        @JsonProperty("ListCondParams") String listCondParams
    ) {
        this.id = id;
        this.name = name;
        this.detailName = detailName;
        this.groupId = groupId;
        this.statisticalGroup = statisticalGroup;
        this.tag = tag;
        this.sort = sort;
        this.currencyType = currencyType;
        this.currencyItemQty = currencyItemQty;
        this.currencyShowPrice = currencyShowPrice;
        this.stock = stock;
        this.items = items;
        this.listTime = listTime;
        this.deListTime = deListTime;
        this.proDeListTime = proDeListTime;
        this.contentIcon = contentIcon != null ? 
            new ArrayList<>(contentIcon) : 
            new ArrayList<>();
        this.displayMode = displayMode;
        this.icon = icon;
        this.simpleName = simpleName;
        this.saleRate = saleRate;
        this.iconBg = iconBg;
        this.refreshType = refreshType;
        this.currencyItemId = currencyItemId;
        this.orderCondType = orderCondType;
        this.orderCondParams = orderCondParams;
        this.listCondType = listCondType;
        this.listCondParams = listCondParams;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDetailName() {
        return this.detailName;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getStatisticalGroup() {
        return this.statisticalGroup;
    }

    public Integer getTag() {
        return this.tag;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getCurrencyType() {
        return this.currencyType;
    }

    public Integer getCurrencyItemQty() {
        return this.currencyItemQty;
    }

    public String getCurrencyShowPrice() {
        return this.currencyShowPrice;
    }

    public Integer getStock() {
        return this.stock;
    }

    public String getItems() {
        return this.items;
    }

    public String getListTime() {
        return this.listTime;
    }

    public String getDeListTime() {
        return this.deListTime;
    }

    public String getProDeListTime() {
        return this.proDeListTime;
    }

    public List<Integer> getContentIcon() {
        return this.contentIcon;
    }

    public Integer getDisplayMode() {
        return this.displayMode;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public Integer getSaleRate() {
        return this.saleRate;
    }

    public String getIconBg() {
        return this.iconBg;
    }

    public Integer getRefreshType() {
        return this.refreshType;
    }

    public Integer getCurrencyItemId() {
        return this.currencyItemId;
    }

    public Integer getOrderCondType() {
        return this.orderCondType;
    }

    public String getOrderCondParams() {
        return this.orderCondParams;
    }

    public Integer getListCondType() {
        return this.listCondType;
    }

    public String getListCondParams() {
        return this.listCondParams;
    }

}
