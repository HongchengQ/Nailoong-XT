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
 * 对应文件: VampireEnemySpAttr.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireEnemySpAttrConfig {

    private final Integer id;
    private final List<Integer> refDistance;
    private final List<Integer> refInterval;

    @JsonCreator
    public VampireEnemySpAttrConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("RefDistance") List<Integer> refDistance,
        @JsonProperty("RefInterval") List<Integer> refInterval
    ) {
        this.id = id;
        this.refDistance = refDistance != null ? 
            new ArrayList<>(refDistance) : 
            new ArrayList<>();
        this.refInterval = refInterval != null ? 
            new ArrayList<>(refInterval) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getRefDistance() {
        return this.refDistance;
    }

    public List<Integer> getRefInterval() {
        return this.refInterval;
    }

}
