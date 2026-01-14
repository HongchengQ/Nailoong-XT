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
 * 对应文件: BdConvert.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BdConvertConfig {

    private final Integer id;
    private final List<Integer> optionList;
    private final Integer rewardGroup;
    private final Integer scoreItemId;
    private final Integer scoreItemLimit;

    @JsonCreator
    public BdConvertConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("OptionList") List<Integer> optionList,
        @JsonProperty("RewardGroup") Integer rewardGroup,
        @JsonProperty("ScoreItemId") Integer scoreItemId,
        @JsonProperty("ScoreItemLimit") Integer scoreItemLimit
    ) {
        this.id = id;
        this.optionList = optionList != null ? 
            new ArrayList<>(optionList) : 
            new ArrayList<>();
        this.rewardGroup = rewardGroup;
        this.scoreItemId = scoreItemId;
        this.scoreItemLimit = scoreItemLimit;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getOptionList() {
        return this.optionList;
    }

    public Integer getRewardGroup() {
        return this.rewardGroup;
    }

    public Integer getScoreItemId() {
        return this.scoreItemId;
    }

    public Integer getScoreItemLimit() {
        return this.scoreItemLimit;
    }

}
