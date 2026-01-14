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
 * 对应文件: ErrorCode.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ErrorCodeConfig {

    private final Integer id;
    private final String title;
    private final String template;
    private final Integer showType;

    @JsonCreator
    public ErrorCodeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Template") String template,
        @JsonProperty("ShowType") Integer showType
    ) {
        this.id = id;
        this.title = title;
        this.template = template;
        this.showType = showType;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTemplate() {
        return this.template;
    }

    public Integer getShowType() {
        return this.showType;
    }

}
