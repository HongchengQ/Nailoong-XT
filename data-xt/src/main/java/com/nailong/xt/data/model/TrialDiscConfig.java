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
 * 对应文件: TrialDisc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialDiscConfig {

    private final Integer id;
    private final Integer discId;
    private final Integer phase;
    private final Integer level;
    private final Integer star;

    @JsonCreator
    public TrialDiscConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("DiscId") Integer discId,
        @JsonProperty("Phase") Integer phase,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Star") Integer star
    ) {
        this.id = id;
        this.discId = discId;
        this.phase = phase;
        this.level = level;
        this.star = star;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDiscId() {
        return this.discId;
    }

    public Integer getPhase() {
        return this.phase;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getStar() {
        return this.star;
    }

}
