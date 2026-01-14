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
 * 对应文件: Drop.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DropConfig {

    private final Integer dropId;
    private final Integer pkgId;

    @JsonCreator
    public DropConfig(
        @JsonProperty("DropId") Integer dropId,
        @JsonProperty("PkgId") Integer pkgId
    ) {
        this.dropId = dropId;
        this.pkgId = pkgId;
    }

    public Integer getDropId() {
        return this.dropId;
    }

    public Integer getPkgId() {
        return this.pkgId;
    }

}
