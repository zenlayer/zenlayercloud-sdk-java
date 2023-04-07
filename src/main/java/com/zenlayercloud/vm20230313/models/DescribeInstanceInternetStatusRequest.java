/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-31 15:26:21
 * @version $ Id: DescribeInstanceInternetStatusRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceInternetStatusRequest extends TeaModel {

    /**
     * 实例ID
     */
    @Validation(required = true)
    public String instanceId;
}
