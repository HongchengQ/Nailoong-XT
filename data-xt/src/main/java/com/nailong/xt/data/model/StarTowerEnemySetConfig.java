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
 * 对应文件: StarTowerEnemySet.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerEnemySetConfig {

    private final Integer setId;
    private final Integer waveNum;
    private final Integer maxNum;
    private final Integer maxNumPerWave;
    private final Integer monsterId;
    private final Integer refInterval;

    @JsonCreator
    public StarTowerEnemySetConfig(
        @JsonProperty("SetId") Integer setId,
        @JsonProperty("WaveNum") Integer waveNum,
        @JsonProperty("MaxNum") Integer maxNum,
        @JsonProperty("MaxNumPerWave") Integer maxNumPerWave,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("RefInterval") Integer refInterval
    ) {
        this.setId = setId;
        this.waveNum = waveNum;
        this.maxNum = maxNum;
        this.maxNumPerWave = maxNumPerWave;
        this.monsterId = monsterId;
        this.refInterval = refInterval;
    }

    public Integer getSetId() {
        return this.setId;
    }

    public Integer getWaveNum() {
        return this.waveNum;
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

    public Integer getRefInterval() {
        return this.refInterval;
    }

}
