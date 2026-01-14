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
 * 对应文件: CharacterSkillUpgrade.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterSkillUpgradeConfig {

    private final Integer id;
    private final Integer group;
    private final Integer advanceNum;
    private final Integer tid1;
    private final Integer qty1;
    private final Integer tid2;
    private final Integer qty2;
    private final Integer goldQty;
    private final Integer tid3;
    private final Integer qty3;
    private final Integer tid4;
    private final Integer qty4;

    @JsonCreator
    public CharacterSkillUpgradeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Group") Integer group,
        @JsonProperty("AdvanceNum") Integer advanceNum,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Tid2") Integer tid2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("GoldQty") Integer goldQty,
        @JsonProperty("Tid3") Integer tid3,
        @JsonProperty("Qty3") Integer qty3,
        @JsonProperty("Tid4") Integer tid4,
        @JsonProperty("Qty4") Integer qty4
    ) {
        this.id = id;
        this.group = group;
        this.advanceNum = advanceNum;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.tid2 = tid2;
        this.qty2 = qty2;
        this.goldQty = goldQty;
        this.tid3 = tid3;
        this.qty3 = qty3;
        this.tid4 = tid4;
        this.qty4 = qty4;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getAdvanceNum() {
        return this.advanceNum;
    }

    public Integer getTid1() {
        return this.tid1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getTid2() {
        return this.tid2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getGoldQty() {
        return this.goldQty;
    }

    public Integer getTid3() {
        return this.tid3;
    }

    public Integer getQty3() {
        return this.qty3;
    }

    public Integer getTid4() {
        return this.tid4;
    }

    public Integer getQty4() {
        return this.qty4;
    }

}
