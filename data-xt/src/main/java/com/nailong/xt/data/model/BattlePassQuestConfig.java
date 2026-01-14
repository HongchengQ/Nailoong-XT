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
 * 对应文件: BattlePassQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BattlePassQuestConfig {

    private final Integer id;
    private final Integer type;
    private final String title;
    private final Integer exp;
    private final Integer jumpTo;

    @JsonCreator
    public BattlePassQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Title") String title,
        @JsonProperty("Exp") Integer exp,
        @JsonProperty("JumpTo") Integer jumpTo
    ) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.exp = exp;
        this.jumpTo = jumpTo;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getExp() {
        return this.exp;
    }

    public Integer getJumpTo() {
        return this.jumpTo;
    }

}
