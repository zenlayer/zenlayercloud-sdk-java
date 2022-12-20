/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:41:51
 * @version $ Id: AllocateEipAddressesRequest.java, v 0.1  alicat.xu Exp $
 */
public class AllocateEipAddressesRequest extends TeaModel {

    /**
     * EIP所属的可用区ID
     */
    @Validation(required = true)
    public String zoneId;

    /**
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费
     */
    @Validation(required = true)
    public String eipChargeType;

    /**
     * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月EIP的购买时长等属性
     * 若指定EIP的付费模式为预付费则该参数必传
     */
    public ChargePrePaid eipChargePrepaid;

    /**
     * 资源组ID, 如果不指定，则会放入默认资源组， 如果用户没有默认资源组权限， 则请求将会失败
     */
    public String resourceGroupId;

    /**
     * 指定创建EIP的数量, 范围为 1-100
     * 默认值：1
     */
    @Validation(minimum = 1, maximum = 100)
    public Integer amount = 1;
}
