/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-15 21:00:50
 * @version $ Id: DescribeAvailableResourcesResponse.java, v 0.1  wolfgang Exp $
 */
public class DescribeAvailableResourcesResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可售卖的实例资源信息。
     */
    public List<AvailableResource> availableResources;

}
