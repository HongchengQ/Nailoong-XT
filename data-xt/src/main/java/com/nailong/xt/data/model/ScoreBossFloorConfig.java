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
 * 对应文件: ScoreBossFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossFloorConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer theme;

    @JsonCreator
    public ScoreBossFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("Theme") Integer theme
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.theme = theme;
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

    public String getBgm() {
        return this.bgm;
    }

    public String getLeaveTriggerEvent() {
        return this.leaveTriggerEvent;
    }

    public Integer getTheme() {
        return this.theme;
    }

}
