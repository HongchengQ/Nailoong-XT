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
 * 对应文件: StarTowerEventAction.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerEventActionConfig {

    private final Integer id;
    private final Integer eventId;
    private final String desc;
    private final Integer group;

    @JsonCreator
    public StarTowerEventActionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("EventId") Integer eventId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Group") Integer group
    ) {
        this.id = id;
        this.eventId = eventId;
        this.desc = desc;
        this.group = group;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getEventId() {
        return this.eventId;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getGroup() {
        return this.group;
    }

}
