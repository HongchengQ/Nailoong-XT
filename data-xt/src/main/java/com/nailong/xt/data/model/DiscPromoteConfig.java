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
 * 对应文件: DiscPromote.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscPromoteConfig {

    private final Integer id;
    private final Integer itemId1;
    private final Integer num1;
    private final Integer expenseGold;
    private final Integer itemId2;
    private final Integer num2;
    private final Integer itemId3;
    private final Integer num3;

    @JsonCreator
    public DiscPromoteConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ItemId1") Integer itemId1,
        @JsonProperty("Num1") Integer num1,
        @JsonProperty("ExpenseGold") Integer expenseGold,
        @JsonProperty("ItemId2") Integer itemId2,
        @JsonProperty("Num2") Integer num2,
        @JsonProperty("ItemId3") Integer itemId3,
        @JsonProperty("Num3") Integer num3
    ) {
        this.id = id;
        this.itemId1 = itemId1;
        this.num1 = num1;
        this.expenseGold = expenseGold;
        this.itemId2 = itemId2;
        this.num2 = num2;
        this.itemId3 = itemId3;
        this.num3 = num3;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getItemId1() {
        return this.itemId1;
    }

    public Integer getNum1() {
        return this.num1;
    }

    public Integer getExpenseGold() {
        return this.expenseGold;
    }

    public Integer getItemId2() {
        return this.itemId2;
    }

    public Integer getNum2() {
        return this.num2;
    }

    public Integer getItemId3() {
        return this.itemId3;
    }

    public Integer getNum3() {
        return this.num3;
    }

}
