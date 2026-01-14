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
 * 对应文件: Banner.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class BannerConfig {

    private final Integer id;
    private final Integer bannerType;
    private final String bannerName;
    private final String param1;
    private final String param2;
    private final String param3;
    private final String param4;

    @JsonCreator
    public BannerConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("BannerType") Integer bannerType,
        @JsonProperty("bannerName") String bannerName,
        @JsonProperty("Param1") String param1,
        @JsonProperty("Param2") String param2,
        @JsonProperty("Param3") String param3,
        @JsonProperty("Param4") String param4
    ) {
        this.id = id;
        this.bannerType = bannerType;
        this.bannerName = bannerName;
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getBannerType() {
        return this.bannerType;
    }

    public String getBannerName() {
        return this.bannerName;
    }

    public String getParam1() {
        return this.param1;
    }

    public String getParam2() {
        return this.param2;
    }

    public String getParam3() {
        return this.param3;
    }

    public String getParam4() {
        return this.param4;
    }

}
