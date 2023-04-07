/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:47:26
 * @version $ Id: InquiryPriceInstanceTrafficPackageRequest.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceInstanceTrafficPackageRequest extends TeaModel {

    /**
     * 实例ID
     */
    @Validation(required = true)
    public String instanceId;

    /**
     * 流量包大小
     */
    @Validation(required = true, minimum = 0)
    public BigDecimal trafficPackageSize;
}
