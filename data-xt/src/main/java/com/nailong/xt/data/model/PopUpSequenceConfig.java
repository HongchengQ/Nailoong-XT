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
 * 对应文件: PopUpSequence.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PopUpSequenceConfig {

    private final Integer id;
    private final Integer sortId;
    private final Integer type;
    private final Integer panelId;
    private final Boolean bLocalSave;

    @JsonCreator
    public PopUpSequenceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("Type") Integer type,
        @JsonProperty("PanelId") Integer panelId,
        @JsonProperty("bLocalSave") Boolean bLocalSave
    ) {
        this.id = id;
        this.sortId = sortId;
        this.type = type;
        this.panelId = panelId;
        this.bLocalSave = bLocalSave;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getPanelId() {
        return this.panelId;
    }

    public Boolean getBLocalSave() {
        return this.bLocalSave;
    }

}
