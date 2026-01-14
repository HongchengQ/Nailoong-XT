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
 * 对应文件: Ai.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AiConfig {

    private final Integer id;
    private final String fcAction;
    private final String fcGlobal;
    private final String fcComboGroup;
    private final String fcIdle;
    private final String fcLostControl;
    private final String fcDeath;
    private final String fcSpawn;

    @JsonCreator
    public AiConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FCAction") String fcAction,
        @JsonProperty("FCGlobal") String fcGlobal,
        @JsonProperty("FCComboGroup") String fcComboGroup,
        @JsonProperty("FCIdle") String fcIdle,
        @JsonProperty("FCLostControl") String fcLostControl,
        @JsonProperty("FCDeath") String fcDeath,
        @JsonProperty("FCSpawn") String fcSpawn
    ) {
        this.id = id;
        this.fcAction = fcAction;
        this.fcGlobal = fcGlobal;
        this.fcComboGroup = fcComboGroup;
        this.fcIdle = fcIdle;
        this.fcLostControl = fcLostControl;
        this.fcDeath = fcDeath;
        this.fcSpawn = fcSpawn;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFcAction() {
        return this.fcAction;
    }

    public String getFcGlobal() {
        return this.fcGlobal;
    }

    public String getFcComboGroup() {
        return this.fcComboGroup;
    }

    public String getFcIdle() {
        return this.fcIdle;
    }

    public String getFcLostControl() {
        return this.fcLostControl;
    }

    public String getFcDeath() {
        return this.fcDeath;
    }

    public String getFcSpawn() {
        return this.fcSpawn;
    }

}
