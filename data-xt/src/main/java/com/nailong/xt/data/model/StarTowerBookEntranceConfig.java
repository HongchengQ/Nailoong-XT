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
 * 对应文件: StarTowerBookEntrance.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBookEntranceConfig {

    private final Integer id;
    private final String icon;
    private final String position;
    private final String desc;

    @JsonCreator
    public StarTowerBookEntranceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Position") String position,
        @JsonProperty("Desc") String desc
    ) {
        this.id = id;
        this.icon = icon;
        this.position = position;
        this.desc = desc;
    }

    public Integer getId() {
        return this.id;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getPosition() {
        return this.position;
    }

    public String getDesc() {
        return this.desc;
    }

}
