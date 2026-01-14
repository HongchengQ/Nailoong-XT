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
 * 对应文件: ScoreBossLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossLevelConfig {

    private final Integer id;
    private final Integer floorId;
    private final Integer monsterId;
    private final Integer nonDamageScoreGet;
    private final Integer scoreBossAbility;
    private final Integer scoreGetSwitchGroup;
    private final String episode;
    private final String image;
    private final String bg;
    private final Boolean summonLevelUp;

    @JsonCreator
    public ScoreBossLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("MonsterId") Integer monsterId,
        @JsonProperty("NonDamageScoreGet") Integer nonDamageScoreGet,
        @JsonProperty("ScoreBossAbility") Integer scoreBossAbility,
        @JsonProperty("ScoreGetSwitchGroup") Integer scoreGetSwitchGroup,
        @JsonProperty("Episode") String episode,
        @JsonProperty("Image") String image,
        @JsonProperty("BG") String bg,
        @JsonProperty("SummonLevelUp") Boolean summonLevelUp
    ) {
        this.id = id;
        this.floorId = floorId;
        this.monsterId = monsterId;
        this.nonDamageScoreGet = nonDamageScoreGet;
        this.scoreBossAbility = scoreBossAbility;
        this.scoreGetSwitchGroup = scoreGetSwitchGroup;
        this.episode = episode;
        this.image = image;
        this.bg = bg;
        this.summonLevelUp = summonLevelUp;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getMonsterId() {
        return this.monsterId;
    }

    public Integer getNonDamageScoreGet() {
        return this.nonDamageScoreGet;
    }

    public Integer getScoreBossAbility() {
        return this.scoreBossAbility;
    }

    public Integer getScoreGetSwitchGroup() {
        return this.scoreGetSwitchGroup;
    }

    public String getEpisode() {
        return this.episode;
    }

    public String getImage() {
        return this.image;
    }

    public String getBg() {
        return this.bg;
    }

    public Boolean getSummonLevelUp() {
        return this.summonLevelUp;
    }

}
