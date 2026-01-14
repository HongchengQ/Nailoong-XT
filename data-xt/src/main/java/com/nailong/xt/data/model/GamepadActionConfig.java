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
 * 对应文件: GamepadAction.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GamepadActionConfig {

    private final String id;
    private final String xboxIcon;
    private final String playStationIcon;
    private final String keyboardIcon;

    @JsonCreator
    public GamepadActionConfig(
        @JsonProperty("Id") String id,
        @JsonProperty("XboxIcon") String xboxIcon,
        @JsonProperty("PlayStationIcon") String playStationIcon,
        @JsonProperty("KeyboardIcon") String keyboardIcon
    ) {
        this.id = id;
        this.xboxIcon = xboxIcon;
        this.playStationIcon = playStationIcon;
        this.keyboardIcon = keyboardIcon;
    }

    public String getId() {
        return this.id;
    }

    public String getXboxIcon() {
        return this.xboxIcon;
    }

    public String getPlayStationIcon() {
        return this.playStationIcon;
    }

    public String getKeyboardIcon() {
        return this.keyboardIcon;
    }

}
