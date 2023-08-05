package org.huangcj.quant.ak.autogen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockZhAStEmRes {
    @JsonProperty("序号")
    public Long c0;

    @JsonProperty("代码")
    public String c1;

    @JsonProperty("名称")
    public String c2;

    @JsonProperty("最新价")
    public BigDecimal c3;

    /**
     * 注意单位: %
     */
    @JsonProperty("涨跌幅")
    public BigDecimal c4;

    @JsonProperty("涨跌额")
    public BigDecimal c5;

    @JsonProperty("成交量")
    public BigDecimal c6;

    @JsonProperty("成交额")
    public BigDecimal c7;

    /**
     * 注意单位: %
     */
    @JsonProperty("振幅")
    public BigDecimal c8;

    @JsonProperty("最高")
    public BigDecimal c9;

    @JsonProperty("最低")
    public BigDecimal c10;

    @JsonProperty("今开")
    public BigDecimal c11;

    @JsonProperty("昨收")
    public BigDecimal c12;

    @JsonProperty("量比")
    public BigDecimal c13;

    /**
     * 注意单位: %
     */
    @JsonProperty("换手率")
    public BigDecimal c14;

    @JsonProperty("市盈率-动态")
    public BigDecimal c15;

    @JsonProperty("市净率")
    public BigDecimal c16;

}
