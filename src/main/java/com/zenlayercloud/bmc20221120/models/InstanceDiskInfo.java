/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author wolfgang
 * @date 2023-01-14 22:48:30
 * @version $ Id: DiskInfo.java, v 0.1  wolfgang Exp $
 */
public class InstanceDiskInfo extends TeaModel {
    public Integer    totalDiskSize;
    public String     diskDescription;
    public List<Disk> disks;

    public static class Disk extends TeaModel {
        public Integer diskSize;
        public Integer diskCount;

    }
}
