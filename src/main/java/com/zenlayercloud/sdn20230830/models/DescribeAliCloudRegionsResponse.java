/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-08-30 13:52:05
 * @version $ Id: DeletePrivateConnectResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeAliCloudRegionsResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;

    /**
     * AliCloud的接入点相关的区域信息。
     */
    public List<CloudRegion> cloudRegions;

}
