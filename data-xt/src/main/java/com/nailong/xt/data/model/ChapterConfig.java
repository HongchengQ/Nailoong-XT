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
 * 对应文件: Chapter.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ChapterConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Integer chapterType;
    private final Integer worldClass;
    private final String completeRewards;
    private final String chapterImg;
    private final String chapterIcon;
    private final List<Integer> prevMainlines;

    @JsonCreator
    public ChapterConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ChapterType") Integer chapterType,
        @JsonProperty("WorldClass") Integer worldClass,
        @JsonProperty("CompleteRewards") String completeRewards,
        @JsonProperty("ChapterImg") String chapterImg,
        @JsonProperty("ChapterIcon") String chapterIcon,
        @JsonProperty("PrevMainlines") List<Integer> prevMainlines
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.chapterType = chapterType;
        this.worldClass = worldClass;
        this.completeRewards = completeRewards;
        this.chapterImg = chapterImg;
        this.chapterIcon = chapterIcon;
        this.prevMainlines = prevMainlines != null ? 
            new ArrayList<>(prevMainlines) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getChapterType() {
        return this.chapterType;
    }

    public Integer getWorldClass() {
        return this.worldClass;
    }

    public String getCompleteRewards() {
        return this.completeRewards;
    }

    public String getChapterImg() {
        return this.chapterImg;
    }

    public String getChapterIcon() {
        return this.chapterIcon;
    }

    public List<Integer> getPrevMainlines() {
        return this.prevMainlines;
    }

}
