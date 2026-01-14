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
 * 对应文件: SubNoteSkill.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubNoteSkillConfig {

    private final Integer id;
    private final List<Integer> scores;
    private final List<Integer> effectId;
    private final String name;
    private final String icon;
    private final String briefDesc;
    private final String desc;
    private final String param1;
    private final String param2;

    @JsonCreator
    public SubNoteSkillConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Scores") List<Integer> scores,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("BriefDesc") String briefDesc,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2
    ) {
        this.id = id;
        this.scores = scores != null ? 
            new ArrayList<>(scores) : 
            new ArrayList<>();
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.name = name;
        this.icon = icon;
        this.briefDesc = briefDesc;
        this.desc = desc;
        this.param1 = param1;
        this.param2 = param2;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getScores() {
        return this.scores;
    }

    public List<Integer> getEffectId() {
        return this.effectId;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getBriefDesc() {
        return this.briefDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

}
