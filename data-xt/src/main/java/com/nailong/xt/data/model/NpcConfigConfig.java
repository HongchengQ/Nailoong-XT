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
 * 对应文件: Npc.json.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class NpcConfigConfig {

    private final Integer id;
    private final Integer type;
    private final String hintIcon;
    private final String name;
    private final String desc;
    private final String literary;
    private final Integer refreshPoint;
    private final List<Integer> firstLines;
    private final List<Integer> lines;
    private final Integer chatTime;
    private final Integer npcId;
    private final String affinityValue;

    @JsonCreator
    public NpcConfigConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("type") Integer type,
        @JsonProperty("HintIcon") String hintIcon,
        @JsonProperty("Name") String name,
        @JsonProperty("Desc") String desc,
        @JsonProperty("Literary") String literary,
        @JsonProperty("RefreshPoint") Integer refreshPoint,
        @JsonProperty("FirstLines") List<Integer> firstLines,
        @JsonProperty("Lines") List<Integer> lines,
        @JsonProperty("ChatTime") Integer chatTime,
        @JsonProperty("NPCId") Integer npcId,
        @JsonProperty("AffinityValue") String affinityValue
    ) {
        this.id = id;
        this.type = type;
        this.hintIcon = hintIcon;
        this.name = name;
        this.desc = desc;
        this.literary = literary;
        this.refreshPoint = refreshPoint;
        this.firstLines = firstLines != null ? 
            new ArrayList<>(firstLines) : 
            new ArrayList<>();
        this.lines = lines != null ? 
            new ArrayList<>(lines) : 
            new ArrayList<>();
        this.chatTime = chatTime;
        this.npcId = npcId;
        this.affinityValue = affinityValue;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getType() {
        return this.type;
    }

    public String getHintIcon() {
        return this.hintIcon;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getLiterary() {
        return this.literary;
    }

    public Integer getRefreshPoint() {
        return this.refreshPoint;
    }

    public List<Integer> getFirstLines() {
        return this.firstLines;
    }

    public List<Integer> getLines() {
        return this.lines;
    }

    public Integer getChatTime() {
        return this.chatTime;
    }

    public Integer getNpcId() {
        return this.npcId;
    }

    public String getAffinityValue() {
        return this.affinityValue;
    }

}
