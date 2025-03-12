/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-11 10:42:36
 * @version $ Id: DescribeEipTrafficResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeEipTrafficResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    public List<EipTrafficData> dataList;

    public Long in95;

    public Long inAvg;

    public Long inMax;

    public Long inMin;

    public Long inTotal;

    public Long out95;

    public Long outAvg;

    public Long outMax;

    public Long outMin;

    public Long outTotal;

}
