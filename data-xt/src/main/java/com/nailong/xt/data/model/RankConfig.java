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
 * 对应文件: Rank.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class RankConfig {

    private final Integer rank;
    private final Integer exp;

    @JsonCreator
    public RankConfig(
        @JsonProperty("Rank") Integer rank,
        @JsonProperty("Exp") Integer exp
    ) {
        this.rank = rank;
        this.exp = exp;
    }

    public Integer getRank() {
        return this.rank;
    }

    public Integer getExp() {
        return this.exp;
    }

}
