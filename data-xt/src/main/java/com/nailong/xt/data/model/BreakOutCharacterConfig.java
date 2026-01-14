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
 * 对应文件: BreakOutCharacter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BreakOutCharacterConfig {

    private final Integer id;
    private final Integer charId;
    private final String name;
    private final Integer unlockCond;
    private final List<Integer> unlockParams;
    private final String model;
    private final Integer modelScale;
    private final Integer faction;
    private final Integer skillId;
    private final Integer mp;
    private final Integer skillCd;
    private final Integer attribute;
    private final Integer level;

    @JsonCreator
    public BreakOutCharacterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Name") String name,
        @JsonProperty("UnlockCond") Integer unlockCond,
        @JsonProperty("UnlockParams") List<Integer> unlockParams,
        @JsonProperty("Model") String model,
        @JsonProperty("ModelScale") Integer modelScale,
        @JsonProperty("Faction") Integer faction,
        @JsonProperty("SkillId") Integer skillId,
        @JsonProperty("MP") Integer mp,
        @JsonProperty("SkillCD") Integer skillCd,
        @JsonProperty("Attribute") Integer attribute,
        @JsonProperty("Level") Integer level
    ) {
        this.id = id;
        this.charId = charId;
        this.name = name;
        this.unlockCond = unlockCond;
        this.unlockParams = unlockParams != null ? 
            new ArrayList<>(unlockParams) : 
            new ArrayList<>();
        this.model = model;
        this.modelScale = modelScale;
        this.faction = faction;
        this.skillId = skillId;
        this.mp = mp;
        this.skillCd = skillCd;
        this.attribute = attribute;
        this.level = level;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public String getName() {
        return this.name;
    }

    public Integer getUnlockCond() {
        return this.unlockCond;
    }

    public List<Integer> getUnlockParams() {
        return this.unlockParams;
    }

    public String getModel() {
        return this.model;
    }

    public Integer getModelScale() {
        return this.modelScale;
    }

    public Integer getFaction() {
        return this.faction;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public Integer getMp() {
        return this.mp;
    }

    public Integer getSkillCd() {
        return this.skillCd;
    }

    public Integer getAttribute() {
        return this.attribute;
    }

    public Integer getLevel() {
        return this.level;
    }

}
