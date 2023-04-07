/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:51:50
 * @version $ Id: DescribeInstancesRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstancesRequest extends TeaModel {

    /**
     * 一个或多个待操作的实例ID。
     * 可通过DescribeInstances接口返回值中的InstanceId获取。
     * 每次请求批量实例的上限为100。
     */
    public List<String> instanceIds;

    /**
     * 实例所属的可用区ID
     */
    public String zoneId;

    /**
     * 资源组ID
     */
    public String resourceGroupId;

    /**
     * 实例机型
     */
    public String instanceType;

    /**
     * 网络计费类型
     */
    public String internetChargeType;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 子网ID
     */
    public String subnetId;

    /**
     * 实例状态
     */
    public String instanceStatus;

    /**
     * 实例名称
     */
    public String instanceName;

    /**
     * 安全组ID
     */
    public String securityGroupId;

    /**
     * 公网IP地址集合
     */
    public List<String> publicIpAddresses;

    /**
     * 内网IP地址集合
     */
    public List<String> privateIpAddresses;

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
