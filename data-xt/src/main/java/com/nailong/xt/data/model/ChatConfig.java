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
 * 对应文件: Chat.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ChatConfig {

    private final Integer id;
    private final Integer addressBookId;
    private final String avgId;
    private final String avgGroupId;
    private final Integer priority;
    private final Integer triggerType;
    private final Integer triggerCond;
    private final String triggerCondParam;
    private final Integer reward1;
    private final Integer rewardQty1;
    private final Integer preChatId;

    @JsonCreator
    public ChatConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AddressBookId") Integer addressBookId,
        @JsonProperty("AVGId") String avgId,
        @JsonProperty("AVGGroupId") String avgGroupId,
        @JsonProperty("Priority") Integer priority,
        @JsonProperty("TriggerType") Integer triggerType,
        @JsonProperty("TriggerCond") Integer triggerCond,
        @JsonProperty("TriggerCondParam") String triggerCondParam,
        @JsonProperty("Reward1") Integer reward1,
        @JsonProperty("RewardQty1") Integer rewardQty1,
        @JsonProperty("PreChatId") Integer preChatId
    ) {
        this.id = id;
        this.addressBookId = addressBookId;
        this.avgId = avgId;
        this.avgGroupId = avgGroupId;
        this.priority = priority;
        this.triggerType = triggerType;
        this.triggerCond = triggerCond;
        this.triggerCondParam = triggerCondParam;
        this.reward1 = reward1;
        this.rewardQty1 = rewardQty1;
        this.preChatId = preChatId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getAddressBookId() {
        return this.addressBookId;
    }

    public String getAvgId() {
        return this.avgId;
    }

    public String getAvgGroupId() {
        return this.avgGroupId;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Integer getTriggerType() {
        return this.triggerType;
    }

    public Integer getTriggerCond() {
        return this.triggerCond;
    }

    public String getTriggerCondParam() {
        return this.triggerCondParam;
    }

    public Integer getReward1() {
        return this.reward1;
    }

    public Integer getRewardQty1() {
        return this.rewardQty1;
    }

    public Integer getPreChatId() {
        return this.preChatId;
    }

}
