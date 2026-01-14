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
 * 对应文件: StarTowerMapMaxNumPerStage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerMapMaxNumPerStageConfig {

    private final Integer id;
    private final Integer maxNumPerStage;

    @JsonCreator
    public StarTowerMapMaxNumPerStageConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MaxNumPerStage") Integer maxNumPerStage
    ) {
        this.id = id;
        this.maxNumPerStage = maxNumPerStage;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMaxNumPerStage() {
        return this.maxNumPerStage;
    }

}
