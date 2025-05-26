/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author otis.lin
 * @date 2025-05-22 16:22:00
 * @version $ Id: DescribeAcceleratorMetricsRequest.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorMetricsRequest extends TeaModel {
    @Validation(required = true)
    public String acceleratorId;

    @Validation(required = true)
    public String startTime;

    @Validation(required = true)
    public String endTime;
}
