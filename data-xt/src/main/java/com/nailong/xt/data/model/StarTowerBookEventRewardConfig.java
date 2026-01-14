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
 * 对应文件: StarTowerBookEventReward.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBookEventRewardConfig {

    private final Integer id;
    private final String name;
    private final String story;
    private final Integer type;
    private final Integer npcId;
    private final Integer sort;
    private final String source;
    private final Integer completeCond;
    private final String completeCondParams;
    private final Integer itemId;
    private final Integer itemQty;
    private final Boolean isBanned;

    @JsonCreator
    public StarTowerBookEventRewardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Story") String story,
        @JsonProperty("Type") Integer type,
        @JsonProperty("NPCId") Integer npcId,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Source") String source,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("CompleteCondParams") String completeCondParams,
        @JsonProperty("ItemId") Integer itemId,
        @JsonProperty("ItemQty") Integer itemQty,
        @JsonProperty("IsBanned") Boolean isBanned
    ) {
        this.id = id;
        this.name = name;
        this.story = story;
        this.type = type;
        this.npcId = npcId;
        this.sort = sort;
        this.source = source;
        this.completeCond = completeCond;
        this.completeCondParams = completeCondParams;
        this.itemId = itemId;
        this.itemQty = itemQty;
        this.isBanned = isBanned;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getStory() {
        return this.story;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getSource() {
        return this.source;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public String getCompleteCondParams() {
        return this.completeCondParams;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getItemQty() {
        return this.itemQty;
    }

    public Boolean getIsBanned() {
        return this.isBanned;
    }

}
