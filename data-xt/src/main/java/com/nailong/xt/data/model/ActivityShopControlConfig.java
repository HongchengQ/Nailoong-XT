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
 * 对应文件: ActivityShopControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityShopControlConfig {

    private final Integer id;
    private final List<Integer> shopIds;
    private final List<Integer> npc;

    @JsonCreator
    public ActivityShopControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ShopIds") List<Integer> shopIds,
        @JsonProperty("Npc") List<Integer> npc
    ) {
        this.id = id;
        this.shopIds = shopIds != null ? 
            new ArrayList<>(shopIds) : 
            new ArrayList<>();
        this.npc = npc != null ? 
            new ArrayList<>(npc) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getShopIds() {
        return this.shopIds;
    }

    public List<Integer> getNpc() {
        return this.npc;
    }

}
