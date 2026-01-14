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
 * 对应文件: UiText.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class UiTextConfig {

    private final String id;
    private final String text;

    @JsonCreator
    public UiTextConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Text") String text
    ) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

}
