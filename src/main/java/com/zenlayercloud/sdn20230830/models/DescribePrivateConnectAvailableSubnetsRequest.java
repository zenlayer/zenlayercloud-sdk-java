/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 11:15:19
 * @version $ Id: DescribeCreatePrivateConnectAvailableSubnetsRequest.java, v 0.1  alicat.xu Exp $
 */
@Deprecated
public class DescribePrivateConnectAvailableSubnetsRequest extends TeaModel {

    /**
     * 数据中心ID。
     */
    public String dcId;

    /**
     * 返回的分页数。
     * 默认为1。
     */
    public Integer pageNum;

    /**
     * 返回的分页大小。
     * 默认为20，最大为100。
     */
    public Integer pageSize;
}
