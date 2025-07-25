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
        public String instanceId;

        public String instanceName;

        public String zoneId;

        public Integer cpu;

        public Integer memory;

        public String instanceType;

        public String imageId;

        public String imageName;

        public String nicNetworkType;

        public String status;

        public SystemDisk systemDisk;

        public List<DataDisk> dataDisks;

        public List<String> publicIpAddresses;

        public List<String> privateIpAddresses;

        public String keyId;

        public String createTime;

        public String expiredTime;

        public String resourceGroupId;

        public String resourceGroupName;

        public List<NicInfo> nics;
    }
}
