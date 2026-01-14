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
 * 对应文件: CharItemExp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharItemExpConfig {

    private final Integer id;
    private final Integer itemId;
    private final Integer expValue;

    @JsonCreator
    public CharItemExpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ExpValue") Integer expValue
    ) {
        this.id = id;
        this.itemId = itemId;
        this.expValue = expValue;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getExpValue() {
        return this.expValue;
    }

}
