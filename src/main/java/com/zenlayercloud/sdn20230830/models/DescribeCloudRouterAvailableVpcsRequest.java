/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:11:57
 * @version $ Id: DescribeCloudRouterAvailableVpcsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterAvailableVpcsRequest extends TeaModel {

    /**
     * VPC ID。
     */
    public String vpcId;

    /**
     * 返回的分页数。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     */
    public Integer pageSize;
}
