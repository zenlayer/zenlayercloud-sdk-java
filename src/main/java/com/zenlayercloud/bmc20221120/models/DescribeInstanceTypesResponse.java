/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-14 21:56:37
 * @version $ Id: DescribeInstanceTypesResponse.java, v 0.1  wolfgang Exp $
 */
public class DescribeInstanceTypesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;

    /**
     * 机型信息列表。
     */
    public List<InstanceType> instanceTypes;

}
