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
 * 对应文件: DiscStrengthen.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscStrengthenConfig {

    private final Integer id;
    private final Integer exp;

    @JsonCreator
    public DiscStrengthenConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Exp") Integer exp
    ) {
        this.id = id;
        this.exp = exp;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getExp() {
        return this.exp;
    }

}
