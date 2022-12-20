/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-02-22 09:55:44
 * @version $ Id: DeleteVpcRequest.java, v 0.1  alicat.xu Exp $
 */
public class DeleteSubnetRequest extends TeaModel {
    /**
     * VPC ID
     */
    @Validation(required = true)
    public String subnetId;
}
