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
 * 对应文件: StarTowerBookFateCardQuest.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerBookFateCardQuestConfig {

    private final Integer id;
    private final Integer bundleId;
    private final String desc;
    private final Integer finishType;
    private final String finishParams;
    private final Integer tid1;
    private final Integer qty1;
    private final String param1;

    @JsonCreator
    public StarTowerBookFateCardQuestConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BundleId") Integer bundleId,
        @JsonProperty("Desc") String desc,
        @JsonProperty("FinishType") Integer finishType,
        @JsonProperty("FinishParams") String finishParams,
        @JsonProperty("Tid1") Integer tid1,
        @JsonProperty("Qty1") Integer qty1,
        @JsonProperty("Param1") String param1
    ) {
        this.id = id;
        this.bundleId = bundleId;
        this.desc = desc;
        this.finishType = finishType;
        this.finishParams = finishParams;
        this.tid1 = tid1;
        this.qty1 = qty1;
        this.param1 = param1;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBundleId() {
        return this.bundleId;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getFinishType() {
        return this.finishType;
    }

    public String getFinishParams() {
        return this.finishParams;
    }

    public Integer getTid1() {
        return this.tid1;
    }

    public Integer getQty1() {
        return this.qty1;
    }

    public String getParam1() {
        return this.param1;
    }

}
