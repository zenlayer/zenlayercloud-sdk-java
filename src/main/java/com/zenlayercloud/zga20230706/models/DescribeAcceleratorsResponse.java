/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 22:17:53
 * @version $ Id: DescribeAcceleratorsResponse.java, v 0.1 alicat.xu Exp $
 */
public class DescribeAcceleratorsResponse extends TeaModel {
    public String requestId;
    public Integer totalCount;
    public List<AcceleratorInfo> dataSet;
}
