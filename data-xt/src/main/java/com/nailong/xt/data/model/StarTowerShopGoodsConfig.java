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
 * 对应文件: StarTowerShopGoods.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerShopGoodsConfig {

    private final Integer id;
    private final Integer goodsGroupId;
    private final Integer showItem;
    private final Integer showItemNum;

    @JsonCreator
    public StarTowerShopGoodsConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GoodsGroupId") Integer goodsGroupId,
        @JsonProperty("ShowItem") Integer showItem,
        @JsonProperty("ShowItemNum") Integer showItemNum
    ) {
        this.id = id;
        this.goodsGroupId = goodsGroupId;
        this.showItem = showItem;
        this.showItemNum = showItemNum;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGoodsGroupId() {
        return this.goodsGroupId;
    }

    public Integer getShowItem() {
        return this.showItem;
    }

    public Integer getShowItemNum() {
        return this.showItemNum;
    }

}
