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
 * 对应文件: InfinityTowerAffix.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerAffixConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final List<Integer> addCamp;
    private final Integer triggerCondition;
    private final String triggerParam;
    private final String param1;
    private final String param2;
    private final String param3;

    @JsonCreator
    public InfinityTowerAffixConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("AddCamp") List<Integer> addCamp,
        @JsonProperty("TriggerCondition") Integer triggerCondition,
        @JsonProperty("TriggerParam") String triggerParam,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.addCamp = addCamp != null ? 
            new ArrayList<>(addCamp) : 
            new ArrayList<>();
        this.triggerCondition = triggerCondition;
        this.triggerParam = triggerParam;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<Integer> getAddCamp() {
        return this.addCamp;
    }

    public Integer getTriggerCondition() {
        return this.triggerCondition;
    }

    public String getTriggerParam() {
        return this.triggerParam;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

}
