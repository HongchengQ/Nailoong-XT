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
 * 对应文件: StarTowerFloorSet.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerFloorSetConfig {

    private final Integer id;
    private final Integer battleLvs;
    private final List<Integer> stage;
    private final List<Integer> mapId;
    private final List<Integer> floorId;
    private final Integer monsterLv;
    private final Integer themeSkillLv;
    private final Integer weight;
    private final Integer roomType;

    @JsonCreator
    public StarTowerFloorSetConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BattleLvs") Integer battleLvs,
        @JsonProperty("Stage") List<Integer> stage,
        @JsonProperty("MapID") List<Integer> mapId,
        @JsonProperty("FloorID") List<Integer> floorId,
        @JsonProperty("MonsterLv") Integer monsterLv,
        @JsonProperty("ThemeSkillLv") Integer themeSkillLv,
        @JsonProperty("Weight") Integer weight,
        @JsonProperty("RoomType") Integer roomType
    ) {
        this.id = id;
        this.battleLvs = battleLvs;
        this.stage = stage != null ? 
            new ArrayList<>(stage) : 
            new ArrayList<>();
        this.mapId = mapId != null ? 
            new ArrayList<>(mapId) : 
            new ArrayList<>();
        this.floorId = floorId != null ? 
            new ArrayList<>(floorId) : 
            new ArrayList<>();
        this.monsterLv = monsterLv;
        this.themeSkillLv = themeSkillLv;
        this.weight = weight;
        this.roomType = roomType;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBattleLvs() {
        return this.battleLvs;
    }

    public List<Integer> getStage() {
        return this.stage;
    }

    public List<Integer> getMapId() {
        return this.mapId;
    }

    public List<Integer> getFloorId() {
        return this.floorId;
    }

    public Integer getMonsterLv() {
        return this.monsterLv;
    }

    public Integer getThemeSkillLv() {
        return this.themeSkillLv;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getRoomType() {
        return this.roomType;
    }

}
