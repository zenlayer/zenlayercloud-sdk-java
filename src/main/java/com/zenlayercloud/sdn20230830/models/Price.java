/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:47:38
 * @version $ Id: Price.java, v 0.1  alicat.xu Exp $
 */
public class Price extends TeaModel {

    /**
     * 预付费的原价。
     * 预付费模式使用，后付费该值为 null。
     */
    public Double originalPrice;

    /**
     * 预付费的折扣价。
     * 预付费模式使用，后付费该值为 null。
     */
    public Double discountPrice;

    /**
     * 折扣大小。
     * 如80.0代表8折。
     */
    public Double discount;

    /**
     * 后付费的单元原始价格。
     * 后付费模式使用，如果价格为阶梯价格，该项为null。
     */
    public Double unitPrice;

    /**
     * 后付费的单元折后价格。
     * 后付费模式使用，如果价格为阶梯价格，该项为null。
     */
    public Double discountUnitPrice;

    /**
     * 后付费计价单元。
     * 后付费模式使用，可取值范围：
     * HOUR: 表示计价单元是按每小时来计算。
     * DAY: 表示计价单元是按天来计算。
     * MONTH: 表示计价单元是按月来计算，95计费则是这种。
     */
    public String chargeUnit;

    public Double excessUnitPrice;

    public Double excessDiscountUnitPrice;

    public String excessAmountUnit;

    /**
     * 后付费阶梯价格。
     * 后付费模式使用，如果非阶梯价格，该项为null。
     */
    public List<StepPrice> stepPrices;

    public static class StepPrice extends TeaModel {

        /**
         * 阶梯用量的开始。
         */
        public Double stepStart;

        /**
         * 阶梯用量的结束。
         */
        public Double stepEnd;

        /**
         * 当前阶梯的单元原始价格。
         * 后付费模式使用。
         */
        public Double unitPrice;

        /**
         * 当前阶梯的单元折后价格。
         * 后付费模式使用。
         */
        public Double discountUnitPrice;


    }

}
