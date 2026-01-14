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
 * 对应文件: FateCard.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FateCardConfig {

    private final Integer id;
    private final String name;
    private final String desc;
    private final String desc2;
    private final Boolean isTower;
    private final Boolean isVampire;
    private final Integer activeNumber;
    private final Integer duration;
    private final List<Integer> activeRoomTypes;
    private final Integer activeAction;
    private final Integer methodMode;
    private final Integer clientEffect;
    private final Integer count;
    private final String param1;
    private final String param9;
    private final String param2;
    private final String param3;
    private final String param4;
    private final List<Integer> clientExEffect;
    private final String param5;
    private final String param6;
    private final Boolean isVampireSpecial;
    private final Integer themeType;
    private final Integer themeValue;
    private final List<Integer> themeTriggerType;
    private final Boolean removable;

    @JsonCreator
    public FateCardConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Desc2") String desc2,
        @JsonProperty("IsTower") Boolean isTower,
        @JsonProperty("IsVampire") Boolean isVampire,
        @JsonProperty("ActiveNumber") Integer activeNumber,
        @JsonProperty("Duration") Integer duration,
        @JsonProperty("ActiveRoomTypes") List<Integer> activeRoomTypes,
        @JsonProperty("ActiveAction") Integer activeAction,
        @JsonProperty("MethodMode") Integer methodMode,
        @JsonProperty("ClientEffect") Integer clientEffect,
        @JsonProperty("Count") Integer count,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param9") String param9,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4,
        @JsonProperty("ClientExEffect") List<Integer> clientExEffect,
        @JsonProperty("Param5") String param5,
        @JsonProperty("Param6") String param6,
        @JsonProperty("IsVampireSpecial") Boolean isVampireSpecial,
        @JsonProperty("ThemeType") Integer themeType,
        @JsonProperty("ThemeValue") Integer themeValue,
        @JsonProperty("ThemeTriggerType") List<Integer> themeTriggerType,
        @JsonProperty("Removable") Boolean removable
    ) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.desc2 = desc2;
        this.isTower = isTower;
        this.isVampire = isVampire;
        this.activeNumber = activeNumber;
        this.duration = duration;
        this.activeRoomTypes = activeRoomTypes != null ? 
            new ArrayList<>(activeRoomTypes) : 
            new ArrayList<>();
        this.activeAction = activeAction;
        this.methodMode = methodMode;
        this.clientEffect = clientEffect;
        this.count = count;
        this.param1 = param1;
        this.param9 = param9;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.clientExEffect = clientExEffect != null ? 
            new ArrayList<>(clientExEffect) : 
            new ArrayList<>();
        this.param5 = param5;
        this.param6 = param6;
        this.isVampireSpecial = isVampireSpecial;
        this.themeType = themeType;
        this.themeValue = themeValue;
        this.themeTriggerType = themeTriggerType != null ? 
            new ArrayList<>(themeTriggerType) : 
            new ArrayList<>();
        this.removable = removable;
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

    public String getDesc2() {
        return this.desc2;
    }

    public Boolean getIsTower() {
        return this.isTower;
    }

    public Boolean getIsVampire() {
        return this.isVampire;
    }

    public Integer getActiveNumber() {
        return this.activeNumber;
    }

    public Integer getDuration() {
        return this.duration;
    }

    public List<Integer> getActiveRoomTypes() {
        return this.activeRoomTypes;
    }

    public Integer getActiveAction() {
        return this.activeAction;
    }

    public Integer getMethodMode() {
        return this.methodMode;
    }

    public Integer getClientEffect() {
        return this.clientEffect;
    }

    public Integer getCount() {
        return this.count;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam9() {
        return this.param9;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

    public List<Integer> getClientExEffect() {
        return this.clientExEffect;
    }

    public String getParam5() {
        return this.param5;
    }

    public String getParam6() {
        return this.param6;
    }

    public Boolean getIsVampireSpecial() {
        return this.isVampireSpecial;
    }

    public Integer getThemeType() {
        return this.themeType;
    }

    public Integer getThemeValue() {
        return this.themeValue;
    }

    public List<Integer> getThemeTriggerType() {
        return this.themeTriggerType;
    }

    public Boolean getRemovable() {
        return this.removable;
    }

}
