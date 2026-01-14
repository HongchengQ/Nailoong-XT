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
 * 对应文件: CharGetLines.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGetLinesConfig {

    private final Integer id;
    private final Integer character;
    private final Integer type;
    private final String voResource;
    private final String lines;
    private final Integer skinId;

    @JsonCreator
    public CharGetLinesConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Character") Integer character,
        @JsonProperty("Type") Integer type,
        @JsonProperty("voResource") String voResource,
        @JsonProperty("Lines") String lines,
        @JsonProperty("SkinId") Integer skinId
    ) {
        this.id = id;
        this.character = character;
        this.type = type;
        this.voResource = voResource;
        this.lines = lines;
        this.skinId = skinId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharacter() {
        return this.character;
    }

    public Integer getType() {
        return this.type;
    }

    public String getVoResource() {
        return this.voResource;
    }

    public String getLines() {
        return this.lines;
    }

    public Integer getSkinId() {
        return this.skinId;
    }

}
