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
 * 对应文件: CharacterCg.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterCgConfig {

    private final Integer id;
    private final String fullScreenPortrait;
    private final String fullScreenL2d;
    private final Integer unlockPlot;
    private final String name;

    @JsonCreator
    public CharacterCgConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FullScreenPortrait") String fullScreenPortrait,
        @JsonProperty("FullScreenL2D") String fullScreenL2d,
        @JsonProperty("UnlockPlot") Integer unlockPlot,
        @JsonProperty("Name") String name
    ) {
        this.id = id;
        this.fullScreenPortrait = fullScreenPortrait;
        this.fullScreenL2d = fullScreenL2d;
        this.unlockPlot = unlockPlot;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFullScreenPortrait() {
        return this.fullScreenPortrait;
    }

    public String getFullScreenL2d() {
        return this.fullScreenL2d;
    }

    public Integer getUnlockPlot() {
        return this.unlockPlot;
    }

    public String getName() {
        return this.name;
    }

}
