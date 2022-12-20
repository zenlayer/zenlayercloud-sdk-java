/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-01-16 20:17:15
 * @version $ Id: ModifyInstanceBandwidthResponse.java, v 0.1  alicat.xu Exp $
 */
public class ModifyInstanceBandwidthResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 订单编号
     */
    public String orderNumber;
}
