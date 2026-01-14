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
 * 对应文件: Agent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AgentConfig {

    private final Integer id;
    private final Integer tab;
    private final String note;
    private final String name;
    private final String desc;
    private final String consignor;
    private final Integer refreshType;
    private final Integer memberType;
    private final Integer level;
    private final Integer memberLimit;
    private final List<Integer> tags;
    private final List<Integer> extraTags;
    private final String unlockConditions;
    private final Integer sort;
    private final Integer time1;
    private final String rewardPreview1;
    private final String bonusPreview1;
    private final Integer time2;
    private final String rewardPreview2;
    private final String bonusPreview2;
    private final Integer time3;
    private final String rewardPreview3;
    private final String bonusPreview3;
    private final Integer time4;
    private final String rewardPreview4;
    private final String bonusPreview4;

    @JsonCreator
    public AgentConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Tab") Integer tab,
        @JsonProperty("Note") String note,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Consignor") String consignor,
        @JsonProperty("RefreshType") Integer refreshType,
        @JsonProperty("MemberType") Integer memberType,
        @JsonProperty("Level") Integer level,
        @JsonProperty("MemberLimit") Integer memberLimit,
        @JsonProperty("Tags") List<Integer> tags,
        @JsonProperty("ExtraTags") List<Integer> extraTags,
        @JsonProperty("UnlockConditions") String unlockConditions,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Time1") Integer time1,
        @JsonProperty("RewardPreview1") String rewardPreview1,
        @JsonProperty("BonusPreview1") String bonusPreview1,
        @JsonProperty("Time2") Integer time2,
        @JsonProperty("RewardPreview2") String rewardPreview2,
        @JsonProperty("BonusPreview2") String bonusPreview2,
        @JsonProperty("Time3") Integer time3,
        @JsonProperty("RewardPreview3") String rewardPreview3,
        @JsonProperty("BonusPreview3") String bonusPreview3,
        @JsonProperty("Time4") Integer time4,
        @JsonProperty("RewardPreview4") String rewardPreview4,
        @JsonProperty("BonusPreview4") String bonusPreview4
    ) {
        this.id = id;
        this.tab = tab;
        this.note = note;
        this.name = name;
        this.desc = desc;
        this.consignor = consignor;
        this.refreshType = refreshType;
        this.memberType = memberType;
        this.level = level;
        this.memberLimit = memberLimit;
        this.tags = tags != null ? 
            new ArrayList<>(tags) : 
            new ArrayList<>();
        this.extraTags = extraTags != null ? 
            new ArrayList<>(extraTags) : 
            new ArrayList<>();
        this.unlockConditions = unlockConditions;
        this.sort = sort;
        this.time1 = time1;
        this.rewardPreview1 = rewardPreview1;
        this.bonusPreview1 = bonusPreview1;
        this.time2 = time2;
        this.rewardPreview2 = rewardPreview2;
        this.bonusPreview2 = bonusPreview2;
        this.time3 = time3;
        this.rewardPreview3 = rewardPreview3;
        this.bonusPreview3 = bonusPreview3;
        this.time4 = time4;
        this.rewardPreview4 = rewardPreview4;
        this.bonusPreview4 = bonusPreview4;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTab() {
        return this.tab;
    }

    public String getNote() {
        return this.note;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getConsignor() {
        return this.consignor;
    }

    public Integer getRefreshType() {
        return this.refreshType;
    }

    public Integer getMemberType() {
        return this.memberType;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getMemberLimit() {
        return this.memberLimit;
    }

    public List<Integer> getTags() {
        return this.tags;
    }

    public List<Integer> getExtraTags() {
        return this.extraTags;
    }

    public String getUnlockConditions() {
        return this.unlockConditions;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getTime1() {
        return this.time1;
    }

    public String getRewardPreview1() {
        return this.rewardPreview1;
    }

    public String getBonusPreview1() {
        return this.bonusPreview1;
    }

    public Integer getTime2() {
        return this.time2;
    }

    public String getRewardPreview2() {
        return this.rewardPreview2;
    }

    public String getBonusPreview2() {
        return this.bonusPreview2;
    }

    public Integer getTime3() {
        return this.time3;
    }

    public String getRewardPreview3() {
        return this.rewardPreview3;
    }

    public String getBonusPreview3() {
        return this.bonusPreview3;
    }

    public Integer getTime4() {
        return this.time4;
    }

    public String getRewardPreview4() {
        return this.rewardPreview4;
    }

    public String getBonusPreview4() {
        return this.bonusPreview4;
    }

}
