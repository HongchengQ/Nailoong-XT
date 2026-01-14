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
 * 对应文件: CookiePackagePathsGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CookiePackagePathsGroupConfig {

    private final Integer id;
    private final Integer pathGroupId;
    private final String packagePathsResource;

    @JsonCreator
    public CookiePackagePathsGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("PathGroupId") Integer pathGroupId,
        @JsonProperty("PackagePathsResource") String packagePathsResource
    ) {
        this.id = id;
        this.pathGroupId = pathGroupId;
        this.packagePathsResource = packagePathsResource;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getPathGroupId() {
        return this.pathGroupId;
    }

    public String getPackagePathsResource() {
        return this.packagePathsResource;
    }

}
