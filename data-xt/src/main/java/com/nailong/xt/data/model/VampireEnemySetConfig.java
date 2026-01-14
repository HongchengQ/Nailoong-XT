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
 * 对应文件: VampireEnemySet.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireEnemySetConfig {

    private final Integer setId;
    private final Integer groupNum;
    private final Integer monsterId;
    private final Integer maxNum;
    private final List<Integer> addData;
    private final List<Integer> maxNumImproveData;
    private final Integer monsterSpawnType;
    private final Integer monsterPoint;
    private final List<Integer> dropExp;
    private final List<Integer> dropHp;
    private final List<Integer> dropMp;
    private final List<Integer> dropAtk;
    private final Integer delayTime;
    private final List<Integer> dropGet;
    private final List<Integer> dropChest;
    private final List<Integer> dropClear;
    private final Integer monsterWarning;
    private final Integer levelChange;

    @JsonCreator
    public VampireEnemySetConfig(
        @JsonProperty("SetId") Integer setId,
        @JsonProperty("GroupNum") Integer groupNum,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("MaxNum") Integer maxNum,
        @JsonProperty("AddData") List<Integer> addData,
        @JsonProperty("MaxNumImproveData") List<Integer> maxNumImproveData,
        @JsonProperty("MonsterSpawnType") Integer monsterSpawnType,
        @JsonProperty("MonsterPoint") Integer monsterPoint,
        @JsonProperty("DropExp") List<Integer> dropExp,
        @JsonProperty("DropHp") List<Integer> dropHp,
        @JsonProperty("DropMp") List<Integer> dropMp,
        @JsonProperty("DropAtk") List<Integer> dropAtk,
        @JsonProperty("DelayTime") Integer delayTime,
        @JsonProperty("DropGet") List<Integer> dropGet,
        @JsonProperty("DropChest") List<Integer> dropChest,
        @JsonProperty("DropClear") List<Integer> dropClear,
        @JsonProperty("MonsterWarning") Integer monsterWarning,
        @JsonProperty("LevelChange") Integer levelChange
    ) {
        this.setId = setId;
        this.groupNum = groupNum;
        this.monsterId = monsterId;
        this.maxNum = maxNum;
        this.addData = addData != null ? 
            new ArrayList<>(addData) : 
            new ArrayList<>();
        this.maxNumImproveData = maxNumImproveData != null ? 
            new ArrayList<>(maxNumImproveData) : 
            new ArrayList<>();
        this.monsterSpawnType = monsterSpawnType;
        this.monsterPoint = monsterPoint;
        this.dropExp = dropExp != null ? 
            new ArrayList<>(dropExp) : 
            new ArrayList<>();
        this.dropHp = dropHp != null ? 
            new ArrayList<>(dropHp) : 
            new ArrayList<>();
        this.dropMp = dropMp != null ? 
            new ArrayList<>(dropMp) : 
            new ArrayList<>();
        this.dropAtk = dropAtk != null ? 
            new ArrayList<>(dropAtk) : 
            new ArrayList<>();
        this.delayTime = delayTime;
        this.dropGet = dropGet != null ? 
            new ArrayList<>(dropGet) : 
            new ArrayList<>();
        this.dropChest = dropChest != null ? 
            new ArrayList<>(dropChest) : 
            new ArrayList<>();
        this.dropClear = dropClear != null ? 
            new ArrayList<>(dropClear) : 
            new ArrayList<>();
        this.monsterWarning = monsterWarning;
        this.levelChange = levelChange;
    }

    public Integer getSetId() {
        return this.setId;
    }

    public Integer getGroupNum() {
        return this.groupNum;
    }

    public Integer getMonsterId() {
        return this.monsterId;
    }

    public Integer getMaxNum() {
        return this.maxNum;
    }

    public List<Integer> getAddData() {
        return this.addData;
    }

    public List<Integer> getMaxNumImproveData() {
        return this.maxNumImproveData;
    }

    public Integer getMonsterSpawnType() {
        return this.monsterSpawnType;
    }

    public Integer getMonsterPoint() {
        return this.monsterPoint;
    }

    public List<Integer> getDropExp() {
        return this.dropExp;
    }

    public List<Integer> getDropHp() {
        return this.dropHp;
    }

    public List<Integer> getDropMp() {
        return this.dropMp;
    }

    public List<Integer> getDropAtk() {
        return this.dropAtk;
    }

    public Integer getDelayTime() {
        return this.delayTime;
    }

    public List<Integer> getDropGet() {
        return this.dropGet;
    }

    public List<Integer> getDropChest() {
        return this.dropChest;
    }

    public List<Integer> getDropClear() {
        return this.dropClear;
    }

    public Integer getMonsterWarning() {
        return this.monsterWarning;
    }

    public Integer getLevelChange() {
        return this.levelChange;
    }

}
