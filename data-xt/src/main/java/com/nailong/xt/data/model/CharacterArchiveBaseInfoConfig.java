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
 * 对应文件: CharacterArchiveBaseInfo.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterArchiveBaseInfoConfig {

    private final Integer id;
    private final Integer characterId;
    private final String title;
    private final String content;
    private final Integer sort;
    private final String updateContent1;
    private final Integer updateStory1;

    @JsonCreator
    public CharacterArchiveBaseInfoConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharacterId") Integer characterId,
        @JsonProperty("Title") String title,
        @JsonProperty("Content") String content,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("UpdateContent1") String updateContent1,
        @JsonProperty("UpdateStory1") Integer updateStory1
    ) {
        this.id = id;
        this.characterId = characterId;
        this.title = title;
        this.content = content;
        this.sort = sort;
        this.updateContent1 = updateContent1;
        this.updateStory1 = updateStory1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getUpdateContent1() {
        return this.updateContent1;
    }

    public Integer getUpdateStory1() {
        return this.updateStory1;
    }

}
