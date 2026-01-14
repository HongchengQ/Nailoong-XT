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
 * 对应文件: MonsterManual.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterManualConfig {

    private final Integer id;
    private final String icon;
    private final String name;
    private final String desc;
    private final String skillDesc;
    private final Integer epicLv;
    private final Integer hp;
    private final Integer atk;
    private final Integer def;
    private final List<Integer> eet;
    private final List<Integer> weakEet;

    @JsonCreator
    public MonsterManualConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SkillDesc") String skillDesc,
        @JsonProperty("EpicLv") Integer epicLv,
        @JsonProperty("HP") Integer hp,
        @JsonProperty("ATK") Integer atk,
        @JsonProperty("DEF") Integer def,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("WeakEET") List<Integer> weakEet
    ) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.desc = desc;
        this.skillDesc = skillDesc;
        this.epicLv = epicLv;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.weakEet = weakEet != null ? 
            new ArrayList<>(weakEet) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getSkillDesc() {
        return this.skillDesc;
    }

    public Integer getEpicLv() {
        return this.epicLv;
    }

    public Integer getHp() {
        return this.hp;
    }

    public Integer getAtk() {
        return this.atk;
    }

    public Integer getDef() {
        return this.def;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public List<Integer> getWeakEet() {
        return this.weakEet;
    }

}
