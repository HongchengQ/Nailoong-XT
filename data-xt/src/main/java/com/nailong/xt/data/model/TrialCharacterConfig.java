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
 * 对应文件: TrialCharacter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TrialCharacterConfig {

    private final Integer id;
    private final String name;
    private final Integer charId;
    private final Integer characterSkin;
    private final Integer breakField;
    private final Integer level;
    private final List<Integer> skillLevel;

    @JsonCreator
    public TrialCharacterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("CharacterSkin") Integer characterSkin,
        @JsonProperty("Break") Integer breakField,
        @JsonProperty("Level") Integer level,
        @JsonProperty("SkillLevel") List<Integer> skillLevel
    ) {
        this.id = id;
        this.name = name;
        this.charId = charId;
        this.characterSkin = characterSkin;
        this.breakField = breakField;
        this.level = level;
        this.skillLevel = skillLevel != null ? 
            new ArrayList<>(skillLevel) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getCharacterSkin() {
        return this.characterSkin;
    }

    public Integer getBreakField() {
        return this.breakField;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<Integer> getSkillLevel() {
        return this.skillLevel;
    }

}
