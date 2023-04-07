/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:42:44
 * @version $ Id: EipChargePrePaidRequest.java, v 0.1  alicat.xu Exp $
 */
public class ChargePrePaid extends TeaModel {
    @Validation(required = true)
    public Integer period;
}
