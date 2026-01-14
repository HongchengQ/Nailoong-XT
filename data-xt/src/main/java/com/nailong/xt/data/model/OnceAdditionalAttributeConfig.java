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
 * 对应文件: OnceAdditionalAttribute.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class OnceAdditionalAttributeConfig {

    private final Integer id;
    private final Integer levelTypeData;
    private final Integer levelData;
    private final Integer mainOrSupport;

    @JsonCreator
    public OnceAdditionalAttributeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("levelTypeData") Integer levelTypeData,
        @JsonProperty("LevelData") Integer levelData,
        @JsonProperty("MainOrSupport") Integer mainOrSupport
    ) {
        this.id = id;
        this.levelTypeData = levelTypeData;
        this.levelData = levelData;
        this.mainOrSupport = mainOrSupport;
    }

    public Integer getId() {
        return this.id;
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

}
