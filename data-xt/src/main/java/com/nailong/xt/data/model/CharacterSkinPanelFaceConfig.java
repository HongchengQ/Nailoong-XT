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
 * 对应文件: CharacterSkinPanelFace.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CharacterSkinPanelFaceConfig {

    private final Integer id;
    private final String mainView;
    private final String charInfo;
    private final String battelWin;
    private final String battleLose;

    @JsonCreator
    public CharacterSkinPanelFaceConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("MainView") String mainView,
        @JsonProperty("CharInfo") String charInfo,
        @JsonProperty("BattelWin") String battelWin,
        @JsonProperty("BattleLose") String battleLose
    ) {
        this.id = id;
        this.mainView = mainView;
        this.charInfo = charInfo;
        this.battelWin = battelWin;
        this.battleLose = battleLose;
    }

    public Integer getId() {
        return this.id;
    }

    public String getMainView() {
        return this.mainView;
    }

    public String getCharInfo() {
        return this.charInfo;
    }

    public String getBattelWin() {
        return this.battelWin;
    }

    public String getBattleLose() {
        return this.battleLose;
    }

}
