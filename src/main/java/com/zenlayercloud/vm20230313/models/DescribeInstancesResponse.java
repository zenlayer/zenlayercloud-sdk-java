/*
 * Zenlayer.com Inc.
 * Copyright (c) 2014-2023 All Rights Reserved.
 */
package com.zenlayercloud.vm20230313.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

/**
 * @author alicat.xu
 * @date 2023-03-23 16:51:54
 * @version $ Id: DescribeInstancesResponse.java, v 0.1  alicat.xu Exp $
 */
public class DescribeInstancesResponse extends TeaModel {

    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String             requestId;
    public List<InstanceInfo> dataSet;
    public Integer            totalCount;

    public static class InstanceInfo extends TeaModel {

        /**
         * 实例ID
         */
        public String instanceId;

        /**
         * 机器所属可用区
         */
        public String zoneId;

        /**
         * 实例名称
         */
        public String instanceName;

        /**
         * 机型ID
         */
        public String instanceType;

        /**
         * cpu核数
         */
        public Integer cpuCount;

        /**
         * 内存容量
         */
        public Integer memory;

        /**
         * 镜像ID
         */
        public String imageId;

        /**
         * 镜像名称
         */
        public String imageName;

        /**
         * 实例计费类型
         */
        public String instanceChargeType;

        /**
         * 带宽
         */
        public Integer internetMaxBandwidthOut;

        /**
         * 网络计费类型
         */
        public String internetChargeType;

        /**
         * 购买实例的时长，单位：月
         * 后付费实例该字段为null
         */
        public Integer period;

        /**
         * 公网IP集合
         */
        public List<String> publicIpAddresses;

        /**
         * 内网IP集合
         */
        public List<String>  privateIpAddresses;

        /**
         * 子网ID
         */
        public String subnetId;

        /**
         * 创建时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-DDThh:mm:ssZ。
         */
        public String createTime;

        /**
         * 到期时间。按照ISO8601标准表示，并且使用UTC时间。格式为：YYYY-MM-ddThh:mm:ssZ。注意：后付费模式本项为null
         */
        public String expiredTime;

        /**
         * 资源组ID
         */
        public String resourceGroupId;

        /**
         * 资源组名称
         */
        public String resourceGroupName;

        /**
         * 实例状态
         */
        public String instanceStatus;

        /**
         * 流量包
         */
        public Double trafficPackageSize;

        /**
         * 安全组ID集合
         */
        public List<String> securityGroupIds;

        /**
         * 系统盘
         */
        public SystemDisk systemDisk;

        /**
         * 数据盘
         */
        public List<DataDisk> dataDisks;

        /**
         * 是否自动续费。
         * 对于预付费实例，取消订阅后，该字段值将返回false
         */
        public Boolean  autoRenew;


    }
}
