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
 * @date 2023-03-23 14:57:25
 * @version $ Id: AttachDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class AttachDisksRequest extends TeaModel {

    /**
     * DISK ID 取值可以由多个DISK ID组成一个
     * 最多支持100个ID查询
     */
    @Validation(required = true)
    public List<String> diskIds;

    /**
     * 实例ID
     */
    @Validation(required = true)
    public String instanceId;
}
