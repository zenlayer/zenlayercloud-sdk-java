/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.ipt20240901.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.sdn20230830.models.DatacenterInfo;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:56:49
 * @version $ Id: DescribePrivateConnectsResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeIPTransitsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer totalCount;

    /**
     * IP Transit列表结果集。
     */
    public List<IPTransit> dataSet;

}
