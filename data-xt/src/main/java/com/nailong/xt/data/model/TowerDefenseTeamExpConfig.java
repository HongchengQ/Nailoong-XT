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
 * 对应文件: TowerDefenseTeamExp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseTeamExpConfig {

    private final Integer id;
    private final Integer floorId;
    private final Integer lv;
    private final Integer exp;

    @JsonCreator
    public TowerDefenseTeamExpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("Lv") Integer lv,
        @JsonProperty("Exp") Integer exp
    ) {
        this.id = id;
        this.floorId = floorId;
        this.lv = lv;
        this.exp = exp;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getLv() {
        return this.lv;
    }

    public Integer getExp() {
        return this.exp;
    }

}
