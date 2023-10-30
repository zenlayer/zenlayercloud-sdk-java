/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-09 17:44:00
 * @version $ Id: DescribeCloudRoutersRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRoutersRequest extends TeaModel {

    /**
     * 三层网络的ID。
     */
    public List<String> cloudRouterIds;

    /**
     * 三层网络的名称。
     */
    public String cloudRouterName;

    /**
     * 三层网络的状态。
     */
    public String cloudRouterStatus;

    /**
     * 边缘连接点的ID。
     */
    public String egdePointId;

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
