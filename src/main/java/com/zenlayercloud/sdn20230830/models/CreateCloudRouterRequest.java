/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:32:44
 * @version $ Id: CreateCloudRouterRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateCloudRouterRequest extends TeaModel {

    /**
     * 三层网络的名称。
     */
    public String cloudRouterName;

    /**
     * 三层网络的描述信息。
     */
    public String cloudRouterDescription;

    /**
     * 创建三层网络中的边缘连接点信息。
     */
    public List<CreateCloudRouterEdgePoint> edgePoints;

    /**
     * 资源组的ID。
     */
    public String resourceGroupId;
}
