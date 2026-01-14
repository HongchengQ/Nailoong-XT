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
 * 对应文件: Production.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ProductionConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final Integer productionId;
    private final Integer productionPerBatch;
    private final Integer group;
    private final Integer tag;
    private final Integer rawMaterialId1;
    private final Integer rawMaterialCount1;
    private final Integer unlockWorldLevel;
    private final String unlockTip;
    private final Integer sortId;
    private final Boolean isActived;

    @JsonCreator
    public ProductionConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ProductionId") Integer productionId,
        @JsonProperty("ProductionPerBatch") Integer productionPerBatch,
        @JsonProperty("Group") Integer group,
        @JsonProperty("Tag") Integer tag,
        @JsonProperty("RawMaterialId1") Integer rawMaterialId1,
        @JsonProperty("RawMaterialCount1") Integer rawMaterialCount1,
        @JsonProperty("UnlockWorldLevel") Integer unlockWorldLevel,
        @JsonProperty("UnlockTip") String unlockTip,
        @JsonProperty("SortId") Integer sortId,
        @JsonProperty("IsActived") Boolean isActived
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.productionId = productionId;
        this.productionPerBatch = productionPerBatch;
        this.group = group;
        this.tag = tag;
        this.rawMaterialId1 = rawMaterialId1;
        this.rawMaterialCount1 = rawMaterialCount1;
        this.unlockWorldLevel = unlockWorldLevel;
        this.unlockTip = unlockTip;
        this.sortId = sortId;
        this.isActived = isActived;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getProductionId() {
        return this.productionId;
    }

    public Integer getProductionPerBatch() {
        return this.productionPerBatch;
    }

    public Integer getGroup() {
        return this.group;
    }

    public Integer getTag() {
        return this.tag;
    }

    public Integer getRawMaterialId1() {
        return this.rawMaterialId1;
    }

    public Integer getRawMaterialCount1() {
        return this.rawMaterialCount1;
    }

    public Integer getUnlockWorldLevel() {
        return this.unlockWorldLevel;
    }

    public String getUnlockTip() {
        return this.unlockTip;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public Boolean getIsActived() {
        return this.isActived;
    }

}
