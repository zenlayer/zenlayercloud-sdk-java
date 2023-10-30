/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-10-09 17:47:39
 * @version $ Id: CloudRouter.java, v 0.1  alicat.xu Exp $
 */
public class CloudRouter extends TeaModel {

    /**
     * 三层网络的ID。
     */
    public String cloudRouterId;

    /**
     * 三层网络的名称。
     */
    public String cloudRouterName;

    /**
     * 三层网络的描述信息。
     */
    public String cloudRouterDescription;

    /**
     * 三层网络中边缘连接点的信息。
     */
    public List<CloudRouterEdgePoint> edgePoints;

    /**
     * 三层网络的计费类型。
     */
    public String cloudRouterChargeType;

    /**
     * 创建时间。
     */
    public String createTime;

    /**
     * 到期时间。
     */
    public String expiredTime;

    /**
     * 销毁的时间。
     */
    public String recycledTime;

    /**
     * 购买三层网络的时长。
     */
    public Integer period;

    /**
     * 三层网络的状态。
     */
    public String cloudRouterStatus;

    /**
     * 三层网络的连通性状态。
     */
    public String connectivityStatus;

    /**
     * 三层网络所在资源组ID。
     */
    public String resourceGroupId;

    /**
     * 三层网络所在资源组名称
     */
    public String resourceGroupName;

}
