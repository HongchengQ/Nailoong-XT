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
 * 对应文件: Html.json.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HtmlConfigConfig {

    private final Integer id;
    private final String htmlFrame;

    @JsonCreator
    public HtmlConfigConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("HtmlFrame") String htmlFrame
    ) {
        this.id = id;
        this.htmlFrame = htmlFrame;
    }

    public Integer getId() {
        return this.id;
    }

    public String getHtmlFrame() {
        return this.htmlFrame;
    }

}
