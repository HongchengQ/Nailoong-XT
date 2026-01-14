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
 * 对应文件: PeriodicQuestControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PeriodicQuestControlConfig {

    private final Integer id;
    private final Integer finalReward1;
    private final Integer finalRewardQty1;
    private final String desText;
    private final String uiAssets;
    private final String ctrlName;
    private final Integer previewType;

    @JsonCreator
    public PeriodicQuestControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FinalReward1") Integer finalReward1,
        @JsonProperty("FinalRewardQty1") Integer finalRewardQty1,
        @JsonProperty("DesText") String desText,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("PreviewType") Integer previewType
    ) {
        this.id = id;
        this.finalReward1 = finalReward1;
        this.finalRewardQty1 = finalRewardQty1;
        this.desText = desText;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.previewType = previewType;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getFinalReward1() {
        return this.finalReward1;
    }

    public Integer getFinalRewardQty1() {
        return this.finalRewardQty1;
    }

    public String getDesText() {
        return this.desText;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public Integer getPreviewType() {
        return this.previewType;
    }

}
