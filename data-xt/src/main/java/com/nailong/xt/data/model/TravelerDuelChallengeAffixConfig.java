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
 * 对应文件: TravelerDuelChallengeAffix.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TravelerDuelChallengeAffixConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final String icon;
    private final Integer element;
    private final List<Integer> addCamp;
    private final List<Integer> addClass;
    private final List<Integer> skillId;
    private final Integer groupId;
    private final Integer difficulty;
    private final Integer branchId;
    private final String param1;
    private final String value1;
    private final Integer unlockDifficulty;
    private final Integer unlockDurationTime;
    private final String logicTag;
    private final String param2;
    private final String param3;

    @JsonCreator
    public TravelerDuelChallengeAffixConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Element") Integer element,
        @JsonProperty("AddCamp") List<Integer> addCamp,
        @JsonProperty("AddClass") List<Integer> addClass,
        @JsonProperty("SkillId") List<Integer> skillId,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("BranchId") Integer branchId,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Value1") String value1,
        @JsonProperty("UnlockDifficulty") Integer unlockDifficulty,
        @JsonProperty("UnlockDurationTime") Integer unlockDurationTime,
        @JsonProperty("LogicTag") String logicTag,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.icon = icon;
        this.element = element;
        this.addCamp = addCamp != null ? 
            new ArrayList<>(addCamp) : 
            new ArrayList<>();
        this.addClass = addClass != null ? 
            new ArrayList<>(addClass) : 
            new ArrayList<>();
        this.skillId = skillId != null ? 
            new ArrayList<>(skillId) : 
            new ArrayList<>();
        this.groupId = groupId;
        this.difficulty = difficulty;
        this.branchId = branchId;
        this.param1 = param1;
        this.value1 = value1;
        this.unlockDifficulty = unlockDifficulty;
        this.unlockDurationTime = unlockDurationTime;
        this.logicTag = logicTag;
        this.param2 = param2;
        this.param3 = param3;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getElement() {
        return this.element;
    }

    public List<Integer> getAddCamp() {
        return this.addCamp;
    }

    public List<Integer> getAddClass() {
        return this.addClass;
    }

    public List<Integer> getSkillId() {
        return this.skillId;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getBranchId() {
        return this.branchId;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getValue1() {
        return this.value1;
    }

    public Integer getUnlockDifficulty() {
        return this.unlockDifficulty;
    }

    public Integer getUnlockDurationTime() {
        return this.unlockDurationTime;
    }

    public String getLogicTag() {
        return this.logicTag;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

}
