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
 * @date 2023-03-27 13:37:47
 * @version $ Id: ModifyEipAddressesResourceGroupRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyInstancesResourceGroupRequest extends TeaModel {

    /**
     * 一个或多个待操作的Instance ID。
     * 可通过DescribeInstances接口返回值中的instanceId获取。
     * 每次请求批量实例的上限为100。
     */
    @Validation(required = true)
    public List<String> instanceIds;

    @Validation(required = true)
    public String resourceGroupId;

}
