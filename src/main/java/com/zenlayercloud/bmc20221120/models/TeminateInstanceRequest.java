/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2023/1/5
 */
public class TeminateInstanceRequest extends TeaModel {

    /**
     * 一个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的InstanceId获取。
     */
    @Validation(minLength = 1, required = true)
    public String instanceId;

}
