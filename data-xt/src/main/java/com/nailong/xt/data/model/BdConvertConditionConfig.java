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
 * 对应文件: BdConvertCondition.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BdConvertConditionConfig {

    private final Integer id;
    private final Integer cond;
    private final List<Integer> condParams;
    private final String requestDes;

    @JsonCreator
    public BdConvertConditionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Cond") Integer cond,
        @JsonProperty("CondParams") List<Integer> condParams,
        @JsonProperty("RequestDes") String requestDes
    ) {
        this.id = id;
        this.cond = cond;
        this.condParams = condParams != null ? 
            new ArrayList<>(condParams) : 
            new ArrayList<>();
        this.requestDes = requestDes;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCond() {
        return this.cond;
    }

    public List<Integer> getCondParams() {
        return this.condParams;
    }

    public String getRequestDes() {
        return this.requestDes;
    }

}
