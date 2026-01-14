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
 * 对应文件: VampireSurvivorLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireSurvivorLevelConfig {

    private final Integer groupId;
    private final Integer level;
    private final Integer exp;

    @JsonCreator
    public VampireSurvivorLevelConfig(
        @JsonProperty("GroupID") Integer groupId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Exp") Integer exp
    ) {
        this.groupId = groupId;
        this.level = level;
        this.exp = exp;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getExp() {
        return this.exp;
    }

}
