/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:40:36
 * @version $ Id: AddCloudRouterEdgePointsResponse.java, v 0.1  alicat.xu Exp $
 */
public class AddCloudRouterEdgePointsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 新增的连接点ID。
     */
    public List<String> edgePointIds;
}
