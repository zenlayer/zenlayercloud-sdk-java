/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.sdn20230830.models.TrafficData;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2024-08-09 13:54:59
 * @version $ Id: DescribeIPTransitTrafficResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeIPTransitTrafficResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

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
