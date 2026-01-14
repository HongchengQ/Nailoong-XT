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
 * 对应文件: BattlePass.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BattlePassConfig {

    private final Integer id;
    private final String name;
    private final String startTime;
    private final String endTime;
    private final String luxuryProductId;
    private final Integer luxuryPrice;
    private final String luxuryShowPrice;
    private final Integer luxuryBonusLevel;
    private final Integer luxuryTid;
    private final Integer luxuryQty;
    private final String premiumProductId;
    private final Integer premiumPrice;
    private final String premiumShowPrice;
    private final String complementaryProductId;
    private final Integer complementaryPrice;
    private final String complementaryShowPrice;
    private final Integer complementaryTid;
    private final Integer complementaryQty;
    private final String originShowPrice;
    private final String coverColor;
    private final Integer cover;
    private final List<Integer> premiumShowItems;
    private final List<Integer> luxuryShowItems;
    private final Integer outfitPackageShowItem;

    @JsonCreator
    public BattlePassConfig(
        @JsonProperty("ID") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("LuxuryProductId") String luxuryProductId,
        @JsonProperty("LuxuryPrice") Integer luxuryPrice,
        @JsonProperty("LuxuryShowPrice") String luxuryShowPrice,
        @JsonProperty("LuxuryBonusLevel") Integer luxuryBonusLevel,
        @JsonProperty("LuxuryTid") Integer luxuryTid,
        @JsonProperty("LuxuryQty") Integer luxuryQty,
        @JsonProperty("PremiumProductId") String premiumProductId,
        @JsonProperty("PremiumPrice") Integer premiumPrice,
        @JsonProperty("PremiumShowPrice") String premiumShowPrice,
        @JsonProperty("ComplementaryProductId") String complementaryProductId,
        @JsonProperty("ComplementaryPrice") Integer complementaryPrice,
        @JsonProperty("ComplementaryShowPrice") String complementaryShowPrice,
        @JsonProperty("ComplementaryTid") Integer complementaryTid,
        @JsonProperty("ComplementaryQty") Integer complementaryQty,
        @JsonProperty("OriginShowPrice") String originShowPrice,
        @JsonProperty("CoverColor") String coverColor,
        @JsonProperty("Cover") Integer cover,
        @JsonProperty("PremiumShowItems") List<Integer> premiumShowItems,
        @JsonProperty("LuxuryShowItems") List<Integer> luxuryShowItems,
        @JsonProperty("OutfitPackageShowItem") Integer outfitPackageShowItem
    ) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.luxuryProductId = luxuryProductId;
        this.luxuryPrice = luxuryPrice;
        this.luxuryShowPrice = luxuryShowPrice;
        this.luxuryBonusLevel = luxuryBonusLevel;
        this.luxuryTid = luxuryTid;
        this.luxuryQty = luxuryQty;
        this.premiumProductId = premiumProductId;
        this.premiumPrice = premiumPrice;
        this.premiumShowPrice = premiumShowPrice;
        this.complementaryProductId = complementaryProductId;
        this.complementaryPrice = complementaryPrice;
        this.complementaryShowPrice = complementaryShowPrice;
        this.complementaryTid = complementaryTid;
        this.complementaryQty = complementaryQty;
        this.originShowPrice = originShowPrice;
        this.coverColor = coverColor;
        this.cover = cover;
        this.premiumShowItems = premiumShowItems != null ? 
            new ArrayList<>(premiumShowItems) : 
            new ArrayList<>();
        this.luxuryShowItems = luxuryShowItems != null ? 
            new ArrayList<>(luxuryShowItems) : 
            new ArrayList<>();
        this.outfitPackageShowItem = outfitPackageShowItem;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getLuxuryProductId() {
        return this.luxuryProductId;
    }

    public Integer getLuxuryPrice() {
        return this.luxuryPrice;
    }

    public String getLuxuryShowPrice() {
        return this.luxuryShowPrice;
    }

    public Integer getLuxuryBonusLevel() {
        return this.luxuryBonusLevel;
    }

    public Integer getLuxuryTid() {
        return this.luxuryTid;
    }

    public Integer getLuxuryQty() {
        return this.luxuryQty;
    }

    public String getPremiumProductId() {
        return this.premiumProductId;
    }

    public Integer getPremiumPrice() {
        return this.premiumPrice;
    }

    public String getPremiumShowPrice() {
        return this.premiumShowPrice;
    }

    public String getComplementaryProductId() {
        return this.complementaryProductId;
    }

    public Integer getComplementaryPrice() {
        return this.complementaryPrice;
    }

    public String getComplementaryShowPrice() {
        return this.complementaryShowPrice;
    }

    public Integer getComplementaryTid() {
        return this.complementaryTid;
    }

    public Integer getComplementaryQty() {
        return this.complementaryQty;
    }

    public String getOriginShowPrice() {
        return this.originShowPrice;
    }

    public String getCoverColor() {
        return this.coverColor;
    }

    public Integer getCover() {
        return this.cover;
    }

    public List<Integer> getPremiumShowItems() {
        return this.premiumShowItems;
    }

    public List<Integer> getLuxuryShowItems() {
        return this.luxuryShowItems;
    }

    public Integer getOutfitPackageShowItem() {
        return this.outfitPackageShowItem;
    }

}
