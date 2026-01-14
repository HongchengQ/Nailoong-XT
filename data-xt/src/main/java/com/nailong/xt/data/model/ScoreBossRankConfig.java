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
 * 对应文件: ScoreBossRank.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ScoreBossRankConfig {

    private final Integer id;
    private final Integer seasonId;
    private final Integer rankLower;
    private final Integer awardItemTid1;
    private final Integer awardItemNum1;
    private final Integer awardItemTid2;
    private final Integer awardItemNum2;

    @JsonCreator
    public ScoreBossRankConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("SeasonId") Integer seasonId,
        @JsonProperty("RankLower") Integer rankLower,
        @JsonProperty("AwardItemTid1") Integer awardItemTid1,
        @JsonProperty("AwardItemNum1") Integer awardItemNum1,
        @JsonProperty("AwardItemTid2") Integer awardItemTid2,
        @JsonProperty("AwardItemNum2") Integer awardItemNum2
    ) {
        this.id = id;
        this.seasonId = seasonId;
        this.rankLower = rankLower;
        this.awardItemTid1 = awardItemTid1;
        this.awardItemNum1 = awardItemNum1;
        this.awardItemTid2 = awardItemTid2;
        this.awardItemNum2 = awardItemNum2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSeasonId() {
        return this.seasonId;
    }

    public Integer getRankLower() {
        return this.rankLower;
    }

    public Integer getAwardItemTid1() {
        return this.awardItemTid1;
    }

    public Integer getAwardItemNum1() {
        return this.awardItemNum1;
    }

    public Integer getAwardItemTid2() {
        return this.awardItemTid2;
    }

    public Integer getAwardItemNum2() {
        return this.awardItemNum2;
    }

}
