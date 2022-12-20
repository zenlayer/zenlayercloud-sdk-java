/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-14 21:57:23
 * @version $ Id: InstanceType.java, v 0.1  wolfgang Exp $
 */
public class InstanceType extends TeaModel {
    public List<String>     imageIds;
    public String           instanceTypeId;
    public String           description;
    public Integer          cpuCoreCount;
    public Integer          memorySize;
    public Integer          maximumBandwidth;
    public List<Integer>    supportRaids;
    public Boolean          supportSubnet;
    public Boolean          isHA;
    public InstanceDiskInfo diskInfo;
}
