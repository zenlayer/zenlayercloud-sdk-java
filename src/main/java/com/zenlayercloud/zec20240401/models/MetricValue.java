/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2024-03-20 10:54:38
 * @version $ Id: MetricValue.java, v 0.1  wolfgang Exp $
 */
public class MetricValue extends TeaModel {
    /**
     * 监控指标值。
     */
    public Double  value;
    /**
     * 数据时间戳，单位秒
     */
    public Integer timeInSecond;
}
