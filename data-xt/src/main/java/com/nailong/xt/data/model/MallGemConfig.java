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
 * 对应文件: MallGem.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MallGemConfig {

    private final String id;
    private final String name;
    private final String desc;
    private final String statisticalGroup;
    private final Integer order;
    private final Integer baseItemId;
    private final Integer baseItemQty;
    private final Integer experiencedBonusItemId;
    private final Integer experiencedBonusItemQty;
    private final Integer maidenBonusItemId;
    private final Integer maidenBonusItemQty;
    private final Integer price;
    private final String showPrice;
    private final String icon;
    private final String iconBg;

    @JsonCreator
    public MallGemConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("StatisticalGroup") String statisticalGroup,
        @JsonProperty("Order") Integer order,
        @JsonProperty("BaseItemId") Integer baseItemId,
        @JsonProperty("BaseItemQty") Integer baseItemQty,
        @JsonProperty("ExperiencedBonusItemId") Integer experiencedBonusItemId,
        @JsonProperty("ExperiencedBonusItemQty") Integer experiencedBonusItemQty,
        @JsonProperty("MaidenBonusItemID") Integer maidenBonusItemId,
        @JsonProperty("MaidenBonusItemQty") Integer maidenBonusItemQty,
        @JsonProperty("Price") Integer price,
        @JsonProperty("ShowPrice") String showPrice,
        @JsonProperty("Icon") String icon,
        @JsonProperty("IconBg") String iconBg
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.statisticalGroup = statisticalGroup;
        this.order = order;
        this.baseItemId = baseItemId;
        this.baseItemQty = baseItemQty;
        this.experiencedBonusItemId = experiencedBonusItemId;
        this.experiencedBonusItemQty = experiencedBonusItemQty;
        this.maidenBonusItemId = maidenBonusItemId;
        this.maidenBonusItemQty = maidenBonusItemQty;
        this.price = price;
        this.showPrice = showPrice;
        this.icon = icon;
        this.iconBg = iconBg;
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

    public String getStatisticalGroup() {
        return this.statisticalGroup;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Integer getBaseItemId() {
        return this.baseItemId;
    }

    public Integer getBaseItemQty() {
        return this.baseItemQty;
    }

    public Integer getExperiencedBonusItemId() {
        return this.experiencedBonusItemId;
    }

    public Integer getExperiencedBonusItemQty() {
        return this.experiencedBonusItemQty;
    }

    public Integer getMaidenBonusItemId() {
        return this.maidenBonusItemId;
    }

    public Integer getMaidenBonusItemQty() {
        return this.maidenBonusItemQty;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getShowPrice() {
        return this.showPrice;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIconBg() {
        return this.iconBg;
    }

}
