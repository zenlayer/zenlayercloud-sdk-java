/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:41:10
 * @version $ Id: AddCloudRouterEdgePointsRequest.java, v 0.1  alicat.xu Exp $
 */
public class AddCloudRouterEdgePointsRequest extends TeaModel {

    /**
     * 三层网络的ID。
     */
    public String cloudRouterId;

    /**
     * 新的连接点信息。
     */
    public List<CreateCloudRouterEdgePoint> edgePoints;
}
