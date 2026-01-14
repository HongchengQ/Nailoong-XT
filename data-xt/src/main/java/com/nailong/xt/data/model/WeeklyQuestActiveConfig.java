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
 * 对应文件: WeeklyQuestActive.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class WeeklyQuestActiveConfig {

    private final Integer id;
    private final Integer active;
    private final Integer itemTid1;
    private final Integer number1;
    private final Integer itemTid2;
    private final Integer number2;

    @JsonCreator
    public WeeklyQuestActiveConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Active") Integer active,
        @JsonProperty("ItemTid1") Integer itemTid1,
        @JsonProperty("Number1") Integer number1,
        @JsonProperty("ItemTid2") Integer itemTid2,
        @JsonProperty("Number2") Integer number2
    ) {
        this.id = id;
        this.active = active;
        this.itemTid1 = itemTid1;
        this.number1 = number1;
        this.itemTid2 = itemTid2;
        this.number2 = number2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getActive() {
        return this.active;
    }

    public Integer getItemTid1() {
        return this.itemTid1;
    }

    public Integer getNumber1() {
        return this.number1;
    }

    public Integer getItemTid2() {
        return this.itemTid2;
    }

    public Integer getNumber2() {
        return this.number2;
    }

}
