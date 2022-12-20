/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-16 21:02:29
 * @version $ Id: InquiryInstanceBandwidthPriceResponse.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceInstanceBandwidthResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 带宽价格
     */
    public List<Price> bandwidthPrice;

}
