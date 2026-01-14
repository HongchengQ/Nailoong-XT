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
 * 对应文件: DiscPromoteLimit.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscPromoteLimitConfig {

    private final Integer id;
    private final Integer rarity;
    private final String phase;
    private final String maxLevel;
    private final Integer worldClassLimit;

    @JsonCreator
    public DiscPromoteLimitConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("Phase") String phase,
        @JsonProperty("MaxLevel") String maxLevel,
        @JsonProperty("WorldClassLimit") Integer worldClassLimit
    ) {
        this.id = id;
        this.rarity = rarity;
        this.phase = phase;
        this.maxLevel = maxLevel;
        this.worldClassLimit = worldClassLimit;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public String getPhase() {
        return this.phase;
    }

    public String getMaxLevel() {
        return this.maxLevel;
    }

    public Integer getWorldClassLimit() {
        return this.worldClassLimit;
    }

}
