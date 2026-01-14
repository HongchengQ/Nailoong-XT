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
 * 对应文件: AreaEffect.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AreaEffectConfig {

    private final Integer areaTag;
    private final Integer maxCount;
    private final Integer overLimitType;

    @JsonCreator
    public AreaEffectConfig(
        @JsonProperty("AreaTag") Integer areaTag,
        @JsonProperty("MaxCount") Integer maxCount,
        @JsonProperty("OverLimitType") Integer overLimitType
    ) {
        this.areaTag = areaTag;
        this.maxCount = maxCount;
        this.overLimitType = overLimitType;
    }

    public Integer getAreaTag() {
        return this.areaTag;
    }

    public Integer getMaxCount() {
        return this.maxCount;
    }

    public Integer getOverLimitType() {
        return this.overLimitType;
    }

}
