package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSubnetsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public List<SubnetInfo> dataSet;
    public Integer totalCount;

    public static class SubnetInfo extends TeaModel {
        public String       subnetId;
        public String       regionId;
        public String       name;
        public String       cidrBlock;
        public String       ipv6CidrBlock;
        public String       stackType;
        public String       ipv6Type;
        public String       vpcId;
        public String       vpcName;
        public Integer      usageIpv4Count;
        public Integer      usageIpv6Count;
        public String       createTime;
        public Boolean      isDefault;
    }
}
