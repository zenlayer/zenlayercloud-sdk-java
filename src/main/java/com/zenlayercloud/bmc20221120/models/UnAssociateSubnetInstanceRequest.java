/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-02-22 14:44:34
 * @version $ Id: UnAssociateSubnetInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class UnAssociateSubnetInstanceRequest extends TeaModel {

    /**
     * Subnet ID
     */
    @Validation(required = true)
    public String subnetId;

    /**
     * Instance ID
     */
    @Validation(required = true)
    public String instanceId;
}
