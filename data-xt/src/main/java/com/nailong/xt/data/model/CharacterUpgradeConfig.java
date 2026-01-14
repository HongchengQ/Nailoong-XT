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
 * 对应文件: CharacterUpgrade.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterUpgradeConfig {

    private final Integer id;
    private final Integer level;
    private final Integer exp;
    private final Integer rarity;

    @JsonCreator
    public CharacterUpgradeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Exp") Integer exp,
        @JsonProperty("Rarity") Integer rarity
    ) {
        this.id = id;
        this.level = level;
        this.exp = exp;
        this.rarity = rarity;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getExp() {
        return this.exp;
    }

    public Integer getRarity() {
        return this.rarity;
    }

}
