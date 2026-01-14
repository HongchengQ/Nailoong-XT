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
 * 对应文件: Attribute.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AttributeConfig {

    private final String id;
    private final Integer groupId;
    private final Integer lvl;
    private final Integer atk;
    private final Integer hp;
    private final Integer def;
    private final Integer critPower;
    private final Integer hitRate;
    private final Integer wee;
    private final Integer fee;
    private final Integer see;
    private final Integer aee;
    private final Integer lee;
    private final Integer dee;
    private final Integer toughnessDamageAdjust;
    private final Integer normaldmg;
    private final Integer skilldmg;
    private final Integer ultradmg;
    private final Integer otherdmg;
    private final Integer rcdnormaldmg;
    private final Integer rcdskilldmg;
    private final Integer rcdultradmg;
    private final Integer rcdotherdmg;
    private final Integer markdmg;
    private final Integer rcdmarkdmg;
    private final Integer summondmg;
    private final Integer rcdsummondmg;
    private final Integer projectiledmg;
    private final Integer rcdprojectiledmg;
    private final Integer gendmg;
    private final Integer finaldmg;
    private final Integer weercd;
    private final Integer feercd;
    private final Integer seercd;
    private final Integer aeercd;
    private final Integer leercd;
    private final Integer deercd;
    private final Integer gendmgrcd;
    private final Integer critRate;
    private final Integer breakField;
    private final Integer suppress;
    private final Integer defPierce;

    @JsonCreator
    public AttributeConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("GroupId") Integer groupId,
        @JsonProperty("lvl") Integer lvl,
        @JsonProperty("Atk") Integer atk,
        @JsonProperty("Hp") Integer hp,
        @JsonProperty("Def") Integer def,
        @JsonProperty("CritPower") Integer critPower,
        @JsonProperty("HitRate") Integer hitRate,
        @JsonProperty("WEE") Integer wee,
        @JsonProperty("FEE") Integer fee,
        @JsonProperty("SEE") Integer see,
        @JsonProperty("AEE") Integer aee,
        @JsonProperty("LEE") Integer lee,
        @JsonProperty("DEE") Integer dee,
        @JsonProperty("ToughnessDamageAdjust") Integer toughnessDamageAdjust,
        @JsonProperty("NORMALDMG") Integer normaldmg,
        @JsonProperty("SKILLDMG") Integer skilldmg,
        @JsonProperty("ULTRADMG") Integer ultradmg,
        @JsonProperty("OTHERDMG") Integer otherdmg,
        @JsonProperty("RCDNORMALDMG") Integer rcdnormaldmg,
        @JsonProperty("RCDSKILLDMG") Integer rcdskilldmg,
        @JsonProperty("RCDULTRADMG") Integer rcdultradmg,
        @JsonProperty("RCDOTHERDMG") Integer rcdotherdmg,
        @JsonProperty("MARKDMG") Integer markdmg,
        @JsonProperty("RCDMARKDMG") Integer rcdmarkdmg,
        @JsonProperty("SUMMONDMG") Integer summondmg,
        @JsonProperty("RCDSUMMONDMG") Integer rcdsummondmg,
        @JsonProperty("PROJECTILEDMG") Integer projectiledmg,
        @JsonProperty("RCDPROJECTILEDMG") Integer rcdprojectiledmg,
        @JsonProperty("GENDMG") Integer gendmg,
        @JsonProperty("FINALDMG") Integer finaldmg,
        @JsonProperty("WEERCD") Integer weercd,
        @JsonProperty("FEERCD") Integer feercd,
        @JsonProperty("SEERCD") Integer seercd,
        @JsonProperty("AEERCD") Integer aeercd,
        @JsonProperty("LEERCD") Integer leercd,
        @JsonProperty("DEERCD") Integer deercd,
        @JsonProperty("GENDMGRCD") Integer gendmgrcd,
        @JsonProperty("CritRate") Integer critRate,
        @JsonProperty("Break") Integer breakField,
        @JsonProperty("Suppress") Integer suppress,
        @JsonProperty("DefPierce") Integer defPierce
    ) {
        this.id = id;
        this.groupId = groupId;
        this.lvl = lvl;
        this.atk = atk;
        this.hp = hp;
        this.def = def;
        this.critPower = critPower;
        this.hitRate = hitRate;
        this.wee = wee;
        this.fee = fee;
        this.see = see;
        this.aee = aee;
        this.lee = lee;
        this.dee = dee;
        this.toughnessDamageAdjust = toughnessDamageAdjust;
        this.normaldmg = normaldmg;
        this.skilldmg = skilldmg;
        this.ultradmg = ultradmg;
        this.otherdmg = otherdmg;
        this.rcdnormaldmg = rcdnormaldmg;
        this.rcdskilldmg = rcdskilldmg;
        this.rcdultradmg = rcdultradmg;
        this.rcdotherdmg = rcdotherdmg;
        this.markdmg = markdmg;
        this.rcdmarkdmg = rcdmarkdmg;
        this.summondmg = summondmg;
        this.rcdsummondmg = rcdsummondmg;
        this.projectiledmg = projectiledmg;
        this.rcdprojectiledmg = rcdprojectiledmg;
        this.gendmg = gendmg;
        this.finaldmg = finaldmg;
        this.weercd = weercd;
        this.feercd = feercd;
        this.seercd = seercd;
        this.aeercd = aeercd;
        this.leercd = leercd;
        this.deercd = deercd;
        this.gendmgrcd = gendmgrcd;
        this.critRate = critRate;
        this.breakField = breakField;
        this.suppress = suppress;
        this.defPierce = defPierce;
    }

    public String getId() {
        return this.id;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getLvl() {
        return this.lvl;
    }

    public Integer getAtk() {
        return this.atk;
    }

    public Integer getHp() {
        return this.hp;
    }

    public Integer getDef() {
        return this.def;
    }

    public Integer getCritPower() {
        return this.critPower;
    }

    public Integer getHitRate() {
        return this.hitRate;
    }

    public Integer getWee() {
        return this.wee;
    }

    public Integer getFee() {
        return this.fee;
    }

    public Integer getSee() {
        return this.see;
    }

    public Integer getAee() {
        return this.aee;
    }

    public Integer getLee() {
        return this.lee;
    }

    public Integer getDee() {
        return this.dee;
    }

    public Integer getToughnessDamageAdjust() {
        return this.toughnessDamageAdjust;
    }

    public Integer getNormaldmg() {
        return this.normaldmg;
    }

    public Integer getSkilldmg() {
        return this.skilldmg;
    }

    public Integer getUltradmg() {
        return this.ultradmg;
    }

    public Integer getOtherdmg() {
        return this.otherdmg;
    }

    public Integer getRcdnormaldmg() {
        return this.rcdnormaldmg;
    }

    public Integer getRcdskilldmg() {
        return this.rcdskilldmg;
    }

    public Integer getRcdultradmg() {
        return this.rcdultradmg;
    }

    public Integer getRcdotherdmg() {
        return this.rcdotherdmg;
    }

    public Integer getMarkdmg() {
        return this.markdmg;
    }

    public Integer getRcdmarkdmg() {
        return this.rcdmarkdmg;
    }

    public Integer getSummondmg() {
        return this.summondmg;
    }

    public Integer getRcdsummondmg() {
        return this.rcdsummondmg;
    }

    public Integer getProjectiledmg() {
        return this.projectiledmg;
    }

    public Integer getRcdprojectiledmg() {
        return this.rcdprojectiledmg;
    }

    public Integer getGendmg() {
        return this.gendmg;
    }

    public Integer getFinaldmg() {
        return this.finaldmg;
    }

    public Integer getWeercd() {
        return this.weercd;
    }

    public Integer getFeercd() {
        return this.feercd;
    }

    public Integer getSeercd() {
        return this.seercd;
    }

    public Integer getAeercd() {
        return this.aeercd;
    }

    public Integer getLeercd() {
        return this.leercd;
    }

    public Integer getDeercd() {
        return this.deercd;
    }

    public Integer getGendmgrcd() {
        return this.gendmgrcd;
    }

    public Integer getCritRate() {
        return this.critRate;
    }

    public Integer getBreakField() {
        return this.breakField;
    }

    public Integer getSuppress() {
        return this.suppress;
    }

    public Integer getDefPierce() {
        return this.defPierce;
    }

}
