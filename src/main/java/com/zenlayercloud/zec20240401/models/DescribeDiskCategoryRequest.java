/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

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
     * 云硬盘种类。
     * HDD: 机械硬盘
     * SSD: 固态硬盘
     * 默认为HDD。
     */
    public String diskCategory;
}
