/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-07-11 10:39:58
 * @version $ Id: DescribeEipTrafficRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeEipTrafficRequest extends TeaModel {

    @Validation(minLength = 1, required = true)
    public String eipId;

    public String startTime;

    public String endTime;

    public String wanIp;
}
