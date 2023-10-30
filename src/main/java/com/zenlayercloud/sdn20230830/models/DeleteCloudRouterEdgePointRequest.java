/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:42:30
 * @version $ Id: DeleteCloudRouterEdgePointRequest.java, v 0.1  alicat.xu Exp $
 */
public class DeleteCloudRouterEdgePointRequest extends TeaModel {

    /**
     * 要移除的连接点ID。
     */
    public String edgePointId;

    /**
     * 连接点所在的三层网络ID。
     */
    public String cloudRouterId;
}
