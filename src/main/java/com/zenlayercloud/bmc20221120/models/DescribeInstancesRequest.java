/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2022/12/29
 */
public class DescribeInstancesRequest extends TeaModel {

    /**
     * 实例ID。取值可以由多个实例ID组成一个。最多支持100个ID查询
     */
    public List<String> instanceIds;

    /**
     * 实例所属的可用区ID。
     */
    public String zoneId;

    /**
     * 资源组的ID。如果不传，则返回该用户可见的所有资源组内的实例
     */
    public String resourceGroupId;

    /**
     * 实例规格
     */
    public String instanceTypeId;

    /**
     * 网络计费类型。取值范围
     * ByBandwidth: 按固定带宽计费
     * ByTrafficPackage: 购买流量包计费
     * ByInstanceBandwidth95: 单个实例95计费
     * ByClusterBandwidth95: 合并95计费
     */
    public String internetChargeType;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 内网子网ID
     */
    public String subnetId;

    /**
     * 实例状态。取值范围：
     * CREATING：表示创建中
     * CREATE_FAILED：表示创建失败
     * INSTALLING: 表示在安装中
     * INSTALL_FAILED: 表示安装失败
     * RUNNING：表示运行中
     * STOPPED：表示关机
     * BOOTING：表示启动中
     * STOPPING：表示关机中
     * REBOOTING：表示重启中
     * SHUTDOWN：表示停止待销毁
     * RECYCLE: 表示实例在回收站
     */
    public String instanceStatus;

    /**
     * 实例显示名称，支持 '*' 进行模糊匹配
     */
    public String instanceName;

    /**
     * 实例主机名称
     */
    public String hostname;

    /**
     * 公网ipv4地址
     */
    public List<String> publicIpAddresses;

    /**
     * 内网子网的ipv4地址
     */
    public List<String> privateIpAddresses;

    /**
     * 返回的分页数。
     * 默认为1
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20。最大为1000
     */
    public Integer pageSize;

}
