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
 * 对应文件: AdControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AdControlConfig {

    private final Integer id;
    private final String uiAssets;
    private final String ctrlName;
    private final String startTime;
    private final List<Integer> jumpTo;
    private final Boolean isMove;

    @JsonCreator
    public AdControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("UIAssets") String uiAssets,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("JumpTo") List<Integer> jumpTo,
        @JsonProperty("IsMove") Boolean isMove
    ) {
        this.id = id;
        this.uiAssets = uiAssets;
        this.ctrlName = ctrlName;
        this.startTime = startTime;
        this.jumpTo = jumpTo != null ? 
            new ArrayList<>(jumpTo) : 
            new ArrayList<>();
        this.isMove = isMove;
    }

    public Integer getId() {
        return this.id;
    }

    public String getUiAssets() {
        return this.uiAssets;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public List<Integer> getJumpTo() {
        return this.jumpTo;
    }

    public Boolean getIsMove() {
        return this.isMove;
    }

}
