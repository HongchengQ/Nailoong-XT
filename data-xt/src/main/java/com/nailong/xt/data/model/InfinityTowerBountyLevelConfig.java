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
 * 对应文件: InfinityTowerBountyLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerBountyLevelConfig {

    private final Integer id;
    private final Integer level;
    private final Integer cond1;
    private final List<Integer> condParam1;
    private final String condDesc1;
    private final Integer cond2;
    private final List<Integer> condParam2;
    private final String condDesc2;

    @JsonCreator
    public InfinityTowerBountyLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Cond1") Integer cond1,
        @JsonProperty("CondParam1") List<Integer> condParam1,
        @JsonProperty("CondDesc1") String condDesc1,
        @JsonProperty("Cond2") Integer cond2,
        @JsonProperty("CondParam2") List<Integer> condParam2,
        @JsonProperty("CondDesc2") String condDesc2
    ) {
        this.id = id;
        this.level = level;
        this.cond1 = cond1;
        this.condParam1 = condParam1 != null ? 
            new ArrayList<>(condParam1) : 
            new ArrayList<>();
        this.condDesc1 = condDesc1;
        this.cond2 = cond2;
        this.condParam2 = condParam2 != null ? 
            new ArrayList<>(condParam2) : 
            new ArrayList<>();
        this.condDesc2 = condDesc2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getCond1() {
        return this.cond1;
    }

    public List<Integer> getCondParam1() {
        return this.condParam1;
    }

    public String getCondDesc1() {
        return this.condDesc1;
    }

    public Integer getCond2() {
        return this.cond2;
    }

    public List<Integer> getCondParam2() {
        return this.condParam2;
    }

    public String getCondDesc2() {
        return this.condDesc2;
    }

}
