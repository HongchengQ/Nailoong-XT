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
 * 对应文件: DailyQuestAward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DailyQuestAwardConfig {

    private final Integer id;
    private final String title;
    private final Integer needPoint;
    private final Integer numShow;
    private final Integer itemTid1;
    private final Integer number1;
    private final Integer itemTid2;
    private final Integer number2;

    @JsonCreator
    public DailyQuestAwardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("NeedPoint") Integer needPoint,
        @JsonProperty("NumShow") Integer numShow,
        @JsonProperty("ItemTid1") Integer itemTid1,
        @JsonProperty("Number1") Integer number1,
        @JsonProperty("ItemTid2") Integer itemTid2,
        @JsonProperty("Number2") Integer number2
    ) {
        this.id = id;
        this.title = title;
        this.needPoint = needPoint;
        this.numShow = numShow;
        this.itemTid1 = itemTid1;
        this.number1 = number1;
        this.itemTid2 = itemTid2;
        this.number2 = number2;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getNeedPoint() {
        return this.needPoint;
    }

    public Integer getNumShow() {
        return this.numShow;
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
