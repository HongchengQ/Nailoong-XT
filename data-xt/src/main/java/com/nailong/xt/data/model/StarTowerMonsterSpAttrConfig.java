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
 * 对应文件: StarTowerMonsterSpAttr.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerMonsterSpAttrConfig {

    private final Integer id;
    private final Integer monsterPosition;
    private final Integer continuousKillingTime;
    private final List<Integer> rougeMoneyDropRange;
    private final List<Integer> rougeExpDropRange;
    private final List<Integer> refDistance;
    private final Integer refInterval;
    private final Boolean wayPointShift;
    private final String themeSkills;

    @JsonCreator
    public StarTowerMonsterSpAttrConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MonsterPosition") Integer monsterPosition,
        @JsonProperty("ContinuousKillingTime") Integer continuousKillingTime,
        @JsonProperty("RougeMoneyDropRange") List<Integer> rougeMoneyDropRange,
        @JsonProperty("RougeExpDropRange") List<Integer> rougeExpDropRange,
        @JsonProperty("RefDistance") List<Integer> refDistance,
        @JsonProperty("RefInterval") Integer refInterval,
        @JsonProperty("WayPointShift") Boolean wayPointShift,
        @JsonProperty("ThemeSkills") String themeSkills
    ) {
        this.id = id;
        this.monsterPosition = monsterPosition;
        this.continuousKillingTime = continuousKillingTime;
        this.rougeMoneyDropRange = rougeMoneyDropRange != null ? 
            new ArrayList<>(rougeMoneyDropRange) : 
            new ArrayList<>();
        this.rougeExpDropRange = rougeExpDropRange != null ? 
            new ArrayList<>(rougeExpDropRange) : 
            new ArrayList<>();
        this.refDistance = refDistance != null ? 
            new ArrayList<>(refDistance) : 
            new ArrayList<>();
        this.refInterval = refInterval;
        this.wayPointShift = wayPointShift;
        this.themeSkills = themeSkills;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMonsterPosition() {
        return this.monsterPosition;
    }

    public Integer getContinuousKillingTime() {
        return this.continuousKillingTime;
    }

    public List<Integer> getRougeMoneyDropRange() {
        return this.rougeMoneyDropRange;
    }

    public List<Integer> getRougeExpDropRange() {
        return this.rougeExpDropRange;
    }

    public List<Integer> getRefDistance() {
        return this.refDistance;
    }

    public Integer getRefInterval() {
        return this.refInterval;
    }

    public Boolean getWayPointShift() {
        return this.wayPointShift;
    }

    public String getThemeSkills() {
        return this.themeSkills;
    }

}
