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
 * 对应文件: ContentWord.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ContentWordConfig {

    private final Integer id;
    private final String presetColor;
    private final String word;

    @JsonCreator
    public ContentWordConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("PresetColor") String presetColor,
        @JsonProperty("Word") String word
    ) {
        this.id = id;
        this.presetColor = presetColor;
        this.word = word;
    }

    public Integer getId() {
        return this.id;
    }

    public String getPresetColor() {
        return this.presetColor;
    }

    public String getWord() {
        return this.word;
    }

}
