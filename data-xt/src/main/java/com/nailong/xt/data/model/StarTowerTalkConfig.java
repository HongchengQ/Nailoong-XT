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
 * 对应文件: StarTowerTalk.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StarTowerTalkConfig {

    private final Integer id;
    private final String name;
    private final String content;
    private final String color;
    private final String face;
    private final String voice;
    private final Integer npcId;
    private final List<Integer> affinity;

    @JsonCreator
    public StarTowerTalkConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("Content") String content,
        @JsonProperty("Color") String color,
        @JsonProperty("Face") String face,
        @JsonProperty("Voice") String voice,
        @JsonProperty("NPCId") Integer npcId,
        @JsonProperty("Affinity") List<Integer> affinity
    ) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.color = color;
        this.face = face;
        this.voice = voice;
        this.npcId = npcId;
        this.affinity = affinity != null ? 
            new ArrayList<>(affinity) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

    public String getColor() {
        return this.color;
    }

    public String getFace() {
        return this.face;
    }

    public String getVoice() {
        return this.voice;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public List<Integer> getAffinity() {
        return this.affinity;
    }

}
