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
 * 对应文件: CharacterDes.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterDesConfig {

    private final Integer id;
    private final String alias;
    private final String cnCv;
    private final String jpCv;
    private final String charColor;
    private final String charSkillColor;
    private final String charDes;
    private final List<Integer> tag;
    private final Integer force;
    private final List<Integer> preferTags;
    private final String birthday;
    private final String potentialMain1;
    private final String potentialMain2;
    private final String potentialAssistant1;
    private final String potentialAssistant2;
    private final String potentialMainContent1;
    private final String potentialMainContent2;
    private final String potentialAssistantContent1;
    private final String potentialAssistantContent2;
    private final List<Integer> hateTags;

    @JsonCreator
    public CharacterDesConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Alias") String alias,
        @JsonProperty("CnCv") String cnCv,
        @JsonProperty("JpCv") String jpCv,
        @JsonProperty("CharColor") String charColor,
        @JsonProperty("CharSkillColor") String charSkillColor,
        @JsonProperty("CharDes") String charDes,
        @JsonProperty("Tag") List<Integer> tag,
        @JsonProperty("Force") Integer force,
        @JsonProperty("PreferTags") List<Integer> preferTags,
        @JsonProperty("Birthday") String birthday,
        @JsonProperty("PotentialMain1") String potentialMain1,
        @JsonProperty("PotentialMain2") String potentialMain2,
        @JsonProperty("PotentialAssistant1") String potentialAssistant1,
        @JsonProperty("PotentialAssistant2") String potentialAssistant2,
        @JsonProperty("PotentialMainContent1") String potentialMainContent1,
        @JsonProperty("PotentialMainContent2") String potentialMainContent2,
        @JsonProperty("PotentialAssistantContent1") String potentialAssistantContent1,
        @JsonProperty("PotentialAssistantContent2") String potentialAssistantContent2,
        @JsonProperty("HateTags") List<Integer> hateTags
    ) {
        this.id = id;
        this.alias = alias;
        this.cnCv = cnCv;
        this.jpCv = jpCv;
        this.charColor = charColor;
        this.charSkillColor = charSkillColor;
        this.charDes = charDes;
        this.tag = tag != null ? 
            new ArrayList<>(tag) : 
            new ArrayList<>();
        this.force = force;
        this.preferTags = preferTags != null ? 
            new ArrayList<>(preferTags) : 
            new ArrayList<>();
        this.birthday = birthday;
        this.potentialMain1 = potentialMain1;
        this.potentialMain2 = potentialMain2;
        this.potentialAssistant1 = potentialAssistant1;
        this.potentialAssistant2 = potentialAssistant2;
        this.potentialMainContent1 = potentialMainContent1;
        this.potentialMainContent2 = potentialMainContent2;
        this.potentialAssistantContent1 = potentialAssistantContent1;
        this.potentialAssistantContent2 = potentialAssistantContent2;
        this.hateTags = hateTags != null ? 
            new ArrayList<>(hateTags) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getCnCv() {
        return this.cnCv;
    }

    public String getJpCv() {
        return this.jpCv;
    }

    public String getCharColor() {
        return this.charColor;
    }

    public String getCharSkillColor() {
        return this.charSkillColor;
    }

    public String getCharDes() {
        return this.charDes;
    }

    public List<Integer> getTag() {
        return this.tag;
    }

    public Integer getForce() {
        return this.force;
    }

    public List<Integer> getPreferTags() {
        return this.preferTags;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getPotentialMain1() {
        return this.potentialMain1;
    }

    public String getPotentialMain2() {
        return this.potentialMain2;
    }

    public String getPotentialAssistant1() {
        return this.potentialAssistant1;
    }

    public String getPotentialAssistant2() {
        return this.potentialAssistant2;
    }

    public String getPotentialMainContent1() {
        return this.potentialMainContent1;
    }

    public String getPotentialMainContent2() {
        return this.potentialMainContent2;
    }

    public String getPotentialAssistantContent1() {
        return this.potentialAssistantContent1;
    }

    public String getPotentialAssistantContent2() {
        return this.potentialAssistantContent2;
    }

    public List<Integer> getHateTags() {
        return this.hateTags;
    }

}
