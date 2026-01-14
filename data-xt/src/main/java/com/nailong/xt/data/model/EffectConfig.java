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
 * 对应文件: Effect.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EffectConfig {

    private final Integer id;
    private final Integer trigger;
    private final Integer triggerTarget;
    private final Integer triggerCondition1;
    private final Integer triggerLogicType;
    private final Integer takeEffectTarget1;
    private final Integer takeEffectCondition1;
    private final Integer takeEffectLogicType;
    private final Integer target1;
    private final Integer targetCondition1;
    private final Integer filterLogicType;
    private final Integer levelTypeData;
    private final Integer levelData;
    private final Integer mainOrSupport;
    private final String name;
    private final String triggerParam1;
    private final String takeEffectParam1;
    private final String takeEffectParam2;
    private final Integer triggerTarget2;
    private final Integer triggerCondition2;
    private final String trigger2Param1;
    private final String triggerParam2;
    private final Integer takeEffectTarget2;
    private final Integer takeEffectCondition2;
    private final String takeEffect2Param1;
    private final String takeEffect2Param2;
    private final String targetParam1;

    @JsonCreator
    public EffectConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Trigger") Integer trigger,
        @JsonProperty("TriggerTarget") Integer triggerTarget,
        @JsonProperty("TriggerCondition1") Integer triggerCondition1,
        @JsonProperty("TriggerLogicType") Integer triggerLogicType,
        @JsonProperty("TakeEffectTarget1") Integer takeEffectTarget1,
        @JsonProperty("TakeEffectCondition1") Integer takeEffectCondition1,
        @JsonProperty("TakeEffectLogicType") Integer takeEffectLogicType,
        @JsonProperty("Target1") Integer target1,
        @JsonProperty("TargetCondition1") Integer targetCondition1,
        @JsonProperty("FilterLogicType") Integer filterLogicType,
        @JsonProperty("levelTypeData") Integer levelTypeData,
        @JsonProperty("LevelData") Integer levelData,
        @JsonProperty("MainOrSupport") Integer mainOrSupport,
        @JsonProperty("Name") String name,
        @JsonProperty("TriggerParam1") String triggerParam1,
        @JsonProperty("TakeEffectParam1") String takeEffectParam1,
        @JsonProperty("TakeEffectParam2") String takeEffectParam2,
        @JsonProperty("TriggerTarget2") Integer triggerTarget2,
        @JsonProperty("TriggerCondition2") Integer triggerCondition2,
        @JsonProperty("Trigger2Param1") String trigger2Param1,
        @JsonProperty("TriggerParam2") String triggerParam2,
        @JsonProperty("TakeEffectTarget2") Integer takeEffectTarget2,
        @JsonProperty("TakeEffectCondition2") Integer takeEffectCondition2,
        @JsonProperty("TakeEffect2Param1") String takeEffect2Param1,
        @JsonProperty("TakeEffect2Param2") String takeEffect2Param2,
        @JsonProperty("TargetParam1") String targetParam1
    ) {
        this.id = id;
        this.trigger = trigger;
        this.triggerTarget = triggerTarget;
        this.triggerCondition1 = triggerCondition1;
        this.triggerLogicType = triggerLogicType;
        this.takeEffectTarget1 = takeEffectTarget1;
        this.takeEffectCondition1 = takeEffectCondition1;
        this.takeEffectLogicType = takeEffectLogicType;
        this.target1 = target1;
        this.targetCondition1 = targetCondition1;
        this.filterLogicType = filterLogicType;
        this.levelTypeData = levelTypeData;
        this.levelData = levelData;
        this.mainOrSupport = mainOrSupport;
        this.name = name;
        this.triggerParam1 = triggerParam1;
        this.takeEffectParam1 = takeEffectParam1;
        this.takeEffectParam2 = takeEffectParam2;
        this.triggerTarget2 = triggerTarget2;
        this.triggerCondition2 = triggerCondition2;
        this.trigger2Param1 = trigger2Param1;
        this.triggerParam2 = triggerParam2;
        this.takeEffectTarget2 = takeEffectTarget2;
        this.takeEffectCondition2 = takeEffectCondition2;
        this.takeEffect2Param1 = takeEffect2Param1;
        this.takeEffect2Param2 = takeEffect2Param2;
        this.targetParam1 = targetParam1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTrigger() {
        return this.trigger;
    }

    public Integer getTriggerTarget() {
        return this.triggerTarget;
    }

    public Integer getTriggerCondition1() {
        return this.triggerCondition1;
    }

    public Integer getTriggerLogicType() {
        return this.triggerLogicType;
    }

    public Integer getTakeEffectTarget1() {
        return this.takeEffectTarget1;
    }

    public Integer getTakeEffectCondition1() {
        return this.takeEffectCondition1;
    }

    public Integer getTakeEffectLogicType() {
        return this.takeEffectLogicType;
    }

    public Integer getTarget1() {
        return this.target1;
    }

    public Integer getTargetCondition1() {
        return this.targetCondition1;
    }

    public Integer getFilterLogicType() {
        return this.filterLogicType;
    }

    public Integer getLevelTypeData() {
        return this.levelTypeData;
    }

    public Integer getLevelData() {
        return this.levelData;
    }

    public Integer getMainOrSupport() {
        return this.mainOrSupport;
    }

    public String getName() {
        return this.name;
    }

    public String getTriggerParam1() {
        return this.triggerParam1;
    }

    public String getTakeEffectParam1() {
        return this.takeEffectParam1;
    }

    public String getTakeEffectParam2() {
        return this.takeEffectParam2;
    }

    public Integer getTriggerTarget2() {
        return this.triggerTarget2;
    }

    public Integer getTriggerCondition2() {
        return this.triggerCondition2;
    }

    public String getTrigger2Param1() {
        return this.trigger2Param1;
    }

    public String getTriggerParam2() {
        return this.triggerParam2;
    }

    public Integer getTakeEffectTarget2() {
        return this.takeEffectTarget2;
    }

    public Integer getTakeEffectCondition2() {
        return this.takeEffectCondition2;
    }

    public String getTakeEffect2Param1() {
        return this.takeEffect2Param1;
    }

    public String getTakeEffect2Param2() {
        return this.takeEffect2Param2;
    }

    public String getTargetParam1() {
        return this.targetParam1;
    }

}
