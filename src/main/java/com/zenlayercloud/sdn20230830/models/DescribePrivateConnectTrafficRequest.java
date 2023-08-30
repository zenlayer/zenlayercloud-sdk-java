/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:54:50
 * @version $ Id: DescribePrivateConnectTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePrivateConnectTrafficRequest extends TeaModel {

    /**
     * 二层网络专线ID。
     */
    public String privateConnectId;

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


