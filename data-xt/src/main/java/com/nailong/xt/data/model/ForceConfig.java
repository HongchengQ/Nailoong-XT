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
 * 对应文件: Force.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ForceConfig {

    private final Integer id;
    private final String title;
    private final String icon1;
    private final String icon2;
    private final List<Integer> talentPos;

    @JsonCreator
    public ForceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Icon1") String icon1,
        @JsonProperty("Icon2") String icon2,
        @JsonProperty("TalentPos") List<Integer> talentPos
    ) {
        this.id = id;
        this.title = title;
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.talentPos = talentPos != null ? 
            new ArrayList<>(talentPos) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIcon1() {
        return this.icon1;
    }

    public String getIcon2() {
        return this.icon2;
    }

    public List<Integer> getTalentPos() {
        return this.talentPos;
    }

}
