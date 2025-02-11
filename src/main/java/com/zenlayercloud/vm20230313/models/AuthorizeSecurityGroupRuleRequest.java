/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-17 16:33:43
 * @version $ Id: AuthorizeSecurityGroupRuleRequest.java, v 0.1  alicat.xu Exp $
 */
public class AuthorizeSecurityGroupRuleRequest extends TeaModel {

    /**
     * 安全组ID。
     */
    @Validation(required = true)
    public String securityGroupId;

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
