/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-21 23:44:31
 * @version $ Id: DescribeVpcRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeVpcsRequest extends TeaModel {
    /**
     * VPC ID 取值可以由多个VPC ID组成一个
     * 最多支持100个ID查询
     */

    public List<String> vpcIds;

    /**
     * VPC 名称
     */
    public String vpcName;

    /**
     * CidrBlock
     */
    public String cidrBlock;

    /**
     * 状态
     */
    public String vpcStatus;

    /**
     * VPC Region ID。
     */
    public String vpcRegionId;

    /**
     * 资源组的ID
     * 如果不传，则返回该用户可见的所有资源组内的EIP
     */
    public String resourceGroupId;

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
