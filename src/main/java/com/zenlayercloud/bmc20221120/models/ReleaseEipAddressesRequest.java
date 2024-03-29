/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-06 11:02:10
 * @version $ Id: ReleaseEipAddressesRequest.java, v 0.1  alicat.xu Exp $
 */
public class ReleaseEipAddressesRequest extends TeaModel {

    /**
     * 一个或多个待操作的EIP
     * EIP ID可通过DescribeEipAddresses接口返回值中的eipId获取
     * 每次请求批量EIP的上限为100
     */
    @Validation(required = true)
    public List<String> eipIds;
}
