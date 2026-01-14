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
 * 对应文件: Handbook.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HandbookConfig {

    private final Integer id;
    private final Integer index;
    private final Integer type;
    private final Integer charId;
    private final Integer skinId;
    private final Integer cond;

    @JsonCreator
    public HandbookConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Index") Integer index,
        @JsonProperty("Type") Integer type,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("SkinId") Integer skinId,
        @JsonProperty("Cond") Integer cond
    ) {
        this.id = id;
        this.index = index;
        this.type = type;
        this.charId = charId;
        this.skinId = skinId;
        this.cond = cond;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getSkinId() {
        return this.skinId;
    }

    public Integer getCond() {
        return this.cond;
    }

}
