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
 * 对应文件: ActivityTask.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ActivityTaskConfig {

    private final Integer id;
    private final String title;
    private final String desc;
    private final Integer rarity;
    private final Integer activityTaskGroupId;
    private final String activityGroupName;
    private final Integer completeCond;
    private final Integer aimNumShow;
    private final Integer tid1;
    private final Integer qty1;
    private final Integer tid2;
    private final Integer qty2;

    @JsonCreator
    public ActivityTaskConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("ActivityTaskGroupId") Integer activityTaskGroupId,
        @JsonProperty("ActivityGroupName") String activityGroupName,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("AimNumShow") Integer aimNumShow,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Tid2") Integer tid2,
        @JsonProperty("Qty2") Integer qty2
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.rarity = rarity;
        this.activityTaskGroupId = activityTaskGroupId;
        this.activityGroupName = activityGroupName;
        this.completeCond = completeCond;
        this.aimNumShow = aimNumShow;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.tid2 = tid2;
        this.qty2 = qty2;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public Integer getActivityTaskGroupId() {
        return this.activityTaskGroupId;
    }

    public String getActivityGroupName() {
        return this.activityGroupName;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public Integer getAimNumShow() {
        return this.aimNumShow;
    }

    public Integer getTid1() {
        return this.tid1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getTid2() {
        return this.tid2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

}
