/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;
import com.zenlayercloud.bmc20221120.models.ChargePrePaid;

/**
 * @author alicat.xu
 * @date 2023-03-23 15:04:43
 * @version $ Id: InquiryPriceCreateDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class InquiryPriceCreateDisksRequest extends TeaModel {

    /**
     * DISK所属的可用区ID
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * DISK大小
     */
    @Validation(required = true, minimum = 20, maximum = 2000)
    public Integer diskSize;

    /**
     * 指定创建DISK的数量, 范围为 1-50
     * 默认值：1
     */
    @Validation(minimum = 1, maximum = 50)
    public Integer diskAmount;

    /**
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费
     */
    @Validation(required = true)
    public String chargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月DISK的购买时长等属性
     * 若指定DISK的付费模式为预付费则该参数必传
     */
    public ChargePrePaid chargePrepaid;

}
