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
 * 对应文件: StarTowerDropItem.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerDropItemConfig {

    private final Integer id;
    private final Integer type;
    private final List<Integer> dropSplitRange;
    private final List<Integer> rate;
    private final String model;

    @JsonCreator
    public StarTowerDropItemConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("DropSplitRange") List<Integer> dropSplitRange,
        @JsonProperty("Rate") List<Integer> rate,
        @JsonProperty("Model") String model
    ) {
        this.id = id;
        this.type = type;
        this.dropSplitRange = dropSplitRange != null ? 
            new ArrayList<>(dropSplitRange) : 
            new ArrayList<>();
        this.rate = rate != null ? 
            new ArrayList<>(rate) : 
            new ArrayList<>();
        this.model = model;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public List<Integer> getDropSplitRange() {
        return this.dropSplitRange;
    }

    public List<Integer> getRate() {
        return this.rate;
    }

    public String getModel() {
        return this.model;
    }

}
