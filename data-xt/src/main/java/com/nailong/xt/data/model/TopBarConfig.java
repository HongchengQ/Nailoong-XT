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
 * 对应文件: TopBar.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class TopBarConfig {

    private final String id;
    private final String title;
    private final Integer entryId;
    private final Boolean coin;
    private final Boolean hideBack;
    private final Boolean delayShow;
    private final List<Integer> coinIds;
    private final Boolean hideCoinAdd;
    private final Boolean energy;
    private final Boolean hideHome;

    @JsonCreator
    public TopBarConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("Title") String title,
        @JsonProperty("EntryId") Integer entryId,
        @JsonProperty("Coin") Boolean coin,
        @JsonProperty("HideBack") Boolean hideBack,
        @JsonProperty("DelayShow") Boolean delayShow,
        @JsonProperty("CoinIds") List<Integer> coinIds,
        @JsonProperty("HideCoinAdd") Boolean hideCoinAdd,
        @JsonProperty("Energy") Boolean energy,
        @JsonProperty("HideHome") Boolean hideHome
    ) {
        this.id = id;
        this.title = title;
        this.entryId = entryId;
        this.coin = coin;
        this.hideBack = hideBack;
        this.delayShow = delayShow;
        this.coinIds = coinIds != null ? 
            new ArrayList<>(coinIds) : 
            new ArrayList<>();
        this.hideCoinAdd = hideCoinAdd;
        this.energy = energy;
        this.hideHome = hideHome;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getEntryId() {
        return this.entryId;
    }

    public Boolean getCoin() {
        return this.coin;
    }

    public Boolean getHideBack() {
        return this.hideBack;
    }

    public Boolean getDelayShow() {
        return this.delayShow;
    }

    public List<Integer> getCoinIds() {
        return this.coinIds;
    }

    public Boolean getHideCoinAdd() {
        return this.hideCoinAdd;
    }

    public Boolean getEnergy() {
        return this.energy;
    }

    public Boolean getHideHome() {
        return this.hideHome;
    }

}
