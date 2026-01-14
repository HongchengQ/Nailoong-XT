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
 * 对应文件: Buff.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BuffConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer buffTag1;
    private final Integer buffTag2;
    private final Integer buffTag3;
    private final Integer buffTag4;
    private final String icon;
    private final Boolean isShow;
    private final String topofHeadEffect;
    private final Boolean notRemove;
    private final Integer levelTypeData;
    private final Integer levelData;
    private final String bindEffect;
    private final List<Integer> buffNumEffectLevel;
    private final String name;
    private final Boolean changeTeamNotRemove;
    private final Integer reduceTime;
    private final Integer buffTag5;

    @JsonCreator
    public BuffConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("BuffTag1") Integer buffTag1,
        @JsonProperty("BuffTag2") Integer buffTag2,
        @JsonProperty("BuffTag3") Integer buffTag3,
        @JsonProperty("BuffTag4") Integer buffTag4,
        @JsonProperty("Icon") String icon,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("TopofHeadEffect") String topofHeadEffect,
        @JsonProperty("NotRemove") Boolean notRemove,
        @JsonProperty("levelTypeData") Integer levelTypeData,
        @JsonProperty("LevelData") Integer levelData,
        @JsonProperty("BindEffect") String bindEffect,
        @JsonProperty("BuffNumEffectLevel") List<Integer> buffNumEffectLevel,
        @JsonProperty("Name") String name,
        @JsonProperty("ChangeTeamNotRemove") Boolean changeTeamNotRemove,
        @JsonProperty("ReduceTime") Integer reduceTime,
        @JsonProperty("BuffTag5") Integer buffTag5
    ) {
        this.id = id;
        this.groupId = groupId;
        this.buffTag1 = buffTag1;
        this.buffTag2 = buffTag2;
        this.buffTag3 = buffTag3;
        this.buffTag4 = buffTag4;
        this.icon = icon;
        this.isShow = isShow;
        this.topofHeadEffect = topofHeadEffect;
        this.notRemove = notRemove;
        this.levelTypeData = levelTypeData;
        this.levelData = levelData;
        this.bindEffect = bindEffect;
        this.buffNumEffectLevel = buffNumEffectLevel != null ? 
            new ArrayList<>(buffNumEffectLevel) : 
            new ArrayList<>();
        this.name = name;
        this.changeTeamNotRemove = changeTeamNotRemove;
        this.reduceTime = reduceTime;
        this.buffTag5 = buffTag5;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getBuffTag1() {
        return this.buffTag1;
    }

    public Integer getBuffTag2() {
        return this.buffTag2;
    }

    public Integer getBuffTag3() {
        return this.buffTag3;
    }

    public Integer getBuffTag4() {
        return this.buffTag4;
    }

    public String getIcon() {
        return this.icon;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public String getTopofHeadEffect() {
        return this.topofHeadEffect;
    }

    public Boolean getNotRemove() {
        return this.notRemove;
    }

    public Integer getLevelTypeData() {
        return this.levelTypeData;
    }

    public Integer getLevelData() {
        return this.levelData;
    }

    public String getBindEffect() {
        return this.bindEffect;
    }

    public List<Integer> getBuffNumEffectLevel() {
        return this.buffNumEffectLevel;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getChangeTeamNotRemove() {
        return this.changeTeamNotRemove;
    }

    public Integer getReduceTime() {
        return this.reduceTime;
    }

    public Integer getBuffTag5() {
        return this.buffTag5;
    }

}
