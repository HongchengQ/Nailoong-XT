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
 * 对应文件: DropItemShow.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DropItemShowConfig {

    private final Integer dropId;
    private final Integer itemId;
    private final Integer itemQty;

    @JsonCreator
    public DropItemShowConfig(
        @JsonProperty("DropId") Integer dropId,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty
    ) {
        this.dropId = dropId;
        this.itemId = itemId;
        this.itemQty = itemQty;
    }

    public Integer getDropId() {
        return this.dropId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

}
