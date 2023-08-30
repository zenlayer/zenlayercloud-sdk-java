/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

public class TrafficData extends TeaModel {

    /**
     * 入口带宽。单位：bps。
     */
    public Long internetRX;

    /**
     * 出口带宽。单位：bps。
     */
    public Long internetTX;

    /**
     * 数据时间。
     */
    public String time;
}