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
 * 对应文件: Gacha.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaConfig {

    private final Integer id;
    private final String name;
    private final Integer storageId;
    private final Integer gachaType;
    private final Integer limitTimes;
    private final Integer aTypePkg;
    private final Integer bTypePkg;
    private final Integer cTypePkg;
    private final Integer aTypeUpPkg;
    private final Integer bGuaranteePkg;
    private final Integer sort;
    private final String icon;
    private final String image;
    private final String tag;
    private final String voice;
    private final Integer aTypeGuaranteeTimes;
    private final Integer bTypeUpPkg;
    private final Integer guaranteeTimes;
    private final Integer guaranteeTid;
    private final Integer guaranteeQty;
    private final Integer firstTenShow;
    private final String startTime;
    private final String endTime;
    private final String bannerRes;
    private final Integer specificTid;
    private final Integer specificQty;

    @JsonCreator
    public GachaConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("StorageId") Integer storageId,
        @JsonProperty("GachaType") Integer gachaType,
        @JsonProperty("LimitTimes") Integer limitTimes,
        @JsonProperty("ATypePkg") Integer aTypePkg,
        @JsonProperty("BTypePkg") Integer bTypePkg,
        @JsonProperty("CTypePkg") Integer cTypePkg,
        @JsonProperty("ATypeUpPkg") Integer aTypeUpPkg,
        @JsonProperty("BGuaranteePkg") Integer bGuaranteePkg,
        @JsonProperty("Sort") Integer sort,
        @JsonProperty("Icon") String icon,
        @JsonProperty("Image") String image,
        @JsonProperty("Tag") String tag,
        @JsonProperty("Voice") String voice,
        @JsonProperty("ATypeGuaranteeTimes") Integer aTypeGuaranteeTimes,
        @JsonProperty("BTypeUpPkg") Integer bTypeUpPkg,
        @JsonProperty("GuaranteeTimes") Integer guaranteeTimes,
        @JsonProperty("GuaranteeTid") Integer guaranteeTid,
        @JsonProperty("GuaranteeQty") Integer guaranteeQty,
        @JsonProperty("FirstTenShow") Integer firstTenShow,
        @JsonProperty("StartTime") String startTime,
        @JsonProperty("EndTime") String endTime,
        @JsonProperty("BannerRes") String bannerRes,
        @JsonProperty("SpecificTid") Integer specificTid,
        @JsonProperty("SpecificQty") Integer specificQty
    ) {
        this.id = id;
        this.name = name;
        this.storageId = storageId;
        this.gachaType = gachaType;
        this.limitTimes = limitTimes;
        this.aTypePkg = aTypePkg;
        this.bTypePkg = bTypePkg;
        this.cTypePkg = cTypePkg;
        this.aTypeUpPkg = aTypeUpPkg;
        this.bGuaranteePkg = bGuaranteePkg;
        this.sort = sort;
        this.icon = icon;
        this.image = image;
        this.tag = tag;
        this.voice = voice;
        this.aTypeGuaranteeTimes = aTypeGuaranteeTimes;
        this.bTypeUpPkg = bTypeUpPkg;
        this.guaranteeTimes = guaranteeTimes;
        this.guaranteeTid = guaranteeTid;
        this.guaranteeQty = guaranteeQty;
        this.firstTenShow = firstTenShow;
        this.startTime = startTime;
        this.endTime = endTime;
        this.bannerRes = bannerRes;
        this.specificTid = specificTid;
        this.specificQty = specificQty;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getStorageId() {
        return this.storageId;
    }

    public Integer getGachaType() {
        return this.gachaType;
    }

    public Integer getLimitTimes() {
        return this.limitTimes;
    }

    public Integer getATypePkg() {
        return this.aTypePkg;
    }

    public Integer getBTypePkg() {
        return this.bTypePkg;
    }

    public Integer getCTypePkg() {
        return this.cTypePkg;
    }

    public Integer getATypeUpPkg() {
        return this.aTypeUpPkg;
    }

    public Integer getBGuaranteePkg() {
        return this.bGuaranteePkg;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getImage() {
        return this.image;
    }

    public String getTag() {
        return this.tag;
    }

    public String getVoice() {
        return this.voice;
    }

    public Integer getATypeGuaranteeTimes() {
        return this.aTypeGuaranteeTimes;
    }

    public Integer getBTypeUpPkg() {
        return this.bTypeUpPkg;
    }

    public Integer getGuaranteeTimes() {
        return this.guaranteeTimes;
    }

    public Integer getGuaranteeTid() {
        return this.guaranteeTid;
    }

    public Integer getGuaranteeQty() {
        return this.guaranteeQty;
    }

    public Integer getFirstTenShow() {
        return this.firstTenShow;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getBannerRes() {
        return this.bannerRes;
    }

    public Integer getSpecificTid() {
        return this.specificTid;
    }

    public Integer getSpecificQty() {
        return this.specificQty;
    }

}
