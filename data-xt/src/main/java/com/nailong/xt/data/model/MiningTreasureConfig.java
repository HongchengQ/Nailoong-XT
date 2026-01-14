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
 * 对应文件: MiningTreasure.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MiningTreasureConfig {

    private final Integer id;
    private final Integer activityId;
    private final String icon;
    private final String name;
    private final String des;
    private final Integer miningItemType;
    private final Integer miningItemRarity;
    private final Integer score;
    private final Integer selfRotate;

    @JsonCreator
    public MiningTreasureConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Name") String name,
        @JsonProperty("Des") String des,
        @JsonProperty("MiningItemType") Integer miningItemType,
        @JsonProperty("MiningItemRarity") Integer miningItemRarity,
        @JsonProperty("Score") Integer score,
        @JsonProperty("SelfRotate") Integer selfRotate
    ) {
        this.id = id;
        this.activityId = activityId;
        this.icon = icon;
        this.name = name;
        this.des = des;
        this.miningItemType = miningItemType;
        this.miningItemRarity = miningItemRarity;
        this.score = score;
        this.selfRotate = selfRotate;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getDes() {
        return this.des;
    }

    public Integer getMiningItemType() {
        return this.miningItemType;
    }

    public Integer getMiningItemRarity() {
        return this.miningItemRarity;
    }

    public Integer getScore() {
        return this.score;
    }

    public Integer getSelfRotate() {
        return this.selfRotate;
    }

}
