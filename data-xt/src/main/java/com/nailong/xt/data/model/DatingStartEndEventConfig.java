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
 * 对应文件: DatingStartEndEvent.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DatingStartEndEventConfig {

    private final Integer id;
    private final Integer datingEventType;
    private final List<Integer> datingEventParams;
    private final String desc1;
    private final String desc2;
    private final String desc3;
    private final String response;

    @JsonCreator
    public DatingStartEndEventConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("DatingEventType") Integer datingEventType,
        @JsonProperty("DatingEventParams") List<Integer> datingEventParams,
        @JsonProperty("Desc1") String desc1,
        @JsonProperty("Desc2") String desc2,
        @JsonProperty("Desc3") String desc3,
        @JsonProperty("Response") String response
    ) {
        this.id = id;
        this.datingEventType = datingEventType;
        this.datingEventParams = datingEventParams != null ? 
            new ArrayList<>(datingEventParams) : 
            new ArrayList<>();
        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;
        this.response = response;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getDatingEventType() {
        return this.datingEventType;
    }

    public List<Integer> getDatingEventParams() {
        return this.datingEventParams;
    }

    public String getDesc1() {
        return this.desc1;
    }

    public String getDesc2() {
        return this.desc2;
    }

    public String getDesc3() {
        return this.desc3;
    }

    public String getResponse() {
        return this.response;
    }

}
