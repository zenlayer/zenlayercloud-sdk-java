/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:21:30
 * @version $ Id: RebootInstancesRequest.java, v 0.1  alicat.xu Exp $
 */
public class RebootInstancesRequest extends TeaModel {

    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的InstanceId获取。
     * 每次请求批量实例的上限为100。
     */
    @Validation(required = true)
    public List<String> instanceIds;
}
