/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import java.util.List;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author otis.lin
 * @date 2024-03-13 10:11:00
 * @version $ Id: DescribeAcceleratorLogsRequest.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorLogsRequest extends TeaModel {
    @Validation(required = true)
    public String acceleratorId;

    @Validation(required = true)
    public String startTime;

    @Validation(required = true)
    public String endTime;

    public List<String> vips;

    public List<String> domains;
}
