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
 * 对应文件: LoginRewardControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class LoginRewardControlConfig {

    private final Integer id;
    private final Integer rewardsGroup;
    private final String desText;
    private final String uiAssets;
    private final String ctrlName;
    private final String popUpUiAssets;

    @JsonCreator
    public LoginRewardControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("RewardsGroup") Integer rewardsGroup,
        @JsonProperty("DesText") String desText,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("PopUpUIAssets") String popUpUiAssets
    ) {
        this.id = id;
        this.rewardsGroup = rewardsGroup;
        this.desText = desText;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.popUpUiAssets = popUpUiAssets;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRewardsGroup() {
        return this.rewardsGroup;
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

    public String getPopUpUiAssets() {
        return this.popUpUiAssets;
    }

}
