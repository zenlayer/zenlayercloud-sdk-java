/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @version $ Id: DescribeTencentRegionsRequest.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:57:11
 */
public class DescribeTencentRegionsRequest extends TeaModel {

    /**
     * 筛选云节点点支持的产品。
     * 可用值：<br/>
     * <li>PrivateConnect:  二层网络</li>
     * <li>CloudRouter: 三层网络</li>
     */
    public String product;
}
