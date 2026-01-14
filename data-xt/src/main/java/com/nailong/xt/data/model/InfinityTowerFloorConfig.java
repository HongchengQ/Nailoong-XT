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
 * 对应文件: InfinityTowerFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerFloorConfig {

    private final Integer id;
    private final Integer lvId;
    private final Integer mapId;
    private final Integer battleLv;
    private final Integer floorFunc;
    private final Integer monsterLv;
    private final Integer stage;
    private final Integer setId;
    private final Integer limitTime;
    private final Integer previewMonsterGroupId;
    private final List<Integer> affixId;

    @JsonCreator
    public InfinityTowerFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("LvId") Integer lvId,
        @JsonProperty("MapId") Integer mapId,
        @JsonProperty("BattleLv") Integer battleLv,
        @JsonProperty("FloorFunc") Integer floorFunc,
        @JsonProperty("MonsterLv") Integer monsterLv,
        @JsonProperty("Stage") Integer stage,
        @JsonProperty("SetId") Integer setId,
        @JsonProperty("LimitTime") Integer limitTime,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("AffixId") List<Integer> affixId
    ) {
        this.id = id;
        this.lvId = lvId;
        this.mapId = mapId;
        this.battleLv = battleLv;
        this.floorFunc = floorFunc;
        this.monsterLv = monsterLv;
        this.stage = stage;
        this.setId = setId;
        this.limitTime = limitTime;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.affixId = affixId != null ? 
            new ArrayList<>(affixId) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLvId() {
        return this.lvId;
    }

    public Integer getMapId() {
        return this.mapId;
    }

    public Integer getBattleLv() {
        return this.battleLv;
    }

    public Integer getFloorFunc() {
        return this.floorFunc;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

    public Integer getStage() {
        return this.stage;
    }

    public Integer getSetId() {
        return this.setId;
    }

    public Integer getLimitTime() {
        return this.limitTime;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public List<Integer> getAffixId() {
        return this.affixId;
    }

}
