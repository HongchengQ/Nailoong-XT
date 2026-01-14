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
 * 对应文件: InfinityTowerEnemySet.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerEnemySetConfig {

    private final Integer setId;
    private final Integer waveNum;
    private final Integer groupNum;
    private final Integer maxNum;
    private final Integer maxNumPerWave;
    private final Integer monsterId;
    private final Integer commonGameplayType;

    @JsonCreator
    public InfinityTowerEnemySetConfig(
        @JsonProperty("SetId") Integer setId,
        @JsonProperty("WaveNum") Integer waveNum,
        @JsonProperty("GroupNum") Integer groupNum,
        @JsonProperty("MaxNum") Integer maxNum,
        @JsonProperty("MaxNumPerWave") Integer maxNumPerWave,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("CommonGameplayType") Integer commonGameplayType
    ) {
        this.setId = setId;
        this.waveNum = waveNum;
        this.groupNum = groupNum;
        this.maxNum = maxNum;
        this.maxNumPerWave = maxNumPerWave;
        this.monsterId = monsterId;
        this.commonGameplayType = commonGameplayType;
    }

    public Integer getSetId() {
        return this.setId;
    }

    public Integer getWaveNum() {
        return this.waveNum;
    }

    public Integer getGroupNum() {
        return this.groupNum;
    }

    public Integer getMaxNum() {
        return this.maxNum;
    }

    public Integer getMaxNumPerWave() {
        return this.maxNumPerWave;
    }

    public Integer getMonsterId() {
        return this.monsterId;
    }

    public Integer getCommonGameplayType() {
        return this.commonGameplayType;
    }

}
