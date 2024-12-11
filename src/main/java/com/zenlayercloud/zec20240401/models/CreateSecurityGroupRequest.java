/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:52:20
 * @version $ Id: CreateSecurityGroupRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateSecurityGroupRequest extends TeaModel {

    @Validation(required = true, minLength = 2, maxLength = 64)
    public String securityGroupName;

    @Validation(required = true)
    public List<RuleInfo> ruleInfos;

}

