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
 * 对应文件: DropPkg.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DropPkgConfig {

    private final Integer pkgId;
    private final Integer itemId;

    @JsonCreator
    public DropPkgConfig(
        @JsonProperty("PkgId") Integer pkgId,
        @JsonProperty("ItemId") Integer itemId
    ) {
        this.pkgId = pkgId;
        this.itemId = itemId;
    }

    public Integer getPkgId() {
        return this.pkgId;
    }

    public Integer getItemId() {
        return this.itemId;
    }

}
