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
 * 对应文件: GachaNewbie.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaNewbieConfig {

    private final Integer id;
    private final Integer spinCount;
    private final Integer saveCount;

    @JsonCreator
    public GachaNewbieConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SpinCount") Integer spinCount,
        @JsonProperty("SaveCount") Integer saveCount
    ) {
        this.id = id;
        this.spinCount = spinCount;
        this.saveCount = saveCount;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSpinCount() {
        return this.spinCount;
    }

    public Integer getSaveCount() {
        return this.saveCount;
    }

}
