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
 * 对应文件: StarTowerScenePrefab.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerScenePrefabConfig {

    private final Integer id;
    private final String configRes;
    private final String bianQuan;
    private final List<Integer> gameplayTypes;

    @JsonCreator
    public StarTowerScenePrefabConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("ConfigRes") String configRes,
        @JsonProperty("BianQuan") String bianQuan,
        @JsonProperty("GameplayTypes") List<Integer> gameplayTypes
    ) {
        this.id = id;
        this.configRes = configRes;
        this.bianQuan = bianQuan;
        this.gameplayTypes = gameplayTypes != null ? 
            new ArrayList<>(gameplayTypes) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getConfigRes() {
        return this.configRes;
    }

    public String getBianQuan() {
        return this.bianQuan;
    }

    public List<Integer> getGameplayTypes() {
        return this.gameplayTypes;
    }

}
