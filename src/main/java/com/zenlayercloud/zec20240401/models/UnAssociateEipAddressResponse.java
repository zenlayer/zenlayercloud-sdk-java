/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-06 11:25:06a
 * @version $ Id: UnAssociateEipAddress.java, v 0.1  alicat.xu Exp $
 */
public class UnAssociateEipAddressResponse extends TeaModel {

    public List<String> failedEipIds;
    
    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;
}
