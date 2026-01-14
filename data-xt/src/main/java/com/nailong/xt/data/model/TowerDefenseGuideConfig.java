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
 * 对应文件: TowerDefenseGuide.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseGuideConfig {

    private final Integer id;
    private final Integer activityId;
    private final Integer guideType;
    private final Integer objectId;
    private final Boolean isShow;
    private final String iconPath;

    @JsonCreator
    public TowerDefenseGuideConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ActivityId") Integer activityId,
        @JsonProperty("GuideType") Integer guideType,
        @JsonProperty("ObjectId") Integer objectId,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("iconPath") String iconPath
    ) {
        this.id = id;
        this.activityId = activityId;
        this.guideType = guideType;
        this.objectId = objectId;
        this.isShow = isShow;
        this.iconPath = iconPath;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActivityId() {
        return this.activityId;
    }

    public Integer getGuideType() {
        return this.guideType;
    }

    public Integer getObjectId() {
        return this.objectId;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public String getIconPath() {
        return this.iconPath;
    }

}
