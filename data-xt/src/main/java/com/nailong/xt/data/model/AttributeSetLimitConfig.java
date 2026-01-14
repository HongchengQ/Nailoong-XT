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
 * 对应文件: AttributeSetLimit.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AttributeSetLimitConfig {

    private final Integer id;
    private final Integer lower;
    private final Integer upper;
    private final Boolean isLimited;
    private final Boolean isPlayer;

    @JsonCreator
    public AttributeSetLimitConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Lower") Integer lower,
        @JsonProperty("Upper") Integer upper,
        @JsonProperty("IsLimited") Boolean isLimited,
        @JsonProperty("IsPlayer") Boolean isPlayer
    ) {
        this.id = id;
        this.lower = lower;
        this.upper = upper;
        this.isLimited = isLimited;
        this.isPlayer = isPlayer;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLower() {
        return this.lower;
    }

    public Integer getUpper() {
        return this.upper;
    }

    public Boolean getIsLimited() {
        return this.isLimited;
    }

    public Boolean getIsPlayer() {
        return this.isPlayer;
    }

}
