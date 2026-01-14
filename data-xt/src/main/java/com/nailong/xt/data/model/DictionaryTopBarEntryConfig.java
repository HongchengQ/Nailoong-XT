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
 * 对应文件: DictionaryTopBarEntry.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DictionaryTopBarEntryConfig {

    private final Integer id;
    private final String title;
    private final List<Integer> diagramList;

    @JsonCreator
    public DictionaryTopBarEntryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Title") String title,
        @JsonProperty("DiagramList") List<Integer> diagramList
    ) {
        this.id = id;
        this.title = title;
        this.diagramList = diagramList != null ? 
            new ArrayList<>(diagramList) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public List<Integer> getDiagramList() {
        return this.diagramList;
    }

}
