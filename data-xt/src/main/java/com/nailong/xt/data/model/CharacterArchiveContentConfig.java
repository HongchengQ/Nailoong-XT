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
 * 对应文件: CharacterArchiveContent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterArchiveContentConfig {

    private final Integer id;
    private final String title;
    private final String content;
    private final String updateContent1;
    private final Integer updateStory1;
    private final Integer updatePlot1;

    @JsonCreator
    public CharacterArchiveContentConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("Content") String content,
        @JsonProperty("UpdateContent1") String updateContent1,
        @JsonProperty("UpdateStory1") Integer updateStory1,
        @JsonProperty("UpdatePlot1") Integer updatePlot1
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.updateContent1 = updateContent1;
        this.updateStory1 = updateStory1;
        this.updatePlot1 = updatePlot1;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getUpdateContent1() {
        return this.updateContent1;
    }

    public Integer getUpdateStory1() {
        return this.updateStory1;
    }

    public Integer getUpdatePlot1() {
        return this.updatePlot1;
    }

}
