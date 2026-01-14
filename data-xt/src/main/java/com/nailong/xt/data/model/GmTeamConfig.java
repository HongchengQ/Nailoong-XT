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
 * 对应文件: GmTeam.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GmTeamConfig {

    private final Integer id;
    private final String name;
    private final List<Integer> teamCharacter;
    private final List<Integer> teamDisc;

    @JsonCreator
    public GmTeamConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("TeamCharacter") List<Integer> teamCharacter,
        @JsonProperty("TeamDisc") List<Integer> teamDisc
    ) {
        this.id = id;
        this.name = name;
        this.teamCharacter = teamCharacter != null ? 
            new ArrayList<>(teamCharacter) : 
            new ArrayList<>();
        this.teamDisc = teamDisc != null ? 
            new ArrayList<>(teamDisc) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Integer> getTeamCharacter() {
        return this.teamCharacter;
    }

    public List<Integer> getTeamDisc() {
        return this.teamDisc;
    }

}
