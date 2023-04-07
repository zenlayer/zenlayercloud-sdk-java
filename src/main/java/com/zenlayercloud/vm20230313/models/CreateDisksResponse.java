/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 11:40:34
 * @version $ Id: CreateDisksResponse.java, v 0.1  alicat.xu Exp $
 */
public class CreateDisksResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    /**
     * 云盘ID集合。
     */
    public List<String> diskIds;

    /**
     * 订单编号
     */
    public String orderNumber;
}
