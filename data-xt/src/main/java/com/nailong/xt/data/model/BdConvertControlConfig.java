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
 * 对应文件: BdConvertControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BdConvertControlConfig {

    private final Integer id;
    private final String uiAssets;
    private final String ctrlName;
    private final List<Integer> rewardsShow;
    private final String desText;

    @JsonCreator
    public BdConvertControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("RewardsShow") List<Integer> rewardsShow,
        @JsonProperty("DesText") String desText
    ) {
        this.id = id;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.rewardsShow = rewardsShow != null ? 
            new ArrayList<>(rewardsShow) : 
            new ArrayList<>();
        this.desText = desText;
    }

    public Integer getId() {
        return this.id;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public List<Integer> getRewardsShow() {
        return this.rewardsShow;
    }

    public String getDesText() {
        return this.desText;
    }

}
