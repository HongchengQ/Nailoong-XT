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
 * 对应文件: CharacterAdvance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterAdvanceConfig {

    private final Integer id;
    private final Integer group;
    private final Integer advanceLvl;
    private final Integer tid1;
    private final Integer qty1;
    private final Integer goldQty;
    private final Integer tid2;
    private final Integer qty2;
    private final Integer tid3;
    private final Integer qty3;

    @JsonCreator
    public CharacterAdvanceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Group") Integer group,
        @JsonProperty("AdvanceLvl") Integer advanceLvl,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("GoldQty") Integer goldQty,
        @JsonProperty("Tid2") Integer tid2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("Tid3") Integer tid3,
        @JsonProperty("Qty3") Integer qty3
    ) {
        this.id = id;
        this.group = group;
        this.advanceLvl = advanceLvl;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.goldQty = goldQty;
        this.tid2 = tid2;
        this.qty2 = qty2;
        this.tid3 = tid3;
        this.qty3 = qty3;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getAdvanceLvl() {
        return this.advanceLvl;
    }

    public Integer getTid1() {
        return this.tid1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getGoldQty() {
        return this.goldQty;
    }

    public Integer getTid2() {
        return this.tid2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getTid3() {
        return this.tid3;
    }

    public Integer getQty3() {
        return this.qty3;
    }

}
