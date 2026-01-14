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
 * 对应文件: Disc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscConfig {

    private final Integer id;
    private final Integer eet;
    private final List<Integer> tags;
    private final Boolean visible;
    private final Boolean available;
    private final String discBg;
    private final Integer strengthenGroupId;
    private final Integer attrBaseGroupId;
    private final Integer attrExtraGroupId;
    private final Integer promoteGroupId;
    private final Integer transformItemId;
    private final List<Integer> maxStarTransformItem;
    private final List<Integer> readReward;
    private final Integer mainSkillGroupId;
    private final Integer subNoteSkillGroupId;
    private final Integer secondarySkillGroupId1;
    private final Integer secondarySkillGroupId2;
    private final List<Integer> avgReadReward;
    private final String skillScript;

    @JsonCreator
    public DiscConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("EET") Integer eet,
        @JsonProperty("Tags") List<Integer> tags,
        @JsonProperty("Visible") Boolean visible,
        @JsonProperty("Available") Boolean available,
        @JsonProperty("DiscBg") String discBg,
        @JsonProperty("StrengthenGroupId") Integer strengthenGroupId,
        @JsonProperty("AttrBaseGroupId") Integer attrBaseGroupId,
        @JsonProperty("AttrExtraGroupId") Integer attrExtraGroupId,
        @JsonProperty("PromoteGroupId") Integer promoteGroupId,
        @JsonProperty("TransformItemId") Integer transformItemId,
        @JsonProperty("MaxStarTransformItem") List<Integer> maxStarTransformItem,
        @JsonProperty("ReadReward") List<Integer> readReward,
        @JsonProperty("MainSkillGroupId") Integer mainSkillGroupId,
        @JsonProperty("SubNoteSkillGroupId") Integer subNoteSkillGroupId,
        @JsonProperty("SecondarySkillGroupId1") Integer secondarySkillGroupId1,
        @JsonProperty("SecondarySkillGroupId2") Integer secondarySkillGroupId2,
        @JsonProperty("AVGReadReward") List<Integer> avgReadReward,
        @JsonProperty("SkillScript") String skillScript
    ) {
        this.id = id;
        this.eet = eet;
        this.tags = tags != null ? 
            new ArrayList<>(tags) : 
            new ArrayList<>();
        this.visible = visible;
        this.available = available;
        this.discBg = discBg;
        this.strengthenGroupId = strengthenGroupId;
        this.attrBaseGroupId = attrBaseGroupId;
        this.attrExtraGroupId = attrExtraGroupId;
        this.promoteGroupId = promoteGroupId;
        this.transformItemId = transformItemId;
        this.maxStarTransformItem = maxStarTransformItem != null ? 
            new ArrayList<>(maxStarTransformItem) : 
            new ArrayList<>();
        this.readReward = readReward != null ? 
            new ArrayList<>(readReward) : 
            new ArrayList<>();
        this.mainSkillGroupId = mainSkillGroupId;
        this.subNoteSkillGroupId = subNoteSkillGroupId;
        this.secondarySkillGroupId1 = secondarySkillGroupId1;
        this.secondarySkillGroupId2 = secondarySkillGroupId2;
        this.avgReadReward = avgReadReward != null ? 
            new ArrayList<>(avgReadReward) : 
            new ArrayList<>();
        this.skillScript = skillScript;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getEet() {
        return this.eet;
    }

    public List<Integer> getTags() {
        return this.tags;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Boolean getAvailable() {
        return this.available;
    }

    public String getDiscBg() {
        return this.discBg;
    }

    public Integer getStrengthenGroupId() {
        return this.strengthenGroupId;
    }

    public Integer getAttrBaseGroupId() {
        return this.attrBaseGroupId;
    }

    public Integer getAttrExtraGroupId() {
        return this.attrExtraGroupId;
    }

    public Integer getPromoteGroupId() {
        return this.promoteGroupId;
    }

    public Integer getTransformItemId() {
        return this.transformItemId;
    }

    public List<Integer> getMaxStarTransformItem() {
        return this.maxStarTransformItem;
    }

    public List<Integer> getReadReward() {
        return this.readReward;
    }

    public Integer getMainSkillGroupId() {
        return this.mainSkillGroupId;
    }

    public Integer getSubNoteSkillGroupId() {
        return this.subNoteSkillGroupId;
    }

    public Integer getSecondarySkillGroupId1() {
        return this.secondarySkillGroupId1;
    }

    public Integer getSecondarySkillGroupId2() {
        return this.secondarySkillGroupId2;
    }

    public List<Integer> getAvgReadReward() {
        return this.avgReadReward;
    }

    public String getSkillScript() {
        return this.skillScript;
    }

}
