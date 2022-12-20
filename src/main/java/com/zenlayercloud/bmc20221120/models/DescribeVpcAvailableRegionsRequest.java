/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-02-22 09:47:14
 * @version $ Id: DescribeVpcRegionAvailableRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeVpcAvailableRegionsRequest extends TeaModel {

    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * VPC Region ID
     */
    public String vpcRegionId;
}
