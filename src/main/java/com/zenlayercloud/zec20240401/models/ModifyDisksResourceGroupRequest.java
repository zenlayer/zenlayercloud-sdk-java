/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 15:50:05
 * @version $ Id: ModifyInstancesResourceGroupRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyDisksResourceGroupRequest extends TeaModel {

    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeDisks接口返回值中的InstanceId获取。
     * 每次请求批量实例的上限为100。
     */
    @Validation(required = true)
    public List<String> diskIds;

    /**
     * 资源组ID
     */
    @Validation(required = true)
    public String resourceGroupId;
}
