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
 * 对应文件: JointDrillQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class JointDrillQuestConfig {

    private final Integer id;
    private final Integer groupId;
    private final String title;
    private final Integer order;
    private final Integer completeCond;
    private final String completeCondParams;
    private final Integer awardItemTid1;
    private final Integer awardItemNum1;
    private final Integer awardItemTid2;
    private final Integer awardItemNum2;

    @JsonCreator
    public JointDrillQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Title") String title,
        @JsonProperty("Order") Integer order,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") String completeCondParams,
        @JsonProperty("AwardItemTid1") Integer awardItemTid1,
        @JsonProperty("AwardItemNum1") Integer awardItemNum1,
        @JsonProperty("AwardItemTid2") Integer awardItemTid2,
        @JsonProperty("AwardItemNum2") Integer awardItemNum2
    ) {
        this.id = id;
        this.groupId = groupId;
        this.title = title;
        this.order = order;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams;
        this.awardItemTid1 = awardItemTid1;
        this.awardItemNum1 = awardItemNum1;
        this.awardItemTid2 = awardItemTid2;
        this.awardItemNum2 = awardItemNum2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public String getCompleteCondParams() {
        return this.completeCondParams;
    }

    public Integer getAwardItemTid1() {
        return this.awardItemTid1;
    }

    public Integer getAwardItemNum1() {
        return this.awardItemNum1;
    }

    public Integer getAwardItemTid2() {
        return this.awardItemTid2;
    }

    public Integer getAwardItemNum2() {
        return this.awardItemNum2;
    }

}
