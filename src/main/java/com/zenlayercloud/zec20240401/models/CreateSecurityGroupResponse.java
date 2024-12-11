/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-03-17 10:53:50
 * @version $ Id: CreateSecurityGroupResponse.java, v 0.1  alicat.xu Exp $
 */
public class CreateSecurityGroupResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String requestId;

    /**
     * 安全组ID。
     */
    public String securityGroupId;
}
