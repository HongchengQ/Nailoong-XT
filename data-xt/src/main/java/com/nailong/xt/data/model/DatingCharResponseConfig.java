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
 * 对应文件: DatingCharResponse.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DatingCharResponseConfig {

    private final Integer id;
    private final Integer charId;
    private final String type;
    private final String voiceKey;
    private final String action;
    private final String words;
    private final String bubbleEmoji;

    @JsonCreator
    public DatingCharResponseConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharId") Integer charId,
        @JsonProperty("Type") String type,
        @JsonProperty("VoiceKey") String voiceKey,
        @JsonProperty("Action") String action,
        @JsonProperty("Words") String words,
        @JsonProperty("BubbleEmoji") String bubbleEmoji
    ) {
        this.id = id;
        this.charId = charId;
        this.type = type;
        this.voiceKey = voiceKey;
        this.action = action;
        this.words = words;
        this.bubbleEmoji = bubbleEmoji;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getCharId() {
        return this.charId;
    }

    public String getType() {
        return this.type;
    }

    public String getVoiceKey() {
        return this.voiceKey;
    }

    public String getAction() {
        return this.action;
    }

    public String getWords() {
        return this.words;
    }

    public String getBubbleEmoji() {
        return this.bubbleEmoji;
    }

}
