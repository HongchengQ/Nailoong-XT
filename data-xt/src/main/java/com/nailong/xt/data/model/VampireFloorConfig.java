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
 * 对应文件: VampireFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireFloorConfig {

    private final Integer id;
    private final Integer mapId;
    private final List<Integer> waveCount;
    private final Integer firstHalfPoolId;
    private final List<Integer> fhAffixId;
    private final Integer fhBossId;
    private final Integer secondHalfPoolId;
    private final List<Integer> shAffixId;
    private final Integer shBossId;
    private final String specialEnemySetId;
    private final String treasureSetId;

    @JsonCreator
    public VampireFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MapId") Integer mapId,
        @JsonProperty("WaveCount") List<Integer> waveCount,
        @JsonProperty("FirstHalfPoolId") Integer firstHalfPoolId,
        @JsonProperty("FHAffixId") List<Integer> fhAffixId,
        @JsonProperty("FHBossId") Integer fhBossId,
        @JsonProperty("SecondHalfPoolId") Integer secondHalfPoolId,
        @JsonProperty("SHAffixId") List<Integer> shAffixId,
        @JsonProperty("SHBossId") Integer shBossId,
        @JsonProperty("SpecialEnemySetId") String specialEnemySetId,
        @JsonProperty("TreasureSetId") String treasureSetId
    ) {
        this.id = id;
        this.mapId = mapId;
        this.waveCount = waveCount != null ? 
            new ArrayList<>(waveCount) : 
            new ArrayList<>();
        this.firstHalfPoolId = firstHalfPoolId;
        this.fhAffixId = fhAffixId != null ? 
            new ArrayList<>(fhAffixId) : 
            new ArrayList<>();
        this.fhBossId = fhBossId;
        this.secondHalfPoolId = secondHalfPoolId;
        this.shAffixId = shAffixId != null ? 
            new ArrayList<>(shAffixId) : 
            new ArrayList<>();
        this.shBossId = shBossId;
        this.specialEnemySetId = specialEnemySetId;
        this.treasureSetId = treasureSetId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMapId() {
        return this.mapId;
    }

    public List<Integer> getWaveCount() {
        return this.waveCount;
    }

    public Integer getFirstHalfPoolId() {
        return this.firstHalfPoolId;
    }

    public List<Integer> getFhAffixId() {
        return this.fhAffixId;
    }

    public Integer getFhBossId() {
        return this.fhBossId;
    }

    public Integer getSecondHalfPoolId() {
        return this.secondHalfPoolId;
    }

    public List<Integer> getShAffixId() {
        return this.shAffixId;
    }

    public Integer getShBossId() {
        return this.shBossId;
    }

    public String getSpecialEnemySetId() {
        return this.specialEnemySetId;
    }

    public String getTreasureSetId() {
        return this.treasureSetId;
    }

}
