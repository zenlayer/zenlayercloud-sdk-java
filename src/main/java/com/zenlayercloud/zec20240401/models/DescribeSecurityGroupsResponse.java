package com.zenlayercloud.zec20240401.models;

import com.aliyun.tea.TeaModel;

import java.util.List;

public class DescribeSecurityGroupsResponse extends TeaModel {
    /**
     * 唯一请求 ID，每次请求都会返回。
     * 定位问题时需要提供该次请求的requestId
     */
    public String         requestId;

    public List<SecurityGroupInfo> dataSet;

    public Integer totalCount;

    public static class SecurityGroupInfo extends TeaModel {
        public String securityGroupId;
        public String securityGroupName;
        public String scope;
        public String createTime;
        public List<String> vpcIds;
        public Boolean isDefault;
    }
}
