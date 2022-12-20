/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-02-22 10:23:51
 * @version $ Id: CreateSubnetRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateSubnetRequest extends TeaModel {

    /**
     * 可用区ID
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * Cidr Block
     */
    @Validation(required = true)
    public String cidrBlock;

    /**
     * Subnet名称
     */
    @Validation(minLength = 1, maxLength = 64)
    public String subnetName;

    /**
     * Subnet所属的资源组ID。
     */
    public String resourceGroupId;

    /**
     * VPC ID
     */
    public String vpcId;
}
