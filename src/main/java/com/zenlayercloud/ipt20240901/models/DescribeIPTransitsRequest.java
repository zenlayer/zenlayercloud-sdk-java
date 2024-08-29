/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2024-08-09 23:43:31
 * @version $ Id: DescribePrivateConnectsRequest.java, v 0.1  wolfgang Exp $
 */
public class DescribeIPTransitsRequest extends TeaModel {
    /**
     * IP Transit ID列表。
     * 最大支持长度为100。
     */
    public  List<String> iptIds;
    /**
     * 数据中心ID。
     * 具体取值可通过调用接口DescribeDataCenters来获得最新的数据中心列表。
     */
    public  String       iptDcId;
    /**
     * IPT 名称。
     * 支持模糊搜索。
     */
    public  String       iptName;
    /**
     * 资源组ID。
     */
    public  String       resourceGroupId;
    /**
     * 端口ID。
     * 通过该字段可以筛选与指定端口有关的IP Transit。
     */
    public  String       peerPortId;
    /**
     * 返回的分页数。
     * 默认为1。
     */
    public  Integer      pageSize;
    /**
     * 返回的分页大小。
     * 默认为20，最大为1000。
     */
    public  Integer      pageNum;
}
