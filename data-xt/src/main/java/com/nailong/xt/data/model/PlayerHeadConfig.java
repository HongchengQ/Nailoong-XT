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
 * 对应文件: PlayerHead.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class PlayerHeadConfig {

    private final Integer id;
    private final Integer headType;
    private final String desc;
    private final Boolean isShow;
    private final String icon;
    private final Integer trId;
    private final Integer trQty;
    private final Integer unlockChar;
    private final Integer unlockSkin;

    @JsonCreator
    public PlayerHeadConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("HeadType") Integer headType,
        @JsonProperty("Desc") String desc,
        @JsonProperty("IsShow") Boolean isShow,
        @JsonProperty("Icon") String icon,
        @JsonProperty("TrId") Integer trId,
        @JsonProperty("TrQty") Integer trQty,
        @JsonProperty("UnlockChar") Integer unlockChar,
        @JsonProperty("UnlockSkin") Integer unlockSkin
    ) {
        this.id = id;
        this.headType = headType;
        this.desc = desc;
        this.isShow = isShow;
        this.icon = icon;
        this.trId = trId;
        this.trQty = trQty;
        this.unlockChar = unlockChar;
        this.unlockSkin = unlockSkin;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getHeadType() {
        return this.headType;
    }

    public String getDesc() {
        return this.desc;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getTrId() {
        return this.trId;
    }

    public Integer getTrQty() {
        return this.trQty;
    }

    public Integer getUnlockChar() {
        return this.unlockChar;
    }

    public Integer getUnlockSkin() {
        return this.unlockSkin;
    }

}
