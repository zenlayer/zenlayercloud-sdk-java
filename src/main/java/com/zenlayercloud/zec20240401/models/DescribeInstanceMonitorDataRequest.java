/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2024 All Rights Reserved.
 */
package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

/**
 * @author wolfgang
 * @date 2024-03-20 10:53:15
 * @version $ Id: DescribeInstanceMonitorDataRequest.java, v 0.1  wolfgang Exp $
 */
public class DescribeInstanceMonitorDataRequest extends TeaModel {
    /**
     * 实例ID。
     */
    public String instanceId;
    /**
     * 指标类型。
     * INTERNET_INGRESS_BITS: 公网入向带宽，单位bps
     * INTERNET_EGRESS_BITS: 公网出向带宽，单位bps
     * INTERNET_INGRESS_PACKETS: 公网入向包量
     * INTERNET_EGRESS_PACKETS: 公网出向包量
     * CPU_UTIL: CPU使用率，单位百分比
     * MEMORY_UTIL: 内存使用率，单位百分比
     * DISK_WRITE_BYTES: 云盘的每秒写入字节，单位Byte
     * DISK_READ_BYTES: 云盘的每秒读取字节，单位Byte
     * DISK_READ_OPS: 云盘的每秒读取I/OPS
     * DISK_WRITE_OPS: 云盘的每秒写入I/OPS
     *
     */
    public String metricType;
    /**
     * 公网IP地址。
     * 当存在多个IP时，需要指定对应网卡上的公网地址。该字段仅对下列指标有效。
     * INTERNET_INGRESS_BITS
     * INTERNET_EGRESS_BITS
     * INTERNET_INGRESS_PACKETS
     * INTERNET_EGRESS_PACKETS
     */
    public String ipAddress;
    /**
     * 查询开始时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String startTime;
    /**
     * 查询结束时间。
     * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String endTime;
}
