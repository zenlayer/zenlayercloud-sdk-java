/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author Zif
 * @date 2023/2/10
 */
public class ModifyVpcsAttributeRequest extends TeaModel {

    /**
     * VPC ID列表。
     */
    @Validation(required = true)
    public List<String> vpcIds;

    /**
     * VPC名称。
     */
    @Validation(required = true, minLength = 1, maxLength = 64)
    public String vpcName;

}
