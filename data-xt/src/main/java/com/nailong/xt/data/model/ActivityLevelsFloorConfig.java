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
 * 对应文件: ActivityLevelsFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityLevelsFloorConfig {

    private final Integer id;
    private final Integer monsterLv;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Boolean mir;

    @JsonCreator
    public ActivityLevelsFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MonsterLv") Integer monsterLv,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("Mir") Boolean mir
    ) {
        this.id = id;
        this.monsterLv = monsterLv;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.mir = mir;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

    public String getSceneName() {
        return this.sceneName;
    }

    public String getConfigPrefabName() {
        return this.configPrefabName;
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

    public Boolean getMir() {
        return this.mir;
    }

}
