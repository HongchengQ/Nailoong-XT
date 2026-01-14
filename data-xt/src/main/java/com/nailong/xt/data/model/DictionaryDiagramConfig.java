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
 * 对应文件: DictionaryDiagram.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DictionaryDiagramConfig {

    private final Integer id;
    private final String title;
    private final String desc;
    private final String icon;

    @JsonCreator
    public DictionaryDiagramConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Icon") String icon
    ) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.icon = icon;
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

    public String getIcon() {
        return this.icon;
    }

}
