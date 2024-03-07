/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.zga20230706.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-07-06 23:25:43
 * @version $ Id: CreateAcceleratorRequest.java, v 0.1  alicat.xu Exp $
 */
public class CreateAcceleratorRequest extends TeaModel {

    public String                           acceleratorName;
    public String                           chargeType;
    public String                           resourceGroupId;
    public String                           certificateId;
    public Domain                           domain;
    public Origin                           origin;
    public List<AccelerateRegion>           accelerateRegions;
    public List<AccelerationRuleL4Listener> l4Listeners;
    public List<AccelerationRuleL7Listener> l7Listeners;
    public AccelerationRuleProtocolOpts     protocolOpts;
    public HealthCheck                      healthCheck;
}
