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
 * 对应文件: ProduceHelper.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ProduceHelperConfig {

    private final Integer id;
    private final List<Integer> comCyoIds;
    private final Integer productionId;

    @JsonCreator
    public ProduceHelperConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ComCYOIds") List<Integer> comCyoIds,
        @JsonProperty("ProductionId") Integer productionId
    ) {
        this.id = id;
        this.comCyoIds = comCyoIds != null ? 
            new ArrayList<>(comCyoIds) : 
            new ArrayList<>();
        this.productionId = productionId;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getComCyoIds() {
        return this.comCyoIds;
    }

    public Integer getProductionId() {
        return this.productionId;
    }

}
