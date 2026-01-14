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
 * 对应文件: LevelQuestTarget.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class LevelQuestTargetConfig {

    private final Integer id;
    private final Integer questType;
    private final String questDes;
    private final String param1;
    private final String param2;
    private final List<String> param5;
    private final String param3;

    @JsonCreator
    public LevelQuestTargetConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("QuestType") Integer questType,
        @JsonProperty("QuestDes") String questDes,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param5") List<String> param5,
        @JsonProperty("Param3") String param3
    ) {
        this.id = id;
        this.questType = questType;
        this.questDes = questDes;
        this.param1 = param1;
        this.param2 = param2;
        this.param5 = param5 != null ? 
            new ArrayList<>(param5) : 
            new ArrayList<>();
        this.param3 = param3;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getQuestType() {
        return this.questType;
    }

    public String getQuestDes() {
        return this.questDes;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public List<String> getParam5() {
        return this.param5;
    }

    public String getParam3() {
        return this.param3;
    }

}
