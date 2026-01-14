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
 * 对应文件: ProductionType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ProductionTypeConfig {

    private final Integer id;
    private final String typeName;
    private final Integer sortId;

    @JsonCreator
    public ProductionTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TypeName") String typeName,
        @JsonProperty("SortId") Integer sortId
    ) {
        this.id = id;
        this.typeName = typeName;
        this.sortId = sortId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getSortId() {
        return this.sortId;
    }

}
