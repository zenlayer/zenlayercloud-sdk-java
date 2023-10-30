/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-10 10:32:12
 * @version $ Id: CreateCloudRouterResponse.java, v 0.1  alicat.xu Exp $
 */
public class CreateCloudRouterResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * 三层网络ID。
     */
    public String cloudRouterId;
}
