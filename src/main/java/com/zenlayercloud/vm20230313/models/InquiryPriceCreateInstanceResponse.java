/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-31 15:07:27
 * @version $ Id: InquiryPriceCreateInstanceResponse.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceCreateInstanceResponse  extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    public Price instancePrice;

    public List<Price> bandwidthPrice;

    public Price systemDiskPrice;

    public Price dataDiskPrice;

}
