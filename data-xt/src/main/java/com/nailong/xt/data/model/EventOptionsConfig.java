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
 * 对应文件: EventOptions.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EventOptionsConfig {

    private final Integer id;
    private final String desc;

    @JsonCreator
    public EventOptionsConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Desc") String desc
    ) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

}
