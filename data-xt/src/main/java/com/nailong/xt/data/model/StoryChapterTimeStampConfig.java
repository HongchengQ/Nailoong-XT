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
 * 对应文件: StoryChapterTimeStamp.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class StoryChapterTimeStampConfig {

    private final Integer id;
    private final String timeStamp;

    @JsonCreator
    public StoryChapterTimeStampConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("TimeStamp") String timeStamp
    ) {
        this.id = id;
        this.timeStamp = timeStamp;
    }

    public Integer getId() {
        return this.id;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

}
