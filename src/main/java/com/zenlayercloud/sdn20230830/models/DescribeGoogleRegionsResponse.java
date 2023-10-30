/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @version $ Id: DescribeGoogleRegionsResponse.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:56:04
 */
public class DescribeGoogleRegionsResponse extends TeaModel {

    public String            requestId;
    public List<CloudRegion> cloudRegions;
}
