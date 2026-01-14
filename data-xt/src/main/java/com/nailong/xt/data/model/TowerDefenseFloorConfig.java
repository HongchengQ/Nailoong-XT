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
 * 对应文件: TowerDefenseFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseFloorConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final String levelScript;
    private final Integer durability;
    private final Integer monsterNum;
    private final List<Integer> teamGroup;
    private final Integer initPlayerNum;
    private final List<Integer> initPlayers;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final String introCutscene;
    private final Integer upgradeSpeed;
    private final Integer itemId;
    private final Integer memberNum;

    @JsonCreator
    public TowerDefenseFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("LevelScript") String levelScript,
        @JsonProperty("Durability") Integer durability,
        @JsonProperty("MonsterNum") Integer monsterNum,
        @JsonProperty("TeamGroup") List<Integer> teamGroup,
        @JsonProperty("InitPlayerNum") Integer initPlayerNum,
        @JsonProperty("InitPlayers") List<Integer> initPlayers,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("IntroCutscene") String introCutscene,
        @JsonProperty("UpgradeSpeed") Integer upgradeSpeed,
        @JsonProperty("ItemID") Integer itemId,
        @JsonProperty("MemberNum") Integer memberNum
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.levelScript = levelScript;
        this.durability = durability;
        this.monsterNum = monsterNum;
        this.teamGroup = teamGroup != null ? 
            new ArrayList<>(teamGroup) : 
            new ArrayList<>();
        this.initPlayerNum = initPlayerNum;
        this.initPlayers = initPlayers != null ? 
            new ArrayList<>(initPlayers) : 
            new ArrayList<>();
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.introCutscene = introCutscene;
        this.upgradeSpeed = upgradeSpeed;
        this.itemId = itemId;
        this.memberNum = memberNum;
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

    public String getLevelScript() {
        return this.levelScript;
    }

    public Integer getDurability() {
        return this.durability;
    }

    public Integer getMonsterNum() {
        return this.monsterNum;
    }

    public List<Integer> getTeamGroup() {
        return this.teamGroup;
    }

    public Integer getInitPlayerNum() {
        return this.initPlayerNum;
    }

    public List<Integer> getInitPlayers() {
        return this.initPlayers;
    }

    public String getBgm() {
        return this.bgm;
    }

    public String getLeaveTriggerEvent() {
        return this.leaveTriggerEvent;
    }

    public String getIntroCutscene() {
        return this.introCutscene;
    }

    public Integer getUpgradeSpeed() {
        return this.upgradeSpeed;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getMemberNum() {
        return this.memberNum;
    }

}
