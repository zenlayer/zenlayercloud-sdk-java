/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2023-08-16 11:38:32
 * @version $ Id: DescribePrivateConnectTrafficRequest.java, v 0.1  wolfgang Exp $
 */
public class DescribeIPTransitTrafficRequest extends TeaModel {
    /**
     * IP Transit ID。
     */
    public String iptId;
    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String startTime;
    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * 默认为当前时间。
     */
    public String endTime;
}
