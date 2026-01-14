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
 * 对应文件: CharAffinityTemplate.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharAffinityTemplateConfig {

    private final Integer id;
    private final Integer templateId;

    @JsonCreator
    public CharAffinityTemplateConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TemplateId") Integer templateId
    ) {
        this.id = id;
        this.templateId = templateId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

}
