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
 * 对应文件: Chest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ChestConfig {

    private final Integer id;
    private final Integer group;
    private final Integer label;
    private final Integer lowFloor;
    private final Integer highFloor;
    private final Integer tnteractionType;
    private final String modelPath;
    private final Integer item1;
    private final Integer number1;
    private final Integer item2;
    private final Integer number2;

    @JsonCreator
    public ChestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Group") Integer group,
        @JsonProperty("Label") Integer label,
        @JsonProperty("LowFloor") Integer lowFloor,
        @JsonProperty("HighFloor") Integer highFloor,
        @JsonProperty("TnteractionType") Integer tnteractionType,
        @JsonProperty("ModelPath") String modelPath,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Number1") Integer number1,
        @JsonProperty("Item2") Integer item2,
        @JsonProperty("Number2") Integer number2
    ) {
        this.id = id;
        this.group = group;
        this.label = label;
        this.lowFloor = lowFloor;
        this.highFloor = highFloor;
        this.tnteractionType = tnteractionType;
        this.modelPath = modelPath;
        this.item1 = item1;
        this.number1 = number1;
        this.item2 = item2;
        this.number2 = number2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getLabel() {
        return this.label;
    }

    public Integer getLowFloor() {
        return this.lowFloor;
    }

    public Integer getHighFloor() {
        return this.highFloor;
    }

    public Integer getTnteractionType() {
        return this.tnteractionType;
    }

    public String getModelPath() {
        return this.modelPath;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getNumber1() {
        return this.number1;
    }

    public Integer getItem2() {
        return this.item2;
    }

    public Integer getNumber2() {
        return this.number2;
    }

}
