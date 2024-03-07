/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import java.util.List;

import com.aliyun.tea.TeaModel;

/**
 * @author otis.lin
 * @date 2024-03-13 10:11:00
 * @version $ Id: DescribeAcceleratorTrafficResponse.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorTrafficResponse extends TeaModel {
    public String requestId;

    public List<AcceleratorTrafficData> dataList;

    public Long inMax;

    public Long inMin;

    public Long inTotal;

    public Long outMax;

    public Long outMin;

    public Long outTotal;

    public String totalUnit;

    public String unit;
}
