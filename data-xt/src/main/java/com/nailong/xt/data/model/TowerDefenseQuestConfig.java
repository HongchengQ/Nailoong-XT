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
 * 对应文件: TowerDefenseQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseQuestConfig {

    private final Integer id;
    private final Integer questGroupId;
    private final Integer questType;
    private final List<Integer> questParam;
    private final String desc;
    private final Integer item1;
    private final Integer qty1;

    @JsonCreator
    public TowerDefenseQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("QuestGroupId") Integer questGroupId,
        @JsonProperty("QuestType") Integer questType,
        @JsonProperty("QuestParam") List<Integer> questParam,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Qty1") Integer qty1
    ) {
        this.id = id;
        this.questGroupId = questGroupId;
        this.questType = questType;
        this.questParam = questParam != null ? 
            new ArrayList<>(questParam) : 
            new ArrayList<>();
        this.desc = desc;
        this.item1 = item1;
        this.qty1 = qty1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getQuestGroupId() {
        return this.questGroupId;
    }

    public Integer getQuestType() {
        return this.questType;
    }

    public List<Integer> getQuestParam() {
        return this.questParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

}
