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
 * 对应文件: BattleThreshold.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BattleThresholdConfig {

    private final Integer missionId;
    private final Integer version;
    private final Integer fromSrcAtk;
    private final Integer fromPerkIntensityRatio;
    private final Integer fromSlotDmgRatio;
    private final Integer fromEe;
    private final Integer fromGenDmgRatio;
    private final Integer fromDmgPlus;
    private final Integer fromCritRatio;
    private final Integer fromFinalDmgRatio;
    private final Integer fromFinalDmgPlus;
    private final Integer toErAmend;
    private final Integer toDefAmend;
    private final Integer toRcdSlotDmgRatio;
    private final Integer toEercd;
    private final Integer toGenDmgRcdRatio;
    private final Integer toDmgPlusRcd;
    private final Integer dmg;
    private final Integer critRate;
    private final Integer hp;

    @JsonCreator
    public BattleThresholdConfig(
        @JsonProperty("MissionId") Integer missionId,
        @JsonProperty("Version") Integer version,
        @JsonProperty("fromSrcAtk") Integer fromSrcAtk,
        @JsonProperty("fromPerkIntensityRatio") Integer fromPerkIntensityRatio,
        @JsonProperty("fromSlotDmgRatio") Integer fromSlotDmgRatio,
        @JsonProperty("fromEE") Integer fromEe,
        @JsonProperty("fromGenDmgRatio") Integer fromGenDmgRatio,
        @JsonProperty("fromDmgPlus") Integer fromDmgPlus,
        @JsonProperty("fromCritRatio") Integer fromCritRatio,
        @JsonProperty("fromFinalDmgRatio") Integer fromFinalDmgRatio,
        @JsonProperty("fromFinalDmgPlus") Integer fromFinalDmgPlus,
        @JsonProperty("toErAmend") Integer toErAmend,
        @JsonProperty("toDefAmend") Integer toDefAmend,
        @JsonProperty("toRcdSlotDmgRatio") Integer toRcdSlotDmgRatio,
        @JsonProperty("toEERCD") Integer toEercd,
        @JsonProperty("toGenDmgRcdRatio") Integer toGenDmgRcdRatio,
        @JsonProperty("toDmgPlusRcd") Integer toDmgPlusRcd,
        @JsonProperty("Dmg") Integer dmg,
        @JsonProperty("CritRate") Integer critRate,
        @JsonProperty("Hp") Integer hp
    ) {
        this.missionId = missionId;
        this.version = version;
        this.fromSrcAtk = fromSrcAtk;
        this.fromPerkIntensityRatio = fromPerkIntensityRatio;
        this.fromSlotDmgRatio = fromSlotDmgRatio;
        this.fromEe = fromEe;
        this.fromGenDmgRatio = fromGenDmgRatio;
        this.fromDmgPlus = fromDmgPlus;
        this.fromCritRatio = fromCritRatio;
        this.fromFinalDmgRatio = fromFinalDmgRatio;
        this.fromFinalDmgPlus = fromFinalDmgPlus;
        this.toErAmend = toErAmend;
        this.toDefAmend = toDefAmend;
        this.toRcdSlotDmgRatio = toRcdSlotDmgRatio;
        this.toEercd = toEercd;
        this.toGenDmgRcdRatio = toGenDmgRcdRatio;
        this.toDmgPlusRcd = toDmgPlusRcd;
        this.dmg = dmg;
        this.critRate = critRate;
        this.hp = hp;
    }

    public Integer getMissionId() {
        return this.missionId;
    }

    public Integer getVersion() {
        return this.version;
    }

    public Integer getFromSrcAtk() {
        return this.fromSrcAtk;
    }

    public Integer getFromPerkIntensityRatio() {
        return this.fromPerkIntensityRatio;
    }

    public Integer getFromSlotDmgRatio() {
        return this.fromSlotDmgRatio;
    }

    public Integer getFromEe() {
        return this.fromEe;
    }

    public Integer getFromGenDmgRatio() {
        return this.fromGenDmgRatio;
    }

    public Integer getFromDmgPlus() {
        return this.fromDmgPlus;
    }

    public Integer getFromCritRatio() {
        return this.fromCritRatio;
    }

    public Integer getFromFinalDmgRatio() {
        return this.fromFinalDmgRatio;
    }

    public Integer getFromFinalDmgPlus() {
        return this.fromFinalDmgPlus;
    }

    public Integer getToErAmend() {
        return this.toErAmend;
    }

    public Integer getToDefAmend() {
        return this.toDefAmend;
    }

    public Integer getToRcdSlotDmgRatio() {
        return this.toRcdSlotDmgRatio;
    }

    public Integer getToEercd() {
        return this.toEercd;
    }

    public Integer getToGenDmgRcdRatio() {
        return this.toGenDmgRcdRatio;
    }

    public Integer getToDmgPlusRcd() {
        return this.toDmgPlusRcd;
    }

    public Integer getDmg() {
        return this.dmg;
    }

    public Integer getCritRate() {
        return this.critRate;
    }

    public Integer getHp() {
        return this.hp;
    }

}
