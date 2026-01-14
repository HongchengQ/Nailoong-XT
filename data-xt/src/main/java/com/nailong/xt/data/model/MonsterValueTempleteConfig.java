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
 * 对应文件: MonsterValueTemplete.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterValueTempleteConfig {

    private final Integer id;
    private final Integer templateId;
    private final Integer lv;
    private final Long hp;
    private final Integer atk;
    private final Integer hitRate;
    private final Integer atkSpd;
    private final Integer wee;
    private final Integer fee;
    private final Integer see;
    private final Integer aee;
    private final Integer lee;
    private final Integer dee;
    private final Integer rcdmarkdmg;
    private final Integer def;
    private final Integer toughness;

    @JsonCreator
    public MonsterValueTempleteConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TemplateId") Integer templateId,
        @JsonProperty("Lv") Integer lv,
        @JsonProperty("Hp") Long hp,
        @JsonProperty("Atk") Integer atk,
        @JsonProperty("HitRate") Integer hitRate,
        @JsonProperty("AtkSpd") Integer atkSpd,
        @JsonProperty("WEE") Integer wee,
        @JsonProperty("FEE") Integer fee,
        @JsonProperty("SEE") Integer see,
        @JsonProperty("AEE") Integer aee,
        @JsonProperty("LEE") Integer lee,
        @JsonProperty("DEE") Integer dee,
        @JsonProperty("RCDMARKDMG") Integer rcdmarkdmg,
        @JsonProperty("Def") Integer def,
        @JsonProperty("Toughness") Integer toughness
    ) {
        this.id = id;
        this.templateId = templateId;
        this.lv = lv;
        this.hp = hp;
        this.atk = atk;
        this.hitRate = hitRate;
        this.atkSpd = atkSpd;
        this.wee = wee;
        this.fee = fee;
        this.see = see;
        this.aee = aee;
        this.lee = lee;
        this.dee = dee;
        this.rcdmarkdmg = rcdmarkdmg;
        this.def = def;
        this.toughness = toughness;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public Integer getLv() {
        return this.lv;
    }

    public Long getHp() {
        return this.hp;
    }

    public Integer getAtk() {
        return this.atk;
    }

    public Integer getHitRate() {
        return this.hitRate;
    }

    public Integer getAtkSpd() {
        return this.atkSpd;
    }

    public Integer getWee() {
        return this.wee;
    }

    public Integer getFee() {
        return this.fee;
    }

    public Integer getSee() {
        return this.see;
    }

    public Integer getAee() {
        return this.aee;
    }

    public Integer getLee() {
        return this.lee;
    }

    public Integer getDee() {
        return this.dee;
    }

    public Integer getRcdmarkdmg() {
        return this.rcdmarkdmg;
    }

    public Integer getDef() {
        return this.def;
    }

    public Integer getToughness() {
        return this.toughness;
    }

}
