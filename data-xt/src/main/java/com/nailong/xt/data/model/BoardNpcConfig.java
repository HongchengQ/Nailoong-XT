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
 * 对应文件: BoardNpc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BoardNpcConfig {

    private final Integer id;
    private final String name;
    private final String alias;
    private final Integer defaultSkinId;

    @JsonCreator
    public BoardNpcConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Alias") String alias,
        @JsonProperty("DefaultSkinId") Integer defaultSkinId
    ) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.defaultSkinId = defaultSkinId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAlias() {
        return this.alias;
    }

    public Integer getDefaultSkinId() {
        return this.defaultSkinId;
    }

}
