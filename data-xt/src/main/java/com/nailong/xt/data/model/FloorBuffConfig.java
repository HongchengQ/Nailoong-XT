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
 * 对应文件: FloorBuff.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FloorBuffConfig {

    private final Integer id;
    private final List<Integer> addCamp;
    private final List<Integer> addClass;
    private final List<Integer> effectId;
    private final List<Integer> buffId;

    @JsonCreator
    public FloorBuffConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AddCamp") List<Integer> addCamp,
        @JsonProperty("AddClass") List<Integer> addClass,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("BuffId") List<Integer> buffId
    ) {
        this.id = id;
        this.addCamp = addCamp != null ? 
            new ArrayList<>(addCamp) : 
            new ArrayList<>();
        this.addClass = addClass != null ? 
            new ArrayList<>(addClass) : 
            new ArrayList<>();
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.buffId = buffId != null ? 
            new ArrayList<>(buffId) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getAddCamp() {
        return this.addCamp;
    }

    public List<Integer> getAddClass() {
        return this.addClass;
    }

    public List<Integer> getEffectId() {
        return this.effectId;
    }

    public List<Integer> getBuffId() {
        return this.buffId;
    }

}
