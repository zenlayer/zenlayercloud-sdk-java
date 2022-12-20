/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-13 18:09:47
 * @version $ Id: NewPriceItem.java, v 0.1  wolfgang Exp $
 */
public class Price extends TeaModel {

    /**
     * 折扣。例如 80.0 代表8折。
     */
    public Double discount;

    /**
     * 预付费折后价格。
     */
    public Double discountPrice;
    /**
     * 预付费原价。
     */
    public Double originalPrice;

    /**
     * 单位价格原价，后付费模式使用。如果是阶梯价格，无当前值
     */
    public Double unitPrice;
    /**
     * 单位价格折后价，后付费模式使用。如果是阶梯价格，无当前值
     */
    public Double discountUnitPrice;
    /**
     * 计价单元。后付费模式使用。有HOUR, DAY, MONTH 分别代表小时，日，月
     */
    public String chargeUnit;

    /**
     * 阶梯价格。
     */
    public List<StepPrice> stepPrices;

    public static class StepPrice extends TeaModel {
        /**
         * 阶梯用量起始
         */
        public Double stepStart;

        public Double stepEnd;

        public Double unitPrice;

        public Double discountUnitPrice;

    }
}
