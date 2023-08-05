package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockGdfxTop10EmRes {
    @JsonProperty("名次")
    public Long c0;

    @JsonProperty("股东名称")
    public String c1;

    @JsonProperty("股份类型")
    public String c2;

    /**
     * 注意单位: 股
     */
    @JsonProperty("持股数")
    public Long c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("占总股本持股比例")
    public BigDecimal c4;

    /**
     * 注意单位: 股
     */
    @JsonProperty("增减")
    public String c5;

    /**
     * 注意单位: %
     */
    @JsonProperty("变动比率")
    public BigDecimal c6;

}
