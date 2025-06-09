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
 * @date 2023-03-23 15:00:44
 * @version $ Id: DetachDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class DetachDisksRequest extends TeaModel {

    /**
     * DISK ID 取值可以由多个DISK ID组成一个
     * 最多支持100个ID查询
     */
    @Validation(required = true)
    public List<String> diskIds;

    /**
     * 是否检查实例状态。
     * 默认为true，则机器关机，才能进行解绑。
     */
    public Boolean instanceCheckFlag;
}
