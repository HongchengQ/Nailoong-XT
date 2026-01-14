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
 * 对应文件: ActivityTaskControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityTaskControlConfig {

    private final Integer activityId;
    private final String uiAssets;
    private final String ctrlName;
    private final String fastEntranceIcon;

    @JsonCreator
    public ActivityTaskControlConfig(
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("FastEntranceIcon") String fastEntranceIcon
    ) {
        this.activityId = activityId;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.fastEntranceIcon = fastEntranceIcon;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public String getFastEntranceIcon() {
        return this.fastEntranceIcon;
    }

}
