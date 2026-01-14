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
 * 对应文件: VampireRankSeason.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireRankSeasonConfig {

    private final Integer id;
    private final Integer missionId;
    private final String openTime;
    private final String endTime;
    private final List<Integer> fateCardBundle;
    private final String speciaFateCard;
    private final String speciaFateCardParam;
    private final Integer questGroup;

    @JsonCreator
    public VampireRankSeasonConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MissionId") Integer missionId,
        @JsonProperty("OpenTime") String openTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("FateCardBundle") List<Integer> fateCardBundle,
        @JsonProperty("SpeciaFateCard") String speciaFateCard,
        @JsonProperty("SpeciaFateCardParam") String speciaFateCardParam,
        @JsonProperty("QuestGroup") Integer questGroup
    ) {
        this.id = id;
        this.missionId = missionId;
        this.openTime = openTime;
        this.endTime = endTime;
        this.fateCardBundle = fateCardBundle != null ? 
            new ArrayList<>(fateCardBundle) : 
            new ArrayList<>();
        this.speciaFateCard = speciaFateCard;
        this.speciaFateCardParam = speciaFateCardParam;
        this.questGroup = questGroup;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getMissionId() {
        return this.missionId;
    }

    public String getOpenTime() {
        return this.openTime;
    }

    public String getEndTime() {
        return this.endTime;
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

    public Integer getQuestGroup() {
        return this.questGroup;
    }

}
