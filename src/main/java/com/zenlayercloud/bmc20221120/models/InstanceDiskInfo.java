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
    /**
     * 机型的硬盘总大小。
     * 单位：GB。
     * totalDiskSize的大小一般小于描述的信息，系统为了分区能够成功预留了一小部分。如果采用自定义分区，最后的一个分区将会获得剩余的所有磁盘大小。
     */
    public Integer    totalDiskSize;

    /**
     * 机型硬盘的描述信息。
     */
    public String     diskDescription;

    /**
     * 可用于raid和分区的磁盘信息。
     * 按顺序标号。比如880 x 2、 220 x2，其磁盘序号1,2,3,4 分别对应的磁盘大小为880，880，220，220。
     */
    public List<Disk> disks;

    public static class Disk extends TeaModel {
        /**
         * 硬盘的大小。
         * 单位：GB。
         */
        public Integer diskSize;

        /**
         * 该硬盘大小的硬盘的数量。
         */
        public Integer diskCount;

    }
}
