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
 * 对应文件: AssistQuestGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AssistQuestGroupConfig {

    private final Integer id;
    private final Integer attributeId;
    private final Integer item1;
    private final Integer qty1;
    private final Integer item2;
    private final Integer qty2;
    private final Integer item3;
    private final Integer qty3;
    private final Integer item4;
    private final Integer qty4;
    private final Integer item5;
    private final Integer qty5;
    private final Integer preGroup;
    private final Integer showBuildId;

    @JsonCreator
    public AssistQuestGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AttributeId") Integer attributeId,
        @JsonProperty("Item1") Integer item1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Item2") Integer item2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("Item3") Integer item3,
        @JsonProperty("Qty3") Integer qty3,
        @JsonProperty("Item4") Integer item4,
        @JsonProperty("Qty4") Integer qty4,
        @JsonProperty("Item5") Integer item5,
        @JsonProperty("Qty5") Integer qty5,
        @JsonProperty("PreGroup") Integer preGroup,
        @JsonProperty("ShowBuildId") Integer showBuildId
    ) {
        this.id = id;
        this.attributeId = attributeId;
        this.item1 = item1;
        this.qty1 = qty1;
        this.item2 = item2;
        this.qty2 = qty2;
        this.item3 = item3;
        this.qty3 = qty3;
        this.item4 = item4;
        this.qty4 = qty4;
        this.item5 = item5;
        this.qty5 = qty5;
        this.preGroup = preGroup;
        this.showBuildId = showBuildId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getAttributeId() {
        return this.attributeId;
    }

    public Integer getItem1() {
        return this.item1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public Integer getItem2() {
        return this.item2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getItem3() {
        return this.item3;
    }

    public Integer getQty3() {
        return this.qty3;
    }

    public Integer getItem4() {
        return this.item4;
    }

    public Integer getQty4() {
        return this.qty4;
    }

    public Integer getItem5() {
        return this.item5;
    }

    public Integer getQty5() {
        return this.qty5;
    }

    public Integer getPreGroup() {
        return this.preGroup;
    }

    public Integer getShowBuildId() {
        return this.showBuildId;
    }

}
