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
 * 对应文件: Trap.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrapConfig {

    private final Integer id;
    private final String name;
    private final Integer fcId;
    private final String model;
    private final Integer modelScale;
    private final Integer buffFxScale;
    private final Integer colliderScale;
    private final String attributeId;
    private final Integer templete;
    private final List<Integer> buffIds;
    private final List<Integer> turnOffBuffIds;
    private final Boolean interruptSkill;
    private final Integer subType;
    private final Integer faction;
    private final List<Integer> filter;
    private final Boolean ignoreCollision;
    private final Integer shapeType;
    private final Double radius;
    private final Double width;
    private final Double length;
    private final List<Integer> offset;
    private final Boolean isBlock;
    private final Boolean isMove;
    private final Integer movAcc;
    private final Integer moveSpd;

    @JsonCreator
    public TrapConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("FCId") Integer fcId,
        @JsonProperty("Model") String model,
        @JsonProperty("ModelScale") Integer modelScale,
        @JsonProperty("BuffFXScale") Integer buffFxScale,
        @JsonProperty("ColliderScale") Integer colliderScale,
        @JsonProperty("AttributeId") String attributeId,
        @JsonProperty("Templete") Integer templete,
        @JsonProperty("BuffIds") List<Integer> buffIds,
        @JsonProperty("TurnOffBuffIds") List<Integer> turnOffBuffIds,
        @JsonProperty("InterruptSkill") Boolean interruptSkill,
        @JsonProperty("SubType") Integer subType,
        @JsonProperty("Faction") Integer faction,
        @JsonProperty("Filter") List<Integer> filter,
        @JsonProperty("IgnoreCollision") Boolean ignoreCollision,
        @JsonProperty("ShapeType") Integer shapeType,
        @JsonProperty("radius") Double radius,
        @JsonProperty("width") Double width,
        @JsonProperty("length") Double length,
        @JsonProperty("offset") List<Integer> offset,
        @JsonProperty("isBlock") Boolean isBlock,
        @JsonProperty("isMove") Boolean isMove,
        @JsonProperty("MovAcc") Integer movAcc,
        @JsonProperty("MoveSpd") Integer moveSpd
    ) {
        this.id = id;
        this.name = name;
        this.fcId = fcId;
        this.model = model;
        this.modelScale = modelScale;
        this.buffFxScale = buffFxScale;
        this.colliderScale = colliderScale;
        this.attributeId = attributeId;
        this.templete = templete;
        this.buffIds = buffIds != null ? 
            new ArrayList<>(buffIds) : 
            new ArrayList<>();
        this.turnOffBuffIds = turnOffBuffIds != null ? 
            new ArrayList<>(turnOffBuffIds) : 
            new ArrayList<>();
        this.interruptSkill = interruptSkill;
        this.subType = subType;
        this.faction = faction;
        this.filter = filter != null ? 
            new ArrayList<>(filter) : 
            new ArrayList<>();
        this.ignoreCollision = ignoreCollision;
        this.shapeType = shapeType;
        this.radius = radius;
        this.width = width;
        this.length = length;
        this.offset = offset != null ? 
            new ArrayList<>(offset) : 
            new ArrayList<>();
        this.isBlock = isBlock;
        this.isMove = isMove;
        this.movAcc = movAcc;
        this.moveSpd = moveSpd;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getFcId() {
        return this.fcId;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getModelScale() {
        return this.modelScale;
    }

    public Integer getBuffFxScale() {
        return this.buffFxScale;
    }

    public Integer getColliderScale() {
        return this.colliderScale;
    }

    public String getAttributeId() {
        return this.attributeId;
    }

    public Integer getTemplete() {
        return this.templete;
    }

    public List<Integer> getBuffIds() {
        return this.buffIds;
    }

    public List<Integer> getTurnOffBuffIds() {
        return this.turnOffBuffIds;
    }

    public Boolean getInterruptSkill() {
        return this.interruptSkill;
    }

    public Integer getSubType() {
        return this.subType;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public List<Integer> getFilter() {
        return this.filter;
    }

    public Boolean getIgnoreCollision() {
        return this.ignoreCollision;
    }

    public Integer getShapeType() {
        return this.shapeType;
    }

    public Double getRadius() {
        return this.radius;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getLength() {
        return this.length;
    }

    public List<Integer> getOffset() {
        return this.offset;
    }

    public Boolean getIsBlock() {
        return this.isBlock;
    }

    public Boolean getIsMove() {
        return this.isMove;
    }

    public Integer getMovAcc() {
        return this.movAcc;
    }

    public Integer getMoveSpd() {
        return this.moveSpd;
    }

}
