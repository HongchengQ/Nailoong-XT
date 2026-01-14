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
 * 对应文件: DiscExtraAttribute.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscExtraAttributeConfig {

    private final String id;
    private final Integer groupId;
    private final Integer breakField;
    private final Integer atk;

    @JsonCreator
    public DiscExtraAttributeConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Break") Integer breakField,
        @JsonProperty("Atk") Integer atk
    ) {
        this.id = id;
        this.groupId = groupId;
        this.breakField = breakField;
        this.atk = atk;
    }

    public String getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getBreakField() {
        return this.breakField;
    }

    public Integer getAtk() {
        return this.atk;
    }

}
