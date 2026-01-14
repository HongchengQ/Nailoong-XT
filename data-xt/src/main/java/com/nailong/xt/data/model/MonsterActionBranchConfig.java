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
 * 对应文件: MonsterActionBranch.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterActionBranchConfig {

    private final Integer id;
    private final Integer groupId;
    private final Integer skillId;
    private final Integer priority;
    private final Integer weight;
    private final Integer rate;
    private final List<Integer> initialCdPool;
    private final Integer releaseDistance;
    private final Integer releaseAngle;
    private final Integer traceDuration;
    private final Boolean activate;
    private final Integer cd;
    private final Integer startCdTime;
    private final Integer activeConditionType1;
    private final String activeParam1;
    private final Integer deActiveConditionType1;
    private final String deActiveParam1;
    private final Integer followEventType1;
    private final String followEventParam1;
    private final Integer followEventType2;
    private final String followEventParam2;
    private final Integer followEventType3;
    private final String followEventParam3;
    private final Boolean fixedCd;
    private final String activeParam2;
    private final String deActiveParam2;

    @JsonCreator
    public MonsterActionBranchConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("SkillId") Integer skillId,
        @JsonProperty("Priority") Integer priority,
        @JsonProperty("Weight") Integer weight,
        @JsonProperty("Rate") Integer rate,
        @JsonProperty("InitialCDPool") List<Integer> initialCdPool,
        @JsonProperty("ReleaseDistance") Integer releaseDistance,
        @JsonProperty("ReleaseAngle") Integer releaseAngle,
        @JsonProperty("TraceDuration") Integer traceDuration,
        @JsonProperty("Activate") Boolean activate,
        @JsonProperty("CD") Integer cd,
        @JsonProperty("StartCDTime") Integer startCdTime,
        @JsonProperty("ActiveConditionType1") Integer activeConditionType1,
        @JsonProperty("ActiveParam1") String activeParam1,
        @JsonProperty("DeActiveConditionType1") Integer deActiveConditionType1,
        @JsonProperty("DeActiveParam1") String deActiveParam1,
        @JsonProperty("FollowEventType1") Integer followEventType1,
        @JsonProperty("FollowEventParam1") String followEventParam1,
        @JsonProperty("FollowEventType2") Integer followEventType2,
        @JsonProperty("FollowEventParam2") String followEventParam2,
        @JsonProperty("FollowEventType3") Integer followEventType3,
        @JsonProperty("FollowEventParam3") String followEventParam3,
        @JsonProperty("FixedCD") Boolean fixedCd,
        @JsonProperty("ActiveParam2") String activeParam2,
        @JsonProperty("DeActiveParam2") String deActiveParam2
    ) {
        this.id = id;
        this.groupId = groupId;
        this.skillId = skillId;
        this.priority = priority;
        this.weight = weight;
        this.rate = rate;
        this.initialCdPool = initialCdPool != null ? 
            new ArrayList<>(initialCdPool) : 
            new ArrayList<>();
        this.releaseDistance = releaseDistance;
        this.releaseAngle = releaseAngle;
        this.traceDuration = traceDuration;
        this.activate = activate;
        this.cd = cd;
        this.startCdTime = startCdTime;
        this.activeConditionType1 = activeConditionType1;
        this.activeParam1 = activeParam1;
        this.deActiveConditionType1 = deActiveConditionType1;
        this.deActiveParam1 = deActiveParam1;
        this.followEventType1 = followEventType1;
        this.followEventParam1 = followEventParam1;
        this.followEventType2 = followEventType2;
        this.followEventParam2 = followEventParam2;
        this.followEventType3 = followEventType3;
        this.followEventParam3 = followEventParam3;
        this.fixedCd = fixedCd;
        this.activeParam2 = activeParam2;
        this.deActiveParam2 = deActiveParam2;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getSkillId() {
        return this.skillId;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public Integer getRate() {
        return this.rate;
    }

    public List<Integer> getInitialCdPool() {
        return this.initialCdPool;
    }

    public Integer getReleaseDistance() {
        return this.releaseDistance;
    }

    public Integer getReleaseAngle() {
        return this.releaseAngle;
    }

    public Integer getTraceDuration() {
        return this.traceDuration;
    }

    public Boolean getActivate() {
        return this.activate;
    }

    public Integer getCd() {
        return this.cd;
    }

    public Integer getStartCdTime() {
        return this.startCdTime;
    }

    public Integer getActiveConditionType1() {
        return this.activeConditionType1;
    }

    public String getActiveParam1() {
        return this.activeParam1;
    }

    public Integer getDeActiveConditionType1() {
        return this.deActiveConditionType1;
    }

    public String getDeActiveParam1() {
        return this.deActiveParam1;
    }

    public Integer getFollowEventType1() {
        return this.followEventType1;
    }

    public String getFollowEventParam1() {
        return this.followEventParam1;
    }

    public Integer getFollowEventType2() {
        return this.followEventType2;
    }

    public String getFollowEventParam2() {
        return this.followEventParam2;
    }

    public Integer getFollowEventType3() {
        return this.followEventType3;
    }

    public String getFollowEventParam3() {
        return this.followEventParam3;
    }

    public Boolean getFixedCd() {
        return this.fixedCd;
    }

    public String getActiveParam2() {
        return this.activeParam2;
    }

    public String getDeActiveParam2() {
        return this.deActiveParam2;
    }

}
