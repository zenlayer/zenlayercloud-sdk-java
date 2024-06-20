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

    /**
     * 公有云区域ID。
     */
    public String cloudRegionId;

    /**
     * 公有云账号ID。Google 云此处为 pairing key.
     */
    public String cloudAccountId;

    /**
     * 接入点数据中心ID。
     */
    public String dcId;

    /**
     * 云连接类型。可选值：
     * - AWS
     * - TENCENT
     * - GOOGLE
     * - ALI_CLOUD
     * - AZURE
     */
    public String cloudType;

    /**
     * 连接点名称, 仅支持类型为云连接时指定名称。<br/>
     * 如果是端口, 则会使用端口名作为接入点名称。
     */
    public String endpointName;

    /**
     * 高可用类型
     */
    public String haType;
}
