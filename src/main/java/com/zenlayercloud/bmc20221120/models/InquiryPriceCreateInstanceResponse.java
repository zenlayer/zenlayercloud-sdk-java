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
    public String      requestId;
    public Price       instancePrice;
    public List<Price> bandwidthPrice;
}
