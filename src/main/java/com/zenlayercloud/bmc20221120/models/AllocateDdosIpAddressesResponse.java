/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-01-05 13:43:53
 * @version $ Id: AllocateEipAddressesResponse.java, v 0.1  alicat.xu Exp $
 */
public class AllocateDdosIpAddressesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String       requestId;
    /**
     * DDOS IP 的ID列表
     * 当通过本接口来创建EIP时会返回该参数，表示一个或多个DDOS IP ID
     * 返回DDOS IP ID列表并不代表EIP创建成功，可根据DescribeDdosIpAddresses接口查询对应DDOS IP ID的状态来判断创建是否完成；
     * 如果DDOS IP状态由“CREATING(创建中)”变为“AVAILABLE”，则为创建成功
     */
    public List<String> ddosIpIdSet;

    /**
     * 订单号
     * 仅ddosIpChargeType为PREPAID时会返回
     */
    public String orderNumber;
}
