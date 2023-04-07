/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;


/**
 * @author alicat.xu
 * @date 2023-03-31 15:26:50
 * @version $ Id: DescribeInstanceInternetStatusResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceInternetStatusResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 实例ID
     */
    public String instanceId;

    /**
     * 实例名称
     */
    public String instanceName;

    /**
     * 当前实例的带宽
     */
    public Integer internetMaxBandwidthOut;

    /**
     * 修改实例的带宽
     */
    public Integer modifiedInternetMaxBandwidthOut;

    /**
     * 带宽状态
     * Process, Enable, WaitToEnable
     */
    public String modifiedBandwidthStatus;

    /**
     * 当前实例的流量包
     */
    public Double trafficPackageSize;

    /**
     * 修改实例的流量包
     */
    public Double modifiedTrafficPackageSize;

    /**
     * Process, Enable, WaitToEnable
     */
    public String modifiedTrafficPackageStatus;
}
