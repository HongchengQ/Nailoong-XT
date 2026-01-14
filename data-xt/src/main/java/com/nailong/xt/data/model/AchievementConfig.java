package com.nailong.xt.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 自动生成的配置类。
 * 对应文件: Achievement.json
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AchievementConfig {

    private final Integer id;
    private final Integer achieveId;
    private final String title;
    private final String desc;
    private final Integer rarity;
    private final Integer type;
    private final Integer completeCond;
    private final Integer aimNumShow;
    private final Integer tid1;
    private final Integer qty1;
    private final List<Integer> prerequisites;
    private final Integer tid2;
    private final Integer qty2;
    private final Boolean hide;
    private final Integer completeCondClient;
    private final List<Integer> levelType;
    private final List<Integer> clientCompleteParams1;

    @JsonCreator
    public AchievementConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AchieveId") Integer achieveId,
        @JsonProperty("Title") String title,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Rarity") Integer rarity,
        @JsonProperty("Type") Integer type,
        @JsonProperty("CompleteCond") Integer completeCond,
        @JsonProperty("AimNumShow") Integer aimNumShow,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Prerequisites") List<Integer> prerequisites,
        @JsonProperty("Tid2") Integer tid2,
        @JsonProperty("Qty2") Integer qty2,
        @JsonProperty("Hide") Boolean hide,
        @JsonProperty("CompleteCondClient") Integer completeCondClient,
        @JsonProperty("LevelType") List<Integer> levelType,
        @JsonProperty("ClientCompleteParams1") List<Integer> clientCompleteParams1
    ) {
        this.id = id;
        this.achieveId = achieveId;
        this.title = title;
        this.desc = desc;
        this.rarity = rarity;
        this.type = type;
        this.completeCond = completeCond;
        this.aimNumShow = aimNumShow;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.prerequisites = prerequisites != null ? 
            new ArrayList<>(prerequisites) : 
            new ArrayList<>();
        this.tid2 = tid2;
        this.qty2 = qty2;
        this.hide = hide;
        this.completeCondClient = completeCondClient;
        this.levelType = levelType != null ? 
            new ArrayList<>(levelType) : 
            new ArrayList<>();
        this.clientCompleteParams1 = clientCompleteParams1 != null ? 
            new ArrayList<>(clientCompleteParams1) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getAchieveId() {
        return this.achieveId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getRarity() {
        return this.rarity;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getCompleteCond() {
        return this.completeCond;
    }

    public Integer getAimNumShow() {
        return this.aimNumShow;
    }

    public Integer getTid1() {
        return this.tid1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public List<Integer> getPrerequisites() {
        return this.prerequisites;
    }

    public Integer getTid2() {
        return this.tid2;
    }

    public Integer getQty2() {
        return this.qty2;
    }

    public Boolean getHide() {
        return this.hide;
    }

    public Integer getCompleteCondClient() {
        return this.completeCondClient;
    }

    public List<Integer> getLevelType() {
        return this.levelType;
    }

    public List<Integer> getClientCompleteParams1() {
        return this.clientCompleteParams1;
    }

    @Override
    public String toString() {
        return "AchievementConfig{" +
            "id=" + id +
            ", achieveId=" + achieveId +
            ", title=" + title +
            ", desc=" + desc +
            ", rarity=" + rarity +
            ", type=" + type +
            ", completeCond=" + completeCond +
            ", aimNumShow=" + aimNumShow +
            ", tid1=" + tid1 +
            ", qty1=" + qty1 +
            ", prerequisites=" + prerequisites +
            ", tid2=" + tid2 +
            ", qty2=" + qty2 +
            ", hide=" + hide +
            ", completeCondClient=" + completeCondClient +
            ", levelType=" + levelType +
            ", clientCompleteParams1=" + clientCompleteParams1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AchievementConfig that = (AchievementConfig) o;
        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(achieveId, that.achieveId)) return false;
        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(desc, that.desc)) return false;
        if (!Objects.equals(rarity, that.rarity)) return false;
        if (!Objects.equals(type, that.type)) return false;
        if (!Objects.equals(completeCond, that.completeCond)) return false;
        if (!Objects.equals(aimNumShow, that.aimNumShow)) return false;
        if (!Objects.equals(tid1, that.tid1)) return false;
        if (!Objects.equals(qty1, that.qty1)) return false;
        if (!Objects.equals(prerequisites, that.prerequisites)) return false;
        if (!Objects.equals(tid2, that.tid2)) return false;
        if (!Objects.equals(qty2, that.qty2)) return false;
        if (!Objects.equals(hide, that.hide)) return false;
        if (!Objects.equals(completeCondClient, that.completeCondClient)) return false;
        if (!Objects.equals(levelType, that.levelType)) return false;
        if (!Objects.equals(clientCompleteParams1, that.clientCompleteParams1)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, achieveId, title, desc, rarity, type, completeCond, aimNumShow, tid1, qty1, prerequisites, tid2, qty2, hide, completeCondClient, levelType, clientCompleteParams1);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer id;
        private Integer achieveId;
        private String title;
        private String desc;
        private Integer rarity;
        private Integer type;
        private Integer completeCond;
        private Integer aimNumShow;
        private Integer tid1;
        private Integer qty1;
        private List<Integer> prerequisites;
        private Integer tid2;
        private Integer qty2;
        private Boolean hide;
        private Integer completeCondClient;
        private List<Integer> levelType;
        private List<Integer> clientCompleteParams1;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder achieveId(Integer achieveId) {
            this.achieveId = achieveId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder rarity(Integer rarity) {
            this.rarity = rarity;
            return this;
        }

        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public Builder completeCond(Integer completeCond) {
            this.completeCond = completeCond;
            return this;
        }

        public Builder aimNumShow(Integer aimNumShow) {
            this.aimNumShow = aimNumShow;
            return this;
        }

        public Builder tid1(Integer tid1) {
            this.tid1 = tid1;
            return this;
        }

        public Builder qty1(Integer qty1) {
            this.qty1 = qty1;
            return this;
        }

        public Builder prerequisites(List<Integer> prerequisites) {
            this.prerequisites = prerequisites;
            return this;
        }

        public Builder tid2(Integer tid2) {
            this.tid2 = tid2;
            return this;
        }

        public Builder qty2(Integer qty2) {
            this.qty2 = qty2;
            return this;
        }

        public Builder hide(Boolean hide) {
            this.hide = hide;
            return this;
        }

        public Builder completeCondClient(Integer completeCondClient) {
            this.completeCondClient = completeCondClient;
            return this;
        }

        public Builder levelType(List<Integer> levelType) {
            this.levelType = levelType;
            return this;
        }

        public Builder clientCompleteParams1(List<Integer> clientCompleteParams1) {
            this.clientCompleteParams1 = clientCompleteParams1;
            return this;
        }

        public AchievementConfig build() {
            return new AchievementConfig(
                id,
                achieveId,
                title,
                desc,
                rarity,
                type,
                completeCond,
                aimNumShow,
                tid1,
                qty1,
                prerequisites,
                tid2,
                qty2,
                hide,
                completeCondClient,
                levelType,
                clientCompleteParams1
            );
        }
    }
}
