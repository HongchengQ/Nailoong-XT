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
 * 对应文件: StarTowerMap.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerMapConfig {

    private final Integer id;
    private final String sceneRes;
    private final String bgSceneRes;
    private final Integer theme;
    private final List<Integer> prefabNum;
    private final Boolean mir;
    private final Integer outPortNum;
    private final Boolean outPortHint;
    private final String bgmRes;
    private final String completeSoundEffectRes;
    private final String introCutscene;

    @JsonCreator
    public StarTowerMapConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SceneRes") String sceneRes,
        @JsonProperty("BGSceneRes") String bgSceneRes,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("PrefabNum") List<Integer> prefabNum,
        @JsonProperty("Mir") Boolean mir,
        @JsonProperty("OutPortNum") Integer outPortNum,
        @JsonProperty("OutPortHint") Boolean outPortHint,
        @JsonProperty("BGMRes") String bgmRes,
        @JsonProperty("CompleteSoundEffectRes") String completeSoundEffectRes,
        @JsonProperty("IntroCutscene") String introCutscene
    ) {
        this.id = id;
        this.sceneRes = sceneRes;
        this.bgSceneRes = bgSceneRes;
        this.theme = theme;
        this.prefabNum = prefabNum != null ? 
            new ArrayList<>(prefabNum) : 
            new ArrayList<>();
        this.mir = mir;
        this.outPortNum = outPortNum;
        this.outPortHint = outPortHint;
        this.bgmRes = bgmRes;
        this.completeSoundEffectRes = completeSoundEffectRes;
        this.introCutscene = introCutscene;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSceneRes() {
        return this.sceneRes;
    }

    public String getBgSceneRes() {
        return this.bgSceneRes;
    }

    public Integer getTheme() {
        return this.theme;
    }

    public List<Integer> getPrefabNum() {
        return this.prefabNum;
    }

    public Boolean getMir() {
        return this.mir;
    }

    public Integer getOutPortNum() {
        return this.outPortNum;
    }

    public Boolean getOutPortHint() {
        return this.outPortHint;
    }

    public String getBgmRes() {
        return this.bgmRes;
    }

    public String getCompleteSoundEffectRes() {
        return this.completeSoundEffectRes;
    }

    public String getIntroCutscene() {
        return this.introCutscene;
    }

}
