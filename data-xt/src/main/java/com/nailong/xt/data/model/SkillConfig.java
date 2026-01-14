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
 * 对应文件: Skill.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SkillConfig {

    private final Integer id;
    private final String title;
    private final String fcPath;
    private final Integer type;
    private final String briefDesc;
    private final String desc;
    private final String icon;
    private final Integer maxLevel;
    private final Integer getEnergyLimit;
    private final String param1;
    private final Boolean checkSkillInterval;
    private final Integer skillCd;
    private final Integer sectionAmount;
    private final Integer useInterval;
    private final Integer ultraEnergy;
    private final String param2;
    private final String param3;
    private final String param4;
    private final String param5;
    private final Integer useTimeHint;
    private final String param6;
    private final String param7;
    private final String param8;
    private final String param9;
    private final String param10;
    private final Boolean checkCdRestore;

    @JsonCreator
    public SkillConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("FCPath") String fcPath,
        @JsonProperty("Type") Integer type,
        @JsonProperty("BriefDesc") String briefDesc,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Icon") String icon,
        @JsonProperty("MaxLevel") Integer maxLevel,
        @JsonProperty("GetEnergyLimit") Integer getEnergyLimit,
        @JsonProperty("Param1") String param1,
        @JsonProperty("CheckSkillInterval") Boolean checkSkillInterval,
        @JsonProperty("SkillCD") Integer skillCd,
        @JsonProperty("SectionAmount") Integer sectionAmount,
        @JsonProperty("UseInterval") Integer useInterval,
        @JsonProperty("UltraEnergy") Integer ultraEnergy,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("Param5") String param5,
        @JsonProperty("UseTimeHint") Integer useTimeHint,
        @JsonProperty("Param6") String param6,
        @JsonProperty("Param7") String param7,
        @JsonProperty("Param8") String param8,
        @JsonProperty("Param9") String param9,
        @JsonProperty("Param10") String param10,
        @JsonProperty("CheckCDRestore") Boolean checkCdRestore
    ) {
        this.id = id;
        this.title = title;
        this.fcPath = fcPath;
        this.type = type;
        this.briefDesc = briefDesc;
        this.desc = desc;
        this.icon = icon;
        this.maxLevel = maxLevel;
        this.getEnergyLimit = getEnergyLimit;
        this.param1 = param1;
        this.checkSkillInterval = checkSkillInterval;
        this.skillCd = skillCd;
        this.sectionAmount = sectionAmount;
        this.useInterval = useInterval;
        this.ultraEnergy = ultraEnergy;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
        this.useTimeHint = useTimeHint;
        this.param6 = param6;
        this.param7 = param7;
        this.param8 = param8;
        this.param9 = param9;
        this.param10 = param10;
        this.checkCdRestore = checkCdRestore;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getFcPath() {
        return this.fcPath;
    }

    public Integer getType() {
        return this.type;
    }

    public String getBriefDesc() {
        return this.briefDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getMaxLevel() {
        return this.maxLevel;
    }

    public Integer getGetEnergyLimit() {
        return this.getEnergyLimit;
    }

    public String getParam1() {
        return this.param1;
    }

    public Boolean getCheckSkillInterval() {
        return this.checkSkillInterval;
    }

    public Integer getSkillCd() {
        return this.skillCd;
    }

    public Integer getSectionAmount() {
        return this.sectionAmount;
    }

    public Integer getUseInterval() {
        return this.useInterval;
    }

    public Integer getUltraEnergy() {
        return this.ultraEnergy;
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

    public Integer getUseTimeHint() {
        return this.useTimeHint;
    }

    public String getParam6() {
        return this.param6;
    }

    public String getParam7() {
        return this.param7;
    }

    public String getParam8() {
        return this.param8;
    }

    public String getParam9() {
        return this.param9;
    }

    public String getParam10() {
        return this.param10;
    }

    public Boolean getCheckCdRestore() {
        return this.checkCdRestore;
    }

}
