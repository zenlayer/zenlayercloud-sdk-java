/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 23:50:25
 * @version $ Id: ModifyAcceleratorAccessControlRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyAcceleratorAccessControlRequest extends TeaModel {

    @Validation(required = true)
    public String acceleratorId;

    public List<AccessControlRule> accessControlRules;
}
