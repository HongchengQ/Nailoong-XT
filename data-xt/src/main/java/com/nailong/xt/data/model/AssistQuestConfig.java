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
 * 对应文件: AssistQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AssistQuestConfig {

    private final Integer id;
    private final Integer questGroup;
    private final String title;
    private final Integer jumpTo;
    private final Integer item1;
    private final Integer qty1;
    private final Integer item2;
    private final Integer qty2;

    @JsonCreator
    public AssistQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("QuestGroup") Integer questGroup,
        @JsonProperty("Title") String title,
        @JsonProperty("JumpTo") Integer jumpTo,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Item2") Integer item2,
        @JsonProperty("Qty2") Integer qty2
    ) {
        this.id = id;
        this.questGroup = questGroup;
        this.title = title;
        this.jumpTo = jumpTo;
        this.item1 = item1;
        this.qty1 = qty1;
        this.item2 = item2;
        this.qty2 = qty2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getQuestGroup() {
        return this.questGroup;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getJumpTo() {
        return this.jumpTo;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getItem2() {
        return this.item2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

}
