/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-06 11:24:09
 * @version $ Id: UnAssociateEipAddressRequest.java, v 0.1  alicat.xu Exp $
 */
public class UnAssociateDdosIpAddressRequest extends TeaModel {

    /**
     * 一个DDOS IP ID 可通过DescribeDdosIpAddresses接口返回值中的ddosIpId获取
     */
    @Validation(minLength = 1, required = true)
    public String ddosIpId;
}
