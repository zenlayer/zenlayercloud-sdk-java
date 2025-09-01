package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;
import com.zenlayercloud.zec20240401.models.DescribeNicsResponse.NicInfo;

import java.util.List;

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
         * 实例唯一ID
         */
        public String instanceId;

        /**
         * 实例显示名称
         */
        public String instanceName;

        /**
         * 实例所属的可用区ID
         */
        public String zoneId;

        /**
         * CPU 规格。
         * 如果是GPU实例，该字段取值为null
         */
        public String instanceType;

        /**
         * CPU 核数。
         * 单位：个
         */
        public Integer cpu;

        /**
         * 内存容量。
         * 单位：GiB
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
         * 设置的系统时区信息
         */
        public String timeZone;

        /**
         * 网卡模式
         */
        public String nicNetworkType;

        /**
         * 实例状态
         */
        public String status;

        /**
         * 系统盘信息
         */
        public SystemDisk systemDisk;

        /**
         * 实例上挂在的数据盘信息
         */
        public List<DataDisk> dataDisks;

        /**
         * 实例上公网IPv4列表
         */
        public List<String> publicIpAddresses;

        /**
         * 实例上内网IP列表
         */
        public List<String> privateIpAddresses;

        /**
         * 安装的SSH密钥ID
         */
        public String keyId;

        /**
         * 实例主网卡关联的子网ID
         */
        public String subnetId;

        /**
         * 是否开启QGA Agent
         */
        public Boolean enableAgent;

        /**
         * 是否开启QGA 监控采集
         */
        public Boolean enableAgentMonitor;

        /**
         * 是否开启IP转发
         */
        public Boolean enableIpForward;

        /**
         * 创建时间
         */
        public String createTime;

        /**
         * 到期时间
         */
        public String expiredTime;

        /**
         * 实例所属的资源组ID
         */
        public String resourceGroupId;

        /**
         * 实例所属的资源组名称
         */
        public String resourceGroupName;

        /**
         * 实例上绑定的网卡信息
         */
        public List<NicInfo> nics;
    }
}
