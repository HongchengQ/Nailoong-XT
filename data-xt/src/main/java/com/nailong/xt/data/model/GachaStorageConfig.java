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
 * 对应文件: GachaStorage.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaStorageConfig {

    private final Integer id;
    private final String name;
    private final Integer defaultId;
    private final Integer defaultQty;
    private final Integer costId;
    private final Integer costQty;
    private final String oncePreferred;
    private final String tenTimesPreferred;
    private final Integer aTypeGroup;
    private final Integer bTypeProb;
    private final Integer bTypeGuaranteeProb;
    private final String giveItems;
    private final Integer aTypeUpProb;
    private final Integer aTypeUpShowProb;
    private final Integer aUpGuaranteeTimes;
    private final Integer bTypeUpProb;
    private final Integer bTypeUpShowProb;

    @JsonCreator
    public GachaStorageConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("DefaultId") Integer defaultId,
        @JsonProperty("DefaultQty") Integer defaultQty,
        @JsonProperty("CostId") Integer costId,
        @JsonProperty("CostQty") Integer costQty,
        @JsonProperty("OncePreferred") String oncePreferred,
        @JsonProperty("TenTimesPreferred") String tenTimesPreferred,
        @JsonProperty("ATypeGroup") Integer aTypeGroup,
        @JsonProperty("BTypeProb") Integer bTypeProb,
        @JsonProperty("BTypeGuaranteeProb") Integer bTypeGuaranteeProb,
        @JsonProperty("GiveItems") String giveItems,
        @JsonProperty("ATypeUpProb") Integer aTypeUpProb,
        @JsonProperty("ATypeUpShowProb") Integer aTypeUpShowProb,
        @JsonProperty("AUpGuaranteeTimes") Integer aUpGuaranteeTimes,
        @JsonProperty("BTypeUpProb") Integer bTypeUpProb,
        @JsonProperty("BTypeUpShowProb") Integer bTypeUpShowProb
    ) {
        this.id = id;
        this.name = name;
        this.defaultId = defaultId;
        this.defaultQty = defaultQty;
        this.costId = costId;
        this.costQty = costQty;
        this.oncePreferred = oncePreferred;
        this.tenTimesPreferred = tenTimesPreferred;
        this.aTypeGroup = aTypeGroup;
        this.bTypeProb = bTypeProb;
        this.bTypeGuaranteeProb = bTypeGuaranteeProb;
        this.giveItems = giveItems;
        this.aTypeUpProb = aTypeUpProb;
        this.aTypeUpShowProb = aTypeUpShowProb;
        this.aUpGuaranteeTimes = aUpGuaranteeTimes;
        this.bTypeUpProb = bTypeUpProb;
        this.bTypeUpShowProb = bTypeUpShowProb;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getDefaultId() {
        return this.defaultId;
    }

    public Integer getDefaultQty() {
        return this.defaultQty;
    }

    public Integer getCostId() {
        return this.costId;
    }

    public Integer getCostQty() {
        return this.costQty;
    }

    public String getOncePreferred() {
        return this.oncePreferred;
    }

    public String getTenTimesPreferred() {
        return this.tenTimesPreferred;
    }

    public Integer getATypeGroup() {
        return this.aTypeGroup;
    }

    public Integer getBTypeProb() {
        return this.bTypeProb;
    }

    public Integer getBTypeGuaranteeProb() {
        return this.bTypeGuaranteeProb;
    }

    public String getGiveItems() {
        return this.giveItems;
    }

    public Integer getATypeUpProb() {
        return this.aTypeUpProb;
    }

    public Integer getATypeUpShowProb() {
        return this.aTypeUpShowProb;
    }

    public Integer getAUpGuaranteeTimes() {
        return this.aUpGuaranteeTimes;
    }

    public Integer getBTypeUpProb() {
        return this.bTypeUpProb;
    }

    public Integer getBTypeUpShowProb() {
        return this.bTypeUpShowProb;
    }

}
