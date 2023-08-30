/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 11:15:19
 * @version $ Id: DescribeCreatePrivateConnectAvailableSubnetsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePrivateConnectAvailablePortsRequest extends TeaModel {

    /**
     * 物理端口ID列表。
     */
    public List<String> portIds;

    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为100。
     */
    public Integer pageSize;
}
