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
 * 对应文件: CharGemAttrValue.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGemAttrValueConfig {

    private final Integer id;
    private final Integer typeId;
    private final Integer attrType;
    private final Integer attrTypeFirstSubtype;
    private final Integer attrTypeSecondSubtype;
    private final String value;
    private final Integer rarity;
    private final Integer tag;
    private final Integer effectId;

    @JsonCreator
    public CharGemAttrValueConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TypeId") Integer typeId,
        @JsonProperty("AttrType") Integer attrType,
        @JsonProperty("AttrTypeFirstSubtype") Integer attrTypeFirstSubtype,
        @JsonProperty("AttrTypeSecondSubtype") Integer attrTypeSecondSubtype,
        @JsonProperty("Value") String value,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("Tag") Integer tag,
        @JsonProperty("EffectId") Integer effectId
    ) {
        this.id = id;
        this.typeId = typeId;
        this.attrType = attrType;
        this.attrTypeFirstSubtype = attrTypeFirstSubtype;
        this.attrTypeSecondSubtype = attrTypeSecondSubtype;
        this.value = value;
        this.rarity = rarity;
        this.tag = tag;
        this.effectId = effectId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public Integer getAttrType() {
        return this.attrType;
    }

    public Integer getAttrTypeFirstSubtype() {
        return this.attrTypeFirstSubtype;
    }

    public Integer getAttrTypeSecondSubtype() {
        return this.attrTypeSecondSubtype;
    }

    public String getValue() {
        return this.value;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public Integer getTag() {
        return this.tag;
    }

    public Integer getEffectId() {
        return this.effectId;
    }

}
