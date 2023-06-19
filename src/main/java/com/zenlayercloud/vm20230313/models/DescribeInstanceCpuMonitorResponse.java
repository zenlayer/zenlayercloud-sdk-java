/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-11 15:10:48
 * @version $ Id: DescribeInstanceCpuMonitorResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceCpuMonitorResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public List<InstanceCpuMonitorData> dataList;


}
