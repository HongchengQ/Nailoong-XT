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
 * 对应文件: BdConvertContent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BdConvertContentConfig {

    private final Integer id;
    private final List<Integer> convertConditionList;
    private final Integer maxSub;
    private final String icon;
    private final String basicReward;
    private final List<Integer> basicRewardPreview;
    private final Integer doubleCheckMinLevel;
    private final String des;

    @JsonCreator
    public BdConvertContentConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ConvertConditionList") List<Integer> convertConditionList,
        @JsonProperty("MaxSub") Integer maxSub,
        @JsonProperty("Icon") String icon,
        @JsonProperty("BasicReward") String basicReward,
        @JsonProperty("BasicRewardPreview") List<Integer> basicRewardPreview,
        @JsonProperty("DoubleCheckMinLevel") Integer doubleCheckMinLevel,
        @JsonProperty("Des") String des
    ) {
        this.id = id;
        this.convertConditionList = convertConditionList != null ? 
            new ArrayList<>(convertConditionList) : 
            new ArrayList<>();
        this.maxSub = maxSub;
        this.icon = icon;
        this.basicReward = basicReward;
        this.basicRewardPreview = basicRewardPreview != null ? 
            new ArrayList<>(basicRewardPreview) : 
            new ArrayList<>();
        this.doubleCheckMinLevel = doubleCheckMinLevel;
        this.des = des;
    }

    public Integer getId() {
        return this.id;
    }

    public List<Integer> getConvertConditionList() {
        return this.convertConditionList;
    }

    public Integer getMaxSub() {
        return this.maxSub;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getBasicReward() {
        return this.basicReward;
    }

    public List<Integer> getBasicRewardPreview() {
        return this.basicRewardPreview;
    }

    public Integer getDoubleCheckMinLevel() {
        return this.doubleCheckMinLevel;
    }

    public String getDes() {
        return this.des;
    }

}
