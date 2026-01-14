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
 * 对应文件: MonsterAi.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterAiConfig {

    private final Integer id;
    private final String comboGroupPath;
    private final List<Integer> actionBranchIds;
    private final Integer thinkInterval;
    private final String actionAiPath;
    private final Integer spawnShowSkillId;
    private final Integer dieSkillId;
    private final String parallelAiPath;
    private final Integer wanderRange;
    private final Integer wanderRate;
    private final Boolean checkAchievement;
    private final Integer wanderInterval;
    private final String idleAiPath;
    private final String spawnAiPath;

    @JsonCreator
    public MonsterAiConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ComboGroupPath") String comboGroupPath,
        @JsonProperty("ActionBranchIds") List<Integer> actionBranchIds,
        @JsonProperty("ThinkInterval") Integer thinkInterval,
        @JsonProperty("ActionAIPath") String actionAiPath,
        @JsonProperty("SpawnShowSkillId") Integer spawnShowSkillId,
        @JsonProperty("DieSkillId") Integer dieSkillId,
        @JsonProperty("ParallelAIPath") String parallelAiPath,
        @JsonProperty("WanderRange") Integer wanderRange,
        @JsonProperty("WanderRate") Integer wanderRate,
        @JsonProperty("CheckAchievement") Boolean checkAchievement,
        @JsonProperty("WanderInterval") Integer wanderInterval,
        @JsonProperty("IdleAIPath") String idleAiPath,
        @JsonProperty("SpawnAIPath") String spawnAiPath
    ) {
        this.id = id;
        this.comboGroupPath = comboGroupPath;
        this.actionBranchIds = actionBranchIds != null ? 
            new ArrayList<>(actionBranchIds) : 
            new ArrayList<>();
        this.thinkInterval = thinkInterval;
        this.actionAiPath = actionAiPath;
        this.spawnShowSkillId = spawnShowSkillId;
        this.dieSkillId = dieSkillId;
        this.parallelAiPath = parallelAiPath;
        this.wanderRange = wanderRange;
        this.wanderRate = wanderRate;
        this.checkAchievement = checkAchievement;
        this.wanderInterval = wanderInterval;
        this.idleAiPath = idleAiPath;
        this.spawnAiPath = spawnAiPath;
    }

    public Integer getId() {
        return this.id;
    }

    public String getComboGroupPath() {
        return this.comboGroupPath;
    }

    public List<Integer> getActionBranchIds() {
        return this.actionBranchIds;
    }

    public Integer getThinkInterval() {
        return this.thinkInterval;
    }

    public String getActionAiPath() {
        return this.actionAiPath;
    }

    public Integer getSpawnShowSkillId() {
        return this.spawnShowSkillId;
    }

    public Integer getDieSkillId() {
        return this.dieSkillId;
    }

    public String getParallelAiPath() {
        return this.parallelAiPath;
    }

    public Integer getWanderRange() {
        return this.wanderRange;
    }

    public Integer getWanderRate() {
        return this.wanderRate;
    }

    public Boolean getCheckAchievement() {
        return this.checkAchievement;
    }

    public Integer getWanderInterval() {
        return this.wanderInterval;
    }

    public String getIdleAiPath() {
        return this.idleAiPath;
    }

    public String getSpawnAiPath() {
        return this.spawnAiPath;
    }

}
