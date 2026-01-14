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
 * 对应文件: TowerDefenseQuestGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseQuestGroupConfig {

    private final Integer id;
    private final Integer activityId;
    private final String groupName;

    @JsonCreator
    public TowerDefenseQuestGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("GroupName") String groupName
    ) {
        this.id = id;
        this.activityId = activityId;
        this.groupName = groupName;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getGroupName() {
        return this.groupName;
    }

}
