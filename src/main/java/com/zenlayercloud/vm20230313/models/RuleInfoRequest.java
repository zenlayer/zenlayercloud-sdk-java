/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:19:49
 * @version $ Id: RuleInfo.java, v 0.1  alicat.xu Exp $
 */
public class RuleInfoRequest extends TeaModel {

    @Validation(required = true)
    public String direction;

    public String policy;

    @Validation(required = true)
    public String ipProtocol;

    @Validation(required = true)
    public String portRange;

    @Validation(required = true)
    public String cidrIp;

    public String description;
}
