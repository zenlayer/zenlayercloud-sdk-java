/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @version $ Id: DescribeTencentRegionsResponse.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:56:04
 */
public class DescribeTencentRegionsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String            requestId;
    public List<CloudRegion> cloudRegions;
}
