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
 * 对应文件: EndSceneType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class EndSceneTypeConfig {

    private final Integer id;
    private final Integer theme;
    private final String endSceneName;
    private final String bgm;

    @JsonCreator
    public EndSceneTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Theme") Integer theme,
        @JsonProperty("EndSceneName") String endSceneName,
        @JsonProperty("BGM") String bgm
    ) {
        this.id = id;
        this.theme = theme;
        this.endSceneName = endSceneName;
        this.bgm = bgm;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getTheme() {
        return this.theme;
    }

    public String getEndSceneName() {
        return this.endSceneName;
    }

    public String getBgm() {
        return this.bgm;
    }

}
