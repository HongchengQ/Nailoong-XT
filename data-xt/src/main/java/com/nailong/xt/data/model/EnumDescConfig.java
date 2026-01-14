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
 * 对应文件: EnumDesc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EnumDescConfig {

    private final String enumName;
    private final Integer value;
    private final String key;

    @JsonCreator
    public EnumDescConfig(
        @JsonProperty("EnumName") String enumName,
        @JsonProperty("Value") Integer value,
        @JsonProperty("Key") String key
    ) {
        this.enumName = enumName;
        this.value = value;
        this.key = key;
    }

    public String getEnumName() {
        return this.enumName;
    }

    public Integer getValue() {
        return this.value;
    }

    public String getKey() {
        return this.key;
    }

}
