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
 * 对应文件: TrialControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialControlConfig {

    private final Integer id;
    private final List<Integer> groupIds;
    private final List<Integer> gachas;
    private final String uiAssets;
    private final String ctrlName;

    @JsonCreator
    public TrialControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupIds") List<Integer> groupIds,
        @JsonProperty("Gachas") List<Integer> gachas,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName
    ) {
        this.id = id;
        this.groupIds = groupIds != null ? 
            new ArrayList<>(groupIds) : 
            new ArrayList<>();
        this.gachas = gachas != null ? 
            new ArrayList<>(gachas) : 
            new ArrayList<>();
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getGroupIds() {
        return this.groupIds;
    }

    public List<Integer> getGachas() {
        return this.gachas;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

}
