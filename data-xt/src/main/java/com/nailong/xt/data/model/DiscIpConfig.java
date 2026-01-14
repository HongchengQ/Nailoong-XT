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
 * 对应文件: DiscIp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DiscIpConfig {

    private final Integer id;
    private final String voFile;
    private final Double voLoop1;
    private final String voName1;
    private final Double voBegin2;
    private final Double voLoop2;
    private final String voName2;
    private final String storyName;
    private final String storyDesc;
    private final List<Integer> charId;
    private final Double voBegin1;
    private final String avgId;

    @JsonCreator
    public DiscIpConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("VoFile") String voFile,
        @JsonProperty("VoLoop1") Double voLoop1,
        @JsonProperty("VoName1") String voName1,
        @JsonProperty("VoBegin2") Double voBegin2,
        @JsonProperty("VoLoop2") Double voLoop2,
        @JsonProperty("VoName2") String voName2,
        @JsonProperty("StoryName") String storyName,
        @JsonProperty("StoryDesc") String storyDesc,
        @JsonProperty("CharId") List<Integer> charId,
        @JsonProperty("VoBegin1") Double voBegin1,
        @JsonProperty("AvgId") String avgId
    ) {
        this.id = id;
        this.voFile = voFile;
        this.voLoop1 = voLoop1;
        this.voName1 = voName1;
        this.voBegin2 = voBegin2;
        this.voLoop2 = voLoop2;
        this.voName2 = voName2;
        this.storyName = storyName;
        this.storyDesc = storyDesc;
        this.charId = charId != null ? 
            new ArrayList<>(charId) : 
            new ArrayList<>();
        this.voBegin1 = voBegin1;
        this.avgId = avgId;
    }

    public Integer getId() {
        return this.id;
    }

    public String getVoFile() {
        return this.voFile;
    }

    public Double getVoLoop1() {
        return this.voLoop1;
    }

    public String getVoName1() {
        return this.voName1;
    }

    public Double getVoBegin2() {
        return this.voBegin2;
    }

    public Double getVoLoop2() {
        return this.voLoop2;
    }

    public String getVoName2() {
        return this.voName2;
    }

    public String getStoryName() {
        return this.storyName;
    }

    public String getStoryDesc() {
        return this.storyDesc;
    }

    public List<Integer> getCharId() {
        return this.charId;
    }

    public Double getVoBegin1() {
        return this.voBegin1;
    }

    public String getAvgId() {
        return this.avgId;
    }

}
