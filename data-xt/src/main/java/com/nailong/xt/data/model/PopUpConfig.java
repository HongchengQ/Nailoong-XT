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
 * 对应文件: PopUp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PopUpConfig {

    private final Integer id;
    private final Integer sortId;
    private final Integer popUpType;
    private final String popUpRes;
    private final String scriptName;
    private final String scriptParams;
    private final Integer popRefreshType;
    private final Integer popJumpType;
    private final Integer jumpToParams;
    private final Integer startCondType;
    private final List<Integer> startCondParams;
    private final Integer startType;
    private final String startTime;
    private final Integer endType;
    private final String endTime;
    private final Integer activityId;

    @JsonCreator
    public PopUpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("PopUpType") Integer popUpType,
        @JsonProperty("PopUpRes") String popUpRes,
        @JsonProperty("ScriptName") String scriptName,
        @JsonProperty("ScriptParams") String scriptParams,
        @JsonProperty("PopRefreshType") Integer popRefreshType,
        @JsonProperty("PopJumpType") Integer popJumpType,
        @JsonProperty("JumpToParams") Integer jumpToParams,
        @JsonProperty("StartCondType") Integer startCondType,
        @JsonProperty("StartCondParams") List<Integer> startCondParams,
        @JsonProperty("StartType") Integer startType,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndType") Integer endType,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("ActivityId") Integer activityId
    ) {
        this.id = id;
        this.sortId = sortId;
        this.popUpType = popUpType;
        this.popUpRes = popUpRes;
        this.scriptName = scriptName;
        this.scriptParams = scriptParams;
        this.popRefreshType = popRefreshType;
        this.popJumpType = popJumpType;
        this.jumpToParams = jumpToParams;
        this.startCondType = startCondType;
        this.startCondParams = startCondParams != null ? 
            new ArrayList<>(startCondParams) : 
            new ArrayList<>();
        this.startType = startType;
        this.startTime = startTime;
        this.endType = endType;
        this.endTime = endTime;
        this.activityId = activityId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public Integer getPopUpType() {
        return this.popUpType;
    }

    public String getPopUpRes() {
        return this.popUpRes;
    }

    public String getScriptName() {
        return this.scriptName;
    }

    public String getScriptParams() {
        return this.scriptParams;
    }

    public Integer getPopRefreshType() {
        return this.popRefreshType;
    }

    public Integer getPopJumpType() {
        return this.popJumpType;
    }

    public Integer getJumpToParams() {
        return this.jumpToParams;
    }

    public Integer getStartCondType() {
        return this.startCondType;
    }

    public List<Integer> getStartCondParams() {
        return this.startCondParams;
    }

    public Integer getStartType() {
        return this.startType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public Integer getEndType() {
        return this.endType;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

}
