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
 * 对应文件: HonorCharacter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HonorCharacterConfig {

    private final Integer id;
    private final Integer charId;
    private final Integer level;
    private final String bigBgPath;
    private final String smallBgPath;
    private final List<Integer> starGroup;

    @JsonCreator
    public HonorCharacterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("BigBgPath") String bigBgPath,
        @JsonProperty("SmallBgPath") String smallBgPath,
        @JsonProperty("StarGroup") List<Integer> starGroup
    ) {
        this.id = id;
        this.charId = charId;
        this.level = level;
        this.bigBgPath = bigBgPath;
        this.smallBgPath = smallBgPath;
        this.starGroup = starGroup != null ? 
            new ArrayList<>(starGroup) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getBigBgPath() {
        return this.bigBgPath;
    }

    public String getSmallBgPath() {
        return this.smallBgPath;
    }

    public List<Integer> getStarGroup() {
        return this.starGroup;
    }

}
