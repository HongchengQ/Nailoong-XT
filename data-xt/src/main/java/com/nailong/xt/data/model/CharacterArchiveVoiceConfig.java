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
 * 对应文件: CharacterArchiveVoice.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterArchiveVoiceConfig {

    private final Integer id;
    private final Integer characterId;
    private final String title;
    private final String source;
    private final Integer archVoiceType;
    private final Integer sort;
    private final Integer unlockAffinityLevel;
    private final Integer unlockPlot;

    @JsonCreator
    public CharacterArchiveVoiceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharacterId") Integer characterId,
        @JsonProperty("Title") String title,
        @JsonProperty("Source") String source,
        @JsonProperty("ArchVoiceType") Integer archVoiceType,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("UnlockAffinityLevel") Integer unlockAffinityLevel,
        @JsonProperty("UnlockPlot") Integer unlockPlot
    ) {
        this.id = id;
        this.characterId = characterId;
        this.title = title;
        this.source = source;
        this.archVoiceType = archVoiceType;
        this.sort = sort;
        this.unlockAffinityLevel = unlockAffinityLevel;
        this.unlockPlot = unlockPlot;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSource() {
        return this.source;
    }

    public Integer getArchVoiceType() {
        return this.archVoiceType;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getUnlockAffinityLevel() {
        return this.unlockAffinityLevel;
    }

    public Integer getUnlockPlot() {
        return this.unlockPlot;
    }

}
