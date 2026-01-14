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
 * 对应文件: MiningControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MiningControlConfig {

    private final Integer id;
    private final Integer useType;
    private final String uiAssets;
    private final String ctrlName;
    private final Integer digConsumeItemId;
    private final Integer configMaxLayer;
    private final String gridListPrefab;

    @JsonCreator
    public MiningControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("UseType") Integer useType,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("DigConsumeItemId") Integer digConsumeItemId,
        @JsonProperty("ConfigMaxLayer") Integer configMaxLayer,
        @JsonProperty("GridListPrefab") String gridListPrefab
    ) {
        this.id = id;
        this.useType = useType;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.digConsumeItemId = digConsumeItemId;
        this.configMaxLayer = configMaxLayer;
        this.gridListPrefab = gridListPrefab;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getUseType() {
        return this.useType;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public Integer getDigConsumeItemId() {
        return this.digConsumeItemId;
    }

    public Integer getConfigMaxLayer() {
        return this.configMaxLayer;
    }

    public String getGridListPrefab() {
        return this.gridListPrefab;
    }

}
