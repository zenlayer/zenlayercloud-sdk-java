package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeVpcsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId。
     */
    public String requestId;
    public List<VpcInfo> dataSet;
    public Integer totalCount;

    public static class VpcInfo extends TeaModel {
        public String       vpcId;
        public String       name;
        public String       cidrBlock;
        public String       ipv6CidrBlock;
        public Integer      mtu;
        public Boolean      isDefault;
        public String       createTime;
        public Integer      usageIpv4Count;
        public Integer      usageIpv6Count;
        public String       securityGroupId;
    }
}
