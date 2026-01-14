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
 * 对应文件: BattlePassLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BattlePassLevelConfig {

    private final Integer id;
    private final Integer exp;
    private final Integer tid;
    private final Integer qty;

    @JsonCreator
    public BattlePassLevelConfig(
        @JsonProperty("ID") Integer id,
        @JsonProperty("Exp") Integer exp,
        @JsonProperty("Tid") Integer tid,
        @JsonProperty("Qty") Integer qty
    ) {
        this.id = id;
        this.exp = exp;
        this.tid = tid;
        this.qty = qty;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getExp() {
        return this.exp;
    }

    public Integer getTid() {
        return this.tid;
    }

    public Integer getQty() {
        return this.qty;
    }

}
