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
 * 对应文件: Shield.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ShieldConfig {

    private final Integer id;
    private final String name;
    private final String bindEffect;
    private final Integer timeSuperposition;
    private final Boolean notShieldScale;
    private final Integer levelTypeData;
    private final Integer levelData;
    private final Integer mainOrSupport;
    private final Integer shieldTag1;
    private final Boolean notRemove;

    @JsonCreator
    public ShieldConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("BindEffect") String bindEffect,
        @JsonProperty("TimeSuperposition") Integer timeSuperposition,
        @JsonProperty("NotShieldScale") Boolean notShieldScale,
        @JsonProperty("levelTypeData") Integer levelTypeData,
        @JsonProperty("LevelData") Integer levelData,
        @JsonProperty("MainOrSupport") Integer mainOrSupport,
        @JsonProperty("ShieldTag1") Integer shieldTag1,
        @JsonProperty("NotRemove") Boolean notRemove
    ) {
        this.id = id;
        this.name = name;
        this.bindEffect = bindEffect;
        this.timeSuperposition = timeSuperposition;
        this.notShieldScale = notShieldScale;
        this.levelTypeData = levelTypeData;
        this.levelData = levelData;
        this.mainOrSupport = mainOrSupport;
        this.shieldTag1 = shieldTag1;
        this.notRemove = notRemove;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBindEffect() {
        return this.bindEffect;
    }

    public Integer getTimeSuperposition() {
        return this.timeSuperposition;
    }

    public Boolean getNotShieldScale() {
        return this.notShieldScale;
    }

    public Integer getLevelTypeData() {
        return this.levelTypeData;
    }

    public Integer getLevelData() {
        return this.levelData;
    }

    public Integer getMainOrSupport() {
        return this.mainOrSupport;
    }

    public Integer getShieldTag1() {
        return this.shieldTag1;
    }

    public Boolean getNotRemove() {
        return this.notRemove;
    }

}
