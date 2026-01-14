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
 * 对应文件: DropObjectGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DropObjectGroupConfig {

    private final Integer dropObjectGroupId;
    private final Integer dropObjectId;
    private final Integer weight;

    @JsonCreator
    public DropObjectGroupConfig(
        @JsonProperty("DropObjectGroupId") Integer dropObjectGroupId,
        @JsonProperty("DropObjectId") Integer dropObjectId,
        @JsonProperty("weight") Integer weight
    ) {
        this.dropObjectGroupId = dropObjectGroupId;
        this.dropObjectId = dropObjectId;
        this.weight = weight;
    }

    public Integer getDropObjectGroupId() {
        return this.dropObjectGroupId;
    }

    public Integer getDropObjectId() {
        return this.dropObjectId;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
