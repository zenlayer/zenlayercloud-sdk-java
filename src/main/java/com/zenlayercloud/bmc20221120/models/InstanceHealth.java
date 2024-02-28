/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

/**
 * @author alicat.xu
 * @date 2023-09-22 17:12:20
 * @version $ Id: InstanceHealth.java, v 0.1  alicat.xu Exp $
 */
public class InstanceHealth extends TeaModel {

    public String instanceId;

    public String cpuStatus;

    public String diskStatus;

    public String ipmiPing;

    public String ipmiStatus;

    public String memoryStatus;

    public String psuStatus;

    public String wanPortStatus;

    public String fanStatus;

    public String serverBrand;

    public String serverModel;

    public Integer cpuTemp;

    public Integer cpu0Temp;

    public Integer cpu1Temp;

    public Integer cpu2Temp;

    public Integer inletTemp;

    public String tempUnit;
}
