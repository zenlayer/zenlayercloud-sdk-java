/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:56:24
 * @version $ Id: DescribeCloudRouteEdgePointTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterEdgePointTrafficRequest extends TeaModel {

    /**
     * 三层网络连接点的ID。
     */
    public String edgePointId;

    /**
     * 查询开始时间。
     */
    public String startTime;

    /**
     * 查询结束时间。
     */
    public String endTime;

}
