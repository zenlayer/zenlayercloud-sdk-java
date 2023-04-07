/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-14 14:40:31
 * @version $ Id: InquiryPriceCreateInstanceResponse.java, v 0.1  wolfgang Exp $
 */
public class InquiryPriceCreateInstanceResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String      requestId;

    /**
     * 实例价格。
     */
    public Price       instancePrice;

    /**
     * 公网带宽价格。
     * 可能有多个价格，比如流量包计费，包含包的价格和用量超出包后的价格
     */
    public List<Price> bandwidthPrice;
}
