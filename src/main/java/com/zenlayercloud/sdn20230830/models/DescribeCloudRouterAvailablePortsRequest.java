/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:29:20
 * @version $ Id: DescribeCloudRouterAvailablePortsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterAvailablePortsRequest extends TeaModel {

    /**
     * 物理端口ID。
     */
    public List<String> portIds;

    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     */
    public Integer pageSize;
}
