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
 * 对应文件: StoryChapter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryChapterConfig {

    private final Integer id;
    private final Integer type;
    private final Integer worldClass;
    private final String index;
    private final String name;
    private final String desc;
    private final String chapterIcon;
    private final String chapterYear;
    private final Integer unlockShowStoryId;
    private final List<String> prevStories;

    @JsonCreator
    public StoryChapterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("WorldClass") Integer worldClass,
        @JsonProperty("Index") String index,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ChapterIcon") String chapterIcon,
        @JsonProperty("ChapterYear") String chapterYear,
        @JsonProperty("UnlockShowStoryId") Integer unlockShowStoryId,
        @JsonProperty("PrevStories") List<String> prevStories
    ) {
        this.id = id;
        this.type = type;
        this.worldClass = worldClass;
        this.index = index;
        this.name = name;
        this.desc = desc;
        this.chapterIcon = chapterIcon;
        this.chapterYear = chapterYear;
        this.unlockShowStoryId = unlockShowStoryId;
        this.prevStories = prevStories != null ? 
            new ArrayList<>(prevStories) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getWorldClass() {
        return this.worldClass;
    }

    public String getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getChapterIcon() {
        return this.chapterIcon;
    }

    public String getChapterYear() {
        return this.chapterYear;
    }

    public Integer getUnlockShowStoryId() {
        return this.unlockShowStoryId;
    }

    public List<String> getPrevStories() {
        return this.prevStories;
    }

}
