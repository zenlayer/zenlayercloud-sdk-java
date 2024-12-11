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
 * @date 2023-03-23 15:03:09
 * @version $ Id: ModifyDisksAttributesRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyDisksAttributesRequest extends TeaModel {

    /**
     * DISK ID 取值可以由多个DISK ID组成一个
     * 最多支持100个ID查询
     */
    @Validation(required = true)
    public List<String> diskIds;

    /**
     * DISK名称
     */
    @Validation(required = true, minLength = 1, maxLength = 64)
    public String diskName;
}
