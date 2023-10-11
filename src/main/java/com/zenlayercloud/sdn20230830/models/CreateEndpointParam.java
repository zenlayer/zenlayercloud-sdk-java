/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.sdn20230830.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-08-30 11:46:38
 * @version $ Id: CreateEndpointParam.java, v 0.1  alicat.xu Exp $
 */
public class CreateEndpointParam extends TeaModel {

    /**
     * 二层专线网络ID。子网专线已废弃,该字段将在未来一段时间彻底删除。
     */
    @Deprecated
    public String subnetId;

    /**
     * 数据中心端口的ID。
     */
    public String portId;

    /**
     * VLAN ID。
     */
    public Integer vlanId;

}
