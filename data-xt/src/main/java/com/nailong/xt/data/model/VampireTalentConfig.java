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
 * 对应文件: VampireTalent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireTalentConfig {

    private final Integer id;
    private final String name;
    private final Integer descTag;
    private final Boolean isServer;
    private final Integer effect;
    private final Integer point;
    private final String icon;
    private final Integer param;
    private final List<Integer> prev;
    private final Boolean isClient;
    private final String params;
    private final Integer effectId;

    @JsonCreator
    public VampireTalentConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("DescTag") Integer descTag,
        @JsonProperty("IsServer") Boolean isServer,
        @JsonProperty("Effect") Integer effect,
        @JsonProperty("Point") Integer point,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Param") Integer param,
        @JsonProperty("Prev") List<Integer> prev,
        @JsonProperty("IsClient") Boolean isClient,
        @JsonProperty("Params") String params,
        @JsonProperty("EffectId") Integer effectId
    ) {
        this.id = id;
        this.name = name;
        this.descTag = descTag;
        this.isServer = isServer;
        this.effect = effect;
        this.point = point;
        this.icon = icon;
        this.param = param;
        this.prev = prev != null ? 
            new ArrayList<>(prev) : 
            new ArrayList<>();
        this.isClient = isClient;
        this.params = params;
        this.effectId = effectId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getDescTag() {
        return this.descTag;
    }

    public Boolean getIsServer() {
        return this.isServer;
    }

    public Integer getEffect() {
        return this.effect;
    }

    public Integer getPoint() {
        return this.point;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getParam() {
        return this.param;
    }

    public List<Integer> getPrev() {
        return this.prev;
    }

    public Boolean getIsClient() {
        return this.isClient;
    }

    public String getParams() {
        return this.params;
    }

    public Integer getEffectId() {
        return this.effectId;
    }

}
