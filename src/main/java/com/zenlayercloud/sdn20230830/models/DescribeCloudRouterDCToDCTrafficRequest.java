/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:56:24
 * @version $ Id: DescribeCloudRouterDCToDCTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeCloudRouterDCToDCTrafficRequest extends TeaModel {

    /**
     * 三层网络ID。
     */
    public String cloudRouterId;

    /**
     * 源数据中心ID。
     */
    public String sourceDcId;

    /**
     * 目的数据中心ID。
     */
    public String destinationDcId;

    /**
     * 查询开始时间。
     */
    public String startTime;

    /**
     * 查询结束时间。
     */
    public String endTime;

}
