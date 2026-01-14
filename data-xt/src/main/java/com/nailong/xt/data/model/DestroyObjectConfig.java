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
 * 对应文件: DestroyObject.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DestroyObjectConfig {

    private final Integer id;
    private final String name;
    private final Integer lv;
    private final Integer templete;
    private final Integer faction;

    @JsonCreator
    public DestroyObjectConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Lv") Integer lv,
        @JsonProperty("Templete") Integer templete,
        @JsonProperty("Faction") Integer faction
    ) {
        this.id = id;
        this.name = name;
        this.lv = lv;
        this.templete = templete;
        this.faction = faction;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLv() {
        return this.lv;
    }

    public Integer getTemplete() {
        return this.templete;
    }

    public Integer getFaction() {
        return this.faction;
    }

}
