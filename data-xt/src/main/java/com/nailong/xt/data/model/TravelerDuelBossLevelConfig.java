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
 * 对应文件: TravelerDuelBossLevel.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TravelerDuelBossLevelConfig {

    private final Integer id;
    private final Integer bossId;
    private final String name;
    private final String desc;
    private final Integer suggestedPower;
    private final Integer recommendBuildRank;
    private final List<Integer> eet;
    private final Integer timelimit;
    private final Integer previewMonsterGroupId;
    private final Integer floorId;
    private final String icon;
    private final String cover;
    private final Integer skinId;

    @JsonCreator
    public TravelerDuelBossLevelConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BossId") Integer bossId,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("SuggestedPower") Integer suggestedPower,
        @JsonProperty("RecommendBuildRank") Integer recommendBuildRank,
        @JsonProperty("EET") List<Integer> eet,
        @JsonProperty("Timelimit") Integer timelimit,
        @JsonProperty("PreviewMonsterGroupId") Integer previewMonsterGroupId,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Cover") String cover,
        @JsonProperty("SkinId") Integer skinId
    ) {
        this.id = id;
        this.bossId = bossId;
        this.name = name;
        this.desc = desc;
        this.suggestedPower = suggestedPower;
        this.recommendBuildRank = recommendBuildRank;
        this.eet = eet != null ? 
            new ArrayList<>(eet) : 
            new ArrayList<>();
        this.timelimit = timelimit;
        this.previewMonsterGroupId = previewMonsterGroupId;
        this.floorId = floorId;
        this.icon = icon;
        this.cover = cover;
        this.skinId = skinId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBossId() {
        return this.bossId;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getSuggestedPower() {
        return this.suggestedPower;
    }

    public Integer getRecommendBuildRank() {
        return this.recommendBuildRank;
    }

    public List<Integer> getEet() {
        return this.eet;
    }

    public Integer getTimelimit() {
        return this.timelimit;
    }

    public Integer getPreviewMonsterGroupId() {
        return this.previewMonsterGroupId;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getCover() {
        return this.cover;
    }

    public Integer getSkinId() {
        return this.skinId;
    }

}
