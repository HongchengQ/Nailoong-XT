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
 * 对应文件: JointDrillLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class JointDrillLevelConfig {

    private final Integer id;
    private final Integer difficulty;
    private final Integer drillLevelGroupId;
    private final Integer maxBattleNum;
    private final Integer floorId;
    private final Integer battleTime;
    private final Integer hpBarNum;
    private final Integer bossId;
    private final Integer firstRrDropId;
    private final String rewardPreview;
    private final Integer timeScore;
    private final Integer scorePerSec;
    private final Integer levelScore;
    private final Integer baseHpScore;
    private final String levelImage;
    private final String levelImageGoing;
    private final List<Integer> bossAffix;
    private final Integer recommendBuildRank;
    private final Integer recommendLv;
    private final String subName;
    private final Integer preLevelId;

    @JsonCreator
    public JointDrillLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Difficulty") Integer difficulty,
        @JsonProperty("DrillLevelGroupId") Integer drillLevelGroupId,
        @JsonProperty("MaxBattleNum") Integer maxBattleNum,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("BattleTime") Integer battleTime,
        @JsonProperty("HpBarNum") Integer hpBarNum,
        @JsonProperty("BossId") Integer bossId,
        @JsonProperty("FirstRRDropId") Integer firstRrDropId,
        @JsonProperty("RewardPreview") String rewardPreview,
        @JsonProperty("TimeScore") Integer timeScore,
        @JsonProperty("ScorePerSec") Integer scorePerSec,
        @JsonProperty("LevelScore") Integer levelScore,
        @JsonProperty("BaseHpScore") Integer baseHpScore,
        @JsonProperty("LevelImage") String levelImage,
        @JsonProperty("LevelImageGoing") String levelImageGoing,
        @JsonProperty("BossAffix") List<Integer> bossAffix,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("RecommendLv") Integer recommendLv,
        @JsonProperty("SubName") String subName,
        @JsonProperty("PreLevelId") Integer preLevelId
    ) {
        this.id = id;
        this.difficulty = difficulty;
        this.drillLevelGroupId = drillLevelGroupId;
        this.maxBattleNum = maxBattleNum;
        this.floorId = floorId;
        this.battleTime = battleTime;
        this.hpBarNum = hpBarNum;
        this.bossId = bossId;
        this.firstRrDropId = firstRrDropId;
        this.rewardPreview = rewardPreview;
        this.timeScore = timeScore;
        this.scorePerSec = scorePerSec;
        this.levelScore = levelScore;
        this.baseHpScore = baseHpScore;
        this.levelImage = levelImage;
        this.levelImageGoing = levelImageGoing;
        this.bossAffix = bossAffix != null ? 
            new ArrayList<>(bossAffix) : 
            new ArrayList<>();
        this.recommendBuildRank = recommendBuildRank;
        this.recommendLv = recommendLv;
        this.subName = subName;
        this.preLevelId = preLevelId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public Integer getDrillLevelGroupId() {
        return this.drillLevelGroupId;
    }

    public Integer getMaxBattleNum() {
        return this.maxBattleNum;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getBattleTime() {
        return this.battleTime;
    }

    public Integer getHpBarNum() {
        return this.hpBarNum;
    }

    public Integer getBossId() {
        return this.bossId;
    }

    public Integer getFirstRrDropId() {
        return this.firstRrDropId;
    }

    public String getRewardPreview() {
        return this.rewardPreview;
    }

    public Integer getTimeScore() {
        return this.timeScore;
    }

    public Integer getScorePerSec() {
        return this.scorePerSec;
    }

    public Integer getLevelScore() {
        return this.levelScore;
    }

    public Integer getBaseHpScore() {
        return this.baseHpScore;
    }

    public String getLevelImage() {
        return this.levelImage;
    }

    public String getLevelImageGoing() {
        return this.levelImageGoing;
    }

    public List<Integer> getBossAffix() {
        return this.bossAffix;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getRecommendLv() {
        return this.recommendLv;
    }

    public String getSubName() {
        return this.subName;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

}
