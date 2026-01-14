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
 * 对应文件: DailyInstanceFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyInstanceFloorConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer oneStarCondition;
    private final Integer twoStarCondition;
    private final Integer threeStarCondition;
    private final Integer levelTotalTime;
    private final Boolean timeEndSettlement;
    private final Integer starConditionType;
    private final Integer monsterLv;

    @JsonCreator
    public DailyInstanceFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("OneStarCondition") Integer oneStarCondition,
        @JsonProperty("TwoStarCondition") Integer twoStarCondition,
        @JsonProperty("ThreeStarCondition") Integer threeStarCondition,
        @JsonProperty("LevelTotalTime") Integer levelTotalTime,
        @JsonProperty("TimeEndSettlement") Boolean timeEndSettlement,
        @JsonProperty("StarConditionType") Integer starConditionType,
        @JsonProperty("MonsterLv") Integer monsterLv
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.oneStarCondition = oneStarCondition;
        this.twoStarCondition = twoStarCondition;
        this.threeStarCondition = threeStarCondition;
        this.levelTotalTime = levelTotalTime;
        this.timeEndSettlement = timeEndSettlement;
        this.starConditionType = starConditionType;
        this.monsterLv = monsterLv;
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

    public Integer getOneStarCondition() {
        return this.oneStarCondition;
    }

    public Integer getTwoStarCondition() {
        return this.twoStarCondition;
    }

    public Integer getThreeStarCondition() {
        return this.threeStarCondition;
    }

    public Integer getLevelTotalTime() {
        return this.levelTotalTime;
    }

    public Boolean getTimeEndSettlement() {
        return this.timeEndSettlement;
    }

    public Integer getStarConditionType() {
        return this.starConditionType;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

}
