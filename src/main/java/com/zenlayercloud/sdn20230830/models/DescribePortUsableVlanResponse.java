/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:42:55
 * @version $ Id: DescribePortUsableVlanResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribePortUsableVlanResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * VLAN 范围起始值。
     */
    public Integer start;

    /**
     * VLAN 范围结束值。
     */
    public Integer end;

    /**
     * 占用中的vlan列表。
     */
    public List<Integer> inuseVlanList;

}
