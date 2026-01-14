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
 * 对应文件: Activity.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityConfig {

    private final Integer id;
    private final Integer sortId;
    private final Integer activityType;
    private final String name;
    private final Integer startType;
    private final Integer endType;
    private final String tabBgRes;
    private final Integer preLimit;
    private final String limitParam;
    private final Integer playCond;
    private final String playCondParams;
    private final Integer startCondType;
    private final List<Integer> startCondParams;
    private final String startTime;
    private final String endTime;
    private final Integer endDuration;
    private final String bannerRes;
    private final Integer midGroupId;
    private final Integer activityThemeType;
    private final Boolean hideFromActivityList;

    @JsonCreator
    public ActivityConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("ActivityType") Integer activityType,
        @JsonProperty("Name") String name,
        @JsonProperty("StartType") Integer startType,
        @JsonProperty("EndType") Integer endType,
        @JsonProperty("TabBgRes") String tabBgRes,
        @JsonProperty("PreLimit") Integer preLimit,
        @JsonProperty("LimitParam") String limitParam,
        @JsonProperty("PlayCond") Integer playCond,
        @JsonProperty("PlayCondParams") String playCondParams,
        @JsonProperty("StartCondType") Integer startCondType,
        @JsonProperty("StartCondParams") List<Integer> startCondParams,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("EndDuration") Integer endDuration,
        @JsonProperty("BannerRes") String bannerRes,
        @JsonProperty("MidGroupId") Integer midGroupId,
        @JsonProperty("ActivityThemeType") Integer activityThemeType,
        @JsonProperty("HideFromActivityList") Boolean hideFromActivityList
    ) {
        this.id = id;
        this.sortId = sortId;
        this.activityType = activityType;
        this.name = name;
        this.startType = startType;
        this.endType = endType;
        this.tabBgRes = tabBgRes;
        this.preLimit = preLimit;
        this.limitParam = limitParam;
        this.playCond = playCond;
        this.playCondParams = playCondParams;
        this.startCondType = startCondType;
        this.startCondParams = startCondParams != null ? 
            new ArrayList<>(startCondParams) : 
            new ArrayList<>();
        this.startTime = startTime;
        this.endTime = endTime;
        this.endDuration = endDuration;
        this.bannerRes = bannerRes;
        this.midGroupId = midGroupId;
        this.activityThemeType = activityThemeType;
        this.hideFromActivityList = hideFromActivityList;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public Integer getActivityType() {
        return this.activityType;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStartType() {
        return this.startType;
    }

    public Integer getEndType() {
        return this.endType;
    }

    public String getTabBgRes() {
        return this.tabBgRes;
    }

    public Integer getPreLimit() {
        return this.preLimit;
    }

    public String getLimitParam() {
        return this.limitParam;
    }

    public Integer getPlayCond() {
        return this.playCond;
    }

    public String getPlayCondParams() {
        return this.playCondParams;
    }

    public Integer getStartCondType() {
        return this.startCondType;
    }

    public List<Integer> getStartCondParams() {
        return this.startCondParams;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public Integer getEndDuration() {
        return this.endDuration;
    }

    public String getBannerRes() {
        return this.bannerRes;
    }

    public Integer getMidGroupId() {
        return this.midGroupId;
    }

    public Integer getActivityThemeType() {
        return this.activityThemeType;
    }

    public Boolean getHideFromActivityList() {
        return this.hideFromActivityList;
    }

}
