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
 * 对应文件: StarTowerStage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerStageConfig {

    private final Integer id;
    private final Integer stage;
    private final Integer groupId;
    private final Integer floor;
    private final Integer guaranteedMapId;
    private final Integer guaranteedMonsterPlanId;
    private final Integer roomType;
    private final Integer interiorCurrencyQuantity;

    @JsonCreator
    public StarTowerStageConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Stage") Integer stage,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Floor") Integer floor,
        @JsonProperty("GuaranteedMapId") Integer guaranteedMapId,
        @JsonProperty("GuaranteedMonsterPlanId") Integer guaranteedMonsterPlanId,
        @JsonProperty("RoomType") Integer roomType,
        @JsonProperty("InteriorCurrencyQuantity") Integer interiorCurrencyQuantity
    ) {
        this.id = id;
        this.stage = stage;
        this.groupId = groupId;
        this.floor = floor;
        this.guaranteedMapId = guaranteedMapId;
        this.guaranteedMonsterPlanId = guaranteedMonsterPlanId;
        this.roomType = roomType;
        this.interiorCurrencyQuantity = interiorCurrencyQuantity;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getStage() {
        return this.stage;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getFloor() {
        return this.floor;
    }

    public Integer getGuaranteedMapId() {
        return this.guaranteedMapId;
    }

    public Integer getGuaranteedMonsterPlanId() {
        return this.guaranteedMonsterPlanId;
    }

    public Integer getRoomType() {
        return this.roomType;
    }

    public Integer getInteriorCurrencyQuantity() {
        return this.interiorCurrencyQuantity;
    }

}
