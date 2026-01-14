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
 * 对应文件: CookieFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CookieFloorConfig {

    private final Integer id;
    private final Integer floorId;
    private final Integer size;
    private final Integer packageNum;
    private final Integer packagePathsGroupId;
    private final Integer rhythmlTime;
    private final Integer preRange;
    private final Integer postRange;
    private final List<Integer> cookieTypeNum;

    @JsonCreator
    public CookieFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("FloorId") Integer floorId,
        @JsonProperty("Size") Integer size,
        @JsonProperty("PackageNum") Integer packageNum,
        @JsonProperty("PackagePathsGroupId") Integer packagePathsGroupId,
        @JsonProperty("RhythmlTime") Integer rhythmlTime,
        @JsonProperty("PreRange") Integer preRange,
        @JsonProperty("PostRange") Integer postRange,
        @JsonProperty("CookieTypeNum") List<Integer> cookieTypeNum
    ) {
        this.id = id;
        this.floorId = floorId;
        this.size = size;
        this.packageNum = packageNum;
        this.packagePathsGroupId = packagePathsGroupId;
        this.rhythmlTime = rhythmlTime;
        this.preRange = preRange;
        this.postRange = postRange;
        this.cookieTypeNum = cookieTypeNum != null ? 
            new ArrayList<>(cookieTypeNum) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getFloorId() {
        return this.floorId;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getPackageNum() {
        return this.packageNum;
    }

    public Integer getPackagePathsGroupId() {
        return this.packagePathsGroupId;
    }

    public Integer getRhythmlTime() {
        return this.rhythmlTime;
    }

    public Integer getPreRange() {
        return this.preRange;
    }

    public Integer getPostRange() {
        return this.postRange;
    }

    public List<Integer> getCookieTypeNum() {
        return this.cookieTypeNum;
    }

}
