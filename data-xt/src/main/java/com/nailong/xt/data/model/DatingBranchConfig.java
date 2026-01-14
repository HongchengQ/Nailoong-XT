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
 * 对应文件: DatingBranch.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DatingBranchConfig {

    private final Integer id;
    private final Integer datingEventType;
    private final List<Integer> datingEventParams;
    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;
    private final String option5;

    @JsonCreator
    public DatingBranchConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("DatingEventType") Integer datingEventType,
        @JsonProperty("DatingEventParams") List<Integer> datingEventParams,
        @JsonProperty("Option1") String option1,
        @JsonProperty("Option2") String option2,
        @JsonProperty("Option3") String option3,
        @JsonProperty("Option4") String option4,
        @JsonProperty("Option5") String option5
    ) {
        this.id = id;
        this.datingEventType = datingEventType;
        this.datingEventParams = datingEventParams != null ? 
            new ArrayList<>(datingEventParams) : 
            new ArrayList<>();
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDatingEventType() {
        return this.datingEventType;
    }

    public List<Integer> getDatingEventParams() {
        return this.datingEventParams;
    }

    public String getOption1() {
        return this.option1;
    }

    public String getOption2() {
        return this.option2;
    }

    public String getOption3() {
        return this.option3;
    }

    public String getOption4() {
        return this.option4;
    }

    public String getOption5() {
        return this.option5;
    }

}
