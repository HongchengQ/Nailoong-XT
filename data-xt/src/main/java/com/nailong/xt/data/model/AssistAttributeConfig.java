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
 * 对应文件: AssistAttribute.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AssistAttributeConfig {

    private final Integer id;
    private final Integer eet;
    private final String desc;
    private final Integer char1;
    private final String charDesc1;
    private final Integer char2;
    private final String charDesc2;
    private final Integer char3;
    private final String charDesc3;
    private final String teamTitle;

    @JsonCreator
    public AssistAttributeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("EET") Integer eet,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Char1") Integer char1,
        @JsonProperty("CharDesc1") String charDesc1,
        @JsonProperty("Char2") Integer char2,
        @JsonProperty("CharDesc2") String charDesc2,
        @JsonProperty("Char3") Integer char3,
        @JsonProperty("CharDesc3") String charDesc3,
        @JsonProperty("TeamTitle") String teamTitle
    ) {
        this.id = id;
        this.eet = eet;
        this.desc = desc;
        this.char1 = char1;
        this.charDesc1 = charDesc1;
        this.char2 = char2;
        this.charDesc2 = charDesc2;
        this.char3 = char3;
        this.charDesc3 = charDesc3;
        this.teamTitle = teamTitle;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getEet() {
        return this.eet;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getChar1() {
        return this.char1;
    }

    public String getCharDesc1() {
        return this.charDesc1;
    }

    public Integer getChar2() {
        return this.char2;
    }

    public String getCharDesc2() {
        return this.charDesc2;
    }

    public Integer getChar3() {
        return this.char3;
    }

    public String getCharDesc3() {
        return this.charDesc3;
    }

    public String getTeamTitle() {
        return this.teamTitle;
    }

}
