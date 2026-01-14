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
 * 对应文件: ScoreBossStar.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossStarConfig {

    private final Integer star;
    private final Integer scoreNeed;

    @JsonCreator
    public ScoreBossStarConfig(
        @JsonProperty("Star") Integer star,
        @JsonProperty("ScoreNeed") Integer scoreNeed
    ) {
        this.star = star;
        this.scoreNeed = scoreNeed;
    }

    public Integer getStar() {
        return this.star;
    }

    public Integer getScoreNeed() {
        return this.scoreNeed;
    }

}
