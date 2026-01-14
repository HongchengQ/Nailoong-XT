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
 * 对应文件: BuffValue.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BuffValueConfig {

    private final Integer id;
    private final Integer sort;
    private final Integer time;
    private final Integer laminatedNum;
    private final Integer num;
    private final Integer timeSuperposition;
    private final Integer timing;
    private final Boolean replaceType;
    private final Boolean replaceMode;
    private final List<Integer> effects;
    private final Boolean isExitDelete;
    private final List<Integer> buffEffects;
    private final Boolean isInherit;
    private final Boolean hitClear;
    private final Boolean attackClear;
    private final String name;

    @JsonCreator
    public BuffValueConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Time") Integer time,
        @JsonProperty("LaminatedNum") Integer laminatedNum,
        @JsonProperty("Num") Integer num,
        @JsonProperty("TimeSuperposition") Integer timeSuperposition,
        @JsonProperty("Timing") Integer timing,
        @JsonProperty("ReplaceType") Boolean replaceType,
        @JsonProperty("ReplaceMode") Boolean replaceMode,
        @JsonProperty("Effects") List<Integer> effects,
        @JsonProperty("IsExitDelete") Boolean isExitDelete,
        @JsonProperty("BuffEffects") List<Integer> buffEffects,
        @JsonProperty("IsInherit") Boolean isInherit,
        @JsonProperty("HitClear") Boolean hitClear,
        @JsonProperty("AttackClear") Boolean attackClear,
        @JsonProperty("Name") String name
    ) {
        this.id = id;
        this.sort = sort;
        this.time = time;
        this.laminatedNum = laminatedNum;
        this.num = num;
        this.timeSuperposition = timeSuperposition;
        this.timing = timing;
        this.replaceType = replaceType;
        this.replaceMode = replaceMode;
        this.effects = effects != null ? 
            new ArrayList<>(effects) : 
            new ArrayList<>();
        this.isExitDelete = isExitDelete;
        this.buffEffects = buffEffects != null ? 
            new ArrayList<>(buffEffects) : 
            new ArrayList<>();
        this.isInherit = isInherit;
        this.hitClear = hitClear;
        this.attackClear = attackClear;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getLaminatedNum() {
        return this.laminatedNum;
    }

    public Integer getNum() {
        return this.num;
    }

    public Integer getTimeSuperposition() {
        return this.timeSuperposition;
    }

    public Integer getTiming() {
        return this.timing;
    }

    public Boolean getReplaceType() {
        return this.replaceType;
    }

    public Boolean getReplaceMode() {
        return this.replaceMode;
    }

    public List<Integer> getEffects() {
        return this.effects;
    }

    public Boolean getIsExitDelete() {
        return this.isExitDelete;
    }

    public List<Integer> getBuffEffects() {
        return this.buffEffects;
    }

    public Boolean getIsInherit() {
        return this.isInherit;
    }

    public Boolean getHitClear() {
        return this.hitClear;
    }

    public Boolean getAttackClear() {
        return this.attackClear;
    }

    public String getName() {
        return this.name;
    }

}
