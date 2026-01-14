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
 * 对应文件: TowerDefenceCharacterAi.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenceCharacterAiConfig {

    private final Integer id;
    private final String comboGroupPath;
    private final String actionAiPath;
    private final String parallelAiPath;

    @JsonCreator
    public TowerDefenceCharacterAiConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ComboGroupPath") String comboGroupPath,
        @JsonProperty("ActionAIPath") String actionAiPath,
        @JsonProperty("ParallelAIPath") String parallelAiPath
    ) {
        this.id = id;
        this.comboGroupPath = comboGroupPath;
        this.actionAiPath = actionAiPath;
        this.parallelAiPath = parallelAiPath;
    }

    public Integer getId() {
        return this.id;
    }

    public String getComboGroupPath() {
        return this.comboGroupPath;
    }

    public String getActionAiPath() {
        return this.actionAiPath;
    }

    public String getParallelAiPath() {
        return this.parallelAiPath;
    }

}
