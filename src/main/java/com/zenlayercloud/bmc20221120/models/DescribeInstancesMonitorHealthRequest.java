/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-06-28 17:21:11
 * @version $ Id: DescribeInstanceTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstancesMonitorHealthRequest extends TeaModel {

    /**
     * 机器实例ID
     * 可通过DescribeInstances接口返回值中的InstanceId获取
     */
    @Validation(required = true)
    public List<String> instanceIds;
}
