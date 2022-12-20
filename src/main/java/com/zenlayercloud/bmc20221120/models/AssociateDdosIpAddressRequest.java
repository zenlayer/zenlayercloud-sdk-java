/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:48:51
 * @version $ Id: AssociateEipAddressRequest.java, v 0.1  alicat.xu Exp $
 */
public class AssociateDdosIpAddressRequest extends TeaModel {

    /**
     * 一个DDOS IP ID
     * 可通过DescribeDdosIpAddresses接口返回值中的ddosIpId获取
     */
    @Validation(minLength = 1, required = true)
    public String ddosIpId;

    /**
     * 机器实例ID
     * 可通过DescribeInstances接口返回值中的InstanceId获取
     */
    @Validation(minLength = 1, required = true)
    public String instanceId;
}
