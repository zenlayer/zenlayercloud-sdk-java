/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-03-23 11:40:24
 * @version $ Id: CreateDisksRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateDisksRequest extends TeaModel {

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

    /**
     * DISK名称
     */
    @Validation(minLength = 1, maxLength = 64)
    public String diskName;

    /**
     * DISK大小
     */
    @Validation(required = true)
    public Integer diskSize;

    /**
     * 云硬盘种类
     */
    public String diskCategory;

    /**
     * 需挂载的实例IDs
     */
    public String instanceId;

    /**
     * DISK所属的可用区ID
     */
    public String zoneId;

    /**
     * 指定创建DISK的数量, 范围为 1-50
     * 默认值：1
     */
    @Validation(minimum = 1, maximum = 50)
    public Integer diskAmount;

    /**
     * 资源组ID, 如果不指定，则会放入默认资源组， 如果用户没有默认资源组权限， 则请求将会失败
     */
    public String resourceGroupId;

    public MarketingInfo  marketingOptions;
}
