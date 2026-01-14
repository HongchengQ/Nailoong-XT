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
 * 对应文件: MailTemplate.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MailTemplateConfig {

    private final Integer id;
    private final String explanation;
    private final String icon;
    private final String author;
    private final String letterPaper;
    private final String subject;
    private final String desc;
    private final Integer type;

    @JsonCreator
    public MailTemplateConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Explanation") String explanation,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Author") String author,
        @JsonProperty("LetterPaper") String letterPaper,
        @JsonProperty("Subject") String subject,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Type") Integer type
    ) {
        this.id = id;
        this.explanation = explanation;
        this.icon = icon;
        this.author = author;
        this.letterPaper = letterPaper;
        this.subject = subject;
        this.desc = desc;
        this.type = type;
    }

    public Integer getId() {
        return this.id;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getLetterPaper() {
        return this.letterPaper;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getType() {
        return this.type;
    }

}
