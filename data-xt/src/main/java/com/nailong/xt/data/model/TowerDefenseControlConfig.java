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
 * 对应文件: TowerDefenseControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseControlConfig {

    private final Integer id;
    private final String uiAssets;
    private final String ctrlName;
    private final String rewardsShow;
    private final String desText;
    private final String fastEntranceIcon;

    @JsonCreator
    public TowerDefenseControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("RewardsShow") String rewardsShow,
        @JsonProperty("DesText") String desText,
        @JsonProperty("FastEntranceIcon") String fastEntranceIcon
    ) {
        this.id = id;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.rewardsShow = rewardsShow;
        this.desText = desText;
        this.fastEntranceIcon = fastEntranceIcon;
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

    public String getRewardsShow() {
        return this.rewardsShow;
    }

    public String getDesText() {
        return this.desText;
    }

    public String getFastEntranceIcon() {
        return this.fastEntranceIcon;
    }

}
