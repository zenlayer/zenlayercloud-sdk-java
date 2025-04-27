/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @version $ Id: AssociateEipAddressResponse.java, v 0.1  alicat.xu Exp $
 * @date 2023-01-06 11:20:56
 */
public class AssociateEipAddressResponse extends TeaModel {

    public List<String> failedEipIds;

    /**
     * 唯一请求 ID，每次请求都会返回
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;
}
