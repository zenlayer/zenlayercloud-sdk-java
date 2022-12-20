/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-06 11:24:09
 * @version $ Id: UnAssociateEipAddressRequest.java, v 0.1  alicat.xu Exp $
 */
public class UnAssociateEipAddressRequest extends TeaModel {

    /**
     * 一个EIP ID 可通过DescribeEipAddresses接口返回值中的eipId获取
     */
    @Validation(minLength = 1, required = true)
    public String eipId;
}
