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
 * 对应文件: EffectDesc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EffectDescConfig {

    private final Integer id;
    private final Integer type2id;
    private final String desc;
    private final String randomAttrDesc;
    private final String icon;
    private final Integer format;
    private final Boolean isPercent;
    private final Integer typeId;
    private final String attribute;
    private final Integer wordId;

    @JsonCreator
    public EffectDescConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Type2ID") Integer type2id,
        @JsonProperty("Desc") String desc,
        @JsonProperty("RandomAttrDesc") String randomAttrDesc,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Format") Integer format,
        @JsonProperty("isPercent") Boolean isPercent,
        @JsonProperty("TypeID") Integer typeId,
        @JsonProperty("Attribute") String attribute,
        @JsonProperty("WordID") Integer wordId
    ) {
        this.id = id;
        this.type2id = type2id;
        this.desc = desc;
        this.randomAttrDesc = randomAttrDesc;
        this.icon = icon;
        this.format = format;
        this.isPercent = isPercent;
        this.typeId = typeId;
        this.attribute = attribute;
        this.wordId = wordId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType2id() {
        return this.type2id;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getRandomAttrDesc() {
        return this.randomAttrDesc;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getFormat() {
        return this.format;
    }

    public Boolean getIsPercent() {
        return this.isPercent;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public Integer getWordId() {
        return this.wordId;
    }

}
