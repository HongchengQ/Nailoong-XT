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
 * 对应文件: InteractiveAction.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class InteractiveActionConfig {

    private final String icon0;
    private final String title0;
    private final String icon1;
    private final String title1;
    private final Integer id;
    private final Boolean playerAni;

    @JsonCreator
    public InteractiveActionConfig(
        @JsonProperty("Icon0") String icon0,
        @JsonProperty("Title0") String title0,
        @JsonProperty("Icon1") String icon1,
        @JsonProperty("Title1") String title1,
        @JsonProperty("Id") Integer id,
        @JsonProperty("PlayerAni") Boolean playerAni
    ) {
        this.icon0 = icon0;
        this.title0 = title0;
        this.icon1 = icon1;
        this.title1 = title1;
        this.id = id;
        this.playerAni = playerAni;
    }

    public String getIcon0() {
        return this.icon0;
    }

    public String getTitle0() {
        return this.title0;
    }

    public String getIcon1() {
        return this.icon1;
    }

    public String getTitle1() {
        return this.title1;
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getPlayerAni() {
        return this.playerAni;
    }

}
