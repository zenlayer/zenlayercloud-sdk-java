/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-02-22 09:42:33
 * @version $ Id: DescribeSubnetAvailableResourceResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeSubnetAvailableResourcesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可用区ID集合
     */
    public List<String> zoneIdSet;
}
