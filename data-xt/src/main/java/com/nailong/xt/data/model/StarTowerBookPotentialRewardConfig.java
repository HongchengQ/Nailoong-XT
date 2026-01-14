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
 * 对应文件: StarTowerBookPotentialReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBookPotentialRewardConfig {

    private final Integer id;
    private final Integer charId;
    private final String desc;
    private final Integer sort;
    private final Integer cond;
    private final String params;
    private final Integer itemId;
    private final Integer itemQty;

    @JsonCreator
    public StarTowerBookPotentialRewardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Cond") Integer cond,
        @JsonProperty("Params") String params,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty
    ) {
        this.id = id;
        this.charId = charId;
        this.desc = desc;
        this.sort = sort;
        this.cond = cond;
        this.params = params;
        this.itemId = itemId;
        this.itemQty = itemQty;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getCond() {
        return this.cond;
    }

    public String getParams() {
        return this.params;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

}
