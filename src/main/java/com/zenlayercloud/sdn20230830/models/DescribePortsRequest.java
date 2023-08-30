/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:16:07
 * @version $ Id: DescribePortsRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePortsRequest extends TeaModel {

    /**
     * 端口id列表。
     */
    public List<String> portIds;

    /**
     * 数据中心四字码。
     */
    public String dcId;

    /**
     * 端口名称。
     */
    public String portName;

    /**
     * 端口备注信息。
     */
    public String portRemarks;

    /**
     * 城市名称。
     */
    public String cityName;

}
