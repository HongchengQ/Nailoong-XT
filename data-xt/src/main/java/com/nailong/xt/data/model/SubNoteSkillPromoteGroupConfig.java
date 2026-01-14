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
 * 对应文件: SubNoteSkillPromoteGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class SubNoteSkillPromoteGroupConfig {

    private final Integer id;
    private final Integer groupId;
    private final String subNoteSkills;
    private final Integer phase;

    @JsonCreator
    public SubNoteSkillPromoteGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("SubNoteSkills") String subNoteSkills,
        @JsonProperty("Phase") Integer phase
    ) {
        this.id = id;
        this.groupId = groupId;
        this.subNoteSkills = subNoteSkills;
        this.phase = phase;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getSubNoteSkills() {
        return this.subNoteSkills;
    }

    public Integer getPhase() {
        return this.phase;
    }

}
