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
 * @version $ Id: DescribeAcceleratorMetricsResponse.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorMetricsResponse extends TeaModel {
    public String requestId;

    public String speedUnit;

    public String timeUnit;

    public List<AcceleratorMetricsData> dataList;
}
