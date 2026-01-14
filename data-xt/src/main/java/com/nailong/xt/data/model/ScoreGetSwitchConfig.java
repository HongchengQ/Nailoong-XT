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
 * 对应文件: ScoreGetSwitch.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreGetSwitchConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer lv;
    private final Integer switchRate;

    @JsonCreator
    public ScoreGetSwitchConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Lv") Integer lv,
        @JsonProperty("SwitchRate") Integer switchRate
    ) {
        this.id = id;
        this.groupId = groupId;
        this.lv = lv;
        this.switchRate = switchRate;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLv() {
        return this.lv;
    }

    public Integer getSwitchRate() {
        return this.switchRate;
    }

}
