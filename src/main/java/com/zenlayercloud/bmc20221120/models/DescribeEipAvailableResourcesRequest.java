/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:37:13
 * @version $ Id: DescribeEipAvailableResourceRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeEipAvailableResourcesRequest extends TeaModel {

    /**
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费
     */
    @Validation(required = true)
    public String eipChargeType;

    /**
     * 可用区ID，不传则查询所有区域可用的EIP
     */
    public String zoneId;
}
