/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:29:12
 * @version $ Id: DescribeCloudRouterAvailablePortsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterAvailablePortsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可加入三层网络的物理端口列表。
     */
    public List<PortInfo> dataSet;

    /**
     * 符合条件的物理端口总数量。
     */
    public Integer totalCount;
}
