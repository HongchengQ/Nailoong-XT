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
 * 对应文件: AffinityQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AffinityQuestConfig {

    private final Integer id;
    private final String desc;
    private final Integer sortId;
    private final Integer charId;
    private final Integer completeCond;
    private final String completeCondParams;
    private final Integer affinityExp;
    private final String param1;
    private final String param2;

    @JsonCreator
    public AffinityQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") String completeCondParams,
        @JsonProperty("AffinityExp") Integer affinityExp,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2
    ) {
        this.id = id;
        this.desc = desc;
        this.sortId = sortId;
        this.charId = charId;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams;
        this.affinityExp = affinityExp;
        this.param1 = param1;
        this.param2 = param2;
    }

    public Integer getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public String getCompleteCondParams() {
        return this.completeCondParams;
    }

    public Integer getAffinityExp() {
        return this.affinityExp;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

}
