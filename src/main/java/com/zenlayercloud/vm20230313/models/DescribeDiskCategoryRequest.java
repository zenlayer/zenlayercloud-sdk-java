/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-07-04 13:54:53
 * @version $ Id: DescribeDiskCategoryRequest.java, v 0.1  alicat.xu Exp $
 */
public class DescribeDiskCategoryRequest extends TeaModel {

    /**
     * 可用区ID
     */
    public String zoneId;

    /**
     * 实例计费类型。
     * PREPAID：预付费，即包年包月。 POSTPAID：后付费。
     */
    public String instanceChargeType;

    /**
     * 云硬盘种类。
     * HDD: 机械硬盘
     * SSD: 固态硬盘
     * 默认为HDD。
     */
    public String diskCategory;
}
