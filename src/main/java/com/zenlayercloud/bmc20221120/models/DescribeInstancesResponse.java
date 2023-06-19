/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.bmc20221120.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author Zif
 * @date 2023/1/9
 */
public class DescribeInstancesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;

    /**
     * 符合条件的数据总数。
     */
    public Integer            totalCount;

    /**
     * 结果集。
     */

    public List<InstanceInfo> dataSet;

    public static class InstanceInfo extends TeaModel {

        /**
         * 实例唯一ID
         */
        public String instanceId;

        /**
         * 实例所属的可用区ID
         */
        public String zoneId;

        /**
         * 实例显示名称
         */
        public String instanceName;

        /**
         * 实例主机名
         */
        public String hostname;

        /**
         * 实例机型
         */
        public String instanceTypeId;

        /**
         * 镜像ID
         */
        public String imageId;

        /**
         * 镜像名称
         */
        public String imageName;

        /**
         * 实例计费类型。取值范围：
         * PREPAID: 表示预付费，即包年包月
         * POSTPAID: 表示后付费，即按量计费
         */
        public String instanceChargeType;

        /**
         * 公网出口带宽。单位：Mbps
         * 0 代表无限制，无限制其最大不会超过机型的最大上限
         */
        public Integer bandwidthOutMbps;

        /**
         * 网络计费类型。取值范围
         * ByBandwidth: 按固定带宽计费
         * ByTrafficPackage: 购买流量包计费
         * ByInstanceBandwidth95: 单个实例95计费
         * ByClusterBandwidth95: 合并95计费
         */
        public String internetChargeType;

        /**
         * 购买实例的时长，单位：月。
         * 后付费实例该字段为null
         */
        public Integer period;

        /**
         * 实例的母IP。
         */
        public String primaryPublicIpAddress;

        /**
         * 实例公网IPv4列表。
         * 如果机器的主IP未加入到公网组网接口，那么主IP将无法使用，且该字段也不会返回该IP
         */
        public List<String> publicIpAddresses;

        /**
         * 实例内网IP列表
         */
        public List<String> privateIpAddresses;

        /**
         * 实例的IPv6地址。
         * 注意: 此字段可能返回 null，表示取不到有效值
         */
        public List<String> ipv6Addresses;

        /**
         * 实例所属的内网组网id列表
         */
        public List<String> subnetIds;

        /**
         * 创建时间。
         * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 到期时间。
         * 按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddThh:mm:ssZ。
         * 注意: 后付费模式本项为null
         */
        public String expiredTime;

        /**
         * 资源组的ID。
         */
        public String resourceGroupId;

        /**
         * 资源组的名称。
         */
        public String resourceGroupName;

        /**
         * 实例状态。取值范围：
         * CREATING：表示创建中
         * CREATE_FAILED：表示创建失败
         * INSTALLING: 表示在安装中
         * INSTALL_FAILED: 表示安装失败
         * RUNNING：表示运行中
         * STOPPED：表示关机
         * BOOTING：表示启动中
         * STOPPING：表示关机中
         * REBOOTING：表示重启中
         * SHUTDOWN：表示停止待销毁
         * RECYCLE: 表示实例在回收站
         */
        public String instanceStatus;

        /**
         * 流量包计费方式时的流量包大小。
         * 单位：TB。
         */
        public Double trafficPackageSize;

        /**
         * raid配置
         */
        public RaidConfig raidConfig;

        /**
         * 磁盘分区配置
         */
        public List<Partition> partitions;

        /**
         * 网卡名称配置
         */
        public Nic nic;

        /**
         * 是否自动续费
         * 对于预付费实例，取消订阅后，该字段值将返回 false
         */
        public Boolean autoRenew;

    }
}
