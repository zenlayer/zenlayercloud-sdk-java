/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:54:47
 * @version $ Id: DescribePrivateConnectsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePrivateConnectsRequest extends TeaModel {

    /**
     * 二层网络专线ID列表。
     */
    public List<String> privateConnectIds;

    /**
     * 二层网络专线的名称。
     */
    public String privateConnectName;

    /**
     * 连通性状态。
     */
    public String connectivityStatus;

    /**
     * 二层网络专线的状态。
     */
    public String privateConnectStatus;

    /**
     * 二层网络专线连接点的类型
     */
    public List<String> endpointTypes;

    /**
     * 资源组的ID。
     */
    public String resourceGroupId;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     */
    public Integer pageSize;
}
