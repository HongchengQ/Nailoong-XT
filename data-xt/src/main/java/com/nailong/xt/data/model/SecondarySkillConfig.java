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
 * 对应文件: SecondarySkill.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SecondarySkillConfig {

    private final Integer id;
    private final String needSubNoteSkills;
    private final Integer score;
    private final String name;
    private final String icon;
    private final String iconBg;
    private final String desc;
    private final Integer groupId;
    private final Integer level;
    private final List<Integer> effectId;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;

    @JsonCreator
    public SecondarySkillConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("NeedSubNoteSkills") String needSubNoteSkills,
        @JsonProperty("Score") Integer score,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("IconBg") String iconBg,
        @JsonProperty("Desc") String desc,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("Param5") String param5
    ) {
        this.id = id;
        this.needSubNoteSkills = needSubNoteSkills;
        this.score = score;
        this.name = name;
        this.icon = icon;
        this.iconBg = iconBg;
        this.desc = desc;
        this.groupId = groupId;
        this.level = level;
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
    }

    public Integer getId() {
        return this.id;
    }

    public String getNeedSubNoteSkills() {
        return this.needSubNoteSkills;
    }

    public Integer getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIconBg() {
        return this.iconBg;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<Integer> getEffectId() {
        return this.effectId;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

    public String getParam5() {
        return this.param5;
    }

}
