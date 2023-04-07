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

    /**
     * 机型支持的镜像ID。
     */
    public List<String>     imageIds;

    /**
     * 实例机型ID。
     */
    public String           instanceTypeId;

    /**
     * 机型描述。
     * 一般包括内存大小，硬盘。
     */
    public String           description;

    /**
     * CPU内核数目。
     */
    public Integer          cpuCoreCount;

    /**
     * 内存大小。
     * 单位：GB。
     */
    public Integer          memorySize;

    /**
     * 机型支持的最大出口带宽。
     * 单位：Mbps。
     */
    public Integer          maximumBandwidth;

    /**
     * 机型支持的raid。
     */
    public List<Integer>    supportRaids;

    /**
     * 是否支持内网组网。
     */
    public Boolean          supportSubnet;

    /**
     * 是否高可用机型。
     */
    public Boolean          isHA;

    /**
     * 硬盘配置。
     * 单位：GB。
     */
    public InstanceDiskInfo diskInfo;
}
