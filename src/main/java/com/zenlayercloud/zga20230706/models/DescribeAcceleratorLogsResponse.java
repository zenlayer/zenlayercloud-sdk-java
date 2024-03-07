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
 * @version $ Id: DescribeAcceleratorLogsResponse.java, v 0.1 otis.lin Exp $
 */
public class DescribeAcceleratorLogsResponse extends TeaModel {
    public String requestId;
    public Integer totalCount;
    public List<AcceleratorLog> logSet;
}
