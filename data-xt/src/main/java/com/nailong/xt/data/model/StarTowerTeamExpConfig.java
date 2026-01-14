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
 * 对应文件: StarTowerTeamExp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerTeamExpConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer level;
    private final Integer needExp;

    @JsonCreator
    public StarTowerTeamExpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("Level") Integer level,
        @JsonProperty("NeedExp") Integer needExp
    ) {
        this.id = id;
        this.groupId = groupId;
        this.level = level;
        this.needExp = needExp;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getNeedExp() {
        return this.needExp;
    }

}
