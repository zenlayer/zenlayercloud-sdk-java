/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author otis.lin
 * @date 2024-03-13 10:11:00
 * @version $ Id: DescribeAcceleratorTrafficRequest.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorTrafficRequest extends TeaModel {
    @Validation(required = true)
    public String acceleratorId;

    public String accelerateRegionId;

    public String listener;

    @Validation(required = true)
    public String startTime;

    @Validation(required = true)
    public String endTime;
}
