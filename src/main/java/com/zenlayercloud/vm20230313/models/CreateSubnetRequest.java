/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;


import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author ezreal
 * @version $ Id: CreateSubnetRequest.java, v 0.1  ezreal Exp $
 * @date 2023-03-14 21:27:14
 */

public class CreateSubnetRequest extends TeaModel {
    @Validation(required = true)
    public String zoneId;

    @Validation(required = true)
    public String cidrBlock;

    @Validation(required = true)
    public String subnetName;

    @Validation
    public String subnetDescription;

}
