/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-01-16 20:32:24
 * @version $ Id: CancelInstanceBandwidthResponse.java, v 0.1  alicat.xu Exp $
 */
public class CancelInstanceBandwidthDowngradeResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;
}
