/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:37:27
 * @version $ Id: ModifyInstanceBandwidthRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyInstanceBandwidthRequest  extends TeaModel {
    /**
     * 实例ID
     */
    @Validation(required = true)
    public String instanceId;

    /**
     * 带宽大小
     */
    @Validation(required = true, minimum = 1)
    public Integer internetMaxBandwidthOut;
}
