/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2022/12/29
 */
public class ModifySecurityGroupsAttributeRequest extends TeaModel {

    /**
     * 一个或多个待操作的安全组ID。
     * 可通过DescribeSecurityGroups接口返回值中的SecurityGroupId获取。
     * 每次请求批量实例的上限为100。
     */
    @Validation(required = true)
    public List<String> securityGroupIds;

    /**
     * 安全组名称。不得超过64个字符。
     * 仅支持输入字母、数字、-和英文句点(.)
     */
    @Validation(minLength = 2, maxLength = 64, required = true)
    public String securityGroupName;


}
