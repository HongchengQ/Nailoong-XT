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
 * 对应文件: Talent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TalentConfig {

    private final Integer id;
    private final Integer index;
    private final String title;
    private final Integer groupId;
    private final Integer type;
    private final Integer sort;
    private final List<Integer> effectId;
    private final String desc;
    private final String param1;
    private final Integer subType;
    private final Integer nodes;
    private final String param2;
    private final String param3;
    private final String param4;

    @JsonCreator
    public TalentConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Index") Integer index,
        @JsonProperty("Title") String title,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Param1") String param1,
        @JsonProperty("SubType") Integer subType,
        @JsonProperty("Nodes") Integer nodes,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4
    ) {
        this.id = id;
        this.index = index;
        this.title = title;
        this.groupId = groupId;
        this.type = type;
        this.sort = sort;
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.desc = desc;
        this.param1 = param1;
        this.subType = subType;
        this.nodes = nodes;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSort() {
        return this.sort;
    }

    public List<Integer> getEffectId() {
        return this.effectId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getParam1() {
        return this.param1;
    }

    public Integer getSubType() {
        return this.subType;
    }

    public Integer getNodes() {
        return this.nodes;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

}
