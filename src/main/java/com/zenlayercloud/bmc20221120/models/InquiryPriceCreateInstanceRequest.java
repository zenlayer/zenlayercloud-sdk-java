/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;

/**
 * @author wolfgang
 * @date 2023-01-14 14:40:03
 * @version $ Id: InquiryPriceCreateInstanceRequest.java, v 0.1  wolfgang Exp $
 */
public class InquiryPriceCreateInstanceRequest extends TeaModel {
    /**
     * 可用区ID。
     */
    @Validation(required = true)
    public String        zoneId;
    /**
     * 规格ID。
     */
    @Validation(required = true)
    public String        instanceTypeId;
    @Validation(required = true)
    public String        instanceChargeType;
    public ChargePrePaid instanceChargePrepaid;
    @Validation(minimum = 0)
    public BigDecimal    trafficPackageSize;
    @Validation(minimum = 0)
    public Integer       internetMaxBandwidthOut = 1;
    @Validation(required = true)
    public String        internetChargeType;
}
