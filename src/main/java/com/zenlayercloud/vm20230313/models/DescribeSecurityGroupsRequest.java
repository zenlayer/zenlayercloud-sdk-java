/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-16 17:48:55
 * @version $ Id: DescribeSecurityGroupsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeSecurityGroupsRequest extends TeaModel {

    /**
     * 一个或多个待操作的安全组ID。
     * 可通过DescribeSecurityGroups接口返回值中的SecurityGroupId获取。
     * 每次请求批量实例的上限为100。
     */
    public List<String> securityGroupIds;

    /**
     * 安全组名称。
     */
    public String securityGroupName;

    /**
     * 返回的分页大小
     * 默认为20。最大为1000
     */
    public Integer pageSize;

    /**
     * 返回的分页数
     * 默认为1
     */
    public Integer pageNum;
}
