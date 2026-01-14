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
 * 对应文件: CookieControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CookieControlConfig {

    private final Integer id;
    private final String uiAssets;
    private final String ctrlName;
    private final String rewardsShow;

    @JsonCreator
    public CookieControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("RewardsShow") String rewardsShow
    ) {
        this.id = id;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.rewardsShow = rewardsShow;
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

}
