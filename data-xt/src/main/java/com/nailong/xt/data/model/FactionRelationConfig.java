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
 * 对应文件: FactionRelation.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FactionRelationConfig {

    private final Integer id;
    private final List<Integer> factionRelationShip;

    @JsonCreator
    public FactionRelationConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FactionRelationShip") List<Integer> factionRelationShip
    ) {
        this.id = id;
        this.factionRelationShip = factionRelationShip != null ? 
            new ArrayList<>(factionRelationShip) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getFactionRelationShip() {
        return this.factionRelationShip;
    }

}
