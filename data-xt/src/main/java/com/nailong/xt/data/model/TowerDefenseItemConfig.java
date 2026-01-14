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
 * 对应文件: TowerDefenseItem.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TowerDefenseItemConfig {

    private final Integer id;
    private final String name;
    private final String des;
    private final Integer cd;
    private final String script;
    private final String cardIcon;
    private final String head;
    private final Integer amount;

    @JsonCreator
    public TowerDefenseItemConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Des") String des,
        @JsonProperty("Cd") Integer cd,
        @JsonProperty("Script") String script,
        @JsonProperty("CardIcon") String cardIcon,
        @JsonProperty("Head") String head,
        @JsonProperty("Amount") Integer amount
    ) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.cd = cd;
        this.script = script;
        this.cardIcon = cardIcon;
        this.head = head;
        this.amount = amount;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDes() {
        return this.des;
    }

    public Integer getCd() {
        return this.cd;
    }

    public String getScript() {
        return this.script;
    }

    public String getCardIcon() {
        return this.cardIcon;
    }

    public String getHead() {
        return this.head;
    }

    public Integer getAmount() {
        return this.amount;
    }

}
