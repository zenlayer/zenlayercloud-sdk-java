/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:25:23
 * @version $ Id: ResetInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class ResetInstanceRequest extends TeaModel {

    /**
     * 实例ID
     */
    @Validation(required = true)
    public String instanceId;

    /**
     * 镜像ID
     */
    public String imageId;

    /**
     * 实例登录密码
     */
    @Validation(minLength = 8, maxLength = 16)
    public String password;


}
