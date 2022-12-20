/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-02-22 09:52:22
 * @version $ Id: CreateVpcRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateVpcRequest extends TeaModel {

    /**
     * VPC Region ID
     */
    @Validation(required = true)
    public String vpcRegionId;

    /**
     * VPC Cidr Block
     */
    @Validation(required = true)
    public String cidrBlock;

    /**
     * VPC名称
     */
    @Validation(minLength = 1, maxLength = 64)
    public String vpcName;

    /**
     * VPC所属的资源组ID。
     */
    public String resourceGroupId;
}
