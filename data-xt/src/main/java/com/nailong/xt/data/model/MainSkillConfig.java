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
 * 对应文件: MainSkill.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MainSkillConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer level;
    private final String name;
    private final String icon;
    private final String iconBg;
    private final String desc;
    private final List<Integer> effectId;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;
    private final String param6;
    private final String param7;

    @JsonCreator
    public MainSkillConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("Name") String name,
        @JsonProperty("Icon") String icon,
        @JsonProperty("IconBg") String iconBg,
        @JsonProperty("Desc") String desc,
        @JsonProperty("EffectId") List<Integer> effectId,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("Param5") String param5,
        @JsonProperty("Param6") String param6,
        @JsonProperty("Param7") String param7
    ) {
        this.id = id;
        this.groupId = groupId;
        this.level = level;
        this.name = name;
        this.icon = icon;
        this.iconBg = iconBg;
        this.desc = desc;
        this.effectId = effectId != null ? 
            new ArrayList<>(effectId) : 
            new ArrayList<>();
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.param6 = param6;
        this.param7 = param7;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLevel() {
        return this.level;
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

    public String getParam6() {
        return this.param6;
    }

    public String getParam7() {
        return this.param7;
    }

}
