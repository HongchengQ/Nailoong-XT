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
 * 对应文件: MallShopPage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MallShopPageConfig {

    private final Integer id;
    private final Integer sort;
    private final String name;
    private final Integer refreshTimeType;
    private final List<Integer> shopCoin;
    private final String listTime;
    private final String deListTime;

    @JsonCreator
    public MallShopPageConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Name") String name,
        @JsonProperty("RefreshTimeType") Integer refreshTimeType,
        @JsonProperty("ShopCoin") List<Integer> shopCoin,
        @JsonProperty("ListTime") String listTime,
        @JsonProperty("DeListTime") String deListTime
    ) {
        this.id = id;
        this.sort = sort;
        this.name = name;
        this.refreshTimeType = refreshTimeType;
        this.shopCoin = shopCoin != null ? 
            new ArrayList<>(shopCoin) : 
            new ArrayList<>();
        this.listTime = listTime;
        this.deListTime = deListTime;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getName() {
        return this.name;
    }

    public Integer getRefreshTimeType() {
        return this.refreshTimeType;
    }

    public List<Integer> getShopCoin() {
        return this.shopCoin;
    }

    public String getListTime() {
        return this.listTime;
    }

    public String getDeListTime() {
        return this.deListTime;
    }

}
