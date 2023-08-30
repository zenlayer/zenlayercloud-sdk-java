/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 11:15:09
 * @version $ Id: DescribeCreatePrivateConnectAvailableSubnetsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribePrivateConnectAvailablePortsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 符合条件的二层网络专线总数量。
     */
    public Integer totalCount;

    /**
     * 二层网络专线列表。
     */
    public List<PortInfo> dataSet;

}
