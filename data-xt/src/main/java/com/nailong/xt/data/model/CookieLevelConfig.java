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
 * 对应文件: CookieLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CookieLevelConfig {

    private final Integer id;
    private final Integer activityId;
    private final String name;
    private final Integer packType;
    private final Integer difficulty;
    private final Integer packModel;
    private final Integer floorId;
    private final Integer firstCompletionScore;
    private final String packContent;
    private final Integer countDownLimit;
    private final Integer returnCd;
    private final Integer firstCompletionReward1Tid;
    private final Integer firstCompletionReward1Qty;
    private final Integer firstCompletionReward2Tid;
    private final Integer firstCompletionReward2Qty;
    private final Integer preLevelId;
    private final Integer dayOpen;

    @JsonCreator
    public CookieLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("Name") String name,
        @JsonProperty("PackType") Integer packType,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("PackModel") Integer packModel,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("FirstCompletionScore") Integer firstCompletionScore,
        @JsonProperty("PackContent") String packContent,
        @JsonProperty("CountDownLimit") Integer countDownLimit,
        @JsonProperty("ReturnCd") Integer returnCd,
        @JsonProperty("FirstCompletionReward1Tid") Integer firstCompletionReward1Tid,
        @JsonProperty("FirstCompletionReward1Qty") Integer firstCompletionReward1Qty,
        @JsonProperty("FirstCompletionReward2Tid") Integer firstCompletionReward2Tid,
        @JsonProperty("FirstCompletionReward2Qty") Integer firstCompletionReward2Qty,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("DayOpen") Integer dayOpen
    ) {
        this.id = id;
        this.activityId = activityId;
        this.name = name;
        this.packType = packType;
        this.difficulty = difficulty;
        this.packModel = packModel;
        this.floorId = floorId;
        this.firstCompletionScore = firstCompletionScore;
        this.packContent = packContent;
        this.countDownLimit = countDownLimit;
        this.returnCd = returnCd;
        this.firstCompletionReward1Tid = firstCompletionReward1Tid;
        this.firstCompletionReward1Qty = firstCompletionReward1Qty;
        this.firstCompletionReward2Tid = firstCompletionReward2Tid;
        this.firstCompletionReward2Qty = firstCompletionReward2Qty;
        this.preLevelId = preLevelId;
        this.dayOpen = dayOpen;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPackType() {
        return this.packType;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getPackModel() {
        return this.packModel;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getFirstCompletionScore() {
        return this.firstCompletionScore;
    }

    public String getPackContent() {
        return this.packContent;
    }

    public Integer getCountDownLimit() {
        return this.countDownLimit;
    }

    public Integer getReturnCd() {
        return this.returnCd;
    }

    public Integer getFirstCompletionReward1Tid() {
        return this.firstCompletionReward1Tid;
    }

    public Integer getFirstCompletionReward1Qty() {
        return this.firstCompletionReward1Qty;
    }

    public Integer getFirstCompletionReward2Tid() {
        return this.firstCompletionReward2Tid;
    }

    public Integer getFirstCompletionReward2Qty() {
        return this.firstCompletionReward2Qty;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public Integer getDayOpen() {
        return this.dayOpen;
    }

}
