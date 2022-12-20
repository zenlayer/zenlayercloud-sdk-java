/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;
import com.aliyun.tea.Validation;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wolfgang
 * @date 2022-11-09 20:21:03
 * @version $ Id: CreateInstanceRequest.java, v 0.1  wolfgang Exp $
 */
public class CreateInstancesRequest extends TeaModel {
    /**
     * 实例所属的可用区ID。
     */
    @Validation(required = true)
    public String          zoneId;
    /**
     *
     */
    @Validation(required = true)
    public String          instanceChargeType;
    public ChargePrePaid   instanceChargePrepaid;
    @Validation(required = true)
    public String          instanceTypeId;
    public String          imageId;
    public String          resourceGroupId;
    public String          instanceName;
    public String          hostname;
    @Validation(minimum = 1, maximum = 100)
    public Integer         amount = 1;
    @Validation(minLength = 8, maxLength = 16)
    public String          password;
    public List<String>    sshKeys;
    @Validation(required = true)
    public String          internetChargeType;
    @Validation(minimum = 1)
    public Integer         internetMaxBandwidthOut;
    @Validation(minimum = 0)
    public BigDecimal      trafficPackageSize;
    /**
     *
     */
    public String          subnetId;
    /**
     * Raid configuration.
     */
    public RaidConfig      raidConfig;
    /**
     * Raid configuration.
     */
    public List<Partition> partitions;
    /**
     * 网卡配置信息，包括公网和内网名称等。
     */
    public Nic             nic;
}
