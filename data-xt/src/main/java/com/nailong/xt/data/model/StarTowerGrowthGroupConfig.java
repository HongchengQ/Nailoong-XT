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
 * 对应文件: StarTowerGrowthGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerGrowthGroupConfig {

    private final Integer id;
    private final Integer worldClass;
    private final String name;
    private final Integer preGroup;

    @JsonCreator
    public StarTowerGrowthGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("WorldClass") Integer worldClass,
        @JsonProperty("Name") String name,
        @JsonProperty("PreGroup") Integer preGroup
    ) {
        this.id = id;
        this.worldClass = worldClass;
        this.name = name;
        this.preGroup = preGroup;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getWorldClass() {
        return this.worldClass;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPreGroup() {
        return this.preGroup;
    }

}
