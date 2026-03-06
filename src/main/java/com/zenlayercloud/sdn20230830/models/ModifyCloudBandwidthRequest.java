/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @version $ Id: ModifyCloudBandwidthRequest.java, v 0.1  wolfgang Exp $
 * @date 2023-11-22 19:57:11
 */
public class ModifyCloudBandwidthRequest extends TeaModel {

    /**
     * 云连接ID。
     */
    public String cloudPortId;

    /**
     * 修改的带宽限速。
     */
    public Integer bandwidthMbps;

}
