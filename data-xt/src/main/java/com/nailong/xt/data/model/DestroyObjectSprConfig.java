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
 * 对应文件: DestroyObjectSpr.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DestroyObjectSprConfig {

    private final Integer id;
    private final Integer score;

    @JsonCreator
    public DestroyObjectSprConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("score") Integer score
    ) {
        this.id = id;
        this.score = score;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getScore() {
        return this.score;
    }

}
