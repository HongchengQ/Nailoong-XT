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
 * 对应文件: NpcSkin.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NpcSkinConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Boolean isShow;
    private final Integer charId;
    private final Integer type;
    private final Integer sourceDesc;
    private final Integer modelScale;
    private final String model;
    private final String portrait;
    private final String offset;
    private final String l2d;
    private final Boolean interactiveAction;
    private final Integer interactiveActionId;

    @JsonCreator
    public NpcSkinConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Type") Integer type,
        @JsonProperty("SourceDesc") Integer sourceDesc,
        @JsonProperty("ModelScale") Integer modelScale,
        @JsonProperty("Model") String model,
        @JsonProperty("Portrait") String portrait,
        @JsonProperty("Offset") String offset,
        @JsonProperty("L2D") String l2d,
        @JsonProperty("InteractiveAction") Boolean interactiveAction,
        @JsonProperty("InteractiveActionId") Integer interactiveActionId
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.isShow = isShow;
        this.charId = charId;
        this.type = type;
        this.sourceDesc = sourceDesc;
        this.modelScale = modelScale;
        this.model = model;
        this.portrait = portrait;
        this.offset = offset;
        this.l2d = l2d;
        this.interactiveAction = interactiveAction;
        this.interactiveActionId = interactiveActionId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSourceDesc() {
        return this.sourceDesc;
    }

    public Integer getModelScale() {
        return this.modelScale;
    }

    public String getModel() {
        return this.model;
    }

    public String getPortrait() {
        return this.portrait;
    }

    public String getOffset() {
        return this.offset;
    }

    public String getL2d() {
        return this.l2d;
    }

    public Boolean getInteractiveAction() {
        return this.interactiveAction;
    }

    public Integer getInteractiveActionId() {
        return this.interactiveActionId;
    }

}
