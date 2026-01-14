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
 * 对应文件: VampireEnemyPool.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireEnemyPoolConfig {

    private final Integer poolId;
    private final Integer waveNum;
    private final Integer monsterLevel;
    private final Integer enemySetId;
    private final Integer waveKeepTime;
    private final Integer poolType;

    @JsonCreator
    public VampireEnemyPoolConfig(
        @JsonProperty("PoolId") Integer poolId,
        @JsonProperty("WaveNum") Integer waveNum,
        @JsonProperty("MonsterLevel") Integer monsterLevel,
        @JsonProperty("EnemySetID") Integer enemySetId,
        @JsonProperty("WaveKeepTime") Integer waveKeepTime,
        @JsonProperty("PoolType") Integer poolType
    ) {
        this.poolId = poolId;
        this.waveNum = waveNum;
        this.monsterLevel = monsterLevel;
        this.enemySetId = enemySetId;
        this.waveKeepTime = waveKeepTime;
        this.poolType = poolType;
    }

    public Integer getPoolId() {
        return this.poolId;
    }

    public Integer getWaveNum() {
        return this.waveNum;
    }

    public Integer getMonsterLevel() {
        return this.monsterLevel;
    }

    public Integer getEnemySetId() {
        return this.enemySetId;
    }

    public Integer getWaveKeepTime() {
        return this.waveKeepTime;
    }

    public Integer getPoolType() {
        return this.poolType;
    }

}
