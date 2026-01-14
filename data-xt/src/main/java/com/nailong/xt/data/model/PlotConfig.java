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
 * 对应文件: Plot.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PlotConfig {

    private final Integer id;
    private final Integer charField;
    private final String name;
    private final String desc;
    private final String avgId;
    private final Integer unlockAffinityLevel;
    private final String rewards;
    private final String picSource;
    private final Integer prePlot;

    @JsonCreator
    public PlotConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Char") Integer charField,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("AvgId") String avgId,
        @JsonProperty("UnlockAffinityLevel") Integer unlockAffinityLevel,
        @JsonProperty("Rewards") String rewards,
        @JsonProperty("PicSource") String picSource,
        @JsonProperty("PrePlot") Integer prePlot
    ) {
        this.id = id;
        this.charField = charField;
        this.name = name;
        this.desc = desc;
        this.avgId = avgId;
        this.unlockAffinityLevel = unlockAffinityLevel;
        this.rewards = rewards;
        this.picSource = picSource;
        this.prePlot = prePlot;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharField() {
        return this.charField;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getAvgId() {
        return this.avgId;
    }

    public Integer getUnlockAffinityLevel() {
        return this.unlockAffinityLevel;
    }

    public String getRewards() {
        return this.rewards;
    }

    public String getPicSource() {
        return this.picSource;
    }

    public Integer getPrePlot() {
        return this.prePlot;
    }

}
