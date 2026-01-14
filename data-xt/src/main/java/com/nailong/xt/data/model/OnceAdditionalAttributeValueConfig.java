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
 * 对应文件: OnceAdditionalAttributeValue.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class OnceAdditionalAttributeValueConfig {

    private final Integer id;
    private final Integer attributeType1;
    private final Integer parameterType1;
    private final Integer value1;
    private final Integer attributeType2;
    private final Integer parameterType2;
    private final Integer value2;
    private final Integer elementType1;

    @JsonCreator
    public OnceAdditionalAttributeValueConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AttributeType1") Integer attributeType1,
        @JsonProperty("ParameterType1") Integer parameterType1,
        @JsonProperty("Value1") Integer value1,
        @JsonProperty("AttributeType2") Integer attributeType2,
        @JsonProperty("ParameterType2") Integer parameterType2,
        @JsonProperty("Value2") Integer value2,
        @JsonProperty("ElementType1") Integer elementType1
    ) {
        this.id = id;
        this.attributeType1 = attributeType1;
        this.parameterType1 = parameterType1;
        this.value1 = value1;
        this.attributeType2 = attributeType2;
        this.parameterType2 = parameterType2;
        this.value2 = value2;
        this.elementType1 = elementType1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getAttributeType1() {
        return this.attributeType1;
    }

    public Integer getParameterType1() {
        return this.parameterType1;
    }

    public Integer getValue1() {
        return this.value1;
    }

    public Integer getAttributeType2() {
        return this.attributeType2;
    }

    public Integer getParameterType2() {
        return this.parameterType2;
    }

    public Integer getValue2() {
        return this.value2;
    }

    public Integer getElementType1() {
        return this.elementType1;
    }

}
