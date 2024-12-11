package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeNicsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public List<DescribeNicsResponse.NicInfo> dataSet;
    public Integer totalCount;

    public static class NicInfo extends TeaModel {
        public String nicId;
        public String name;
        public String status;
        public String nicType;
        public String regionId;
        public String nicSubnetType;
        public List<String> publicIpList;
        public List<String> privateIpList;
        public String instanceId;
        public String vpcId;
        public String subnetId;
        public String createTime;
    }
}
