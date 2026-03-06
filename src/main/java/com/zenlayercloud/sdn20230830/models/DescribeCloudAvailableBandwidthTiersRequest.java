/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @version $ Id: DescribeCloudAvailableBandwidthTiersRequest.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:57:11
 */
public class DescribeCloudAvailableBandwidthTiersRequest extends TeaModel {

    /**
     * 云连接ID。
     */
    public String cloudPortId;

    /**
     * 云连接类型。
     */
    public String cloudType;

    /**
     * 云平台账号。
     */
    public String cloudAccountId;

    /**
     * 公有云区域ID。
     */
    public String cloudRegionId;

    /**
     * 连接云接入点的数据中心ID。
     */
    public String dcId;

    /**
     * VLAN ID。
     */
    public Integer vlanId;
}
