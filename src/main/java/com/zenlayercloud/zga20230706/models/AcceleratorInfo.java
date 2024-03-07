/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 22:21:48
 * @version $ Id: AcceleratorInfo.java, v 0.1  alicat.xu Exp $
 */
public class AcceleratorInfo extends TeaModel {

    public String                           acceleratorId;
    public String                           acceleratorType;
    public String                           acceleratorName;
    public String                           chargeType;
    public Domain                           domain;
    public String                           acceleratorStatus;
    public String                           cname;
    public OriginInfo                       origin;
    public List<AccelerateRegionInfo>       accelerateRegions;
    public List<AccelerationRuleL4Listener> l4Listeners;
    public List<AccelerationRuleL7Listener> l7Listeners;
    public AccelerationRuleProtocolOpts     protocolOpts;
    public CertificateInfo                  certificate;
    public AccessControl                    accessControl;
    public HealthCheck                      healthCheck;
    public String                           createTime;
    public String                           resourceGroupId;



}
