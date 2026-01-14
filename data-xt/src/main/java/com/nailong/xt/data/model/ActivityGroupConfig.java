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
 * 对应文件: ActivityGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityGroupConfig {

    private final Integer id;
    private final Integer activityGroupType;
    private final Integer activityThemeType;
    private final String startTime;
    private final String endTime;
    private final String enterEndTime;
    private final String enterRes;
    private final Integer panelId;
    private final Integer preLimit;
    private final String limitParam;
    private final Integer startCondType;
    private final List<Integer> startCondParams;
    private final String enter;
    private final String uiAssetsPrefab;
    private final String ctrlName;
    private final List<Integer> rewardsShow;
    private final String desText;
    private final String tabBgRes;
    private final Integer transitionId;

    @JsonCreator
    public ActivityGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityGroupType") Integer activityGroupType,
        @JsonProperty("ActivityThemeType") Integer activityThemeType,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("EnterEndTime") String enterEndTime,
        @JsonProperty("EnterRes") String enterRes,
        @JsonProperty("PanelId") Integer panelId,
        @JsonProperty("PreLimit") Integer preLimit,
        @JsonProperty("LimitParam") String limitParam,
        @JsonProperty("StartCondType") Integer startCondType,
        @JsonProperty("StartCondParams") List<Integer> startCondParams,
        @JsonProperty("Enter") String enter,
        @JsonProperty("UIAssetsPrefab") String uiAssetsPrefab,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("RewardsShow") List<Integer> rewardsShow,
        @JsonProperty("DesText") String desText,
        @JsonProperty("TabBgRes") String tabBgRes,
        @JsonProperty("TransitionId") Integer transitionId
    ) {
        this.id = id;
        this.activityGroupType = activityGroupType;
        this.activityThemeType = activityThemeType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.enterEndTime = enterEndTime;
        this.enterRes = enterRes;
        this.panelId = panelId;
        this.preLimit = preLimit;
        this.limitParam = limitParam;
        this.startCondType = startCondType;
        this.startCondParams = startCondParams != null ? 
            new ArrayList<>(startCondParams) : 
            new ArrayList<>();
        this.enter = enter;
        this.uiAssetsPrefab = uiAssetsPrefab;
        this.ctrlName = ctrlName;
        this.rewardsShow = rewardsShow != null ? 
            new ArrayList<>(rewardsShow) : 
            new ArrayList<>();
        this.desText = desText;
        this.tabBgRes = tabBgRes;
        this.transitionId = transitionId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityGroupType() {
        return this.activityGroupType;
    }

    public Integer getActivityThemeType() {
        return this.activityThemeType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getEnterEndTime() {
        return this.enterEndTime;
    }

    public String getEnterRes() {
        return this.enterRes;
    }

    public Integer getPanelId() {
        return this.panelId;
    }

    public Integer getPreLimit() {
        return this.preLimit;
    }

    public String getLimitParam() {
        return this.limitParam;
    }

    public Integer getStartCondType() {
        return this.startCondType;
    }

    public List<Integer> getStartCondParams() {
        return this.startCondParams;
    }

    public String getEnter() {
        return this.enter;
    }

    public String getUiAssetsPrefab() {
        return this.uiAssetsPrefab;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public List<Integer> getRewardsShow() {
        return this.rewardsShow;
    }

    public String getDesText() {
        return this.desText;
    }

    public String getTabBgRes() {
        return this.tabBgRes;
    }

    public Integer getTransitionId() {
        return this.transitionId;
    }

}
