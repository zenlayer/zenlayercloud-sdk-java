/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:08:50
 * @version $ Id: CreateInstancesRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateInstancesRequest extends TeaModel {

    /**
     * 可用区ID
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * 付费类型
     */
    @Validation(required = true)
    public String instanceChargeType;

    public ChargePrePaid instanceChargePrepaid;

    /**
     * 实例机型
     */
    @Validation(required = true)
    public String instanceType;

    /**
     * 镜像ID
     */
    @Validation(required = true)
    public String imageId;

    /**
     * 资源组ID
     */
    public String resourceGroupId;

    /**
     * 实例名称
     */
    public String instanceName;

    /**
     * 实例数量
     */
    @Validation(minimum = 1)
    public Integer instanceCount;

    /**
     * 实例密码
     */
    public String password;

    /**
     * 密钥对ID
     */
    public String keyId;

    /**
     * 网络计费类型
     */
    @Validation(required = true)
    public String internetChargeType;

    /**
     * 公网带宽上限
     */
    @Validation(minimum = 1)
    public Integer internetMaxBandwidthOut;

    /**
     * 流量包大小
     */
    public BigDecimal trafficPackageSize;

    /**
     * 私有子网
     */
    @Validation(required = true)
    public String subnetId;

    /**
     * 是否开启CIDR IPv6
     */
    public Boolean enableIpv6;

    /**
     * 是否开启CPU 透传
     */
    public Boolean cpuPassThrough;

    /**
     * 初始化脚本
     */
    public String initScript;

    /**
     * 系统盘配置
     */
    public SystemDisk systemDisk;

    /**
     * 数据盘配置
     */
    public List<DataDisk> dataDisks;

    /**
     * 安全组ID
     */
    public String securityGroupId;

    /**
     * 网卡
     */
    public Nic nic;

    /**
     * 带宽组ID
     */
    public String clusterId;

    public String networkMode;

    public Boolean diskPreAllocated;

}

