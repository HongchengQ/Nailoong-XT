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
 * 对应文件: TutorialLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TutorialLevelConfig {

    private final Integer id;
    private final Integer tutorialType;
    private final String title;
    private final Integer tutorialBuild;
    private final Integer floorId;
    private final Integer worldClass;
    private final Integer item1;
    private final Integer qty1;

    @JsonCreator
    public TutorialLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TutorialType") Integer tutorialType,
        @JsonProperty("Title") String title,
        @JsonProperty("TutorialBuild") Integer tutorialBuild,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("WorldClass") Integer worldClass,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Qty1") Integer qty1
    ) {
        this.id = id;
        this.tutorialType = tutorialType;
        this.title = title;
        this.tutorialBuild = tutorialBuild;
        this.floorId = floorId;
        this.worldClass = worldClass;
        this.item1 = item1;
        this.qty1 = qty1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTutorialType() {
        return this.tutorialType;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getTutorialBuild() {
        return this.tutorialBuild;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getWorldClass() {
        return this.worldClass;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

}
