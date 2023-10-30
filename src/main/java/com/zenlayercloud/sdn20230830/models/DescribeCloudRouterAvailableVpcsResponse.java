/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:11:39
 * @version $ Id: DescribeCloudRouterAvailableVpcsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterAvailableVpcsResponse extends TeaModel {


    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可加入三层网络的VPC列表。
     */
    public List<CloudRouterAvailableVpc> dataSet;

    /**
     * 符合条件的VPC总数量。
     */
    public Integer totalCount;
}
