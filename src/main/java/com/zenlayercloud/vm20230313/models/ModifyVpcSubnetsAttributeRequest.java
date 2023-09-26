/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;


import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.Set;

/**
 * @author ezreal
 * @version $ Id: ModifySubnetsAttributeRequest.java, v 0.1  ezreal Exp $
 * @date 2023-03-14 21:27:14
 */

public class ModifyVpcSubnetsAttributeRequest extends TeaModel {

    @Validation(maxLength = 100, required = true)
    public Set<String> subnetIds;

    @Validation(required = true)
    public String subnetName;

}
