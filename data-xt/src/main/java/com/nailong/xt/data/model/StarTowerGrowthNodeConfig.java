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
 * 对应文件: StarTowerGrowthNode.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerGrowthNodeConfig {

    private final Integer id;
    private final Integer nodeId;
    private final Integer group;
    private final String name;
    private final Boolean isServer;
    private final Integer type;
    private final Integer priority;
    private final List<Integer> position;
    private final String desc;
    private final Integer itemId1;
    private final Integer itemQty1;
    private final Boolean isClient;
    private final List<Integer> preNodes;
    private final Integer effectClient;
    private final String clientParams;
    private final Integer color;
    private final String icon;

    @JsonCreator
    public StarTowerGrowthNodeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("NodeId") Integer nodeId,
        @JsonProperty("Group") Integer group,
        @JsonProperty("Name") String name,
        @JsonProperty("IsServer") Boolean isServer,
        @JsonProperty("Type") Integer type,
        @JsonProperty("Priority") Integer priority,
        @JsonProperty("Position") List<Integer> position,
        @JsonProperty("Desc") String desc,
        @JsonProperty("ItemId1") Integer itemId1,
        @JsonProperty("ItemQty1") Integer itemQty1,
        @JsonProperty("IsClient") Boolean isClient,
        @JsonProperty("PreNodes") List<Integer> preNodes,
        @JsonProperty("EffectClient") Integer effectClient,
        @JsonProperty("ClientParams") String clientParams,
        @JsonProperty("Color") Integer color,
        @JsonProperty("Icon") String icon
    ) {
        this.id = id;
        this.nodeId = nodeId;
        this.group = group;
        this.name = name;
        this.isServer = isServer;
        this.type = type;
        this.priority = priority;
        this.position = position != null ? 
            new ArrayList<>(position) : 
            new ArrayList<>();
        this.desc = desc;
        this.itemId1 = itemId1;
        this.itemQty1 = itemQty1;
        this.isClient = isClient;
        this.preNodes = preNodes != null ? 
            new ArrayList<>(preNodes) : 
            new ArrayList<>();
        this.effectClient = effectClient;
        this.clientParams = clientParams;
        this.color = color;
        this.icon = icon;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getNodeId() {
        return this.nodeId;
    }

    public Integer getGroup() {
        return this.group;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getIsServer() {
        return this.isServer;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public List<Integer> getPosition() {
        return this.position;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getItemId1() {
        return this.itemId1;
    }

    public Integer getItemQty1() {
        return this.itemQty1;
    }

    public Boolean getIsClient() {
        return this.isClient;
    }

    public List<Integer> getPreNodes() {
        return this.preNodes;
    }

    public Integer getEffectClient() {
        return this.effectClient;
    }

    public String getClientParams() {
        return this.clientParams;
    }

    public Integer getColor() {
        return this.color;
    }

    public String getIcon() {
        return this.icon;
    }

}
