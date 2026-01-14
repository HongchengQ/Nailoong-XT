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
 * 对应文件: EffectValue.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EffectValueConfig {

    private final Integer id;
    private final String tag;
    private final Integer effectRate;
    private final Integer effectType;
    private final Integer effectTypeFirstSubtype;
    private final String effectTypeParam1;
    private final Integer effectTypeSecondSubtype;
    private final String effectTypeParam2;
    private final String effectTypeParam3;
    private final String effectTypeParam4;
    private final Integer takeEffectLimit;
    private final Boolean remove;
    private final String name;
    private final Integer cd;

    @JsonCreator
    public EffectValueConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Tag") String tag,
        @JsonProperty("EffectRate") Integer effectRate,
        @JsonProperty("EffectType") Integer effectType,
        @JsonProperty("EffectTypeFirstSubtype") Integer effectTypeFirstSubtype,
        @JsonProperty("EffectTypeParam1") String effectTypeParam1,
        @JsonProperty("EffectTypeSecondSubtype") Integer effectTypeSecondSubtype,
        @JsonProperty("EffectTypeParam2") String effectTypeParam2,
        @JsonProperty("EffectTypeParam3") String effectTypeParam3,
        @JsonProperty("EffectTypeParam4") String effectTypeParam4,
        @JsonProperty("TakeEffectLimit") Integer takeEffectLimit,
        @JsonProperty("Remove") Boolean remove,
        @JsonProperty("Name") String name,
        @JsonProperty("CD") Integer cd
    ) {
        this.id = id;
        this.tag = tag;
        this.effectRate = effectRate;
        this.effectType = effectType;
        this.effectTypeFirstSubtype = effectTypeFirstSubtype;
        this.effectTypeParam1 = effectTypeParam1;
        this.effectTypeSecondSubtype = effectTypeSecondSubtype;
        this.effectTypeParam2 = effectTypeParam2;
        this.effectTypeParam3 = effectTypeParam3;
        this.effectTypeParam4 = effectTypeParam4;
        this.takeEffectLimit = takeEffectLimit;
        this.remove = remove;
        this.name = name;
        this.cd = cd;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTag() {
        return this.tag;
    }

    public Integer getEffectRate() {
        return this.effectRate;
    }

    public Integer getEffectType() {
        return this.effectType;
    }

    public Integer getEffectTypeFirstSubtype() {
        return this.effectTypeFirstSubtype;
    }

    public String getEffectTypeParam1() {
        return this.effectTypeParam1;
    }

    public Integer getEffectTypeSecondSubtype() {
        return this.effectTypeSecondSubtype;
    }

    public String getEffectTypeParam2() {
        return this.effectTypeParam2;
    }

    public String getEffectTypeParam3() {
        return this.effectTypeParam3;
    }

    public String getEffectTypeParam4() {
        return this.effectTypeParam4;
    }

    public Integer getTakeEffectLimit() {
        return this.takeEffectLimit;
    }

    public Boolean getRemove() {
        return this.remove;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCd() {
        return this.cd;
    }

}
