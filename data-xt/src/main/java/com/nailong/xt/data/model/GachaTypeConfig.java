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
 * 对应文件: GachaType.json
 */
@ToString
@Builder
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class GachaTypeConfig {

    private final Integer id;
    private final String name;
    private final List<Integer> coinItem;
    private final String title1;
    private final String desc1;
    private final String title2;
    private final String desc2;
    private final String title3;
    private final String desc3;
    private final String title4;
    private final String desc4;
    private final String desc5;
    private final String title5;
    private final String desc6;
    private final String desc7;
    private final String desc8;
    private final String desc9;
    private final String desc10;
    private final String desc11;

    @JsonCreator
    public GachaTypeConfig(
        @JsonProperty("Id") Integer id,
        @JsonProperty("Name") String name,
        @JsonProperty("CoinItem") List<Integer> coinItem,
        @JsonProperty("Title1") String title1,
        @JsonProperty("Desc1") String desc1,
        @JsonProperty("Title2") String title2,
        @JsonProperty("Desc2") String desc2,
        @JsonProperty("Title3") String title3,
        @JsonProperty("Desc3") String desc3,
        @JsonProperty("Title4") String title4,
        @JsonProperty("Desc4") String desc4,
        @JsonProperty("Desc5") String desc5,
        @JsonProperty("Title5") String title5,
        @JsonProperty("Desc6") String desc6,
        @JsonProperty("Desc7") String desc7,
        @JsonProperty("Desc8") String desc8,
        @JsonProperty("Desc9") String desc9,
        @JsonProperty("Desc10") String desc10,
        @JsonProperty("Desc11") String desc11
    ) {
        this.id = id;
        this.name = name;
        this.coinItem = coinItem != null ? 
            new ArrayList<>(coinItem) : 
            new ArrayList<>();
        this.title1 = title1;
        this.desc1 = desc1;
        this.title2 = title2;
        this.desc2 = desc2;
        this.title3 = title3;
        this.desc3 = desc3;
        this.title4 = title4;
        this.desc4 = desc4;
        this.desc5 = desc5;
        this.title5 = title5;
        this.desc6 = desc6;
        this.desc7 = desc7;
        this.desc8 = desc8;
        this.desc9 = desc9;
        this.desc10 = desc10;
        this.desc11 = desc11;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Integer> getCoinItem() {
        return this.coinItem;
    }

    public String getTitle1() {
        return this.title1;
    }

    public String getDesc1() {
        return this.desc1;
    }

    public String getTitle2() {
        return this.title2;
    }

    public String getDesc2() {
        return this.desc2;
    }

    public String getTitle3() {
        return this.title3;
    }

    public String getDesc3() {
        return this.desc3;
    }

    public String getTitle4() {
        return this.title4;
    }

    public String getDesc4() {
        return this.desc4;
    }

    public String getDesc5() {
        return this.desc5;
    }

    public String getTitle5() {
        return this.title5;
    }

    public String getDesc6() {
        return this.desc6;
    }

    public String getDesc7() {
        return this.desc7;
    }

    public String getDesc8() {
        return this.desc8;
    }

    public String getDesc9() {
        return this.desc9;
    }

    public String getDesc10() {
        return this.desc10;
    }

    public String getDesc11() {
        return this.desc11;
    }

}
