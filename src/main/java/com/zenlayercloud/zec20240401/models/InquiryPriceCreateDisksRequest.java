/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

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
     * 云硬盘种类
     */
    public String diskCategory;

}
