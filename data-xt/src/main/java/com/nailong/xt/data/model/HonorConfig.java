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
 * 对应文件: Honor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class HonorConfig {

    private final Integer id;
    private final String name;
    private final Boolean isUnlock;
    private final Integer type;
    private final Integer tabType;
    private final String mainRes;
    private final String subRes;
    private final Integer bgType;
    private final List<Integer> params;

    @JsonCreator
    public HonorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("IsUnlock") Boolean isUnlock,
        @JsonProperty("Type") Integer type,
        @JsonProperty("TabType") Integer tabType,
        @JsonProperty("MainRes") String mainRes,
        @JsonProperty("SubRes") String subRes,
        @JsonProperty("BGType") Integer bgType,
        @JsonProperty("Params") List<Integer> params
    ) {
        this.id = id;
        this.name = name;
        this.isUnlock = isUnlock;
        this.type = type;
        this.tabType = tabType;
        this.mainRes = mainRes;
        this.subRes = subRes;
        this.bgType = bgType;
        this.params = params != null ? 
            new ArrayList<>(params) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getIsUnlock() {
        return this.isUnlock;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getTabType() {
        return this.tabType;
    }

    public String getMainRes() {
        return this.mainRes;
    }

    public String getSubRes() {
        return this.subRes;
    }

    public Integer getBgType() {
        return this.bgType;
    }

    public List<Integer> getParams() {
        return this.params;
    }

}
