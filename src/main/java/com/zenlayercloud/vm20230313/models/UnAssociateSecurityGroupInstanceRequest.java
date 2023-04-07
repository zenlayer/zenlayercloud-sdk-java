/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-17 11:03:55
 * @version $ Id: UnAssociateSecurityGroupInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class UnAssociateSecurityGroupInstanceRequest extends TeaModel {
    /**
     * 安全组ID。
     */
    @Validation(required = true)
    public String securityGroupId;

    /**
     * 实例ID。
     */
    @Validation(required = true)
    public String instanceId;
}
