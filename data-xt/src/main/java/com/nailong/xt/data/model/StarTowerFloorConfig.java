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
 * 对应文件: StarTowerFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerFloorConfig {

    private final Integer id;
    private final Integer commonGameplayType;
    private final String commonMonsterSet;
    private final Integer limitTime;
    private final Integer dropObjectGroupId;
    private final Integer dropObjectRate;
    private final Integer dropMaxNum;

    @JsonCreator
    public StarTowerFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CommonGameplayType") Integer commonGameplayType,
        @JsonProperty("CommonMonsterSet") String commonMonsterSet,
        @JsonProperty("LimitTime") Integer limitTime,
        @JsonProperty("DropObjectGroupId") Integer dropObjectGroupId,
        @JsonProperty("DropObjectRate") Integer dropObjectRate,
        @JsonProperty("DropMaxNum") Integer dropMaxNum
    ) {
        this.id = id;
        this.commonGameplayType = commonGameplayType;
        this.commonMonsterSet = commonMonsterSet;
        this.limitTime = limitTime;
        this.dropObjectGroupId = dropObjectGroupId;
        this.dropObjectRate = dropObjectRate;
        this.dropMaxNum = dropMaxNum;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCommonGameplayType() {
        return this.commonGameplayType;
    }

    public String getCommonMonsterSet() {
        return this.commonMonsterSet;
    }

    public Integer getLimitTime() {
        return this.limitTime;
    }

    public Integer getDropObjectGroupId() {
        return this.dropObjectGroupId;
    }

    public Integer getDropObjectRate() {
        return this.dropObjectRate;
    }

    public Integer getDropMaxNum() {
        return this.dropMaxNum;
    }

}
