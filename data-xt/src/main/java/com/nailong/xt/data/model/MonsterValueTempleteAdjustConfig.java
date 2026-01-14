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
 * 对应文件: MonsterValueTempleteAdjust.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MonsterValueTempleteAdjustConfig {

    private final Integer id;
    private final Integer templateId;
    private final Integer eet;
    private final List<Integer> resistEet;
    private final List<Integer> weakEet;
    private final Integer atkFix;
    private final Integer werFix;
    private final Integer ferFix;
    private final Integer serFix;
    private final Integer aerFix;
    private final Integer lerFix;
    private final Integer derFix;
    private final Integer toughnessRatio;
    private final Integer hpRatio;
    private final Integer atkRatio;
    private final Integer hpFix;
    private final Integer toughnessFix;

    @JsonCreator
    public MonsterValueTempleteAdjustConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TemplateId") Integer templateId,
        @JsonProperty("EET") Integer eet,
        @JsonProperty("ResistEET") List<Integer> resistEet,
        @JsonProperty("WeakEET") List<Integer> weakEet,
        @JsonProperty("AtkFix") Integer atkFix,
        @JsonProperty("WERFix") Integer werFix,
        @JsonProperty("FERFix") Integer ferFix,
        @JsonProperty("SERFix") Integer serFix,
        @JsonProperty("AERFix") Integer aerFix,
        @JsonProperty("LERFix") Integer lerFix,
        @JsonProperty("DERFix") Integer derFix,
        @JsonProperty("ToughnessRatio") Integer toughnessRatio,
        @JsonProperty("HpRatio") Integer hpRatio,
        @JsonProperty("AtkRatio") Integer atkRatio,
        @JsonProperty("HpFix") Integer hpFix,
        @JsonProperty("ToughnessFix") Integer toughnessFix
    ) {
        this.id = id;
        this.templateId = templateId;
        this.eet = eet;
        this.resistEet = resistEet != null ? 
            new ArrayList<>(resistEet) : 
            new ArrayList<>();
        this.weakEet = weakEet != null ? 
            new ArrayList<>(weakEet) : 
            new ArrayList<>();
        this.atkFix = atkFix;
        this.werFix = werFix;
        this.ferFix = ferFix;
        this.serFix = serFix;
        this.aerFix = aerFix;
        this.lerFix = lerFix;
        this.derFix = derFix;
        this.toughnessRatio = toughnessRatio;
        this.hpRatio = hpRatio;
        this.atkRatio = atkRatio;
        this.hpFix = hpFix;
        this.toughnessFix = toughnessFix;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public Integer getEet() {
        return this.eet;
    }

    public List<Integer> getResistEet() {
        return this.resistEet;
    }

    public List<Integer> getWeakEet() {
        return this.weakEet;
    }

    public Integer getAtkFix() {
        return this.atkFix;
    }

    public Integer getWerFix() {
        return this.werFix;
    }

    public Integer getFerFix() {
        return this.ferFix;
    }

    public Integer getSerFix() {
        return this.serFix;
    }

    public Integer getAerFix() {
        return this.aerFix;
    }

    public Integer getLerFix() {
        return this.lerFix;
    }

    public Integer getDerFix() {
        return this.derFix;
    }

    public Integer getToughnessRatio() {
        return this.toughnessRatio;
    }

    public Integer getHpRatio() {
        return this.hpRatio;
    }

    public Integer getAtkRatio() {
        return this.atkRatio;
    }

    public Integer getHpFix() {
        return this.hpFix;
    }

    public Integer getToughnessFix() {
        return this.toughnessFix;
    }

}
