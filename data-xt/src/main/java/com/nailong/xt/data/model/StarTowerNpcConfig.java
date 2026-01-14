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
 * 对应文件: StarTowerNpc.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerNpcConfig {

    private final Integer id;
    private final String name;
    private final Integer affinityGroupId;
    private final String npcDesc;
    private final String head;
    private final String image;
    private final Integer npcSkin;

    @JsonCreator
    public StarTowerNpcConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("AffinityGroupId") Integer affinityGroupId,
        @JsonProperty("NPCDesc") String npcDesc,
        @JsonProperty("Head") String head,
        @JsonProperty("Image") String image,
        @JsonProperty("NPCSkin") Integer npcSkin
    ) {
        this.id = id;
        this.name = name;
        this.affinityGroupId = affinityGroupId;
        this.npcDesc = npcDesc;
        this.head = head;
        this.image = image;
        this.npcSkin = npcSkin;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAffinityGroupId() {
        return this.affinityGroupId;
    }

    public String getNpcDesc() {
        return this.npcDesc;
    }

    public String getHead() {
        return this.head;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getNpcSkin() {
        return this.npcSkin;
    }

}
