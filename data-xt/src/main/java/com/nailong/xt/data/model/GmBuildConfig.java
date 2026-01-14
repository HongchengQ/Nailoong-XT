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
 * 对应文件: GmBuild.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GmBuildConfig {

    private final Integer id;
    private final String buildData;

    @JsonCreator
    public GmBuildConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BuildData") String buildData
    ) {
        this.id = id;
        this.buildData = buildData;
    }

    public Integer getId() {
        return this.id;
    }

    public String getBuildData() {
        return this.buildData;
    }

}
