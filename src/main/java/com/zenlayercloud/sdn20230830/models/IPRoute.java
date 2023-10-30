/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-10-09 18:11:25
 * @version $ Id: IPRoute.java, v 0.1  alicat.xu Exp $
 */
public class IPRoute extends TeaModel {

    /**
     * 用于路由到下一跳的 IPv4 前缀。
     */
    public String prefix;

    /**
     * 下一跳IPv4地址。
     */
    public String nextHop;
}
