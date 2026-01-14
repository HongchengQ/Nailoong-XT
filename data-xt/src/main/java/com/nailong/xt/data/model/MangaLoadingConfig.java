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
 * 对应文件: MangaLoading.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MangaLoadingConfig {

    private final Integer id;
    private final String source;
    private final String title;
    private final Integer conditionType;
    private final Integer weight;

    @JsonCreator
    public MangaLoadingConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Source") String source,
        @JsonProperty("Title") String title,
        @JsonProperty("ConditionType") Integer conditionType,
        @JsonProperty("Weight") Integer weight
    ) {
        this.id = id;
        this.source = source;
        this.title = title;
        this.conditionType = conditionType;
        this.weight = weight;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getConditionType() {
        return this.conditionType;
    }

    public Integer getWeight() {
        return this.weight;
    }

}
