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
 * 对应文件: NpcAffinityPlot.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NpcAffinityPlotConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final String plotSum;
    private final String avgId;
    private final Integer npcId;
    private final Integer affinityLevel;
    private final Integer itemId;
    private final Integer itemQty;

    @JsonCreator
    public NpcAffinityPlotConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("PlotSum") String plotSum,
        @JsonProperty("avgId") String avgId,
        @JsonProperty("NPCId") Integer npcId,
        @JsonProperty("AffinityLevel") Integer affinityLevel,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.plotSum = plotSum;
        this.avgId = avgId;
        this.npcId = npcId;
        this.affinityLevel = affinityLevel;
        this.itemId = itemId;
        this.itemQty = itemQty;
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

    public String getPlotSum() {
        return this.plotSum;
    }

    public String getAvgId() {
        return this.avgId;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public Integer getAffinityLevel() {
        return this.affinityLevel;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

}
