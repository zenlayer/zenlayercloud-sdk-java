/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:35:05
 * @version $ Id: DescribePortTrafficResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribePortTrafficResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 带宽数据列表。
     */
    public List<TrafficData> dataList;

    /**
     * 入口带宽95值。
     */
    public Double in95;

    /**
     * 入口带宽平均值。
     */
    public Integer inAvg;

    /**
     * 入口带宽最大值。
     */
    public Integer inMax;

    /**
     * 入口带宽最小值。
     */
    public Integer inMin;

    /**
     * 入口带宽总流量。
     */
    public Integer inTotal;

    /**
     * 出口带宽95值。
     */
    public Integer out95;

    /**
     * 出口带宽平均值。
     */
    public Integer outAvg;

    /**
     * 出口带宽最大值。
     */
    public Integer outMax;

    /**
     * 出口带宽最小值。
     */
    public Integer outMin;

    /**
     * 带宽值单位。例如：bps。
     */
    public String unit;
    
}
