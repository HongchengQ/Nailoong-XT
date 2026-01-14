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
 * 对应文件: WeeklyQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WeeklyQuestConfig {

    private final Integer id;
    private final String title;
    private final String desc;
    private final Integer active;
    private final Integer order;
    private final Boolean apear;
    private final Integer completeCond;
    private final String completeCondParams;
    private final Integer itemTid;
    private final Integer itemQty;
    private final List<Integer> prerequisites;
    private final Integer jumpTo;

    @JsonCreator
    public WeeklyQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Active") Integer active,
        @JsonProperty("Order") Integer order,
        @JsonProperty("Apear") Boolean apear,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") String completeCondParams,
        @JsonProperty("ItemTid") Integer itemTid,
        @JsonProperty("ItemQty") Integer itemQty,
        @JsonProperty("Prerequisites") List<Integer> prerequisites,
        @JsonProperty("JumpTo") Integer jumpTo
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.active = active;
        this.order = order;
        this.apear = apear;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams;
        this.itemTid = itemTid;
        this.itemQty = itemQty;
        this.prerequisites = prerequisites != null ? 
            new ArrayList<>(prerequisites) : 
            new ArrayList<>();
        this.jumpTo = jumpTo;
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

    public Integer getActive() {
        return this.active;
    }

    public Integer getOrder() {
        return this.order;
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

    public List<Integer> getPrerequisites() {
        return this.prerequisites;
    }

    public Integer getJumpTo() {
        return this.jumpTo;
    }

}
