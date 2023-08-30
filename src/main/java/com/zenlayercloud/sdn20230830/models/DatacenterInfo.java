/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:42:45
 * @version $ Id: DescribePortUsableVlanRequest.java, v 0.1  alicat.xu Exp $
 */
public class DatacenterInfo extends TeaModel {

    /**
     * 数据中心四字码
     */
    public String dcId;

    /**
     * 数据中心名称。
     */
    public String dcName;

    /**
     * 数据中心地址。
     */
    public String dcAddress;

    /**
     * 城市名称
     */
    public String cityName;

    /**
     * 国家名称。
     */
    public String countryName;

    /**
     * 地区名称。
     */
    public String areaName;
}