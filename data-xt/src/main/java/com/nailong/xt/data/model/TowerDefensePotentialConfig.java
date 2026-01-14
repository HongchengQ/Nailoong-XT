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
 * 对应文件: TowerDefensePotential.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefensePotentialConfig {

    private final Integer id;
    private final String name;
    private final String icon;
    private final Integer rarity;
    private final String potentialDes;
    private final Integer effect1;

    @JsonCreator
    public TowerDefensePotentialConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("PotentialDes") String potentialDes,
        @JsonProperty("Effect1") Integer effect1
    ) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.rarity = rarity;
        this.potentialDes = potentialDes;
        this.effect1 = effect1;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public String getPotentialDes() {
        return this.potentialDes;
    }

    public Integer getEffect1() {
        return this.effect1;
    }

}
