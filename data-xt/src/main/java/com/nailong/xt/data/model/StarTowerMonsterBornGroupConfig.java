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
 * 对应文件: StarTowerMonsterBornGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerMonsterBornGroupConfig {

    private final Integer groupId;
    private final Integer monsterId;
    private final Integer difficulty;
    private final Integer minFloor;
    private final Integer maxFloor;

    @JsonCreator
    public StarTowerMonsterBornGroupConfig(
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("MinFloor") Integer minFloor,
        @JsonProperty("MaxFloor") Integer maxFloor
    ) {
        this.groupId = groupId;
        this.monsterId = monsterId;
        this.difficulty = difficulty;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getMonsterId() {
        return this.monsterId;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getMinFloor() {
        return this.minFloor;
    }

    public Integer getMaxFloor() {
        return this.maxFloor;
    }

}
