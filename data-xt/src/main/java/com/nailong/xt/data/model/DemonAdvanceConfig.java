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
 * 对应文件: DemonAdvance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DemonAdvanceConfig {

    private final Integer id;
    private final String advanceName;
    private final List<Integer> levelRange;

    @JsonCreator
    public DemonAdvanceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AdvanceName") String advanceName,
        @JsonProperty("LevelRange") List<Integer> levelRange
    ) {
        this.id = id;
        this.advanceName = advanceName;
        this.levelRange = levelRange != null ? 
            new ArrayList<>(levelRange) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getAdvanceName() {
        return this.advanceName;
    }

    public List<Integer> getLevelRange() {
        return this.levelRange;
    }

}
