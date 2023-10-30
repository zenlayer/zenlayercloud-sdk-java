/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @version $ Id: DescribeAWSVlanUsageRequest.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:57:11
 */
public class DescribeGoogleVlanUsageResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 可用的VLAN 范围起始值。
     */
    public Integer start;

    /**
     * 可用的VLAN 范围结束值。
     */
    public Integer end;

    /**
     * 已使用的vlan列表。
     */
    public List<Integer> usedVlans;
}
