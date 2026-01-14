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
 * 对应文件: Title.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TitleConfig {

    private final Integer id;
    private final Integer itemId;
    private final Integer titleType;
    private final String desc;
    private final Integer sort;

    @JsonCreator
    public TitleConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("TitleType") Integer titleType,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Sort") Integer sort
    ) {
        this.id = id;
        this.itemId = itemId;
        this.titleType = titleType;
        this.desc = desc;
        this.sort = sort;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getTitleType() {
        return this.titleType;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getSort() {
        return this.sort;
    }

}
