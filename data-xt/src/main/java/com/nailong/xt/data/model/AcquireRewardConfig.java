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
 * 对应文件: AcquireReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AcquireRewardConfig {

    private final Integer id;
    private final Integer itemStype;
    private final Integer itemRarity;
    private final Integer acquireTimes;
    private final Integer itemId;
    private final Integer itemNum;

    @JsonCreator
    public AcquireRewardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("itemStype") Integer itemStype,
        @JsonProperty("itemRarity") Integer itemRarity,
        @JsonProperty("AcquireTimes") Integer acquireTimes,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemNum") Integer itemNum
    ) {
        this.id = id;
        this.itemStype = itemStype;
        this.itemRarity = itemRarity;
        this.acquireTimes = acquireTimes;
        this.itemId = itemId;
        this.itemNum = itemNum;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getItemStype() {
        return this.itemStype;
    }

    public Integer getItemRarity() {
        return this.itemRarity;
    }

    public Integer getAcquireTimes() {
        return this.acquireTimes;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemNum() {
        return this.itemNum;
    }

}
