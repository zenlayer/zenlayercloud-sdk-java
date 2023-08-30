/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:34:51
 * @version $ Id: DescribePortTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePortTrafficRequest extends TeaModel {

    /**
     * 端口id。
     */
    public String portId;

    /**
     * 查询开始时间。
     */
    public String startTime;

    /**
     * 查询结束时间。
     */
    public String endTime;


}
