/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-30 14:06:29
 * @version $ Id: DescribeZoneInstanceConfigInfosRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeZoneInstanceConfigInfosRequest extends TeaModel {

    /**
     * 计费类型
     */
    @Validation(required = true)
    public String instanceChargeType;

    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 实例机型
     */
    public String instanceType;

}
