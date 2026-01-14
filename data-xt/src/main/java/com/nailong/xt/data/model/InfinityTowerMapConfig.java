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
 * 对应文件: InfinityTowerMap.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerMapConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final String continuePrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;

    @JsonCreator
    public InfinityTowerMapConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("ContinuePrefabName") String continuePrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.continuePrefabName = continuePrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSceneName() {
        return this.sceneName;
    }

    public String getConfigPrefabName() {
        return this.configPrefabName;
    }

    public String getContinuePrefabName() {
        return this.continuePrefabName;
    }

    public Integer getTheme() {
        return this.theme;
    }

    public String getBgm() {
        return this.bgm;
    }

    public String getLeaveTriggerEvent() {
        return this.leaveTriggerEvent;
    }

}
