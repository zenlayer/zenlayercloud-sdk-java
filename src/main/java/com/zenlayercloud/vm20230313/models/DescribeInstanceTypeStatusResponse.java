/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-07-11 15:10:48
 * @version $ Id: DescribeInstanceCpuMonitorResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceTypeStatusResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    /**
     * 虚拟机实例ID。
     */
    public String instanceId;

    /**
     * 实例的名称。
     */
    public String instanceName;

    /**
     * 当前实例的机型。
     */
    public String instanceType;

    /**
     * 实例将要修改的机型。
     */
    public String modifiedInstanceType;

    /**
     * 实例机型状态。
     */
    public String modifiedInstanceTypeStatus;


}
