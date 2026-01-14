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
 * 对应文件: JointDrillControl.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class JointDrillControlConfig {

    private final Integer id;
    private final Integer drillStartTime;
    private final Integer drillDurationTime;
    private final Integer drillLevelGroupId;
    private final Integer drillQuestGroupId;
    private final String plotTitle;
    private final String plotDesc;
    private final String bg;
    private final String drillPrefab;
    private final String ctrlName;
    private final String descText;
    private final String detailDesc;
    private final String fastEntranceIcon;

    @JsonCreator
    public JointDrillControlConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("DrillStartTime") Integer drillStartTime,
        @JsonProperty("DrillDurationTime") Integer drillDurationTime,
        @JsonProperty("DrillLevelGroupId") Integer drillLevelGroupId,
        @JsonProperty("DrillQuestGroupId") Integer drillQuestGroupId,
        @JsonProperty("PlotTitle") String plotTitle,
        @JsonProperty("PlotDesc") String plotDesc,
        @JsonProperty("BG") String bg,
        @JsonProperty("DrillPrefab") String drillPrefab,
        @JsonProperty("CtrlName") String ctrlName,
        @JsonProperty("DescText") String descText,
        @JsonProperty("DetailDesc") String detailDesc,
        @JsonProperty("FastEntranceIcon") String fastEntranceIcon
    ) {
        this.id = id;
        this.drillStartTime = drillStartTime;
        this.drillDurationTime = drillDurationTime;
        this.drillLevelGroupId = drillLevelGroupId;
        this.drillQuestGroupId = drillQuestGroupId;
        this.plotTitle = plotTitle;
        this.plotDesc = plotDesc;
        this.bg = bg;
        this.drillPrefab = drillPrefab;
        this.ctrlName = ctrlName;
        this.descText = descText;
        this.detailDesc = detailDesc;
        this.fastEntranceIcon = fastEntranceIcon;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDrillStartTime() {
        return this.drillStartTime;
    }

    public Integer getDrillDurationTime() {
        return this.drillDurationTime;
    }

    public Integer getDrillLevelGroupId() {
        return this.drillLevelGroupId;
    }

    public Integer getDrillQuestGroupId() {
        return this.drillQuestGroupId;
    }

    public String getPlotTitle() {
        return this.plotTitle;
    }

    public String getPlotDesc() {
        return this.plotDesc;
    }

    public String getBg() {
        return this.bg;
    }

    public String getDrillPrefab() {
        return this.drillPrefab;
    }

    public String getCtrlName() {
        return this.ctrlName;
    }

    public String getDescText() {
        return this.descText;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getFastEntranceIcon() {
        return this.fastEntranceIcon;
    }

}
