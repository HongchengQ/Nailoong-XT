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
 * 对应文件: VoDirectory.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VoDirectoryConfig {

    private final Integer id;
    private final String voResource;
    private final Integer characterId;
    private final String votype;

    @JsonCreator
    public VoDirectoryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("voResource") String voResource,
        @JsonProperty("characterId") Integer characterId,
        @JsonProperty("votype") String votype
    ) {
        this.id = id;
        this.voResource = voResource;
        this.characterId = characterId;
        this.votype = votype;
    }

    public Integer getId() {
        return this.id;
    }

    public String getVoResource() {
        return this.voResource;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public String getVotype() {
        return this.votype;
    }

}
