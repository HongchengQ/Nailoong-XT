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
 * 对应文件: DictionaryTab.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DictionaryTabConfig {

    private final Integer id;
    private final String icon;
    private final String icon2;
    private final String title;
    private final Boolean hideInBattle;

    @JsonCreator
    public DictionaryTabConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Icon2") String icon2,
        @JsonProperty("Title") String title,
        @JsonProperty("HideInBattle") Boolean hideInBattle
    ) {
        this.id = id;
        this.icon = icon;
        this.icon2 = icon2;
        this.title = title;
        this.hideInBattle = hideInBattle;
    }

    public Integer getId() {
        return this.id;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIcon2() {
        return this.icon2;
    }

    public String getTitle() {
        return this.title;
    }

    public Boolean getHideInBattle() {
        return this.hideInBattle;
    }

}
