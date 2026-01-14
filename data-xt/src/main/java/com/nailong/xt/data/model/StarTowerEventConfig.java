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
 * 对应文件: StarTowerEvent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerEventConfig {

    private final Integer id;
    private final Integer optionsRulesId;
    private final String desc;
    private final Integer eventType;
    private final Integer guaranteedMapId;
    private final List<Integer> relatedNpCs;
    private final Integer eventResType;

    @JsonCreator
    public StarTowerEventConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("OptionsRulesId") Integer optionsRulesId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("EventType") Integer eventType,
        @JsonProperty("GuaranteedMapId") Integer guaranteedMapId,
        @JsonProperty("RelatedNPCs") List<Integer> relatedNpCs,
        @JsonProperty("EventResType") Integer eventResType
    ) {
        this.id = id;
        this.optionsRulesId = optionsRulesId;
        this.desc = desc;
        this.eventType = eventType;
        this.guaranteedMapId = guaranteedMapId;
        this.relatedNpCs = relatedNpCs != null ? 
            new ArrayList<>(relatedNpCs) : 
            new ArrayList<>();
        this.eventResType = eventResType;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getOptionsRulesId() {
        return this.optionsRulesId;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getEventType() {
        return this.eventType;
    }

    public Integer getGuaranteedMapId() {
        return this.guaranteedMapId;
    }

    public List<Integer> getRelatedNpCs() {
        return this.relatedNpCs;
    }

    public Integer getEventResType() {
        return this.eventResType;
    }

}
