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
 * 对应文件: GachaPkg.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaPkgConfig {

    private final Integer pkgId;
    private final Integer goodsId;
    private final Integer weight;

    @JsonCreator
    public GachaPkgConfig(
        @JsonProperty("PkgId") Integer pkgId,
        @JsonProperty("GoodsId") Integer goodsId,
        @JsonProperty("Weight") Integer weight
    ) {
        this.pkgId = pkgId;
        this.goodsId = goodsId;
        this.weight = weight;
    }

    public Integer getPkgId() {
        return this.pkgId;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
