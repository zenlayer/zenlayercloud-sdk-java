/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 10:42:45
 * @version $ Id: DescribePortUsableVlanRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribePortUsableVlanRequest extends TeaModel {

    /**
     * 数据中心四字码。
     */
    public String dcId;

    /**
     * 端口id。
     */
    public String portId;

}
