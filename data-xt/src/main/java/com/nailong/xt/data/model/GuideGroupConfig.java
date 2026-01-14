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
 * 对应文件: GuideGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GuideGroupConfig {

    private final Integer id;
    private final Integer guideDetectionType;
    private final Integer guideTrigger;
    private final String triggerParams;
    private final String scriptPath;
    private final Boolean isActive;
    private final Integer guidePrepose;
    private final String preposeParams;
    private final Integer guidePost;
    private final String postParams;
    private final String passiveMsg;
    private final Integer guidePrepose2;
    private final String preposeParams2;
    private final Boolean towerState;

    @JsonCreator
    public GuideGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GuideDetectionType") Integer guideDetectionType,
        @JsonProperty("GuideTrigger") Integer guideTrigger,
        @JsonProperty("TriggerParams") String triggerParams,
        @JsonProperty("ScriptPath") String scriptPath,
        @JsonProperty("IsActive") Boolean isActive,
        @JsonProperty("GuidePrepose") Integer guidePrepose,
        @JsonProperty("PreposeParams") String preposeParams,
        @JsonProperty("GuidePost") Integer guidePost,
        @JsonProperty("PostParams") String postParams,
        @JsonProperty("PassiveMsg") String passiveMsg,
        @JsonProperty("GuidePrepose2") Integer guidePrepose2,
        @JsonProperty("PreposeParams2") String preposeParams2,
        @JsonProperty("TowerState") Boolean towerState
    ) {
        this.id = id;
        this.guideDetectionType = guideDetectionType;
        this.guideTrigger = guideTrigger;
        this.triggerParams = triggerParams;
        this.scriptPath = scriptPath;
        this.isActive = isActive;
        this.guidePrepose = guidePrepose;
        this.preposeParams = preposeParams;
        this.guidePost = guidePost;
        this.postParams = postParams;
        this.passiveMsg = passiveMsg;
        this.guidePrepose2 = guidePrepose2;
        this.preposeParams2 = preposeParams2;
        this.towerState = towerState;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGuideDetectionType() {
        return this.guideDetectionType;
    }

    public Integer getGuideTrigger() {
        return this.guideTrigger;
    }

    public String getTriggerParams() {
        return this.triggerParams;
    }

    public String getScriptPath() {
        return this.scriptPath;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public Integer getGuidePrepose() {
        return this.guidePrepose;
    }

    public String getPreposeParams() {
        return this.preposeParams;
    }

    public Integer getGuidePost() {
        return this.guidePost;
    }

    public String getPostParams() {
        return this.postParams;
    }

    public String getPassiveMsg() {
        return this.passiveMsg;
    }

    public Integer getGuidePrepose2() {
        return this.guidePrepose2;
    }

    public String getPreposeParams2() {
        return this.preposeParams2;
    }

    public Boolean getTowerState() {
        return this.towerState;
    }

}
