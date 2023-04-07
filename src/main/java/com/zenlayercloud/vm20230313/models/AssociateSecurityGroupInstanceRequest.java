/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-17 11:02:32
 * @version $ Id: AssociateSecurityGroupInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class AssociateSecurityGroupInstanceRequest extends TeaModel {

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
