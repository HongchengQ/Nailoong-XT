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
 * 对应文件: FormationScene.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class FormationSceneConfig {

    private final String sceneName;
    private final String path;

    @JsonCreator
    public FormationSceneConfig(
        @JsonProperty("SceneName") String sceneName,
        @JsonProperty("Path") String path
    ) {
        this.sceneName = sceneName;
        this.path = path;
    }

    public String getSceneName() {
        return this.sceneName;
    }

    public String getPath() {
        return this.path;
    }

}
