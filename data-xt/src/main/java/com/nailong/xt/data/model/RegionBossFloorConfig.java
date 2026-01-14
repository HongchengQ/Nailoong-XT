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
 * 对应文件: RegionBossFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RegionBossFloorConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer monsterLv;
    private final Integer dungeonDelay;
    private final String introCutscene;

    @JsonCreator
    public RegionBossFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("MonsterLv") Integer monsterLv,
        @JsonProperty("DungeonDelay") Integer dungeonDelay,
        @JsonProperty("IntroCutscene") String introCutscene
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.monsterLv = monsterLv;
        this.dungeonDelay = dungeonDelay;
        this.introCutscene = introCutscene;
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

    public Integer getTheme() {
        return this.theme;
    }

    public String getBgm() {
        return this.bgm;
    }

    public String getLeaveTriggerEvent() {
        return this.leaveTriggerEvent;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

    public Integer getDungeonDelay() {
        return this.dungeonDelay;
    }

    public String getIntroCutscene() {
        return this.introCutscene;
    }

}
