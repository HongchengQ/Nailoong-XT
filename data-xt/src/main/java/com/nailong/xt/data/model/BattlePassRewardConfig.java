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
 * 对应文件: BattlePassReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BattlePassRewardConfig {

    private final Integer id;
    private final Integer level;
    private final Integer tid1;
    private final Integer qty1;
    private final Integer tid2;
    private final Integer qty2;
    private final Integer tid3;
    private final Integer qty3;
    private final Boolean focus;

    @JsonCreator
    public BattlePassRewardConfig(
        @JsonProperty("ID") Integer id,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Tid2") Integer tid2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("Tid3") Integer tid3,
        @JsonProperty("Qty3") Integer qty3,
        @JsonProperty("Focus") Boolean focus
    ) {
        this.id = id;
        this.level = level;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.tid2 = tid2;
        this.qty2 = qty2;
        this.tid3 = tid3;
        this.qty3 = qty3;
        this.focus = focus;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLevel() {
        return this.level;
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

    public Integer getTid3() {
        return this.tid3;
    }

    public Integer getQty3() {
        return this.qty3;
    }

    public Boolean getFocus() {
        return this.focus;
    }

}
