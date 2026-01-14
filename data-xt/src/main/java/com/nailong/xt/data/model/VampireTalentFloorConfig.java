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
 * 对应文件: VampireTalentFloor.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class VampireTalentFloorConfig {

    private final Integer id;
    private final Integer num;
    private final List<Integer> talentId;

    @JsonCreator
    public VampireTalentFloorConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Num") Integer num,
        @JsonProperty("TalentId") List<Integer> talentId
    ) {
        this.id = id;
        this.num = num;
        this.talentId = talentId != null ? 
            new ArrayList<>(talentId) : 
            new ArrayList<>();
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getNum() {
        return this.num;
    }

    public List<Integer> getTalentId() {
        return this.talentId;
    }

}
