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
 * 对应文件: TrialFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialFloorConfig {

    private final Integer id;
    private final Integer trialChar;
    private final Integer trialSectType;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer trialBuild;
    private final List<Integer> questFlow;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer dungeonDelay;
    private final Integer theme;
    private final Integer monsterLv;

    @JsonCreator
    public TrialFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TrialChar") Integer trialChar,
        @JsonProperty("TrialSectType") Integer trialSectType,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("TrialBuild") Integer trialBuild,
        @JsonProperty("QuestFlow") List<Integer> questFlow,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("DungeonDelay") Integer dungeonDelay,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("MonsterLv") Integer monsterLv
    ) {
        this.id = id;
        this.trialChar = trialChar;
        this.trialSectType = trialSectType;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.trialBuild = trialBuild;
        this.questFlow = questFlow != null ? 
            new ArrayList<>(questFlow) : 
            new ArrayList<>();
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.dungeonDelay = dungeonDelay;
        this.theme = theme;
        this.monsterLv = monsterLv;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTrialChar() {
        return this.trialChar;
    }

    public Integer getTrialSectType() {
        return this.trialSectType;
    }

    public String getSceneName() {
        return this.sceneName;
    }

    public String getConfigPrefabName() {
        return this.configPrefabName;
    }

    public Integer getTrialBuild() {
        return this.trialBuild;
    }

    public List<Integer> getQuestFlow() {
        return this.questFlow;
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

    public Integer getTheme() {
        return this.theme;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

}
