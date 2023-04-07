/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:49:10
 * @version $ Id: ModifyInstanceTrafficPackageResponse.java, v 0.1  alicat.xu Exp $
 */
public class ModifyInstanceTrafficPackageResponse extends TeaModel {

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
