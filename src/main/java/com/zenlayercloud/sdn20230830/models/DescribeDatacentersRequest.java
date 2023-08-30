/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-09-05 11:35:22
 * @version $ Id: DescribeDatacentersRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDatacentersRequest extends TeaModel {

    /**
     * 数据中心四字码
     */
    public List<String> dcIds;

    /**
     * 是否支持端口创建
     */
    public Boolean isPortAvailable;
}
