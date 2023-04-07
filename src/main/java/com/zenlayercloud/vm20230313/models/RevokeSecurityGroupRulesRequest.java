/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:59:22
 * @version $ Id: RevokeSecurityGroupRulesRequest.java, v 0.1  alicat.xu Exp $
 */
public class RevokeSecurityGroupRulesRequest extends TeaModel {

    /**
     * 安全组ID。
     */
    @Validation(required = true)
    public String securityGroupId;

    /**
     * 移除规则
     */
    @Validation(required = true, minLength = 1)
    public List<RuleInfoRequest> ruleInfos;

}
