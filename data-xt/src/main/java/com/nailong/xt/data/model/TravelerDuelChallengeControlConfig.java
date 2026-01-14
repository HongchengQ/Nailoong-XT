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
 * 对应文件: TravelerDuelChallengeControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TravelerDuelChallengeControlConfig {

    private final Integer id;
    private final Integer bossLevelId;
    private final String affixGroupIds;
    private final Integer questGroupId;
    private final String backGroundSource;
    private final String openTime;
    private final String endTime;
    private final String fastEntranceIcon;

    @JsonCreator
    public TravelerDuelChallengeControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BossLevelId") Integer bossLevelId,
        @JsonProperty("AffixGroupIds") String affixGroupIds,
        @JsonProperty("QuestGroupId") Integer questGroupId,
        @JsonProperty("BackGroundSource") String backGroundSource,
        @JsonProperty("OpenTime") String openTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("FastEntranceIcon") String fastEntranceIcon
    ) {
        this.id = id;
        this.bossLevelId = bossLevelId;
        this.affixGroupIds = affixGroupIds;
        this.questGroupId = questGroupId;
        this.backGroundSource = backGroundSource;
        this.openTime = openTime;
        this.endTime = endTime;
        this.fastEntranceIcon = fastEntranceIcon;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBossLevelId() {
        return this.bossLevelId;
    }

    public String getAffixGroupIds() {
        return this.affixGroupIds;
    }

    public Integer getQuestGroupId() {
        return this.questGroupId;
    }

    public String getBackGroundSource() {
        return this.backGroundSource;
    }

    public String getOpenTime() {
        return this.openTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getFastEntranceIcon() {
        return this.fastEntranceIcon;
    }

}
