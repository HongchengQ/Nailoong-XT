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
 * 对应文件: Guide.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GuideConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer step;
    private final Integer type;
    private final Integer guideTrigger;
    private final String triggerParams;
    private final Integer endType;
    private final List<String> bindIcon;
    private final List<Integer> size;
    private final List<Integer> deviation;
    private final String head;
    private final String desc;
    private final List<Integer> descDeviation;
    private final List<Integer> handDeviation;
    private final Integer handRotation;
    private final Boolean isActive;
    private final Integer delay;
    private final Integer guidePrepose;
    private final String preposeParams;
    private final Integer dictionary;

    @JsonCreator
    public GuideConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Step") Integer step,
        @JsonProperty("Type") Integer type,
        @JsonProperty("GuideTrigger") Integer guideTrigger,
        @JsonProperty("TriggerParams") String triggerParams,
        @JsonProperty("EndType") Integer endType,
        @JsonProperty("BindIcon") List<String> bindIcon,
        @JsonProperty("Size") List<Integer> size,
        @JsonProperty("Deviation") List<Integer> deviation,
        @JsonProperty("Head") String head,
        @JsonProperty("Desc") String desc,
        @JsonProperty("DescDeviation") List<Integer> descDeviation,
        @JsonProperty("HandDeviation") List<Integer> handDeviation,
        @JsonProperty("HandRotation") Integer handRotation,
        @JsonProperty("IsActive") Boolean isActive,
        @JsonProperty("Delay") Integer delay,
        @JsonProperty("GuidePrepose") Integer guidePrepose,
        @JsonProperty("PreposeParams") String preposeParams,
        @JsonProperty("Dictionary") Integer dictionary
    ) {
        this.id = id;
        this.groupId = groupId;
        this.step = step;
        this.type = type;
        this.guideTrigger = guideTrigger;
        this.triggerParams = triggerParams;
        this.endType = endType;
        this.bindIcon = bindIcon != null ? 
            new ArrayList<>(bindIcon) : 
            new ArrayList<>();
        this.size = size != null ? 
            new ArrayList<>(size) : 
            new ArrayList<>();
        this.deviation = deviation != null ? 
            new ArrayList<>(deviation) : 
            new ArrayList<>();
        this.head = head;
        this.desc = desc;
        this.descDeviation = descDeviation != null ? 
            new ArrayList<>(descDeviation) : 
            new ArrayList<>();
        this.handDeviation = handDeviation != null ? 
            new ArrayList<>(handDeviation) : 
            new ArrayList<>();
        this.handRotation = handRotation;
        this.isActive = isActive;
        this.delay = delay;
        this.guidePrepose = guidePrepose;
        this.preposeParams = preposeParams;
        this.dictionary = dictionary;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getStep() {
        return this.step;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getGuideTrigger() {
        return this.guideTrigger;
    }

    public String getTriggerParams() {
        return this.triggerParams;
    }

    public Integer getEndType() {
        return this.endType;
    }

    public List<String> getBindIcon() {
        return this.bindIcon;
    }

    public List<Integer> getSize() {
        return this.size;
    }

    public List<Integer> getDeviation() {
        return this.deviation;
    }

    public String getHead() {
        return this.head;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<Integer> getDescDeviation() {
        return this.descDeviation;
    }

    public List<Integer> getHandDeviation() {
        return this.handDeviation;
    }

    public Integer getHandRotation() {
        return this.handRotation;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public Integer getDelay() {
        return this.delay;
    }

    public Integer getGuidePrepose() {
        return this.guidePrepose;
    }

    public String getPreposeParams() {
        return this.preposeParams;
    }

    public Integer getDictionary() {
        return this.dictionary;
    }

}
