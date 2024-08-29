/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2024-03-20 10:53:15
 * @version $ Id: DescribeInstanceMonitorDataResponse.java, v 0.1  wolfgang Exp $
 */
public class CreateVpcResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String       requestId;

    public String       vpcId;
}
