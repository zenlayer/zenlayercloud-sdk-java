/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-31 15:07:08
 * @version $ Id: InquiryPriceCreateInstanceRequest.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceCreateInstanceRequest extends TeaModel {

    /**
     * 可用区ID
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * 实例机型
     */
    @Validation(required = true)
    public String instanceType;

    /**
     * 实例计费类型
     */
    @Validation(required = true)
    public String instanceChargeType;

    /**
     * 网络计费类型
     */
    @Validation(required = true)
    public String internetChargeType;

    public ChargePrePaid instanceChargePrepaid;

    /**
     * 流量包
     */
    public BigDecimal trafficPackageSize;

    /**
     * 带宽上限
     */
    public Integer  internetMaxBandwidthOut;

    /**
     * 系统盘
     */
    @Validation(required = true)
    public SystemDisk systemDisk;

    /**
     * 数据盘
     */
    public List<DataDisk> dataDisks;
}
