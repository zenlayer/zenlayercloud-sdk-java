/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:52:08
 * @version $ Id: EipPriceResponse.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceCreateEipAddressResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    /**
     * EIP 价格
     */
    public Price eipPrice;
}
