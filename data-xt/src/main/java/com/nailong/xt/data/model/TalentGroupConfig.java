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
 * 对应文件: TalentGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TalentGroupConfig {

    private final Integer id;
    private final Integer charId;
    private final Integer nodeLimit;
    private final Integer background;
    private final String title;
    private final Integer preGroup;

    @JsonCreator
    public TalentGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("NodeLimit") Integer nodeLimit,
        @JsonProperty("Background") Integer background,
        @JsonProperty("Title") String title,
        @JsonProperty("PreGroup") Integer preGroup
    ) {
        this.id = id;
        this.charId = charId;
        this.nodeLimit = nodeLimit;
        this.background = background;
        this.title = title;
        this.preGroup = preGroup;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public Integer getNodeLimit() {
        return this.nodeLimit;
    }

    public Integer getBackground() {
        return this.background;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getPreGroup() {
        return this.preGroup;
    }

}
