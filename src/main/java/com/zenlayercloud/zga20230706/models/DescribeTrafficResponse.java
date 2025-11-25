/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author otis.lin
 * @date 2025-11-24 17:56:00
 * @version $ Id: DescribeTrafficResponse.java, v 0.1 otis.lin Exp $
 */
public class DescribeTrafficResponse extends TeaModel {
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
