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
 * 对应文件: ResidentShop.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ResidentShopConfig {

    private final Integer id;
    private final List<Integer> shopCoin;
    private final String name;
    private final Integer sequence;
    private final Integer refreshTimeType;
    private final Integer refreshInterval;
    private final String openTime;

    @JsonCreator
    public ResidentShopConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ShopCoin") List<Integer> shopCoin,
        @JsonProperty("Name") String name,
        @JsonProperty("Sequence") Integer sequence,
        @JsonProperty("RefreshTimeType") Integer refreshTimeType,
        @JsonProperty("RefreshInterval") Integer refreshInterval,
        @JsonProperty("OpenTime") String openTime
    ) {
        this.id = id;
        this.shopCoin = shopCoin != null ? 
            new ArrayList<>(shopCoin) : 
            new ArrayList<>();
        this.name = name;
        this.sequence = sequence;
        this.refreshTimeType = refreshTimeType;
        this.refreshInterval = refreshInterval;
        this.openTime = openTime;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getShopCoin() {
        return this.shopCoin;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Integer getRefreshTimeType() {
        return this.refreshTimeType;
    }

    public Integer getRefreshInterval() {
        return this.refreshInterval;
    }

    public String getOpenTime() {
        return this.openTime;
    }

}
