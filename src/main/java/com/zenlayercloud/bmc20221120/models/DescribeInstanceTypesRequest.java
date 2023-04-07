/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2022/12/29
 */
public class DescribeInstanceTypesRequest extends TeaModel {

    /**
     * 查询实例机型时，支持某镜像的机型。
     */
    public String        imageId;

    /**
     * 实例机型ID。
     * 数量不超过100个。
     */
    public List<String>  instanceTypeIds;

    /**
     * 查询实例机型时，期望最小CPU内核的数目。
     * 取值范围：正整数。
     */
    public Integer       minimumCpuCoreCount;

    /**
     * 查询实例机型时，期望最大CPU内核的数目。
     * 取值范围：正整数。
     */
    public Integer       maximumCpuCoreCount;

    /**
     * 查询实例机型时，期望最小内存大小。
     * 取值范围：正整数。
     * 单位：GB。
     */
    public Integer       minimumMemorySize;

    /**
     * 查询实例机型时，期望最大内存大小。
     * 取值范围：正整数。
     * 单位：GB。
     */
    public Integer       maximumMemorySize;

    /**
     * 查询实例机型时，期望最小公网入方向带宽限制。
     * 单位：Mbps。
     */
    public Integer       minimumBandwidth;

    /**
     * 查询实例机型时，对实例机型做raid时所支持的raid类型。
     * Raid可选值包括：0, 1, 5, 10。
     */
    public List<Integer> supportRaids;

    /**
     * 查询实例机型时，机型是否支持内网组网。
     */
    public Boolean       supportSubnet;

    /**
     * 查询实例机型时，期望最小磁盘大小。
     * 取值范围：正整数。
     * 单位：GB。
     */
    public Integer       minimumDiskSize;

    /**
     * 查询实例机型时，期望最大磁盘大小。
     * 取值范围：正整数。
     * 单位：GB。
     */
    public Integer       maximumDiskSize;

    /**
     * 查询实例机型时，是否是高可用机型。
     */
    public Boolean       isHA;
}
