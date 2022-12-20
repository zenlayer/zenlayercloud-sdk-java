/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2022/12/29
 */
public class ModifyInstancesAttributeRequest extends TeaModel {

    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的InstanceId获取。
     * 每次请求批量实例的上限为100。
     */
    @Validation(required = true)
    public List<String> instanceIds;

    /**
     * 实例名称。不得超过64个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    @Validation(minLength = 1, maxLength = 64, required = true)
    public String instanceName;

}
