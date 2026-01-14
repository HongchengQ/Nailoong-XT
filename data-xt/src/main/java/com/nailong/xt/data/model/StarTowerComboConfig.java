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
 * 对应文件: StarTowerCombo.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerComboConfig {

    private final Integer id;
    private final List<Integer> battleLvs;

    @JsonCreator
    public StarTowerComboConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BattleLvs") List<Integer> battleLvs
    ) {
        this.id = id;
        this.battleLvs = battleLvs != null ? 
            new ArrayList<>(battleLvs) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getBattleLvs() {
        return this.battleLvs;
    }

}
