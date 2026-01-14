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
 * 对应文件: CharGrade.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharGradeConfig {

    private final Integer grade;
    private final Integer fragmentsQty;
    private final Integer generalFragmentId;
    private final Integer substituteItemId;
    private final Integer substituteItemQty;

    @JsonCreator
    public CharGradeConfig(
        @JsonProperty("Grade") Integer grade,
        @JsonProperty("FragmentsQty") Integer fragmentsQty,
        @JsonProperty("GeneralFragmentId") Integer generalFragmentId,
        @JsonProperty("SubstituteItemId") Integer substituteItemId,
        @JsonProperty("SubstituteItemQty") Integer substituteItemQty
    ) {
        this.grade = grade;
        this.fragmentsQty = fragmentsQty;
        this.generalFragmentId = generalFragmentId;
        this.substituteItemId = substituteItemId;
        this.substituteItemQty = substituteItemQty;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public Integer getFragmentsQty() {
        return this.fragmentsQty;
    }

    public Integer getGeneralFragmentId() {
        return this.generalFragmentId;
    }

    public Integer getSubstituteItemId() {
        return this.substituteItemId;
    }

    public Integer getSubstituteItemQty() {
        return this.substituteItemQty;
    }

}
