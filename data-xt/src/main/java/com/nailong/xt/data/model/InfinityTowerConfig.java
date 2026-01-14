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
 * 对应文件: InfinityTower.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InfinityTowerConfig {

    private final Integer id;
    private final String name;
    private final Integer elementType;
    private final String formationSceneName;
    private final String bg;
    private final List<Integer> openDay;
    private final String openDayDesc;
    private final Integer preTowerLevelId;

    @JsonCreator
    public InfinityTowerConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("ElementType") Integer elementType,
        @JsonProperty("FormationSceneName") String formationSceneName,
        @JsonProperty("Bg") String bg,
        @JsonProperty("OpenDay") List<Integer> openDay,
        @JsonProperty("OpenDayDesc") String openDayDesc,
        @JsonProperty("PreTowerLevelId") Integer preTowerLevelId
    ) {
        this.id = id;
        this.name = name;
        this.elementType = elementType;
        this.formationSceneName = formationSceneName;
        this.bg = bg;
        this.openDay = openDay != null ? 
            new ArrayList<>(openDay) : 
            new ArrayList<>();
        this.openDayDesc = openDayDesc;
        this.preTowerLevelId = preTowerLevelId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getElementType() {
        return this.elementType;
    }

    public String getFormationSceneName() {
        return this.formationSceneName;
    }

    public String getBg() {
        return this.bg;
    }

    public List<Integer> getOpenDay() {
        return this.openDay;
    }

    public String getOpenDayDesc() {
        return this.openDayDesc;
    }

    public Integer getPreTowerLevelId() {
        return this.preTowerLevelId;
    }

}
