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
 * 对应文件: MonsterValueTempleteModify.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterValueTempleteModifyConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer lv;
    private final String lvUpEffect;
    private final Long hpFix;
    private final Double atkFix;
    private final Double toughnessFix;
    private final Integer defFix;

    @JsonCreator
    public MonsterValueTempleteModifyConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Lv") Integer lv,
        @JsonProperty("LvUpEffect") String lvUpEffect,
        @JsonProperty("HpFix") Long hpFix,
        @JsonProperty("AtkFix") Double atkFix,
        @JsonProperty("ToughnessFix") Double toughnessFix,
        @JsonProperty("DefFix") Integer defFix
    ) {
        this.id = id;
        this.groupId = groupId;
        this.lv = lv;
        this.lvUpEffect = lvUpEffect;
        this.hpFix = hpFix;
        this.atkFix = atkFix;
        this.toughnessFix = toughnessFix;
        this.defFix = defFix;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLv() {
        return this.lv;
    }

    public String getLvUpEffect() {
        return this.lvUpEffect;
    }

    public Long getHpFix() {
        return this.hpFix;
    }

    public Double getAtkFix() {
        return this.atkFix;
    }

    public Double getToughnessFix() {
        return this.toughnessFix;
    }

    public Integer getDefFix() {
        return this.defFix;
    }

}
