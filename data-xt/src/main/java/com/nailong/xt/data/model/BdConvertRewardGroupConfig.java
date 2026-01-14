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
 * 对应文件: BdConvertRewardGroup.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BdConvertRewardGroupConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer completeCond;
    private final List<Integer> completeCondParams;
    private final String rewards;
    private final String des;

    @JsonCreator
    public BdConvertRewardGroupConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") List<Integer> completeCondParams,
        @JsonProperty("Rewards") String rewards,
        @JsonProperty("Des") String des
    ) {
        this.id = id;
        this.groupId = groupId;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams != null ? 
            new ArrayList<>(completeCondParams) : 
            new ArrayList<>();
        this.rewards = rewards;
        this.des = des;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public List<Integer> getCompleteCondParams() {
        return this.completeCondParams;
    }

    public String getRewards() {
        return this.rewards;
    }

    public String getDes() {
        return this.des;
    }

}
