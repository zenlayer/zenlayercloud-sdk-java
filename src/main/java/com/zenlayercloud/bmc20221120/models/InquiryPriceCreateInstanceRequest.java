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
     * 实例机型ID。
     * 具体取值可通过调用接口DescribeInstanceTypes来获得最新的规格表。
     */
    @Validation(required = true)
    public String        instanceTypeId;

    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。 POSTPAID：后付费。
     */
    @Validation(required = true)
    public String        instanceChargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。
     * 通过该参数可以指定包年包月实例的购买时长等属性。
     * 若指定实例的付费模式为预付费则该参数必传。
     */
    public ChargePrePaid instanceChargePrepaid;

    /**
     * 流量包订购大小。
     * 单位为TB。该值仅限当 internetChargeType = ByTrafficPackage 生效。
     */
    @Validation(minimum = 0)
    public BigDecimal    trafficPackageSize;

    /**
     * 公网出带宽上限。
     * 单位：Mbps。
     * 默认值：1Mbps。
     * 不同机型带宽上限范围不一致，具体限制详见购买网络带宽。
     */
    @Validation(minimum = 0)
    public Integer       internetMaxBandwidthOut = 1;

    /**
     * 网络计费类型。
     * 取值范围请看InternetChargeType。
     */
    @Validation(required = true)
    public String        internetChargeType;
}
