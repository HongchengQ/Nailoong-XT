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
 * 对应文件: CharacterArchive.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterArchiveConfig {

    private final Integer id;
    private final Integer archType;
    private final Integer characterId;
    private final Integer recordId;
    private final Integer sort;
    private final Integer unlockAffinityLevel;
    private final Integer archReward;
    private final Integer archRewardQuantity;

    @JsonCreator
    public CharacterArchiveConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ArchType") Integer archType,
        @JsonProperty("CharacterId") Integer characterId,
        @JsonProperty("RecordId") Integer recordId,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("UnlockAffinityLevel") Integer unlockAffinityLevel,
        @JsonProperty("ArchReward") Integer archReward,
        @JsonProperty("ArchRewardQuantity") Integer archRewardQuantity
    ) {
        this.id = id;
        this.archType = archType;
        this.characterId = characterId;
        this.recordId = recordId;
        this.sort = sort;
        this.unlockAffinityLevel = unlockAffinityLevel;
        this.archReward = archReward;
        this.archRewardQuantity = archRewardQuantity;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getArchType() {
        return this.archType;
    }

    public Integer getCharacterId() {
        return this.characterId;
    }

    public Integer getRecordId() {
        return this.recordId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getUnlockAffinityLevel() {
        return this.unlockAffinityLevel;
    }

    public Integer getArchReward() {
        return this.archReward;
    }

    public Integer getArchRewardQuantity() {
        return this.archRewardQuantity;
    }

}
