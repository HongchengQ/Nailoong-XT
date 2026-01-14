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
 * 对应文件: BreakOutFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BreakOutFloorConfig {

    private final Integer id;
    private final String sceneName;
    private final String configPrefabName;
    private final Integer theme;
    private final String bgm;
    private final String leaveTriggerEvent;
    private final Integer monsterLv;
    private final Integer time;
    private final Integer heart;
    private final Integer score;
    private final List<Integer> drops;
    private final List<Integer> counts;
    private final List<Integer> dropParam;

    @JsonCreator
    public BreakOutFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("ConfigPrefabName") String configPrefabName,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("BGM") String bgm,
        @JsonProperty("LeaveTriggerEvent") String leaveTriggerEvent,
        @JsonProperty("MonsterLv") Integer monsterLv,
        @JsonProperty("Time") Integer time,
        @JsonProperty("Heart") Integer heart,
        @JsonProperty("Score") Integer score,
        @JsonProperty("Drops") List<Integer> drops,
        @JsonProperty("Counts") List<Integer> counts,
        @JsonProperty("DropParam") List<Integer> dropParam
    ) {
        this.id = id;
        this.sceneName = sceneName;
        this.configPrefabName = configPrefabName;
        this.theme = theme;
        this.bgm = bgm;
        this.leaveTriggerEvent = leaveTriggerEvent;
        this.monsterLv = monsterLv;
        this.time = time;
        this.heart = heart;
        this.score = score;
        this.drops = drops != null ? 
            new ArrayList<>(drops) : 
            new ArrayList<>();
        this.counts = counts != null ? 
            new ArrayList<>(counts) : 
            new ArrayList<>();
        this.dropParam = dropParam != null ? 
            new ArrayList<>(dropParam) : 
            new ArrayList<>();
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

    public Integer getTime() {
        return this.time;
    }

    public Integer getHeart() {
        return this.heart;
    }

    public Integer getScore() {
        return this.score;
    }

    public List<Integer> getDrops() {
        return this.drops;
    }

    public List<Integer> getCounts() {
        return this.counts;
    }

    public List<Integer> getDropParam() {
        return this.dropParam;
    }

}
