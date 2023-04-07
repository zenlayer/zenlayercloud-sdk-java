/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-02-22 17:44:56
 * @version $ Id: AssociateVpcSubnetRequest.java, v 0.1  alicat.xu Exp $
 */
public class AssociateVpcSubnetRequest extends TeaModel {

    /**
     * Subnet的ID。
     */
    @Validation(required = true)
    public String subnetId;

    /**
     * VPC的ID。
     */
    @Validation(required = true)
    public String vpcId;
}
