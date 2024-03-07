/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-07-06 23:36:21
 * @version $ Id: ModifyAcceleratorNameRequest.java, v 0.1  alicat.xu Exp $
 */
public class ModifyAcceleratorNameRequest extends TeaModel {

    @Validation(required = true)
    public String acceleratorId;
    @Validation(required = true)
    public String acceleratorName;
}
