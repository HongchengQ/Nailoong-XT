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
 * 对应文件: JointDrillFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class JointDrillFloorConfig {

    private final Integer id;
    private final Integer floorId;
    private final Integer battleLvs;
    private final Integer floorType;
    private final Integer battleLvsToggle;
    private final String battleLvsToggleParam1;
    private final Integer maxEnergyValue;
    private final Boolean teamSaveResilience;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer dungeonDelay;
    private final String introCutscene;

    @JsonCreator
    public JointDrillFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("BattleLvs") Integer battleLvs,
        @JsonProperty("FloorType") Integer floorType,
        @JsonProperty("BattleLvsToggle") Integer battleLvsToggle,
        @JsonProperty("BattleLvsToggleParam1") String battleLvsToggleParam1,
        @JsonProperty("MaxEnergyValue") Integer maxEnergyValue,
        @JsonProperty("TeamSaveResilience") Boolean teamSaveResilience,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("DungeonDelay") Integer dungeonDelay,
        @JsonProperty("IntroCutscene") String introCutscene
    ) {
        this.id = id;
        this.floorId = floorId;
        this.battleLvs = battleLvs;
        this.floorType = floorType;
        this.battleLvsToggle = battleLvsToggle;
        this.battleLvsToggleParam1 = battleLvsToggleParam1;
        this.maxEnergyValue = maxEnergyValue;
        this.teamSaveResilience = teamSaveResilience;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.dungeonDelay = dungeonDelay;
        this.introCutscene = introCutscene;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getBattleLvs() {
        return this.battleLvs;
    }

    public Integer getFloorType() {
        return this.floorType;
    }

    public Integer getBattleLvsToggle() {
        return this.battleLvsToggle;
    }

    public String getBattleLvsToggleParam1() {
        return this.battleLvsToggleParam1;
    }

    public Integer getMaxEnergyValue() {
        return this.maxEnergyValue;
    }

    public Boolean getTeamSaveResilience() {
        return this.teamSaveResilience;
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

    public Integer getDungeonDelay() {
        return this.dungeonDelay;
    }

    public String getIntroCutscene() {
        return this.introCutscene;
    }

}
