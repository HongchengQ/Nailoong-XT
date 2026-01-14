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
 * 对应文件: OpenFunc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class OpenFuncConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final String tips;
    private final String param1;
    private final Boolean popWindows;
    private final String icon;
    private final Integer needWorldClass;

    @JsonCreator
    public OpenFuncConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Tips") String tips,
        @JsonProperty("Param1") String param1,
        @JsonProperty("PopWindows") Boolean popWindows,
        @JsonProperty("Icon") String icon,
        @JsonProperty("NeedWorldClass") Integer needWorldClass
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.tips = tips;
        this.param1 = param1;
        this.popWindows = popWindows;
        this.icon = icon;
        this.needWorldClass = needWorldClass;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getTips() {
        return this.tips;
    }

    public String getParam1() {
        return this.param1;
    }

    public Boolean getPopWindows() {
        return this.popWindows;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

}
