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
 * 对应文件: Item.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ItemConfig {

    private final Integer id;
    private final String title;
    private final String desc;
    private final String literary;
    private final Integer type;
    private final Integer stype;
    private final Integer rarity;
    private final Boolean stack;
    private final Integer positionLimit;
    private final String icon;
    private final String icon2;
    private final Boolean disHaving;
    private final Boolean display;
    private final List<Integer> jumpTo;
    private final Integer expireType;
    private final String expireDate;
    private final Integer useMode;
    private final Integer useAction;
    private final String useArgs;

    @JsonCreator
    public ItemConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Literary") String literary,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Stype") Integer stype,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("Stack") Boolean stack,
        @JsonProperty("PositionLimit") Integer positionLimit,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Icon2") String icon2,
        @JsonProperty("DisHaving") Boolean disHaving,
        @JsonProperty("Display") Boolean display,
        @JsonProperty("JumpTo") List<Integer> jumpTo,
        @JsonProperty("ExpireType") Integer expireType,
        @JsonProperty("ExpireDate") String expireDate,
        @JsonProperty("UseMode") Integer useMode,
        @JsonProperty("UseAction") Integer useAction,
        @JsonProperty("UseArgs") String useArgs
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.literary = literary;
        this.type = type;
        this.stype = stype;
        this.rarity = rarity;
        this.stack = stack;
        this.positionLimit = positionLimit;
        this.icon = icon;
        this.icon2 = icon2;
        this.disHaving = disHaving;
        this.display = display;
        this.jumpTo = jumpTo != null ? 
            new ArrayList<>(jumpTo) : 
            new ArrayList<>();
        this.expireType = expireType;
        this.expireDate = expireDate;
        this.useMode = useMode;
        this.useAction = useAction;
        this.useArgs = useArgs;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getLiterary() {
        return this.literary;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getStype() {
        return this.stype;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public Boolean getStack() {
        return this.stack;
    }

    public Integer getPositionLimit() {
        return this.positionLimit;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIcon2() {
        return this.icon2;
    }

    public Boolean getDisHaving() {
        return this.disHaving;
    }

    public Boolean getDisplay() {
        return this.display;
    }

    public List<Integer> getJumpTo() {
        return this.jumpTo;
    }

    public Integer getExpireType() {
        return this.expireType;
    }

    public String getExpireDate() {
        return this.expireDate;
    }

    public Integer getUseMode() {
        return this.useMode;
    }

    public Integer getUseAction() {
        return this.useAction;
    }

    public String getUseArgs() {
        return this.useArgs;
    }

}
