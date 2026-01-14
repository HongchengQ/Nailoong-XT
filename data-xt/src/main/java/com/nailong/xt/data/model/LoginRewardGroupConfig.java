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
 * 对应文件: LoginRewardGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class LoginRewardGroupConfig {

    private final Integer id;
    private final Integer rewardGroupId;
    private final Integer order;
    private final Integer rewardId1;
    private final Integer qty1;
    private final String rewardIcon;
    private final Integer rewardCount;
    private final String rewardDesc;
    private final Boolean disRare;
    private final Integer rewardId2;
    private final Integer qty2;
    private final Integer npcId;
    private final Integer voiceId;

    @JsonCreator
    public LoginRewardGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("RewardGroupId") Integer rewardGroupId,
        @JsonProperty("Order") Integer order,
        @JsonProperty("RewardId1") Integer rewardId1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("RewardIcon") String rewardIcon,
        @JsonProperty("RewardCount") Integer rewardCount,
        @JsonProperty("RewardDesc") String rewardDesc,
        @JsonProperty("DisRare") Boolean disRare,
        @JsonProperty("RewardId2") Integer rewardId2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("NpcId") Integer npcId,
        @JsonProperty("VoiceId") Integer voiceId
    ) {
        this.id = id;
        this.rewardGroupId = rewardGroupId;
        this.order = order;
        this.rewardId1 = rewardId1;
        this.qty1 = qty1;
        this.rewardIcon = rewardIcon;
        this.rewardCount = rewardCount;
        this.rewardDesc = rewardDesc;
        this.disRare = disRare;
        this.rewardId2 = rewardId2;
        this.qty2 = qty2;
        this.npcId = npcId;
        this.voiceId = voiceId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getRewardGroupId() {
        return this.rewardGroupId;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Integer getRewardId1() {
        return this.rewardId1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public String getRewardIcon() {
        return this.rewardIcon;
    }

    public Integer getRewardCount() {
        return this.rewardCount;
    }

    public String getRewardDesc() {
        return this.rewardDesc;
    }

    public Boolean getDisRare() {
        return this.disRare;
    }

    public Integer getRewardId2() {
        return this.rewardId2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public Integer getVoiceId() {
        return this.voiceId;
    }

}
