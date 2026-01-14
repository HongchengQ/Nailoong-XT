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
 * 对应文件: StarTowerEventOptionAction.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerEventOptionActionConfig {

    private final Integer id;
    private final Integer optionId;
    private final String desc;
    private final Integer group;

    @JsonCreator
    public StarTowerEventOptionActionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("OptionId") Integer optionId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Group") Integer group
    ) {
        this.id = id;
        this.optionId = optionId;
        this.desc = desc;
        this.group = group;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getOptionId() {
        return this.optionId;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getGroup() {
        return this.group;
    }

}
