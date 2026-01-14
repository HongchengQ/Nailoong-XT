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
 * 对应文件: GmOrder.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GmOrderConfig {

    private final String order;
    private final String desc;
    private final Integer paramCount;
    private final String paramName1;
    private final String paramName2;
    private final String paramName3;
    private final String paramName4;

    @JsonCreator
    public GmOrderConfig(
        @JsonProperty("Order") String order,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ParamCount") Integer paramCount,
        @JsonProperty("ParamName1") String paramName1,
        @JsonProperty("ParamName2") String paramName2,
        @JsonProperty("ParamName3") String paramName3,
        @JsonProperty("ParamName4") String paramName4
    ) {
        this.order = order;
        this.desc = desc;
        this.paramCount = paramCount;
        this.paramName1 = paramName1;
        this.paramName2 = paramName2;
        this.paramName3 = paramName3;
        this.paramName4 = paramName4;
    }

    public String getOrder() {
        return this.order;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getParamCount() {
        return this.paramCount;
    }

    public String getParamName1() {
        return this.paramName1;
    }

    public String getParamName2() {
        return this.paramName2;
    }

    public String getParamName3() {
        return this.paramName3;
    }

    public String getParamName4() {
        return this.paramName4;
    }

}
