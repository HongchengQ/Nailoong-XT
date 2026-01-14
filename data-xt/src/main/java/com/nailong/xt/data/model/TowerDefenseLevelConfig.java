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
 * 对应文件: TowerDefenseLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseLevelConfig {

    private final Integer id;
    private final Integer activityId;
    private final String levelName;
    private final Integer levelPage;
    private final String levelBg;
    private final Integer floorId;
    private final Integer monsterPreview;
    private final String des1;
    private final String des2;
    private final String des3;
    private final Integer condition2;
    private final Integer condition3;
    private final Integer item1;
    private final Integer qty1;
    private final Integer item2;
    private final Integer qty2;
    private final Integer preLevel;
    private final Integer activeTime;
    private final Boolean skip;

    @JsonCreator
    public TowerDefenseLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("activityId") Integer activityId,
        @JsonProperty("LevelName") String levelName,
        @JsonProperty("LevelPage") Integer levelPage,
        @JsonProperty("LevelBg") String levelBg,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("MonsterPreview") Integer monsterPreview,
        @JsonProperty("Des1") String des1,
        @JsonProperty("Des2") String des2,
        @JsonProperty("Des3") String des3,
        @JsonProperty("Condition2") Integer condition2,
        @JsonProperty("Condition3") Integer condition3,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Item2") Integer item2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("PreLevel") Integer preLevel,
        @JsonProperty("ActiveTime") Integer activeTime,
        @JsonProperty("Skip") Boolean skip
    ) {
        this.id = id;
        this.activityId = activityId;
        this.levelName = levelName;
        this.levelPage = levelPage;
        this.levelBg = levelBg;
        this.floorId = floorId;
        this.monsterPreview = monsterPreview;
        this.des1 = des1;
        this.des2 = des2;
        this.des3 = des3;
        this.condition2 = condition2;
        this.condition3 = condition3;
        this.item1 = item1;
        this.qty1 = qty1;
        this.item2 = item2;
        this.qty2 = qty2;
        this.preLevel = preLevel;
        this.activeTime = activeTime;
        this.skip = skip;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public Integer getLevelPage() {
        return this.levelPage;
    }

    public String getLevelBg() {
        return this.levelBg;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getMonsterPreview() {
        return this.monsterPreview;
    }

    public String getDes1() {
        return this.des1;
    }

    public String getDes2() {
        return this.des2;
    }

    public String getDes3() {
        return this.des3;
    }

    public Integer getCondition2() {
        return this.condition2;
    }

    public Integer getCondition3() {
        return this.condition3;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getItem2() {
        return this.item2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getPreLevel() {
        return this.preLevel;
    }

    public Integer getActiveTime() {
        return this.activeTime;
    }

    public Boolean getSkip() {
        return this.skip;
    }

}
