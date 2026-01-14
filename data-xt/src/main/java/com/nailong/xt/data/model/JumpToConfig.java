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
 * 对应文件: JumpTo.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class JumpToConfig {

    private final Integer id;
    private final Integer type;
    private final List<Integer> param;
    private final String desc;
    private final String icon;

    @JsonCreator
    public JumpToConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Param") List<Integer> param,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Icon") String icon
    ) {
        this.id = id;
        this.type = type;
        this.param = param != null ? 
            new ArrayList<>(param) : 
            new ArrayList<>();
        this.desc = desc;
        this.icon = icon;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public List<Integer> getParam() {
        return this.param;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

}
