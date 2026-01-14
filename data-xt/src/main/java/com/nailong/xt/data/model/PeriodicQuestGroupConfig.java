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
 * 对应文件: PeriodicQuestGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PeriodicQuestGroupConfig {

    private final Integer belong;
    private final Integer groupId;
    private final Integer unlockTime;

    @JsonCreator
    public PeriodicQuestGroupConfig(
        @JsonProperty("Belong") Integer belong,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("UnlockTime") Integer unlockTime
    ) {
        this.belong = belong;
        this.groupId = groupId;
        this.unlockTime = unlockTime;
    }

    public Integer getBelong() {
        return this.belong;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getUnlockTime() {
        return this.unlockTime;
    }

}
