/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-11 10:42:36
 * @version $ Id: DescribeInstanceTrafficResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstanceTrafficResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public List<InstanceTrafficData> dataList;

    public Long in95;

    public String in95Time;

    public Long inAvg;

    public Long inMax;

    public Long inMin;

    public Long inTotal;

    public Double maxBandwidth95ValueMbps;

    public Long out95;

    public String out95Time;

    public Long outAvg;

    public Long outMax;

    public Long outMin;

    public Long outTotal;

    public String totalUnit;

    public String unit;
}
