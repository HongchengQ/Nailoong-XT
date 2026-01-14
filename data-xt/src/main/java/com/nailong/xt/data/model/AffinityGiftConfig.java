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
 * 对应文件: AffinityGift.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AffinityGiftConfig {

    private final Integer id;
    private final Integer baseAffinity;
    private final List<Integer> tags;

    @JsonCreator
    public AffinityGiftConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BaseAffinity") Integer baseAffinity,
        @JsonProperty("Tags") List<Integer> tags
    ) {
        this.id = id;
        this.baseAffinity = baseAffinity;
        this.tags = tags != null ? 
            new ArrayList<>(tags) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBaseAffinity() {
        return this.baseAffinity;
    }

    public List<Integer> getTags() {
        return this.tags;
    }

}
