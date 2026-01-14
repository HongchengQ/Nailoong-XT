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
 * 对应文件: CharPotential.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharPotentialConfig {

    private final Integer id;
    private final List<Integer> masterSpecificPotentialIds;
    private final List<Integer> assistSpecificPotentialIds;
    private final List<Integer> commonPotentialIds;
    private final List<Integer> masterNormalPotentialIds;
    private final List<Integer> assistNormalPotentialIds;

    @JsonCreator
    public CharPotentialConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MasterSpecificPotentialIds") List<Integer> masterSpecificPotentialIds,
        @JsonProperty("AssistSpecificPotentialIds") List<Integer> assistSpecificPotentialIds,
        @JsonProperty("CommonPotentialIds") List<Integer> commonPotentialIds,
        @JsonProperty("MasterNormalPotentialIds") List<Integer> masterNormalPotentialIds,
        @JsonProperty("AssistNormalPotentialIds") List<Integer> assistNormalPotentialIds
    ) {
        this.id = id;
        this.masterSpecificPotentialIds = masterSpecificPotentialIds != null ? 
            new ArrayList<>(masterSpecificPotentialIds) : 
            new ArrayList<>();
        this.assistSpecificPotentialIds = assistSpecificPotentialIds != null ? 
            new ArrayList<>(assistSpecificPotentialIds) : 
            new ArrayList<>();
        this.commonPotentialIds = commonPotentialIds != null ? 
            new ArrayList<>(commonPotentialIds) : 
            new ArrayList<>();
        this.masterNormalPotentialIds = masterNormalPotentialIds != null ? 
            new ArrayList<>(masterNormalPotentialIds) : 
            new ArrayList<>();
        this.assistNormalPotentialIds = assistNormalPotentialIds != null ? 
            new ArrayList<>(assistNormalPotentialIds) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getMasterSpecificPotentialIds() {
        return this.masterSpecificPotentialIds;
    }

    public List<Integer> getAssistSpecificPotentialIds() {
        return this.assistSpecificPotentialIds;
    }

    public List<Integer> getCommonPotentialIds() {
        return this.commonPotentialIds;
    }

    public List<Integer> getMasterNormalPotentialIds() {
        return this.masterNormalPotentialIds;
    }

    public List<Integer> getAssistNormalPotentialIds() {
        return this.assistNormalPotentialIds;
    }

}
