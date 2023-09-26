/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;


import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.Set;

/**
 * @author ezreal
 * @version $ Id: DescribeSubnetsRequest.java, v 0.1  ezreal Exp $
 * @date 2023-03-14 21:27:14
 */

public class DescribeVpcSubnetsRequest extends TeaModel {
    @Validation(maxLength = 100)
    public Set<String> subnetIds;

    @Validation
    public String cidrBlock;

    @Validation
    public String vpcId;

    @Validation
    public String subnetStatus;

    @Validation
    public String subnetName;

    @Validation(maximum = 1000, minimum = 1)
    public Integer pageSize;

    @Validation(minimum = 1)
    public Integer pageNum;
}
