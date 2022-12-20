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
    public String        imageId;
    public List<String>  instanceTypeIds;
    public Integer       minimumCpuCoreCount;
    public Integer       maximumCpuCoreCount;
    public Integer       minimumMemorySize;
    public Integer       maximumMemorySize;
    public Integer       minimumBandwidth;
    public List<Integer> supportRaids;
    public Boolean       supportSubnet;
    public Integer       minimumDiskSize;
    public Integer       maximumDiskSize;
    public Boolean       isHA;
}
