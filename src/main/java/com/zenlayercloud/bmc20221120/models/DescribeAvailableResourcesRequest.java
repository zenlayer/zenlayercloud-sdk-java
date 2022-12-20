/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author Zif
 * @date 2022/12/29
 */
public class DescribeAvailableResourcesRequest extends TeaModel {

    /**
     * 实例机型ID。
     */
    public String instanceTypeId;

    /**
     * 实例的付费类型。
     * PREPAID：预付费，即包年包月
     * POSTPAID：后付费
     */
    @Validation(required = true)
    public String instanceChargeType;

    /**
     * 可用区ID。
     */
    public String zoneId;

    /**
     * 售卖状态
     */
    public String sellStatus;

}
