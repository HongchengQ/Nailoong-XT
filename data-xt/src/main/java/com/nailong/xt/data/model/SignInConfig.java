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
 * 对应文件: SignIn.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SignInConfig {

    private final Integer id;
    private final Integer group;
    private final Integer day;
    private final Integer itemId;
    private final Integer itemQty;

    @JsonCreator
    public SignInConfig(
        @JsonProperty("ID") Integer id,
        @JsonProperty("Group") Integer group,
        @JsonProperty("Day") Integer day,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty
    ) {
        this.id = id;
        this.group = group;
        this.day = day;
        this.itemId = itemId;
        this.itemQty = itemQty;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getDay() {
        return this.day;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

}
