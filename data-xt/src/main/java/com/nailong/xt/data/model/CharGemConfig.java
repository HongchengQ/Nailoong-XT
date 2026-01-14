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
 * 对应文件: CharGem.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGemConfig {

    private final Integer id;
    private final Integer generateCostTid;
    private final Integer refreshCostTid;
    private final String icon;
    private final String iconBg;
    private final Integer type;
    private final String title;
    private final String desc;

    @JsonCreator
    public CharGemConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GenerateCostTid") Integer generateCostTid,
        @JsonProperty("RefreshCostTid") Integer refreshCostTid,
        @JsonProperty("Icon") String icon,
        @JsonProperty("IconBg") String iconBg,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc
    ) {
        this.id = id;
        this.generateCostTid = generateCostTid;
        this.refreshCostTid = refreshCostTid;
        this.icon = icon;
        this.iconBg = iconBg;
        this.type = type;
        this.title = title;
        this.desc = desc;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGenerateCostTid() {
        return this.generateCostTid;
    }

    public Integer getRefreshCostTid() {
        return this.refreshCostTid;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIconBg() {
        return this.iconBg;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

}
