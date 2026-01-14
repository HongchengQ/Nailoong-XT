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
 * 对应文件: StoryRolePersonality.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryRolePersonalityConfig {

    private final Integer id;
    private final String avgCharId;
    private final List<Integer> personalitys;
    private final List<Integer> baseValue;
    private final String amax;
    private final String amaxFace;
    private final String amaxHead;
    private final String bmax;
    private final String bmaxFace;
    private final String bmaxHead;
    private final String cmax;
    private final String cmaxFace;
    private final String cmaxHead;
    private final String aplus;
    private final String aplusFace;
    private final String aplusHead;
    private final String bplus;
    private final String bplusFace;
    private final String bplusHead;
    private final String cplus;
    private final String cplusFace;
    private final String cplusHead;
    private final String ab;
    private final String abFace;
    private final String abHead;
    private final String ac;
    private final String acFace;
    private final String acHead;
    private final String bc;
    private final String bcFace;
    private final String bcHead;
    private final String normal;
    private final String normalFace;
    private final String normalHead;

    @JsonCreator
    public StoryRolePersonalityConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("AvgCharId") String avgCharId,
        @JsonProperty("Personalitys") List<Integer> personalitys,
        @JsonProperty("BaseValue") List<Integer> baseValue,
        @JsonProperty("Amax") String amax,
        @JsonProperty("AmaxFace") String amaxFace,
        @JsonProperty("AmaxHead") String amaxHead,
        @JsonProperty("Bmax") String bmax,
        @JsonProperty("BmaxFace") String bmaxFace,
        @JsonProperty("BmaxHead") String bmaxHead,
        @JsonProperty("Cmax") String cmax,
        @JsonProperty("CmaxFace") String cmaxFace,
        @JsonProperty("CmaxHead") String cmaxHead,
        @JsonProperty("Aplus") String aplus,
        @JsonProperty("AplusFace") String aplusFace,
        @JsonProperty("AplusHead") String aplusHead,
        @JsonProperty("Bplus") String bplus,
        @JsonProperty("BplusFace") String bplusFace,
        @JsonProperty("BplusHead") String bplusHead,
        @JsonProperty("Cplus") String cplus,
        @JsonProperty("CplusFace") String cplusFace,
        @JsonProperty("CplusHead") String cplusHead,
        @JsonProperty("Ab") String ab,
        @JsonProperty("AbFace") String abFace,
        @JsonProperty("AbHead") String abHead,
        @JsonProperty("Ac") String ac,
        @JsonProperty("AcFace") String acFace,
        @JsonProperty("AcHead") String acHead,
        @JsonProperty("Bc") String bc,
        @JsonProperty("BcFace") String bcFace,
        @JsonProperty("BcHead") String bcHead,
        @JsonProperty("Normal") String normal,
        @JsonProperty("NormalFace") String normalFace,
        @JsonProperty("NormalHead") String normalHead
    ) {
        this.id = id;
        this.avgCharId = avgCharId;
        this.personalitys = personalitys != null ? 
            new ArrayList<>(personalitys) : 
            new ArrayList<>();
        this.baseValue = baseValue != null ? 
            new ArrayList<>(baseValue) : 
            new ArrayList<>();
        this.amax = amax;
        this.amaxFace = amaxFace;
        this.amaxHead = amaxHead;
        this.bmax = bmax;
        this.bmaxFace = bmaxFace;
        this.bmaxHead = bmaxHead;
        this.cmax = cmax;
        this.cmaxFace = cmaxFace;
        this.cmaxHead = cmaxHead;
        this.aplus = aplus;
        this.aplusFace = aplusFace;
        this.aplusHead = aplusHead;
        this.bplus = bplus;
        this.bplusFace = bplusFace;
        this.bplusHead = bplusHead;
        this.cplus = cplus;
        this.cplusFace = cplusFace;
        this.cplusHead = cplusHead;
        this.ab = ab;
        this.abFace = abFace;
        this.abHead = abHead;
        this.ac = ac;
        this.acFace = acFace;
        this.acHead = acHead;
        this.bc = bc;
        this.bcFace = bcFace;
        this.bcHead = bcHead;
        this.normal = normal;
        this.normalFace = normalFace;
        this.normalHead = normalHead;
    }

    public Integer getId() {
        return this.id;
    }

    public String getAvgCharId() {
        return this.avgCharId;
    }

    public List<Integer> getPersonalitys() {
        return this.personalitys;
    }

    public List<Integer> getBaseValue() {
        return this.baseValue;
    }

    public String getAmax() {
        return this.amax;
    }

    public String getAmaxFace() {
        return this.amaxFace;
    }

    public String getAmaxHead() {
        return this.amaxHead;
    }

    public String getBmax() {
        return this.bmax;
    }

    public String getBmaxFace() {
        return this.bmaxFace;
    }

    public String getBmaxHead() {
        return this.bmaxHead;
    }

    public String getCmax() {
        return this.cmax;
    }

    public String getCmaxFace() {
        return this.cmaxFace;
    }

    public String getCmaxHead() {
        return this.cmaxHead;
    }

    public String getAplus() {
        return this.aplus;
    }

    public String getAplusFace() {
        return this.aplusFace;
    }

    public String getAplusHead() {
        return this.aplusHead;
    }

    public String getBplus() {
        return this.bplus;
    }

    public String getBplusFace() {
        return this.bplusFace;
    }

    public String getBplusHead() {
        return this.bplusHead;
    }

    public String getCplus() {
        return this.cplus;
    }

    public String getCplusFace() {
        return this.cplusFace;
    }

    public String getCplusHead() {
        return this.cplusHead;
    }

    public String getAb() {
        return this.ab;
    }

    public String getAbFace() {
        return this.abFace;
    }

    public String getAbHead() {
        return this.abHead;
    }

    public String getAc() {
        return this.ac;
    }

    public String getAcFace() {
        return this.acFace;
    }

    public String getAcHead() {
        return this.acHead;
    }

    public String getBc() {
        return this.bc;
    }

    public String getBcFace() {
        return this.bcFace;
    }

    public String getBcHead() {
        return this.bcHead;
    }

    public String getNormal() {
        return this.normal;
    }

    public String getNormalFace() {
        return this.normalFace;
    }

    public String getNormalHead() {
        return this.normalHead;
    }

}
