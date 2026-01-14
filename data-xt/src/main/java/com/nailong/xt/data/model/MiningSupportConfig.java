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
 * 对应文件: MiningSupport.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class MiningSupportConfig {

    private final Integer id;
    private final String charIcon;
    private final String skillName;
    private final String skillDes;
    private final Integer supportEffect;
    private final String supportParams;

    @JsonCreator
    public MiningSupportConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("CharIcon") String charIcon,
        @JsonProperty("SkillName") String skillName,
        @JsonProperty("SkillDes") String skillDes,
        @JsonProperty("SupportEffect") Integer supportEffect,
        @JsonProperty("SupportParams") String supportParams
    ) {
        this.id = id;
        this.charIcon = charIcon;
        this.skillName = skillName;
        this.skillDes = skillDes;
        this.supportEffect = supportEffect;
        this.supportParams = supportParams;
    }

    public Integer getId() {
        return this.id;
    }

    public String getCharIcon() {
        return this.charIcon;
    }

    public String getSkillName() {
        return this.skillName;
    }

    public String getSkillDes() {
        return this.skillDes;
    }

    public Integer getSupportEffect() {
        return this.supportEffect;
    }

    public String getSupportParams() {
        return this.supportParams;
    }

}
