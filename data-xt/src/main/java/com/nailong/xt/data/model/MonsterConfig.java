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
 * 对应文件: Monster.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterConfig {

    private final Integer id;
    private final String name;
    private final Integer epicLv;
    private final Integer monsterPosition;
    private final Integer fcId;
    private final Integer faId;
    private final Integer movType;
    private final Integer runSpd;
    private final Integer transSpdScale;
    private final Integer walkSpd;
    private final Integer movAcc;
    private final Integer visionRng;
    private final Integer visionDeg;
    private final Integer hearRng;
    private final Integer refRng;
    private final Integer actRng;
    private final Integer disActRng;
    private final Integer searchRng;
    private final Integer rotSpd;
    private final Integer templete;
    private final List<Integer> buffIds;
    private final Integer subType;
    private final Integer faction;
    private final List<Integer> trapTagIds;
    private final Integer weight;
    private final Integer blockPriority;
    private final Integer supCharge;
    private final Integer bloodType;
    private final Integer rotSpdInSkill;
    private final Integer attackHintType;
    private final Integer toughnessBrokenTime;
    private final Boolean isToughnessRecorver;
    private final Integer monsterTeamId;
    private final String tag1;
    private final String tag2;
    private final String tag4;
    private final String tag5;
    private final Boolean isShowRng;

    @JsonCreator
    public MonsterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("EpicLv") Integer epicLv,
        @JsonProperty("MonsterPosition") Integer monsterPosition,
        @JsonProperty("FCId") Integer fcId,
        @JsonProperty("FAId") Integer faId,
        @JsonProperty("MovType") Integer movType,
        @JsonProperty("RunSpd") Integer runSpd,
        @JsonProperty("TransSpdScale") Integer transSpdScale,
        @JsonProperty("WalkSpd") Integer walkSpd,
        @JsonProperty("MovAcc") Integer movAcc,
        @JsonProperty("VisionRng") Integer visionRng,
        @JsonProperty("VisionDeg") Integer visionDeg,
        @JsonProperty("HearRng") Integer hearRng,
        @JsonProperty("RefRng") Integer refRng,
        @JsonProperty("ActRng") Integer actRng,
        @JsonProperty("DisActRng") Integer disActRng,
        @JsonProperty("SearchRng") Integer searchRng,
        @JsonProperty("RotSpd") Integer rotSpd,
        @JsonProperty("Templete") Integer templete,
        @JsonProperty("BuffIds") List<Integer> buffIds,
        @JsonProperty("SubType") Integer subType,
        @JsonProperty("Faction") Integer faction,
        @JsonProperty("TrapTagIds") List<Integer> trapTagIds,
        @JsonProperty("Weight") Integer weight,
        @JsonProperty("BlockPriority") Integer blockPriority,
        @JsonProperty("SupCharge") Integer supCharge,
        @JsonProperty("BloodType") Integer bloodType,
        @JsonProperty("RotSpdInSkill") Integer rotSpdInSkill,
        @JsonProperty("AttackHintType") Integer attackHintType,
        @JsonProperty("ToughnessBrokenTime") Integer toughnessBrokenTime,
        @JsonProperty("IsToughnessRecorver") Boolean isToughnessRecorver,
        @JsonProperty("MonsterTeamId") Integer monsterTeamId,
        @JsonProperty("Tag1") String tag1,
        @JsonProperty("Tag2") String tag2,
        @JsonProperty("Tag4") String tag4,
        @JsonProperty("Tag5") String tag5,
        @JsonProperty("IsShowRng") Boolean isShowRng
    ) {
        this.id = id;
        this.name = name;
        this.epicLv = epicLv;
        this.monsterPosition = monsterPosition;
        this.fcId = fcId;
        this.faId = faId;
        this.movType = movType;
        this.runSpd = runSpd;
        this.transSpdScale = transSpdScale;
        this.walkSpd = walkSpd;
        this.movAcc = movAcc;
        this.visionRng = visionRng;
        this.visionDeg = visionDeg;
        this.hearRng = hearRng;
        this.refRng = refRng;
        this.actRng = actRng;
        this.disActRng = disActRng;
        this.searchRng = searchRng;
        this.rotSpd = rotSpd;
        this.templete = templete;
        this.buffIds = buffIds != null ? 
            new ArrayList<>(buffIds) : 
            new ArrayList<>();
        this.subType = subType;
        this.faction = faction;
        this.trapTagIds = trapTagIds != null ? 
            new ArrayList<>(trapTagIds) : 
            new ArrayList<>();
        this.weight = weight;
        this.blockPriority = blockPriority;
        this.supCharge = supCharge;
        this.bloodType = bloodType;
        this.rotSpdInSkill = rotSpdInSkill;
        this.attackHintType = attackHintType;
        this.toughnessBrokenTime = toughnessBrokenTime;
        this.isToughnessRecorver = isToughnessRecorver;
        this.monsterTeamId = monsterTeamId;
        this.tag1 = tag1;
        this.tag2 = tag2;
        this.tag4 = tag4;
        this.tag5 = tag5;
        this.isShowRng = isShowRng;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getEpicLv() {
        return this.epicLv;
    }

    public Integer getMonsterPosition() {
        return this.monsterPosition;
    }

    public Integer getFcId() {
        return this.fcId;
    }

    public Integer getFaId() {
        return this.faId;
    }

    public Integer getMovType() {
        return this.movType;
    }

    public Integer getRunSpd() {
        return this.runSpd;
    }

    public Integer getTransSpdScale() {
        return this.transSpdScale;
    }

    public Integer getWalkSpd() {
        return this.walkSpd;
    }

    public Integer getMovAcc() {
        return this.movAcc;
    }

    public Integer getVisionRng() {
        return this.visionRng;
    }

    public Integer getVisionDeg() {
        return this.visionDeg;
    }

    public Integer getHearRng() {
        return this.hearRng;
    }

    public Integer getRefRng() {
        return this.refRng;
    }

    public Integer getActRng() {
        return this.actRng;
    }

    public Integer getDisActRng() {
        return this.disActRng;
    }

    public Integer getSearchRng() {
        return this.searchRng;
    }

    public Integer getRotSpd() {
        return this.rotSpd;
    }

    public Integer getTemplete() {
        return this.templete;
    }

    public List<Integer> getBuffIds() {
        return this.buffIds;
    }

    public Integer getSubType() {
        return this.subType;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public List<Integer> getTrapTagIds() {
        return this.trapTagIds;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getBlockPriority() {
        return this.blockPriority;
    }

    public Integer getSupCharge() {
        return this.supCharge;
    }

    public Integer getBloodType() {
        return this.bloodType;
    }

    public Integer getRotSpdInSkill() {
        return this.rotSpdInSkill;
    }

    public Integer getAttackHintType() {
        return this.attackHintType;
    }

    public Integer getToughnessBrokenTime() {
        return this.toughnessBrokenTime;
    }

    public Boolean getIsToughnessRecorver() {
        return this.isToughnessRecorver;
    }

    public Integer getMonsterTeamId() {
        return this.monsterTeamId;
    }

    public String getTag1() {
        return this.tag1;
    }

    public String getTag2() {
        return this.tag2;
    }

    public String getTag4() {
        return this.tag4;
    }

    public String getTag5() {
        return this.tag5;
    }

    public Boolean getIsShowRng() {
        return this.isShowRng;
    }

}
