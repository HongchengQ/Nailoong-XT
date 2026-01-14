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
 * 对应文件: AgentSpecialPerformance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AgentSpecialPerformanceConfig {

    private final Integer id;
    private final List<Integer> charId;
    private final Integer weight;
    private final String avg;
    private final String avgGroupId;

    @JsonCreator
    public AgentSpecialPerformanceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") List<Integer> charId,
        @JsonProperty("Weight") Integer weight,
        @JsonProperty("Avg") String avg,
        @JsonProperty("AVGGroupId") String avgGroupId
    ) {
        this.id = id;
        this.charId = charId != null ? 
            new ArrayList<>(charId) : 
            new ArrayList<>();
        this.weight = weight;
        this.avg = avg;
        this.avgGroupId = avgGroupId;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getCharId() {
        return this.charId;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getAvg() {
        return this.avg;
    }

    public String getAvgGroupId() {
        return this.avgGroupId;
    }

}
