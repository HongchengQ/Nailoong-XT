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
 * 对应文件: CharGemSlotControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGemSlotControlConfig {

    private final Integer id;
    private final Integer generatenCostQty;
    private final Integer refreshCostQty;
    private final Integer lockableNum;
    private final Integer maxAlterNum;
    private final Integer unlockLevel;
    private final Integer lockItemTid;
    private final Integer lockItemQty;
    private final Integer position;

    @JsonCreator
    public CharGemSlotControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GeneratenCostQty") Integer generatenCostQty,
        @JsonProperty("RefreshCostQty") Integer refreshCostQty,
        @JsonProperty("LockableNum") Integer lockableNum,
        @JsonProperty("MaxAlterNum") Integer maxAlterNum,
        @JsonProperty("UnlockLevel") Integer unlockLevel,
        @JsonProperty("LockItemTid") Integer lockItemTid,
        @JsonProperty("LockItemQty") Integer lockItemQty,
        @JsonProperty("Position") Integer position
    ) {
        this.id = id;
        this.generatenCostQty = generatenCostQty;
        this.refreshCostQty = refreshCostQty;
        this.lockableNum = lockableNum;
        this.maxAlterNum = maxAlterNum;
        this.unlockLevel = unlockLevel;
        this.lockItemTid = lockItemTid;
        this.lockItemQty = lockItemQty;
        this.position = position;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGeneratenCostQty() {
        return this.generatenCostQty;
    }

    public Integer getRefreshCostQty() {
        return this.refreshCostQty;
    }

    public Integer getLockableNum() {
        return this.lockableNum;
    }

    public Integer getMaxAlterNum() {
        return this.maxAlterNum;
    }

    public Integer getUnlockLevel() {
        return this.unlockLevel;
    }

    public Integer getLockItemTid() {
        return this.lockItemTid;
    }

    public Integer getLockItemQty() {
        return this.lockItemQty;
    }

    public Integer getPosition() {
        return this.position;
    }

}
