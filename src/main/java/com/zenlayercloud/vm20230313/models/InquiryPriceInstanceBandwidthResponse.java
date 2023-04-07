/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.bmc20221120.models.Price;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:34:25
 * @version $ Id: InquiryPriceInstanceBandwidthResponse.java, v 0.1  alicat.xu Exp $
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
