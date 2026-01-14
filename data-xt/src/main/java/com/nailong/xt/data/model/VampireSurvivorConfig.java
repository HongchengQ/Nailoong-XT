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
 * 对应文件: VampireSurvivor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireSurvivorConfig {

    private final Integer id;
    private final String name;
    private final String name1;
    private final String name2;
    private final List<Integer> eet;
    private final Integer suggestedPower;
    private final Integer recommendBuildRank;
    private final Integer mode;
    private final Integer type;
    private final Integer needWorldClass;
    private final Integer firstQuestGroupId;
    private final Integer levelGroupId;
    private final Integer floorId;
    private final Integer normalScore1;
    private final Integer eliteScore1;
    private final Integer bossScore1;
    private final Integer timeScore1;
    private final Integer timeLimit1;
    private final Integer normalScore2;
    private final Integer eliteScore2;
    private final Integer bossScore2;
    private final Integer timeScore2;
    private final Integer timeLimit2;
    private final List<Integer> eetScore1;
    private final List<Integer> eetScore2;
    private final Integer fhPreviewMonsterGroupId;
    private final Integer shPreviewMonsterGroupId;
    private final String coverEpisode;
    private final String episode;
    private final List<Integer> fateCardBundle;
    private final String speciaFateCard;
    private final String speciaFateCardParam;
    private final List<Integer> notEet;
    private final Integer preLevelId;
    private final String episode2;

    @JsonCreator
    public VampireSurvivorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Name1") String name1,
        @JsonProperty("Name2") String name2,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("Mode") Integer mode,
        @JsonProperty("Type") Integer type,
        @JsonProperty("NeedWorldClass") Integer needWorldClass,
        @JsonProperty("FirstQuestGroupId") Integer firstQuestGroupId,
        @JsonProperty("LevelGroupId") Integer levelGroupId,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("NormalScore1") Integer normalScore1,
        @JsonProperty("EliteScore1") Integer eliteScore1,
        @JsonProperty("BossScore1") Integer bossScore1,
        @JsonProperty("TimeScore1") Integer timeScore1,
        @JsonProperty("TimeLimit1") Integer timeLimit1,
        @JsonProperty("NormalScore2") Integer normalScore2,
        @JsonProperty("EliteScore2") Integer eliteScore2,
        @JsonProperty("BossScore2") Integer bossScore2,
        @JsonProperty("TimeScore2") Integer timeScore2,
        @JsonProperty("TimeLimit2") Integer timeLimit2,
        @JsonProperty("EETScore1") List<Integer> eetScore1,
        @JsonProperty("EETScore2") List<Integer> eetScore2,
        @JsonProperty("FHPreviewMonsterGroupId") Integer fhPreviewMonsterGroupId,
        @JsonProperty("SHPreviewMonsterGroupId") Integer shPreviewMonsterGroupId,
        @JsonProperty("CoverEpisode") String coverEpisode,
        @JsonProperty("Episode") String episode,
        @JsonProperty("FateCardBundle") List<Integer> fateCardBundle,
        @JsonProperty("SpeciaFateCard") String speciaFateCard,
        @JsonProperty("SpeciaFateCardParam") String speciaFateCardParam,
        @JsonProperty("NotEET") List<Integer> notEet,
        @JsonProperty("PreLevelId") Integer preLevelId,
        @JsonProperty("Episode2") String episode2
    ) {
        this.id = id;
        this.name = name;
        this.name1 = name1;
        this.name2 = name2;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.suggestedPower = suggestedPower;
        this.recommendBuildRank = recommendBuildRank;
        this.mode = mode;
        this.type = type;
        this.needWorldClass = needWorldClass;
        this.firstQuestGroupId = firstQuestGroupId;
        this.levelGroupId = levelGroupId;
        this.floorId = floorId;
        this.normalScore1 = normalScore1;
        this.eliteScore1 = eliteScore1;
        this.bossScore1 = bossScore1;
        this.timeScore1 = timeScore1;
        this.timeLimit1 = timeLimit1;
        this.normalScore2 = normalScore2;
        this.eliteScore2 = eliteScore2;
        this.bossScore2 = bossScore2;
        this.timeScore2 = timeScore2;
        this.timeLimit2 = timeLimit2;
        this.eetScore1 = eetScore1 != null ? 
            new ArrayList<>(eetScore1) : 
            new ArrayList<>();
        this.eetScore2 = eetScore2 != null ? 
            new ArrayList<>(eetScore2) : 
            new ArrayList<>();
        this.fhPreviewMonsterGroupId = fhPreviewMonsterGroupId;
        this.shPreviewMonsterGroupId = shPreviewMonsterGroupId;
        this.coverEpisode = coverEpisode;
        this.episode = episode;
        this.fateCardBundle = fateCardBundle != null ? 
            new ArrayList<>(fateCardBundle) : 
            new ArrayList<>();
        this.speciaFateCard = speciaFateCard;
        this.speciaFateCardParam = speciaFateCardParam;
        this.notEet = notEet != null ? 
            new ArrayList<>(notEet) : 
            new ArrayList<>();
        this.preLevelId = preLevelId;
        this.episode2 = episode2;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getName1() {
        return this.name1;
    }

    public String getName2() {
        return this.name2;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public Integer getMode() {
        return this.mode;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getNeedWorldClass() {
        return this.needWorldClass;
    }

    public Integer getFirstQuestGroupId() {
        return this.firstQuestGroupId;
    }

    public Integer getLevelGroupId() {
        return this.levelGroupId;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getNormalScore1() {
        return this.normalScore1;
    }

    public Integer getEliteScore1() {
        return this.eliteScore1;
    }

    public Integer getBossScore1() {
        return this.bossScore1;
    }

    public Integer getTimeScore1() {
        return this.timeScore1;
    }

    public Integer getTimeLimit1() {
        return this.timeLimit1;
    }

    public Integer getNormalScore2() {
        return this.normalScore2;
    }

    public Integer getEliteScore2() {
        return this.eliteScore2;
    }

    public Integer getBossScore2() {
        return this.bossScore2;
    }

    public Integer getTimeScore2() {
        return this.timeScore2;
    }

    public Integer getTimeLimit2() {
        return this.timeLimit2;
    }

    public List<Integer> getEetScore1() {
        return this.eetScore1;
    }

    public List<Integer> getEetScore2() {
        return this.eetScore2;
    }

    public Integer getFhPreviewMonsterGroupId() {
        return this.fhPreviewMonsterGroupId;
    }

    public Integer getShPreviewMonsterGroupId() {
        return this.shPreviewMonsterGroupId;
    }

    public String getCoverEpisode() {
        return this.coverEpisode;
    }

    public String getEpisode() {
        return this.episode;
    }

    public List<Integer> getFateCardBundle() {
        return this.fateCardBundle;
    }

    public String getSpeciaFateCard() {
        return this.speciaFateCard;
    }

    public String getSpeciaFateCardParam() {
        return this.speciaFateCardParam;
    }

    public List<Integer> getNotEet() {
        return this.notEet;
    }

    public Integer getPreLevelId() {
        return this.preLevelId;
    }

    public String getEpisode2() {
        return this.episode2;
    }

}
