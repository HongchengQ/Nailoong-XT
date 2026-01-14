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
 * 对应文件: DictionaryEntry.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DictionaryEntryConfig {

    private final Integer id;
    private final Integer index;
    private final String title;
    private final Integer tab;
    private final Integer itemId;
    private final Integer qty;
    private final List<Integer> diagramList;
    private final Integer sort;
    private final Boolean popup;

    @JsonCreator
    public DictionaryEntryConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Index") Integer index,
        @JsonProperty("Title") String title,
        @JsonProperty("Tab") Integer tab,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("Qty") Integer qty,
        @JsonProperty("DiagramList") List<Integer> diagramList,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Popup") Boolean popup
    ) {
        this.id = id;
        this.index = index;
        this.title = title;
        this.tab = tab;
        this.itemId = itemId;
        this.qty = qty;
        this.diagramList = diagramList != null ? 
            new ArrayList<>(diagramList) : 
            new ArrayList<>();
        this.sort = sort;
        this.popup = popup;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getTab() {
        return this.tab;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getQty() {
        return this.qty;
    }

    public List<Integer> getDiagramList() {
        return this.diagramList;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Boolean getPopup() {
        return this.popup;
    }

}
