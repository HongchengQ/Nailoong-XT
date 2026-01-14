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
 * 对应文件: DailyQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyQuestConfig {

    private final Integer id;
    private final String title;
    private final String desc;
    private final Integer order;
    private final Integer active;
    private final Boolean apear;
    private final Integer completeCond;
    private final String completeCondParams;
    private final Integer itemTid;
    private final Integer itemQty;
    private final Integer jumpTo;
    private final Integer completeCondClient;

    @JsonCreator
    public DailyQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Order") Integer order,
        @JsonProperty("Active") Integer active,
        @JsonProperty("Apear") Boolean apear,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") String completeCondParams,
        @JsonProperty("ItemTid") Integer itemTid,
        @JsonProperty("ItemQty") Integer itemQty,
        @JsonProperty("JumpTo") Integer jumpTo,
        @JsonProperty("CompleteCondClient") Integer completeCondClient
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.order = order;
        this.active = active;
        this.apear = apear;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams;
        this.itemTid = itemTid;
        this.itemQty = itemQty;
        this.jumpTo = jumpTo;
        this.completeCondClient = completeCondClient;
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

    public Integer getOrder() {
        return this.order;
    }

    public Integer getActive() {
        return this.active;
    }

    public Boolean getApear() {
        return this.apear;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public String getCompleteCondParams() {
        return this.completeCondParams;
    }

    public Integer getItemTid() {
        return this.itemTid;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

    public Integer getJumpTo() {
        return this.jumpTo;
    }

    public Integer getCompleteCondClient() {
        return this.completeCondClient;
    }

}
