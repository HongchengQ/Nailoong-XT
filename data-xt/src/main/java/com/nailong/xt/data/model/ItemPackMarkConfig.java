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
 * 对应文件: ItemPackMark.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ItemPackMarkConfig {

    private final Integer id;
    private final Integer packMark;
    private final List<Integer> itemStype;
    private final String name;
    private final Integer sort;

    @JsonCreator
    public ItemPackMarkConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("PackMark") Integer packMark,
        @JsonProperty("ItemStype") List<Integer> itemStype,
        @JsonProperty("Name") String name,
        @JsonProperty("Sort") Integer sort
    ) {
        this.id = id;
        this.packMark = packMark;
        this.itemStype = itemStype != null ? 
            new ArrayList<>(itemStype) : 
            new ArrayList<>();
        this.name = name;
        this.sort = sort;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getPackMark() {
        return this.packMark;
    }

    public List<Integer> getItemStype() {
        return this.itemStype;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSort() {
        return this.sort;
    }

}
